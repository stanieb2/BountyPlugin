package me.stanieb2.bounty.death;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import me.stanieb2.bounty.Main;

public class DeathListener implements Listener{
	
	public DeathListener(Main plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
}
