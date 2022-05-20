package com.studionode.chatwizard.filtering;

import com.studionode.chatwizard.ChatWizard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapChatFilter extends ChatFilter {
    private Set<String> words = new HashSet<>();

    @Override
    public void loadFilter(List<String> words) {
        this.words = Set.copyOf(words);
    }

    @Override
    public String filtered(String message) {
        StringBuilder builder = new StringBuilder();
        for (String word : message.split(" ")) {
            if (words.contains(word)) {
                builder.append(ChatWizard.getInstance().config().getString("chat.filter.replace-word", "*"));
            } else {
                builder.append(word);
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}
