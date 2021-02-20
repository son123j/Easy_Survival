package com.boy0710boy.Easy_Survival.github.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.Arrays;
import java.util.List;

public class commands implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equals("")) {
            if(args.length == 1) {
                return Arrays.asList("", "");
            }
        }

        return null;
    }
}