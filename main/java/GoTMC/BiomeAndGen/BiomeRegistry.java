package GoTMC.BiomeAndGen;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;


public class BiomeRegistry {
	public static void IanMod(){
		initializeBiome();
		registerBiome();
		
	}
	public static BiomeGenBase biomeUberNorth;
	public static BiomeGenBase biomeDorne;
	public static BiomeGenBase biomeSouth;
	public static BiomeGenBase biomeNorth;
	public static void initializeBiome(){
		biomeUberNorth = new BiomeGenUberNorth(137).setBiomeName("Uttermost North").setTemperatureRainfall(0.4F, 0.9F);
		biomeNorth = new BiomeGenNorth(175).setBiomeName("The South").setTemperatureRainfall(1.0F, 0.9F);
		biomeSouth = new BiomeGenSouth(176).setBiomeName("The North").setTemperatureRainfall(0.7F, 0.9F);
		biomeDorne = new BiomeGenDorne(177).setBiomeName("Desert of Dorne").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeUberNorth, Type.SNOWY);
		BiomeManager.addSpawnBiome(biomeUberNorth);
		
		BiomeDictionary.registerBiomeType(biomeNorth, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeNorth);
		
		BiomeDictionary.registerBiomeType(biomeSouth, Type.PLAINS);
		BiomeManager.addSpawnBiome(biomeSouth);
		
		BiomeDictionary.registerBiomeType(biomeDorne, Type.SAVANNA);
		BiomeManager.addSpawnBiome(biomeDorne);
	}
}
