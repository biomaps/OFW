
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
import GoTMC.Crops.*;
import GoTMC.Items.*;
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
		
		//Limestone
	public static Block blockLimestoneBrick;
	public static Block blockLimestoneBrickCA;
	public static Block blockLimestoneBrickM;
	public static Block blockLimestoneBrickF;
	public static Block blockLimestoneCobble;
	public static Block blockLimestoneBrickCR;
	public static Block blockLimestoneBrickB;
	public static Block blockLimestone;
	
	//granite
	public static Block blockNorthStoneBrick;
	public static Block blockNorthStoneBrickCA;
	public static Block blockNorthStoneBrickM;
	public static Block blockNorthStoneBrickF;
	public static Block blockNorthStoneCobble;
	public static Block blockNorthStoneBrickCR;
	public static Block blockNorthStoneBrickB;
	public static Block blockNorthStone;
	
	/*-=-=-=-=-=-=-Armor-=-=-=-=-*/

	public static Item itemHelmet1;
	public static Item itemChestplate1;
	public static Item itemLeggings1;
	public static Item itemBoots1;
	
	public static Item itemHelmet2;
	public static Item itemChestplate2;
	public static Item itemLeggings2;
	public static Item itemBoots2;
	
	public static Item itemHelmet3;
	public static Item itemChestplate3;
	public static Item itemLeggings3;
	public static Item itemBoots3;
	
	public static Item itemHelmet4;
	public static Item itemChestplate4;
	public static Item itemLeggings4;
	public static Item itemBoots4;
	
	public static Item itemSword1;
	public static Item itemSword2;

	public static final ItemArmor.ArmorMaterial ArmorMaterial1 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{2,5,4,1}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterial2 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{3,7,5,2}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterial3 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{2,4,3,1}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterial4 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{3,7,5,2}, 30);
	
	public static final Item.ToolMaterial BCEm1 = EnumHelper.addToolMaterial("BCEm1", 4, 1500, 9.0F, 3.0F, 0);
	public static final Item.ToolMaterial BCEeu1 = EnumHelper.addToolMaterial("BCEeu1", 4, 1500, 9.0F, 3.0F, 0);
	
	public static Block crapOne;
	
	public static Item seedFood;
	
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
		
		crapOne = new CrapOne().setBlockName("CropOne").setBlockTextureName("irjm:a");
		GameRegistry.registerBlock(crapOne, crapOne.getUnlocalizedName().substring(5));
		
		seedFood = new BCEitemSeedFood(3, 0.3F, crapOne, Blocks.farmland).setUnlocalizedName("a").setTextureName("irjm:itemSword1");
		GameRegistry.registerItem(seedFood, seedFood.getUnlocalizedName().substring(5));
		
			/*-=-=-=-=-=-=-Armor-=-=-=-=-*/

		itemHelmet1 = new ItemArmor1(ArmorMaterial1, 0, 0).setUnlocalizedName("EU1helm").setTextureName("irjm:EU1helm").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemHelmet1, itemHelmet1.getUnlocalizedName().substring(5));
		
		itemChestplate1 = new ItemArmor1(ArmorMaterial1, 0, 1).setUnlocalizedName("EU1chest").setTextureName("irjm:EU1chest").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemChestplate1, itemChestplate1.getUnlocalizedName().substring(5));
		
		itemLeggings1 = new ItemArmor1(ArmorMaterial1, 0, 2).setUnlocalizedName("EU1legs").setTextureName("irjm:EU1legs").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemLeggings1, itemLeggings1.getUnlocalizedName().substring(5));
		
		itemBoots1 = new ItemArmor1(ArmorMaterial1, 0, 3).setUnlocalizedName("EU1boots").setTextureName("irjm:EU1boots").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemBoots1, itemBoots1.getUnlocalizedName().substring(5));
		
		
		
		itemHelmet2 = new ItemArmor2(ArmorMaterial2, 0, 0).setUnlocalizedName("EU2helm").setTextureName("irjm:EU2helm").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemHelmet2, itemHelmet2.getUnlocalizedName().substring(5));
		
		itemChestplate2 = new ItemArmor2(ArmorMaterial2, 0, 1).setUnlocalizedName("EU2chest").setTextureName("irjm:EU2chest").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemChestplate2, itemChestplate2.getUnlocalizedName().substring(5));
		
		itemLeggings2 = new ItemArmor2(ArmorMaterial2, 0, 2).setUnlocalizedName("EU2legs").setTextureName("irjm:EU2legs").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemLeggings2, itemLeggings2.getUnlocalizedName().substring(5));
		
		itemBoots2 = new ItemArmor2(ArmorMaterial2, 0, 3).setUnlocalizedName("EU2boots").setTextureName("irjm:EU2boots").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemBoots2, itemBoots2.getUnlocalizedName().substring(5));
		
		
		
		itemHelmet3 = new ItemArmor3(ArmorMaterial3, 0, 0).setUnlocalizedName("MOSLEM1helm").setTextureName("irjm:MOSLEM1helm").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemHelmet3, itemHelmet3.getUnlocalizedName().substring(5));
		
		itemChestplate3 = new ItemArmor3(ArmorMaterial3, 0, 1).setUnlocalizedName("MOSLEM1chest").setTextureName("irjm:MOSLEM1chest").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemChestplate3, itemChestplate3.getUnlocalizedName().substring(5));
		
		itemLeggings3 = new ItemArmor3(ArmorMaterial3, 0, 2).setUnlocalizedName("MOSLEM1legs").setTextureName("irjm:MOSLEM1legs").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemLeggings3, itemLeggings3.getUnlocalizedName().substring(5));
		
		itemBoots3 = new ItemArmor3(ArmorMaterial3, 0, 3).setUnlocalizedName("MOSLEM1boots").setTextureName("irjm:MOSLEM1boots").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemBoots3, itemBoots3.getUnlocalizedName().substring(5));
		
		
		
		itemHelmet4 = new ItemArmor4(ArmorMaterial4, 0, 0).setUnlocalizedName("MOSLEM2helm").setTextureName("irjm:MOSLEM2helm").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemHelmet4, itemHelmet4.getUnlocalizedName().substring(5));
		
		itemChestplate4 = new ItemArmor4(ArmorMaterial4, 0, 1).setUnlocalizedName("MOSLEM2chest").setTextureName("irjm:MOSLEM2chest").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemChestplate4, itemChestplate4.getUnlocalizedName().substring(5));
		
		itemLeggings4 = new ItemArmor4(ArmorMaterial4, 0, 2).setUnlocalizedName("MOSLEM2legs").setTextureName("irjm:MOSLEM2legs").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemLeggings4, itemLeggings4.getUnlocalizedName().substring(5));
		
		itemBoots4 = new ItemArmor4(ArmorMaterial4, 0, 3).setUnlocalizedName("MOSLEM2boots").setTextureName("irjm:MOSLEM2boots").setCreativeTab(FaithAndWarArmor);
		GameRegistry.registerItem(itemBoots4, itemBoots4.getUnlocalizedName().substring(5));
		
					/*-=-=-=-=-=-=-=-Materials-=-=-=-=-=-*/
		
		itemIronNug = new CraftingMaterial().setUnlocalizedName("IronNug").setTextureName("irjm:IronNug").setCreativeTab(FaithAndWarArmor);;
		GameRegistry.registerItem(itemIronNug, itemIronNug.getUnlocalizedName().substring(5));
		
		itemChainmail = new CraftingMaterial().setUnlocalizedName("Chainmail").setTextureName("irjm:Chainmail").setCreativeTab(FaithAndWarArmor);;
		GameRegistry.registerItem(itemChainmail, itemChainmail.getUnlocalizedName().substring(5));
		
		itemWoodShaft = new CraftingMaterialHand().setUnlocalizedName("WoodShaft").setTextureName("irjm:WoodShaft").setCreativeTab(FaithAndWarArmor);;
		GameRegistry.registerItem(itemWoodShaft, itemWoodShaft.getUnlocalizedName().substring(5));
		
		itemLeatherStrap = new CraftingMaterial().setUnlocalizedName("LeatherStrap").setTextureName("irjm:LeatherStrap").setCreativeTab(FaithAndWarArmor);;
		GameRegistry.registerItem(itemLeatherStrap, itemLeatherStrap.getUnlocalizedName().substring(5));
		
		/*SWORDS + BOWS 🦈 */
		
		itemSword1 = new ItemBCESword(BCEeu1).setUnlocalizedName("WesterlandSword").setTextureName("irjm:itemSword1").setCreativeTab(FaithAndWarTools);
		GameRegistry.registerItem(itemSword1, itemSword1.getUnlocalizedName().substring(5));
		
		itemSword2 = new ItemBCESword(BCEm1).setUnlocalizedName("NotWesterlandSword").setTextureName("irjm:itemSword2").setCreativeTab(FaithAndWarTools);
		GameRegistry.registerItem(itemSword2, itemSword2.getUnlocalizedName().substring(5));
		
		/*BLOCKS*/
		
		
	//Limestone
		
		blockLimestone = new BCEstoneLI(Material.rock).setBlockName("Limestone").setBlockTextureName("irjm:limestone").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestone, blockLimestone.getUnlocalizedName().substring(5));
		
		blockLimestoneBrick = new BCEbrick(Material.rock).setBlockName("LimestoneBrick").setBlockTextureName("irjm:limestoneB").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrick, blockLimestoneBrick.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickM = new BCEbrick(Material.rock).setBlockName("LimestoneBrickM").setBlockTextureName("irjm:limestoneBmossy").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickM, blockLimestoneBrickM.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickB = new BCEbrick(Material.rock).setBlockName("LimestoneBrickB").setBlockTextureName("irjm:limestoneBburnt").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickB, blockLimestoneBrickB.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickCR = new BCEbrick(Material.rock).setBlockName("LimestoneBrickCR").setBlockTextureName("irjm:limestoneBcracked").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickCR, blockLimestoneBrickCR.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickCA = new BCEbrick(Material.rock).setBlockName("LimestoneBrickCA").setBlockTextureName("irjm:limestoneBcarved").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickCA, blockLimestoneBrickCA.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickF = new BCEbrick(Material.rock).setBlockName("LimestoneBrickF").setBlockTextureName("irjm:limestoneBfrozen").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickF, blockLimestoneBrickF.getUnlocalizedName().substring(5));
		
		blockLimestoneCobble = new BCEbrick(Material.rock).setBlockName("LimestoneCobble").setBlockTextureName("irjm:limestoneCobble").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneCobble, blockLimestoneCobble.getUnlocalizedName().substring(5));
	//Granite
		
		
		blockNorthStone = new BCEstoneGR(Material.rock).setBlockName("NorthStone").setBlockTextureName("irjm:NorthStone").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStone, blockNorthStone.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrick = new BCEbrick(Material.rock).setBlockName("NorthStoneBrick").setBlockTextureName("irjm:NorthStoneB").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrick, blockNorthStoneBrick.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickM = new BCEbrick(Material.rock).setBlockName("NorthStoneBrickM").setBlockTextureName("irjm:NorthStoneBmossy").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickM, blockNorthStoneBrickM.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickCR = new BCEbrick(Material.rock).setBlockName("NorthStoneBrickCR").setBlockTextureName("irjm:NorthStoneBcracked").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickCR, blockNorthStoneBrickCR.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickCA = new BCEbrick(Material.rock).setBlockName("NorthStoneBrickCA").setBlockTextureName("irjm:NorthStoneBcarved").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickCA, blockNorthStoneBrickCA.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickF = new BCEbrick(Material.rock).setBlockName("NorthStoneBrickF").setBlockTextureName("irjm:NorthStoneBfrozen").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickF, blockNorthStoneBrickF.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickB = new BCEbrick(Material.rock).setBlockName("NorthStoneBrickB").setBlockTextureName("irjm:NorthStoneBburnt").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickB, blockNorthStoneBrickB.getUnlocalizedName().substring(5));
		
		blockNorthStoneCobble = new BCEbrick(Material.rock).setBlockName("NorthStoneCobble").setBlockTextureName("irjm:NorthStoneCobble").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneCobble, blockNorthStoneCobble.getUnlocalizedName().substring(5));

		

	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	 //WorldType GOT = new WorldTypeGOT(3, "Game of Thrones");
	
				//list of blocks from every mod
	}
	public static CreativeTabs FaithAndWarArmor= new CreativeTabs("FaithAndWarArmor"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemHelmet2).getItem();
	

	//causes an order to the loading of the mods so PreInit then init then post
		}
	};
	public static CreativeTabs FaithAndWarItems= new CreativeTabs("FaithAndWarItems"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemHelmet2).getItem();
		}
	};
	public static CreativeTabs FaithAndWarTools= new CreativeTabs("FaithAndWarTools"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemHelmet2).getItem();
		}
	};
}

