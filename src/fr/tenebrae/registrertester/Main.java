package fr.tenebrae.registrertester;

import net.minecraft.server.v1_10_R1.EntityVillager;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

import fr.tenebrae.entityregistrer.EntityAppearence;
import fr.tenebrae.entityregistrer.EntityRegistrer;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		EntityRegistrer.register("MyCustomVillager", EntityAppearence.VILLAGER, EntityType.VILLAGER, EntityVillager.class, MyVillager.class);
	}
	
	@EventHandler
	public void oncmd(PlayerCommandPreprocessEvent evt) {
		if (!evt.getMessage().equals("/test")) return;
		MyVillager.spawn(evt.getPlayer().getLocation());
		evt.setCancelled(true);
	}

}
