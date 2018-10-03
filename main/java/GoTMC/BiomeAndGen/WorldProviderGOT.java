package com.ianRJ.ianMCmod.genDimension;

import com.ianRJ.ianMCmod.genDimension.BiomeRegistry;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderGOT extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeUberNorth, 0.4F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration(){
		return null;
	}
	
	@Override
	public String getDimensionName() {
		return "Westeros";
	}

}
