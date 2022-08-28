package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        String Prefix = VEssentials.getInstance().getConfig().getString("Prefix");
        String DiscordLink = VEssentials.getInstance().getConfig().getString("DiscordLink");
        player.sendMessage(ColorUtils.color(Prefix + " &7" + DiscordLink));
        return false;
    }

}
