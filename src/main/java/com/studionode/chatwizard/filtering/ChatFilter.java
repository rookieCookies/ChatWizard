package com.studionode.chatwizard.filtering;

import java.util.List;

public abstract class ChatFilter {
    public abstract void loadFilter(List<String> words);
    public abstract String filtered(String message);
}
