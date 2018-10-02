
package com.ianRJ.ianMCmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.ianRJ.ianMCmod.item.ItemGemArmor;
import com.ianRJ.ianMCmod.item.ItemGemAxe;
import com.ianRJ.ianMCmod.item.ItemGemPickaxe;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "irjm", name = "1198AD Mod", version = "1.0.7")
public class IanMod {
	
	public static Item itemNewBlock;
	public static Block blockNewItem;
	public static Item itemFood1;
	public static Item itemFood2;
	public static Block blockPurplePillar;
	public static Item itemNickle;
	public static Item itemBlueberry;
	public static Block blockCarvedPurpleRock;
	public static Block blockGemOre;
	public static Block blockBlueberryBush;
	
	public static Item itemGemPickaxe;
	public static Item itemGemSword;
	public static Item itemGemAxe;
	public static Item itemGemSpade;
	public static Item itemGemHoe;
	
	public static Item itemGemHelmet;
	public static Item itemGemChestplate;
	public static Item itemGemLeggings;
	public static Item itemGemBoots;
	
	/*NEW
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
	*/
	public static final Item.ToolMaterial gemToolMaterial = EnumHelper.addToolMaterial("gemToolMaterial", 4, 1500, 9.0F, 2.5F, 3);
	public static final ItemArmor.ArmorMaterial gemArmorMaterial = EnumHelper.addArmorMaterial("gemArmorMaterial", 2000, new int[]{2,7,5,3}, 30);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/block init and registering
		//config handling
		
		blockBlueberryBush=new BlockBlueberryBush(Material.grass).setBlockName("BlockBlueberryBush").setBlockTextureName("irjm:blockBlueberryBush").setCreativeTab(tabIanMod);
		GameRegistry.registerBlock(blockBlueberryBush, blockBlueberryBush.getUnlocalizedName().substring(5));

		
		blockGemOre = new BlockGemOre(Material.rock).setBlockName("BlockGemOre").setBlockTextureName("irjm:blockGemOre").setCreativeTab(tabIanMod);
		GameRegistry.registerBlock(blockGemOre, blockGemOre.getUnlocalizedName().substring(5));

		blockCarvedPurpleRock = new BlockCarvedPurpleRock(Material.rock).setBlockName("BlockCarvedPurpleRock").setBlockTextureName("irjm:blockCarvedPurpleRock").setCreativeTab(tabIanMod);
		GameRegistry.registerBlock(blockCarvedPurpleRock, blockCarvedPurpleRock.getUnlocalizedName().substring(5));
		
		
		itemGemHelmet = new ItemGemArmor(gemArmorMaterial, 0, 0).setUnlocalizedName("ItemGemHelmet").setTextureName("irjm:itemGemHelmet").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemHelmet, itemGemHelmet.getUnlocalizedName().substring(5));
		
		itemGemChestplate = new ItemGemArmor(gemArmorMaterial, 0, 1).setUnlocalizedName("ItemGemChestplate").setTextureName("irjm:itemGemChestplate").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemChestplate, itemGemChestplate.getUnlocalizedName().substring(5));
		
		itemGemLeggings = new ItemGemArmor(gemArmorMaterial, 0, 2).setUnlocalizedName("ItemGemLeggings").setTextureName("irjm:itemGemLeggings").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemLeggings, itemGemLeggings.getUnlocalizedName().substring(5));
		
		itemGemBoots = new ItemGemArmor(gemArmorMaterial, 0, 3).setUnlocalizedName("ItemGemBoots").setTextureName("irjm:itemGemBoots").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemBoots, itemGemBoots.getUnlocalizedName().substring(5));
		
		
		itemBlueberry = new ItemFood(3, 0.3F, false).setUnlocalizedName("ItemBlueberry").setTextureName("irjm:itemBlueberry").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemBlueberry, itemBlueberry.getUnlocalizedName().substring(5));

		itemGemPickaxe = new ItemGemPickaxe(gemToolMaterial).setUnlocalizedName("ItemGemPickaxe").setTextureName("irjm:itemGemPickaxe").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemPickaxe, itemGemPickaxe.getUnlocalizedName().substring(5));
		
		itemGemAxe = new ItemGemAxe(gemToolMaterial).setUnlocalizedName("ItemGemAxe").setCreativeTab(tabIanMod).setTextureName("irjm:itemGemAxe");
		GameRegistry.registerItem(itemGemAxe, itemGemAxe.getUnlocalizedName().substring(5));
		
		itemGemSpade = new ItemGemSpade(gemToolMaterial).setUnlocalizedName("ItemGemSpade").setCreativeTab(tabIanMod).setTextureName("irjm:itemGemSpade");
		GameRegistry.registerItem(itemGemSpade, itemGemSpade.getUnlocalizedName().substring(5));
		
		itemGemSword = new ItemGemSword(gemToolMaterial).setUnlocalizedName("ItemGemSword").setCreativeTab(tabIanMod).setTextureName("irjm:itemGemSword");
		GameRegistry.registerItem(itemGemSword, itemGemSword.getUnlocalizedName().substring(5));
		
		itemGemHoe = new ItemGemHoe(gemToolMaterial).setUnlocalizedName("ItemGemHoe").setCreativeTab(tabIanMod).setTextureName("irjm:itemGemHoe");
		GameRegistry.registerItem(itemGemHoe, itemGemHoe.getUnlocalizedName().substring(5));
		
		blockNewItem = new BlockNewItem(Material.rock).setBlockName("BlockNewItem").setBlockTextureName("irjm:blockNewItem").setCreativeTab(tabIanMod);
		GameRegistry.registerBlock(blockNewItem, blockNewItem.getUnlocalizedName().substring(5));
		
		itemNewBlock = new ItemNewBlock().setUnlocalizedName("ItemNewBlock").setTextureName("irjm:itemNewBlock").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemNewBlock, itemNewBlock.getUnlocalizedName().substring(5));
		
		itemFood1 = new ItemFood(12, 0.6F, true).setUnlocalizedName("Muffin").setTextureName("irjm:itemMuffinBatter").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemFood1, itemFood1.getUnlocalizedName().substring(5));
		
		itemFood2 = new ItemFood(5, 1.0F, false).setUnlocalizedName("BurntMuffin").setTextureName("irjm:itemFood1").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemFood2, itemFood2.getUnlocalizedName().substring(5));
		
		blockPurplePillar = new BlockPurplePillar(Material.rock).setBlockName("BlockPurplePillar").setBlockTextureName("irjm:blockPurplePillar").setCreativeTab(tabIanMod);
		GameRegistry.registerBlock(blockPurplePillar, blockPurplePillar.getUnlocalizedName().substring(5));
		
		itemNickle = new ItemNickle().setUnlocalizedName("ItemNickle").setTextureName("irjm:itemNickle").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemNickle, itemNickle.getUnlocalizedName().substring(5));
		
		/*NEW
		itemHelmet1 = new ItemArmor1(ArmorMaterial1, 0, 0).setUnlocalizedName("ItemHelmet1").setTextureName("irjm:itemHelmet1").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemHelmet, itemGemHelmet.getUnlocalizedName().substring(5));
		
		itemGemChestplate = new ItemGemArmor(gemArmorMaterial, 0, 1).setUnlocalizedName("ItemGemChestplate").setTextureName("irjm:itemGemChestplate").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemChestplate, itemGemChestplate.getUnlocalizedName().substring(5));
		
		itemGemLeggings = new ItemGemArmor(gemArmorMaterial, 0, 2).setUnlocalizedName("ItemGemLeggings").setTextureName("irjm:itemGemLeggings").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemLeggings, itemGemLeggings.getUnlocalizedName().substring(5));
		
		itemGemBoots = new ItemGemArmor(gemArmorMaterial, 0, 3).setUnlocalizedName("ItemGemBoots").setTextureName("irjm:itemGemBoots").setCreativeTab(tabIanMod);
		GameRegistry.registerItem(itemGemBoots, itemGemBoots.getUnlocalizedName().substring(5));
		
		
		
		
		*/
		

		GameRegistry.addSmelting(itemFood1, new ItemStack(itemFood2), 10.0f);
		
		GameRegistry.registerWorldGenerator(new GemGeneration(), 0);
		}
	@EventHandler
	public void init(FMLInitializationEvent event){
		/*
		 * Proxy, tile entity gui and packet registering
		 */
		GameRegistry.addRecipe(new ItemStack(blockNewItem), new Object[]{"CCC","PCP","CCC", 'C', Blocks.cobblestone, 'P', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(itemNewBlock), new Object[]{"D D"," P ","DDD", 'D', Items.diamond, 'P', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(blockPurplePillar), new Object[]{" P "," P "," P ", 'P', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(itemFood1), new Object[]{"BWB","SES"," R ", 'S', Items.sugar, 'B', itemBlueberry, 'W', Items.wheat, 'R', Items.milk_bucket, 'E', Items.egg});
		GameRegistry.addRecipe(new ItemStack(blockCarvedPurpleRock), new Object[]{"BB ","BB ","   ", 'B', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(blockCarvedPurpleRock), new Object[]{" BB"," BB","   ", 'B', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(blockCarvedPurpleRock), new Object[]{"   ","BB ","BB ", 'B', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(blockCarvedPurpleRock), new Object[]{"   "," BB"," BB", 'B', blockNewItem});
		
		GameRegistry.addRecipe(new ItemStack(itemGemAxe), new Object[]{"NN ","NS "," S ", 'S', Items.stick, 'N', itemNickle});
		GameRegistry.addRecipe(new ItemStack(itemGemAxe), new Object[]{" NN"," SN"," S ", 'S', Items.stick, 'N', itemNickle});
		GameRegistry.addRecipe(new ItemStack(itemGemSword), new Object[]{" N "," N "," S ", 'S', Items.stick, 'N', itemNickle});
		GameRegistry.addRecipe(new ItemStack(itemGemSpade), new Object[]{" N "," S "," S ", 'S', Items.stick, 'N', itemNickle});
		GameRegistry.addRecipe(new ItemStack(itemGemPickaxe), new Object[]{"NNN"," S "," S ", 'S', Items.stick, 'N', itemNickle});
		GameRegistry.addRecipe(new ItemStack(itemGemHoe), new Object[]{"NN "," S "," S ", 'S', Items.stick, 'N', itemNickle});
		GameRegistry.addRecipe(new ItemStack(itemGemHoe), new Object[]{" NN"," S "," S ", 'S', Items.stick, 'N', itemNickle});
		
		GameRegistry.addRecipe(new ItemStack(itemGemHelmet), new Object[]{"PPP","P P","   ", 'P', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(itemGemChestplate), new Object[]{"P P","PPP","PPP", 'P', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(itemGemLeggings), new Object[]{"PPP","P P","P P", 'P', blockNewItem});		
		GameRegistry.addRecipe(new ItemStack(itemGemBoots), new Object[]{"P P","P P","   ", 'P', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(itemGemBoots), new Object[]{"   ","P P","P P", 'P', blockNewItem});
		GameRegistry.addRecipe(new ItemStack(itemGemHelmet), new Object[]{"   ","PPP","P P", 'P', blockNewItem});
		/*NEW
		
		*/
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	
		//list of blocks from every mod
	}
	public static CreativeTabs tabIanMod = new CreativeTabs("tabIanMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemNewBlock).getItem();
		}
	};
	//causes an order to the loading of the mods so PreInit then init then post
}
