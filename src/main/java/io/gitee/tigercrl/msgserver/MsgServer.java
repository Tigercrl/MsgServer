package io.gitee.tigercrl.msgserver;

import org.bukkit.plugin.java.JavaPlugin;

public final class MsgServer extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tellserver").setExecutor(new TellServerCommand());
        System.out.println("[MsgServer] Plugin enabled.");
    }

    @Override
    public void onDisable() {
        System.out.println("[MsgServer] Plugin disabled");
    }
}
