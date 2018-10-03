package GoTMC.BiomeAndGen;

import com.ianRJ.ianMCmod.IanMod;


import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenUberNorth extends BiomeGenBase {
	public BiomeGenUberNorth(int id){
		super(id);
		                                                      //  average,min,max
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 2, 2, 4));
		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.grassPerChunk = 8;
		
		this.topBlock = Blocks.snow;
		this.fillerBlock = IanMod.blockNorthStone;
		this.enableSnow = true;
		this.spawnableMonsterList.removeAll(spawnableMonsterList);
	}
}
