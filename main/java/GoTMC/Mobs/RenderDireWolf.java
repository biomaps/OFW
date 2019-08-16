package GoTMC.Mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDireWolf extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("irjm:textures/entity/PersonMob.png");
	
	public RenderDireWolf(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	public ResourceLocation getEntityTexture(EntityDireWolfMob entity){
		return mobTextures;
	}
	public ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityDireWolfMob)entity);	
		
	}

}