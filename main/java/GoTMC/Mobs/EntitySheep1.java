package GoTMC.Mobs;



 


import net.minecraft.entity.EntityList; 
import net.minecraft.entity.EnumCreatureType; 
import net.minecraft.world.biome.BiomeGenBase; 
import cpw.mods.fml.common.registry.EntityRegistry; 
import GoTMC.IanMod;

public class EntitySheep1 { 


	 


	public static void mainRegistry(){ 


		registerEntityDW(); 
		
		registerEntityA1();
		registerEntityA2();
		registerEntityA3();
		registerEntityA4();
		registerEntityA5();
		
		
		registerEntityE1(); 
		registerEntityE2();
		registerEntityE3();
		registerEntityE4();
		registerEntityE5();
		
		


	} 
	
	public static void registerEntityDW(){
		createEntity(EntityDireWolfMob.class, "Dire Wolf", 0xF5C15F, 0xFC2121); 
	}
	
	/*MOSLEM*/
	
	public static void registerEntityA1(){
		createEntity(EntityDireWolfMob.class, "Arabian", 0xc49b71 , 0x585858); 
	} 
	public static void registerEntityA2(){
		createEntity(EntityDireWolfMob.class, "Moslem Soldier", 0x357648, 0xfffff); 
	} 
	public static void registerEntityA3(){
		createEntity(EntityDireWolfMob.class, "Moslem Archer", 0x357648, 0xfffff); 
	} 
	public static void registerEntityA4(){
		createEntity(EntityDireWolfMob.class, "Jihad Warlord", 0x357648, 0xfffff); 
	} 
	public static void registerEntityA5(){
		createEntity(EntityDireWolfMob.class, "Jihad Marksman", 0x357648, 0xfffff); 
	} 
	/* EUROPEAN*/
	
	public static void registerEntityE1(){
		createEntity(EntityDireWolfMob.class, "European", 0xfdd2a6, 0x585858); 
	} 
	public static void registerEntityE2(){
		createEntity(EntityDireWolfMob.class, "Norman Crusader", 0xffffff, 0x10026); 
	} 
	public static void registerEntityE3(){
		createEntity(EntityDireWolfMob.class, "Norman Crusader Archer", 0xffffff, 0x10026); 
	} 
	public static void registerEntityE4(){
		createEntity(EntityDireWolfMob.class, "Crusader Knight", 0xffffff, 0x10026); 
	} 
	public static void registerEntityE5(){
		createEntity(EntityDireWolfMob.class, "Crusader Marksman", 0xffffff, 0x10026); 
	} 
	
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){ 
		int randomId = EntityRegistry.findGlobalUniqueEntityId(); 
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId); 
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, IanMod.modInstance, 64, 1, true); 
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest); 
		createEgg(randomId, solidColor, spotColor); 
	} 


	 


	private static void createEgg(int randomId, int solidColor, int spotColor){ 


		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor)); 


		 


	} 


 


} 
