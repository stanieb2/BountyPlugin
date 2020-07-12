package me.stanieb2.bounty.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.stanieb2.bounty.Main;

public class SetBountyCommand implements CommandExecutor{

//	private Main plugin;
	
	public SetBountyCommand(Main plugin) {
//		this.plugin = plugin;
		plugin.getCommand("setBounty").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
	}
}
