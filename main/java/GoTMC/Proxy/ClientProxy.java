package GoTMC.Proxy;

import GoTMC.IanMod;
import GoTMC.Mobs.EntityDireWolfMob;
import GoTMC.Mobs.RenderDireWolf;
import GoTMC.models.LargeSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends ServerProxy{

	

	public void registerRenderThings(){

		//MinecraftForgeClient.registerItemRenderer(IanMod.itemLargeSword, new ItemRendererLargeSword());
		
		
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityDireWolfMob.class, new RenderDireWolf(new DireWolf(), 0));
		

	

	}



}