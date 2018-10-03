package com.ianRJ.ianMCmod.genDimension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {

	public static void mainRegistry(){
		registerDimension();
		
	}
	
	public static final int dimensionId = 2;
	
	public static void registerDimension(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderGOT.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
	}
}
