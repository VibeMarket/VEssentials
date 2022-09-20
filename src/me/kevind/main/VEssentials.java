package me.kevind.main;

import me.kevind.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class VEssentials extends JavaPlugin {
    public static VEssentials instance;
    public static VEssentials getInstance() {
        return instance;
    }

    public void onEnable() {
        instance = this;
        getCommand("kevinurgay").setExecutor(new KevinUrGayCommand());
        getCommand("minaurgay").setExecutor(new MinaUrGayCommand());
        getCommand("autoafk").setExecutor(new AutoAfkCommand());
        getCommand("colors").setExecutor(new ColorsCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("ping").setExecutor(new PingCommand());
        getConfig().options().copyDefaults(true);
        saveConfig();

    }
    public void onDisable() {

    }
}
