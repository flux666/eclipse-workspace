package fr.flux666.hub;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.print("plugin on");
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		System.out.println("plugin off");
		super.onDisable();
	}
	
	

}
