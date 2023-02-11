package io.gitee.tigercrl.msgserver;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MsgServer extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tellserver").setExecutor(new TellServerCommand());
        System.out.println(ChatColor.DARK_GREEN + "[MsgServer]" + ChatColor.RESET + " Plugin enabled.");
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.DARK_GREEN + "[MsgServer]" + ChatColor.RESET + " Plugin disabled");
    }
}
