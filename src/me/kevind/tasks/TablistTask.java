package me.kevind.tasks;

import me.kevind.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TablistTask extends BukkitRunnable {
    @Override
    public void run() {
        String timeStamp = new SimpleDateFormat("MM/dd/yy").format(Calendar.getInstance().getTime());
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setPlayerListHeaderFooter(ColorUtils.color("&9&lVibe Market\n&7" + timeStamp), ColorUtils.color("&fvibemarket.org"));
        }
    }
}
