package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ColorUtils.color("You must be a player to execute this command"));
            return false;
        }
        Player player = (Player) sender;
        if (args.length == 0) {
            int ping = player.getPing();
            player.sendMessage(ColorUtils.color(VEssentials.getInstance().getConfig().getString("Prefix") + "&7 " + ping + "ms"));
            return false;
        }else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target != null) {
                player.sendMessage(ColorUtils.color(VEssentials.getPrefix() + " &9" + target.getDisplayName() + "&7's ping: " + target.getPing() + "ms"));
                return false;
            }else {
                player.sendMessage(ColorUtils.color(VEssentials.getPrefix() + " &cThat player is not online!"));
            }
        }
        return false;
    }
}
