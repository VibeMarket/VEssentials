package me.kevind.commands;

import me.kevind.utils.ColorUtils;
import me.kevind.utils.ColorUtilss;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ColorsCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        Player player = (Player)sender;
        if (player.hasPermission("colors.color")) {
            player.sendMessage(ColorUtils.color("&7Minecraft colors:\n&cMade by ItsCryptic\n") + ColorUtilss.color$("$0&0\n$1&1\n$2&2\n$3&3\n$4&4\n$5&5\n$6&6\n$7&7\n$8&8\n$9&9\n$a&a\n$b&b\n$c&c\n$d&d\n$e&e\n$f&f\n\n$r$kNice$r (&k)\n$r$lBold$r (&l)\n$r$mStrike$r (&m)\n$r$nUnderline$r (&n)\n$r$oItalic$r (&o)\n$rReset (&r)"));
        } else if (!player.hasPermission("colors.color")) {
            player.sendMessage(ColorUtils.color("&cYou do not have permission to execute this command."));
        }
        return false;
    }
}
