package fr.tenebrae.entityregistrer;

public enum EntityAppearence {

	DROPPED_ITEM(1),
	EXPERIENCE_ORB(2),
	AREA_EFFECT_CLOUD(3),
	ELDER_GUARDIAN(4),
	WITHER_SKELETON(5),
	STRAY(6),
	THROWN_EGG(7),
	LEAD_KNOT(8),
	PAINTING(9),
	ARROW(10),
	SNOWBALL(11),
	FIREBALL_BIG(12),
	FIREBALL_SMALL(13),
	ENDER_PEARL(14),
	EYE_OF_ENDER(15),
	SPLASH_POTION(16),
	BOTTLE_O_ENCHANTING(17),
	ITEM_FRAME(18),
	WITHER_SKULL(19),
	PRIMED_TNT(20),
	FALLING_BLOCK(21),
	FIREWORK(22),
	HUSK(23),
	SPECTRAL_ARROW(24),
	SHULKER_BULLET(25),
	FIREBALL_DRAGON(26),
	ZOMBIE_VILLAGER(27),
	HORSE_SKELETON(28),
	HORSE_ZOMBIE(29),
	ARMOR_STAND(30),
	HORSE_DONKEY(31),
	HORSE_MULE(32),
	EVOCATION_FANGS(33),
	EVOKER(34),
	VEX(35),
	VINDICATOR(36),
	MINECART_COMMANDBLOCK(40),
	BOAT(41),
	MINECART(42),
	MINECART_CHEST(43),
	MINECART_FURNACE(44),
	MINECART_TNT(45),
	MINECART_HOPPER(46),
	MINECART_SPAWNER(47),
	CREEPER(50),
	SKELETON(51),
	SPIDER(52),
	GIANT(53),
	ZOMBIE(54),
	SLIME(55),
	GHAST(56),
	ZOMBIE_PIGMAN(57),
	ENDERMAN(58),
	CAVE_SPIDER(59),
	SILVERFISH(60),
	BLAZE(61),
	MAGMA_CUBE(62),
	ENDER_DRAGON(63),
	WITHER(64),
	BAT(65),
	WITCH(66),
	ENDERMITE(67),
	GUARDIAN(68),
	SHULKER(69),
	PIG(90),
	SHEEP(91),
	COW(92),
	CHICKEN(93),
	SQUID(94),
	WOLF(95),
	MOOSHROOM(96),
	SNOW_GOLEM(97),
	OCELOT(98),
	IRON_GOLEM(99),
	HORSE(100),
	RABBIT(101),
	POLAR_BEAR(102),
	LLAMA(103),
	LLAMA_SPIT(104),
	VILLAGER(120),
	ENDER_CRYSTAL(200);
	
	
	int id;
	
	private EntityAppearence(int id) {
		this.id = id;
	}
}
