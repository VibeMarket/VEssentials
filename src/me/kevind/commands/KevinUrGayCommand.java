package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KevinUrGayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;
        String Prefix = VEssentials.getInstance().getConfig().getString("Prefix");
        player.sendMessage(ColorUtils.color(Prefix + "&cNo I'm not!! Minas gayer."));
        return false;
    }
}
