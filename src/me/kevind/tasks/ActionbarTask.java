package me.kevind.tasks;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.awt.*;

public class ActionbarTask extends BukkitRunnable {
    String serverip = VEssentials.getInstance().getConfig().getString("ServerIP");
    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            TextComponent ip = new TextComponent(ColorUtils.color(serverip));
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, ip);
        }
    }
}
