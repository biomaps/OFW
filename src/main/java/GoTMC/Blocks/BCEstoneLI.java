package GoTMC.Blocks;

import net.minecraft.block.material.Material;

public class BCEstoneLI extends BCEstone{

	public BCEstone(Material material) {
		super(material);
	}
  public Item getItemDropped(int metadata, Random rand, int fortune){
		return IanMod.itemBlueberry;
	
	}

	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(4);
	
	}

}
