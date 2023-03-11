package me.kevind.listeners;

import me.clip.placeholderapi.PlaceholderAPI;
import me.kevind.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        String timeStamp = new SimpleDateFormat("MMM dd yyyy").format(Calendar.getInstance().getTime());
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setPlayerListHeaderFooter(ColorUtils.color("&9&lVibe Market\n&7" + timeStamp), ColorUtils.color("&fvibemarket.org"));
            player.setPlayerListName(ColorUtils.color(PlaceholderAPI.setPlaceholders(player, "%vault_prefix%" + "%player_displayname%" + "%vault_suffix%")));
        }
    }
}
