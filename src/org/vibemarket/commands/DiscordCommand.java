package org.vibemarket.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        Player player = (Player)sender;
        String prefix = "&9&lVibeツ &8&l» ";
        if (player.hasPermission("vibe.discord")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + "&7Discord: &9https://discord.gg/W29frSFaqr"));
        }else {
          player.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + "&cYou do not have permission to do that!"));
        }
        return false;
    }
}
