
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
	
	public static Item itemIronNug;
	public static Item itemChainmail;
	public static Item itemWoodShaft;
	public static Item itemLeatherStrap;
		
	
	
	/*-=-=-=-=-=-=-Armor-=-=-=-=-*/

	public static Item itemHelmet1;
	public static Item itemChestplate1;
	public static Item itemLeggings1;
	public static Item itemBoots1;
	
	public static Item itemHelmet2;
	public static Item itemChestplate2;
	public static Item itemLeggings2;
	public static Item itemBoots2;
	
	public static Item itemHelmet;3
	public static Item itemChestplate3;
	public static Item itemLeggings3;
	public static Item itemBoots3;
	
	public static Item itemHelmet4;
	public static Item itemChestplate4;
	public static Item itemLeggings4;
	public static Item itemBoots4;

	public static final ItemArmor.ArmorMaterial ArmorMaterial1 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{2,5,4,1}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterial1 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{3,7,5,2}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterial1 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{2,4,3,1}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterial1 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{3,7,5,2}, 30);
	
	
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
		
			/*-=-=-=-=-=-=-Armor-=-=-=-=-*/

		itemHelmet1 = new ItemArmor1(ArmorMaterial1, 0, 0).setUnlocalizedName("EU1helm").setTextureName("irjm:EU1helm").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemHelmet1, itemHelmet1.getUnlocalizedName().substring(5));
		
		itemChestplate1 = new ItemArmor1(ArmorMaterial1, 0, 1).setUnlocalizedName("EU1chest").setTextureName("irjm:EU1chest").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemChestplate1, itemChestplate1.getUnlocalizedName().substring(5));
		
		itemLeggings1 = new ItemArmor1(ArmorMaterial1, 0, 2).setUnlocalizedName("EU1Legs").setTextureName("irjm:EU1Legs").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemGemLeggings, itemGemLeggings.getUnlocalizedName().substring(5));
		
		itemBoots1 = new ItemArmor1(ArmorMaterial1, 0, 3).setUnlocalizedName("EU1boots").setTextureName("irjm:EU1boots").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemBoots1, itemBoots1.getUnlocalizedName().substring(5));
		
					/*-=-=-=-=-=-=-=-Materials-=-=-=-=-=-*/
		
		itemIronNug = new CraftingMaterial().setUnlocalizedName("IronNug").setTextureName("irjm:IronNug");
		GameRegistry.registerItem(itemIronNug, itemIronNug.getUnlocalizedName().substring(5));
		
		itemChainmail = new CraftingMaterial().setUnlocalizedName("Chainmail").setTextureName("irjm:Chainmail");
		GameRegistry.registerItem(itemChainmail, itemChainmail.getUnlocalizedName().substring(5));
		
		itemChainmail = new CraftingMaterial().setUnlocalizedName("Chainmail").setTextureName("irjm:Chainmail");
		GameRegistry.registerItem(itemChainmail, itemChainmail.getUnlocalizedName().substring(5));
		
		itemLeatherStrap = new CraftingMaterial().setUnlocalizedName("LeatherStrap").setTextureName("irjm:LeatherStrap");
		GameRegistry.registerItem(itemLeatherStrap, itemLeatherStrap.getUnlocalizedName().substring(5));
		
	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	 //WorldType GOT = new WorldTypeGOT(3, "Game of Thrones");
	 
	public static CreativeTabs FaithAndWarArmor= new CreativeTabs("FaithAndWarArmor"){
	@Override
		public Item getTabIconItem(){
			return new ItemStack(EU2helm).getItem();
		}
	};

		//list of blocks from every mod
	}
	//causes an order to the loading of the mods so PreInit then init then post
}

