package GoTMC.Blocks;

import java.util.Random;

import GoTMC.IanMod;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BCEstoneLI extends BCEstone{

	public BCEstoneLI(Material material) {
		super(material);
	}
  public Item getItemDropped(int metadata, Random rand, int fortune){
		return null;
	
	}

	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(4);
	
	}

}
