
package GoTMC;

import java.lang.reflect.Constructor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.util.EnumHelper;




















import GoTMC.*;
import GoTMC.ArmorTools.*;
import GoTMC.Blocks.*;
import GoTMC.Blocks.Slabs.*;
import GoTMC.Crops.*;
import GoTMC.Mobs.*;
import GoTMC.Proxy.*;



import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "irjm", name = "1198 C.E.", version = "a")
public class IanMod {
	@SidedProxy(clientSide = "GoTMC.Proxy.ClientProxy", serverSide = "GoTMC.Proxy.ServerProxy")

	public static ServerProxy proxy;
	
	public static Item itemLargeSword;

	
	@Instance
	public static IanMod modInstance;
	public static BCEblock blockNewItem;

	public static final Item.ToolMaterial BCE1 = EnumHelper.addToolMaterial
			("BCE1", 4, 1500, 9.0F, 2.5F, 3);
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/block init and registering
		//config handling
		
		itemLargeSword = new ItemLargeSword(BCE1).setUnlocalizedName("NorthernSword").setTextureName("irjm:itemSword1");
		GameRegistry.registerItem(itemLargeSword, itemLargeSword.getUnlocalizedName().substring(5));
		
	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	 //WorldType GOT = new WorldTypeGOT(3, "Game of Thrones");
	 
	

		//list of blocks from every mod
	}
	//causes an order to the loading of the mods so PreInit then init then post
}

