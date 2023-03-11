package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class AutoAfkCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        String Prefix = VEssentials.getInstance().getConfig().getString("Prefix");
        if (args[0].equalsIgnoreCase("off")) {
            getServer().dispatchCommand(getServer().getConsoleSender(), "lp user " + player.getName() + " permission set essentials.afk.auto false");
            player.sendMessage(ColorUtils.color(Prefix + "&7Turned &coff &7Auto AFK"));
        }if (args[0].equalsIgnoreCase("on")) {
            getServer().dispatchCommand(getServer().getConsoleSender(), "lp user " + player.getName() + " permission set essentials.afk.auto true");
            player.sendMessage(ColorUtils.color(Prefix + "&7Turned &aon &7Auto AFK"));
        }
        if (args.length == 0) {
            player.sendMessage(ColorUtils.color(Prefix + "&cIncorrect usage: Please specify on or off!"));
        }
        return false;
    }
}
