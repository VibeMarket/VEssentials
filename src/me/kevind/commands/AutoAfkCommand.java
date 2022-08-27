package me.kevind.commands;

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
        if (args[0].equalsIgnoreCase("off")) {
            getServer().dispatchCommand(getServer().getConsoleSender(), "lp user" + player.getName() + "permission set essentials.afk.auto false");
            player.sendMessage("&9&lVibeツ &8» &7Turned &coff &7Auto AFK");
        }if (args[0].equalsIgnoreCase("on")) {
            getServer().dispatchCommand(getServer().getConsoleSender(), "lp user" + player.getName() + "permisison set essentials.afk.auto true");
            player.sendMessage("&9&lVibeツ &8» &7Turned &aon &7Auto AFK");
        }
        if (args.length == 0) {
            player.sendMessage(ColorUtils.color("&9&lVibeツ &8» &cIncorrect usage: Please specify on or off!"));
        }
        return false;
    }
}
