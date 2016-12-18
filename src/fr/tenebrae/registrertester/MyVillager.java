package fr.tenebrae.registrertester;

import javax.annotation.Nullable;

import net.minecraft.server.v1_10_R1.Entity;
import net.minecraft.server.v1_10_R1.EntityHuman;
import net.minecraft.server.v1_10_R1.EntityVillager;
import net.minecraft.server.v1_10_R1.EnumHand;
import net.minecraft.server.v1_10_R1.ItemStack;
import net.minecraft.server.v1_10_R1.SoundEffect;
import net.minecraft.server.v1_10_R1.World;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_10_R1.CraftWorld;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class MyVillager extends EntityVillager {

	public MyVillager(World world) {
		super(world);
	}

	@Override
	public boolean a(EntityHuman entity, EnumHand enumhand, @Nullable ItemStack itemstack) {
		return false;
	}
	
	@Override
	protected SoundEffect G() {
		return null;
	}
	
	@Override
	public void collide(Entity entity) {}
	
	public static MyVillager spawn(Location location) {
		try {
			if (!location.getChunk().isLoaded()) location.getChunk().load();
			MyVillager villager = new MyVillager(((CraftWorld) location.getWorld()).getHandle());
			villager.setPosition(location.getX(), location.getY(), location.getZ());
			(((CraftWorld) location.getWorld()).getHandle()).addEntity(villager, SpawnReason.CUSTOM);
			return villager;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
