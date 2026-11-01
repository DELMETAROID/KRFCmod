package rider.wmod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.entity.EntityGarrenPlate;
import rider.wmod.entity.model.ModelGarrenPlate;

@SideOnly(Side.CLIENT)
public class RenderGarrenPlate extends RenderLiving<EntityLiving>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("wmod:textures/entity/garren_plate.png");

	public RenderGarrenPlate(RenderManager manager)
	{
		super(manager,new ModelGarrenPlate(),0F);
	}

	protected ResourceLocation getEntityTexture(EntityLiving entity)
	{
		return TEXTURES;
	}


	protected void applyRotations(EntityGarrenPlate entityLiving,float p_77043_2_,float rotationYaw,float particalTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, particalTicks);
	}
}
