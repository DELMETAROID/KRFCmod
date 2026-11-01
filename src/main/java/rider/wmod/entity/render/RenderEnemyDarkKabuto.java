package rider.wmod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.entity.EntityEnemyDarkKabuto;
import rider.wmod.entity.model.ModelEnemyDarkKabuto;

@SideOnly(Side.CLIENT)
public class RenderEnemyDarkKabuto extends RenderLiving<EntityLiving>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("wmod:textures/models/armor/darkkabuto_rider_layer_1.png");

	public RenderEnemyDarkKabuto(RenderManager manager)
	{
		super(manager,new ModelEnemyDarkKabuto(),0.5F);
	}

	protected ResourceLocation getEntityTexture(EntityLiving entity)
	{
		return TEXTURES;
	}


	protected void applyRotations(EntityEnemyDarkKabuto entityLiving,float p_77043_2_,float rotationYaw,float particalTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, particalTicks);
	}
}
