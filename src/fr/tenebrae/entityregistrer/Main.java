package fr.tenebrae.entityregistrer;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

final public class Main extends JavaPlugin implements Listener {
	
	public static boolean enabled = false;
	public static File saveDirectory;
	public static String nmsver;
	public static Logger log;
	
	@Override
	public void onLoad() {
		nmsver = Bukkit.getServer().getClass().getPackage().getName();
		nmsver = nmsver.substring(nmsver.lastIndexOf(".") + 1);
		saveDirectory = new File(this.getDataFolder(), "entityNBT");
		saveDirectory.mkdirs();
	}
	
	@Override
	public void onEnable() {
		enabled = true;
		log = getLogger();
		registerEntities();
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		unregisterEntities();
		enabled = false;
	}
	
	private void registerEntities() {
		if (nmsver.contains("1_11_R1")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_11_R1.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_11_R1.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_10_R1")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_10_R1.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_9_R2")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_9_R2.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_9_R2.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_9_R1")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_9_R1.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_9_R1.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_8_R3")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_8_R3.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_8_R3.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_8_R2")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_8_R2.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_8_R2.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_8_R1")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_8_R1.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_8_R1.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_7_R4")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_7_R4.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_7_R4.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_7_R3")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_7_R3.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_7_R3.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_7_R2")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_7_R2.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_7_R2.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_7_R1")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_7_R1.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_7_R1.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_6_R3")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_6_R3.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_6_R3.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_6_R2")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_6_R2.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_6_R2.CustomRegistry.registerEntities();
		} else if (nmsver.contains("1_6_R1")) {
			getServer().getPluginManager().registerEvents(new fr.tenebrae.entityregistrer.v1_6_R1.Listeners(), this);
			fr.tenebrae.entityregistrer.v1_6_R1.CustomRegistry.registerEntities();
		}
	}
	
	private void unregisterEntities() {
		if (nmsver.contains("1_11_R1")) {
			fr.tenebrae.entityregistrer.v1_11_R1.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_10_R1")) {
			fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_9_R2")) {
			fr.tenebrae.entityregistrer.v1_9_R2.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_9_R1")) {
			fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_8_R3")) {
			fr.tenebrae.entityregistrer.v1_8_R3.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_8_R2")) {
			fr.tenebrae.entityregistrer.v1_8_R2.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_8_R1")) {
			fr.tenebrae.entityregistrer.v1_8_R1.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_7_R4")) {
			fr.tenebrae.entityregistrer.v1_7_R4.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_7_R3")) {
			fr.tenebrae.entityregistrer.v1_7_R3.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_7_R2")) {
			fr.tenebrae.entityregistrer.v1_7_R2.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_7_R1")) {
			fr.tenebrae.entityregistrer.v1_7_R1.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_6_R3")) {
			fr.tenebrae.entityregistrer.v1_6_R3.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_6_R2")) {
			fr.tenebrae.entityregistrer.v1_6_R2.CustomRegistry.unregisterEntities();
		} else if (nmsver.contains("1_6_R1")) {
			fr.tenebrae.entityregistrer.v1_6_R1.CustomRegistry.unregisterEntities();
		}
	}

}
