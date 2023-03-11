package me.kevind.main;

import me.kevind.commands.*;
import me.kevind.listeners.ChatListener;
import me.kevind.listeners.JoinListener;
import me.kevind.tasks.ActionbarTask;
import me.kevind.tasks.TablistTask;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.Objects;

public class VEssentials extends JavaPlugin {
    public static VEssentials instance;

    public static VEssentials getInstance() {
        return instance;
    }
    public static String getPrefix() {
        return instance.getConfig().getString("Prefix");
    }

    public void onEnable() {
        instance = this;
        getCommand("kevinurgay").setExecutor(new KevinUrGayCommand());
        getCommand("minaurgay").setExecutor(new MinaUrGayCommand());
        getCommand("autoafk").setExecutor(new AutoAfkCommand());
        getCommand("colors").setExecutor(new ColorsCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("ping").setExecutor(new PingCommand());
        getCommand("nv").setExecutor(new NightVisionCommand());
        getConfig().options().copyDefaults(true);
        saveConfig();
        //this is convoluted as hell, but I don't care.
        if (Objects.equals(instance.getConfig().getString("Tablist"), "on")) {
            getServer().getPluginManager().registerEvents(new JoinListener(), this);
            getServer().getPluginManager().registerEvents(new ChatListener(), this);
            getLogger().info("Enabling tablist!");
        }else if (Objects.equals(instance.getConfig().getString("Tablist"), "off")) {
            getLogger().info("Not enabling Tablist!");
        }
        if (Objects.equals(instance.getConfig().getString("Actionbar"), "on")) {
            BukkitTask actionbar = new ActionbarTask().runTaskTimerAsynchronously(this, 0, 40);
            getLogger().info("Actionbar is enabled!");
        }else if (Objects.equals(instance.getConfig().getString("Actionbar"), "off")) {
            getLogger().info("Not enabling actionbar!");
        }

    }
    public void onDisable() {

    }
}
