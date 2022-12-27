package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class ServerinfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (player.hasPermission("vibe.serverinfo")) {
                player.sendMessage(ColorUtils.color(VEssentials.getPrefix() + "Server Info"));
                player.sendMessage(" ");
            }else {
                player.sendMessage(VEssentials.getPrefix() + "&cYou don't have permission to execute this command.");
            }
        }
        return false;
    }
}
