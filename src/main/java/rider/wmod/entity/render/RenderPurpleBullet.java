package rider.wmod.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.entity.EntityPurpleBullet;
import rider.wmod.entity.model.ModelBullet;

@SideOnly(Side.CLIENT)
public class RenderPurpleBullet extends Render<EntityPurpleBullet>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("wmod:textures/entity/purple_bullet.png");
	private final ModelBullet model = new ModelBullet();

	public RenderPurpleBullet(RenderManager p_i47202_1_)
	{
		super(p_i47202_1_);
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntityPurpleBullet entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)x, (float)y + 0.15F, (float)z);
		GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks - 90.0F, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks, 0.0F, 0.0F, 1.0F);
		this.bindEntityTexture(entity);

		if (this.renderOutlines)
		{
			GlStateManager.enableColorMaterial();
			GlStateManager.enableOutlineMode(this.getTeamColor(entity));
		}

		this.model.render(entity, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		if (this.renderOutlines)
		{
			GlStateManager.disableOutlineMode();
			GlStateManager.disableColorMaterial();
		}

		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPurpleBullet entity) {
		return TEXTURES;
	}
}