package me.kevind.tasks;

import me.clip.placeholderapi.PlaceholderAPI;
import me.kevind.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TablistTask extends BukkitRunnable {
    @Override
    public void run() {
        String timeStamp = new SimpleDateFormat("MMM dd yyyy").format(Calendar.getInstance().getTime());
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setPlayerListHeaderFooter(ColorUtils.color("&9&lVibe Market\n&7" + timeStamp), ColorUtils.color("&fvibemarket.org"));
            player.setPlayerListName(ColorUtils.color(PlaceholderAPI.setPlaceholders(player, "%vault_prefix%" + "%player_displayname%" + "%vault_suffix%")));
        }
    }
}
