package GoTMC.Crops;

import java.util.Random;

import GoTMC.IanMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CrapOne extends BCEcrops
{

    public CrapOne()
    {

    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
    return (IanMod.itemChainmail);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
         /* iIcon[0] = parIIconRegister.registerIcon("irjm:crapCrop0");
          iIcon[1] = parIIconRegister.registerIcon("irjm:crapCrop0");
          iIcon[2] = parIIconRegister.registerIcon("irjm:crapCrop1");
          iIcon[3] = parIIconRegister.registerIcon("irjm:crapCrop1");
          iIcon[4] = parIIconRegister.registerIcon("irjm:crapCrop2");
          iIcon[5] = parIIconRegister.registerIcon("irjm:crapCrop2");
          iIcon[6] = parIIconRegister.registerIcon("irjm:crapCrop3");
          iIcon[7] = parIIconRegister.registerIcon("irjm:crapCrop3");
    */
          iIcon[0] = parIIconRegister.registerIcon("irjm:a");
          iIcon[1] = parIIconRegister.registerIcon("irjm:a");
          iIcon[2] = parIIconRegister.registerIcon("irjm:a");
          iIcon[3] = parIIconRegister.registerIcon("irjm:a");
          iIcon[4] = parIIconRegister.registerIcon("irjm:a");
          iIcon[5] = parIIconRegister.registerIcon("irjm:a");
          iIcon[6] = parIIconRegister.registerIcon("irjm:a");
          iIcon[7] = parIIconRegister.registerIcon("irjm:a");
    }
}
