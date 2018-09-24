package com.ianRJ.ianMCmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBlueberryBush extends Block{

	protected BlockBlueberryBush(Material material) {
		super(material);
		
	}

	public Item getItemDropped(int metadata, Random rand, int fortune){
		return IanMod.itemBlueberry;
	
	}

	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(4);
	
	}

}
