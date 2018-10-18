package GoTMC.ArmorTools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class ItemLargeSword extends ItemSword{

	public ItemLargeSword(ToolMaterial material) {
		super(material);
	    this.setFull3D();
	    }
	        
	    @Override
	    public void registerIcons(IIconRegister iconReg) {
	        itemIcon = iconReg.registerIcon("irjm:" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	        }
	}


