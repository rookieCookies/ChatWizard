package com.studionode.chatwizard.events;

import com.studionode.chatwizard.ChatWizard;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatEventListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        e.setMessage(ChatWizard.getInstance().getChatFilter().filtered(e.getMessage()));
    }
}
