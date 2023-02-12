package io.gitee.tigercrl.msgserver;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TellServerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("tellserver") || label.equalsIgnoreCase("wserver") || label.equalsIgnoreCase("msgserver")) {
            if (sender instanceof Player) {
                if (args.length >= 1) {
                    StringBuilder message = new StringBuilder();
                    for (String i : args) {
                        message.append(i);
                        if (!i.equals(args[args.length - 1])) {
                            message.append(" ");
                        }
                    }
                    String player = sender.getName();
                    sender.sendMessage(ChatColor.GRAY + "You whisper to the Server: " + message);
                    System.out.println("[MsgServer] " + player + "whispers to you: " + message);
                }
            } else {
                System.out.println("[MsgServer] You should be a player to use this command!");
            }
            return true;
        }
        return false;
    }
}
