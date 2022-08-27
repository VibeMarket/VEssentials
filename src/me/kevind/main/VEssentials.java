package me.kevind.main;

import me.kevind.commands.AutoAfkCommand;
import me.kevind.commands.ColorsCommand;
import me.kevind.commands.KevinUrGayCommand;
import me.kevind.commands.MinaUrGayCommand;
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


    }
    public void onDisable() {

    }
}
