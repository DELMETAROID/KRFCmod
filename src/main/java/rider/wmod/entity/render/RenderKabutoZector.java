package rider.wmod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.entity.EntityKabutoZector;
import rider.wmod.entity.model.ModelKabutoZector;

@SideOnly(Side.CLIENT)
public class RenderKabutoZector extends RenderLiving<EntityLiving>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("wmod:textures/entity/kabuto_zector.png");

	public RenderKabutoZector(RenderManager manager)
	{
		super(manager,new ModelKabutoZector(),0.1F);
	}

	protected ResourceLocation getEntityTexture(EntityLiving entity)
	{
		return TEXTURES;
	}


	protected void applyRotations(EntityKabutoZector entityLiving,float p_77043_2_,float rotationYaw,float particalTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, particalTicks);
	}
}
