package me.stanieb2.bounty;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.stanieb2.bounty.commands.SetBountyCommand;
import me.stanieb2.bounty.death.DeathListener;

public class Main extends JavaPlugin implements Listener{
	
//	private Logger logger;
	@Override 
	public void onEnable() {
		new SetBountyCommand(this);
		new DeathListener(this);
//		this.logger = (Logger) this.getLogger();

	}
	
	@Override
	public void onDisable() {

	}
	
}
