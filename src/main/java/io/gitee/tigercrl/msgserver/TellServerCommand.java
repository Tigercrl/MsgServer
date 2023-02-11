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
                        if (!i.equals(args[args.length])) {
                            message.append(" ");
                        }
                    }
                    String player = sender.getName();
                    sender.sendMessage(ChatColor.GREEN + "[MsgServer] " + ChatColor.GRAY + "You whisper to the Server: " + message + ChatColor.RESET);
                    System.out.println(ChatColor.GREEN + "[MsgServer] " + ChatColor.GRAY + player + "whispers to you: " + message + ChatColor.RESET);
                }
            } else {
                System.out.println(ChatColor.GREEN + "[MsgServer] " + ChatColor.RED + "You should be a player to use this command!" + ChatColor.RESET);
            }
            return true;
        }
        return false;
    }
}
