package com.ianRJ.ianMCmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNewItem extends Block {

	protected BlockNewItem(Material material) {
		super(material);
		//this.setBlockUnbreakable();
		this.setResistance(15.0F); 
		this.setHardness(1.5F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setLightOpacity(16);
		this.setStepSound(this.soundTypeStone);
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
