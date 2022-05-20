package com.studionode.chatwizard;

import com.studionode.chatwizard.filtering.ChatFilter;
import com.studionode.chatwizard.filtering.MapChatFilter;
import com.studionode.filemanager.Configuration;
import com.studionode.filemanager.FileID;
import com.studionode.filemanager.FileManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatWizard extends JavaPlugin {
    private static ChatWizard instance;

    private ChatFilter chatFilter;

    private FileManager fileManager;

    @Override
    public void onEnable() {
        instance = this;
        Debug.setLogger(getLogger());

        setupFiles();
        setupChatFilter();

    }

    private void setupFiles() {
        fileManager = new FileManager(instance);

        fileManager.addFile(FileID.CONFIG, fileManager.create(null, "config.yml"));
    }

    private void setupChatFilter() {
        chatFilter = new MapChatFilter();
        chatFilter.loadFilter(config().getStringList("chat-filter.words"));
    }

    public Configuration config() {
        return fileManager.getFile(FileID.CONFIG).getConfiguration();
    }

    public static ChatWizard getInstance() {
        return instance;
    }
    public ChatFilter getChatFilter() {
        return chatFilter;
    }
}
