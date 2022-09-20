package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;
        int ping = player.getPing();
        player.sendMessage(ColorUtils.color(VEssentials.getInstance().getConfig().getString("Prefix") + "&7 " + ping + "ms"));
        return false;
    }
}
