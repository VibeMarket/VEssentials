package me.kevind.commands;

import me.kevind.main.VEssentials;
import me.kevind.utils.ColorUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVisionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (player.hasPermission("vibe.nv")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 3));
            }else {
                player.sendMessage(ColorUtils.color(VEssentials.getInstance().getConfig().getString("Prefix") + "&cYou do not have permission."));
            }
        }
        return false;
    }
}