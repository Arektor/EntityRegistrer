package fr.tenebrae.entityregistrer;

import org.bukkit.entity.EntityType;

final public class EntityRegistrer {

	/**
	 * Register a new custom entity.<br>
	 * If the entity is already registered, does nothing.<br><br>
	 * 
	 * When an entity is registered, it will load every already spawned instance of this entity, so it may or may not create a little lag spike.
	 * 
	 * @param name
	 * The entity internal name. Must be unique and not already used, else bad issues will happend.
	 * 
	 * @param id
	 * The entity network ID. Will define appearence of the entity, but beware of DataWatcher differences!
	 * 
	 * @param type
	 * The entity type. Mainly used by Bukkit to retrieve the bukkit EntityType.
	 * 
	 * @param nmsClass
	 * The base NMS Class that your custom entity inherit from. EntityCaveSpider.class, for example
	 * 
	 * @param customClass
	 * The class of your custom entity. MyAwesomeCustomVillager.class, for example
	 */
	public static final void register(final String name, final int id, final EntityType type, final Class<?> nmsClass, final Class<?> customClass) {
		final CustomRegistryEntry entry = new CustomRegistryEntry(name, id, type, nmsClass, customClass);
		if (Main.nmsver.contains("1_11_R1")) {
			if (!net.minecraft.server.v1_11_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_11_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_11_R1.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_10_R1")) {
			if (!net.minecraft.server.v1_10_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_10_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_9_R2")) {
			if (!net.minecraft.server.v1_9_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_9_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_9_R2.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_9_R1")) {
			if (!net.minecraft.server.v1_9_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_9_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_9_R1.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_8_R3")) {
			if (!net.minecraft.server.v1_8_R3.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_8_R3.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_8_R3.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_8_R2")) {
			if (!net.minecraft.server.v1_8_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_8_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_8_R2.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_8_R1")) {
			if (!net.minecraft.server.v1_8_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_8_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_8_R1.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_7_R4")) {
			if (!net.minecraft.server.v1_7_R4.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R4.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R4.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_7_R3")) {
			if (!net.minecraft.server.v1_7_R3.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R3.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R3.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_7_R2")) {
			if (!net.minecraft.server.v1_7_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R2.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_7_R1")) {
			if (!net.minecraft.server.v1_7_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R1.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_6_R3")) {
			if (!net.minecraft.server.v1_6_R3.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_6_R3.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_6_R3.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_6_R2")) {
			if (!net.minecraft.server.v1_6_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_6_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_6_R2.CustomRegistry.register(entry);
		} else if (Main.nmsver.contains("1_6_R1")) {
			if (!net.minecraft.server.v1_6_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_6_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_6_R1.CustomRegistry.register(entry);
		}
	}
	
	/**
	 * Unregister a custom entity, using its internal name.<br>
	 * Unregistering an entity will save and remove it, and may cause lag spikes - bigger than if you registered one.
	 * 
	 * @param name
	 * The entity name to unregister. You can try silly things... at your own risks.
	 */
	public static final void unregister(final String name) {
		if (Main.nmsver.contains("1_11_R1")) fr.tenebrae.entityregistrer.v1_11_R1.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_11_R1.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_10_R1")) fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_9_R2")) fr.tenebrae.entityregistrer.v1_9_R2.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_9_R2.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_9_R1")) fr.tenebrae.entityregistrer.v1_9_R1.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_9_R1.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_8_R3")) fr.tenebrae.entityregistrer.v1_8_R3.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_8_R3.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_8_R2")) fr.tenebrae.entityregistrer.v1_8_R2.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_8_R2.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_8_R1")) fr.tenebrae.entityregistrer.v1_8_R1.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_8_R1.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_7_R4")) fr.tenebrae.entityregistrer.v1_7_R4.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_7_R4.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_7_R3")) fr.tenebrae.entityregistrer.v1_7_R3.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_7_R3.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_7_R2")) fr.tenebrae.entityregistrer.v1_7_R2.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_7_R2.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_7_R1")) fr.tenebrae.entityregistrer.v1_7_R1.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_7_R1.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_6_R3")) fr.tenebrae.entityregistrer.v1_6_R3.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_6_R3.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_6_R2")) fr.tenebrae.entityregistrer.v1_6_R2.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_6_R2.CustomRegistry.registryEntries.get(name));
		else if (Main.nmsver.contains("1_6_R1")) fr.tenebrae.entityregistrer.v1_6_R1.CustomRegistry.unregister(fr.tenebrae.entityregistrer.v1_6_R1.CustomRegistry.registryEntries.get(name));
	}
	
	/**
	 * Force the register of a custom entity, even if it is already registered.<br>
	 * <b>Registering the same entity twice may not be what you would like to do.</b>
	 * 
	 * @param name
	 * The entity internal name. Must be unique and not already used, else bad issues will happend.
	 * 
	 * @param id
	 * The entity network ID. Will define appearence of the entity, but beware of DataWatcher differences!
	 * 
	 * @param type
	 * The entity type. Mainly used by Bukkit to retrieve the bukkit EntityType.
	 * 
	 * @param nmsClass
	 * The base NMS Class that your custom entity inherit from. EntityCaveSpider.class, for example
	 * 
	 * @param customClass
	 * The class of your custom entity. MyAwesomeCustomVillager.class, for example
	 */
	public static final void unsafeRegister(final String name, final int id, final EntityType type, final Class<?> nmsClass, final Class<?> customClass) {
		final CustomRegistryEntry entry = new CustomRegistryEntry(name, id, type, nmsClass, customClass);
		if (Main.nmsver.contains("1_11_R1")) {
			if (!net.minecraft.server.v1_11_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_11_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_11_R1.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_10_R1")) {
			if (!net.minecraft.server.v1_10_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_10_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_10_R1.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_9_R2")) {
			if (!net.minecraft.server.v1_9_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_9_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_9_R2.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_9_R1")) {
			if (!net.minecraft.server.v1_9_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_9_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_9_R1.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_8_R3")) {
			if (!net.minecraft.server.v1_8_R3.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_8_R3.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_8_R3.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_8_R2")) {
			if (!net.minecraft.server.v1_8_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_8_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_8_R2.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_8_R1")) {
			if (!net.minecraft.server.v1_8_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_8_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_8_R1.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_7_R4")) {
			if (!net.minecraft.server.v1_7_R4.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R4.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R4.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_7_R3")) {
			if (!net.minecraft.server.v1_7_R3.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R3.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R3.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_7_R2")) {
			if (!net.minecraft.server.v1_7_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R2.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_7_R1")) {
			if (!net.minecraft.server.v1_7_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_7_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_7_R1.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_6_R3")) {
			if (!net.minecraft.server.v1_6_R3.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_6_R3.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_6_R3.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_6_R2")) {
			if (!net.minecraft.server.v1_6_R2.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_6_R2.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_6_R2.CustomRegistry.unsafeRegister(entry);
		} else if (Main.nmsver.contains("1_6_R1")) {
			if (!net.minecraft.server.v1_6_R1.EntityInsentient.class.isAssignableFrom(nmsClass)) throw new IllegalArgumentException("The provided NMS class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			if (!net.minecraft.server.v1_6_R1.EntityInsentient.class.isAssignableFrom(customClass)) throw new IllegalArgumentException("The provided custom entity class is not inheritent from EntityInsentient, and therefore does not need to be registered.");
			
			fr.tenebrae.entityregistrer.v1_6_R1.CustomRegistry.unsafeRegister(entry);
		}
	}
	
	/**
	 * Force the register of a custom entity, even if it is already registered.<br>
	 * <b>Registering the same entity twice may not be what you would like to do.</b>
	 * 
	 * 
	 * @param name
	 * The entity internal name. Must be unique and not already used, else bad issues will happend.
	 * 
	 * @param appearence
	 * The entity appearence. You can make a zombie appear as a silverfish, but beware of DataWatcher differences!
	 * 
	 * @param type
	 * The entity type. Mainly used by Bukkit to retrieve the bukkit EntityType.
	 * 
	 * @param nmsClass
	 * The base NMS Class that your custom entity inherit from. EntityCaveSpider.class, for example
	 * 
	 * @param customClass
	 * The class of your custom entity. MyAwesomeCustomVillager.class, for example
	 */
	public static final void unsafeRegister(final String name, final EntityAppearence appearence, final EntityType type, final Class<?> nmsClass, final Class<?> customClass) {
		unsafeRegister(name, appearence.id, type, nmsClass, customClass);
	}

	/**
	 * Register a new custom entity.<br>
	 * If the entity is already registered, does nothing.<br><br>
	 * 
	 * When an entity is registered, it will load every already spawned instance of this entity, so it may or may not create a little lag spike.
	 * 
	 * @param name
	 * The entity internal name. Must be unique and not already used, else bad issues will happend.
	 * 
	 * @param appearence
	 * The entity appearence. You can make a zombie appear as a silverfish, but beware of DataWatcher differences!
	 * 
	 * @param type
	 * The entity type. Mainly used by Bukkit to retrieve the bukkit EntityType.
	 * 
	 * @param nmsClass
	 * The base NMS Class that your custom entity inherit from. EntityCaveSpider.class, for example
	 * 
	 * @param customClass
	 * The class of your custom entity. MyAwesomeCustomVillager.class, for example
	 */
	public static final void register(final String name, final EntityAppearence appearence, final EntityType type, final Class<?> nmsClass, final Class<?> customClass) {
		register(name, appearence.id, type, nmsClass, customClass);
	}
}
