package GoTMC.Blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import GoTMC.IanMod;

public class BCEstoneGR extends BCEstone{

	public BCEstoneGR(Material material) {
		super(material);
	}
  public Item getItemDropped(int metadata, Random rand, int fortune){
		return null;
	
	}

	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(4);
	
	}

}
