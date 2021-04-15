package org.vibemarket.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.vibemarket.commands.DiscordCommand;

public class Main extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginCommand("Discord").setExecutor(new DiscordCommand());
    }
    public void onDisable() {

    }
}
