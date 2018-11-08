package GoTMC.Mobs;



 


import net.minecraft.entity.EntityList; 
import net.minecraft.entity.EnumCreatureType; 
import net.minecraft.world.biome.BiomeGenBase; 
import cpw.mods.fml.common.registry.EntityRegistry; 
import GoTMC.IanMod;

public class EntitySheep1 { 


	 


	public static void mainRegistry(){ 


		//registerEntity(); 
		


	} 
	
	public static void registerEntity(){
		//createEntity(EntityDireWolfMob.class, "Dire Wolf", 0xF5C15F, 0xFC2121); 
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