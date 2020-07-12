package me.stanieb2.bounty;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
//	private Logger logger;
	@Override 
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
//		this.logger = (Logger) this.getLogger();

	}
	
	@Override
	public void onDisable() {

		// unload all chunks
	}
	
}
