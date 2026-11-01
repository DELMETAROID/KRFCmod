package rider.wmod.rendering.models.items.saber;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.saber.ArmorSaberHedgehog;

/**
 * ModelSaberHedgehog - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelSaberHedgehog extends ModelBiped {

	public ModelRenderer BookC;
	public ModelRenderer BookC_open;

	public ModelSaberHedgehog() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.BookC = new ModelRenderer(this, 0, 5);
		this.BookC.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BookC.addBox(-0.75F, 7.5F, -7.35F, 2, 2, 1, 0.0F);
		this.BookC_open = new ModelRenderer(this, 0, 1);
		this.BookC_open.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BookC_open.addBox(-2.0F, 7.5F, -7.35F, 3, 2, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorSaberHedgehog.DriverCheck==1&&ArmorSaberHedgehog.isInvisible==0) 
		{
			if(ArmorSaberHedgehog.isBookOpen==1) 
			{
				this.BookC.showModel=false;
				this.BookC_open.showModel=true;
			}else {
				this.BookC.showModel=true;
				this.BookC_open.showModel=false;
			}
		}else {
			this.BookC.showModel=false;
			this.BookC_open.showModel=false;
		}

		if (this.isChild)
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookC.offsetX, this.BookC.offsetY, this.BookC.offsetZ);
			GlStateManager.translate(this.BookC.rotationPointX * f5, this.BookC.rotationPointY * f5, this.BookC.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookC.offsetX, -this.BookC.offsetY, -this.BookC.offsetZ);
			GlStateManager.translate(-this.BookC.rotationPointX * f5, -this.BookC.rotationPointY * f5, -this.BookC.rotationPointZ * f5);
			this.BookC.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookC_open.offsetX, this.BookC_open.offsetY, this.BookC_open.offsetZ);
			GlStateManager.translate(this.BookC_open.rotationPointX * f5, this.BookC_open.rotationPointY * f5, this.BookC_open.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookC_open.offsetX, -this.BookC_open.offsetY, -this.BookC_open.offsetZ);
			GlStateManager.translate(-this.BookC_open.rotationPointX * f5, -this.BookC_open.rotationPointY * f5, -this.BookC_open.rotationPointZ * f5);
			this.BookC_open.render(f5);
			GlStateManager.popMatrix();
		}	
		else 
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookC.offsetX, this.BookC.offsetY, this.BookC.offsetZ);
			GlStateManager.translate(this.BookC.rotationPointX * f5, this.BookC.rotationPointY * f5, this.BookC.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookC.offsetX, -this.BookC.offsetY, -this.BookC.offsetZ);
			GlStateManager.translate(-this.BookC.rotationPointX * f5, -this.BookC.rotationPointY * f5, -this.BookC.rotationPointZ * f5);
			this.BookC.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookC_open.offsetX, this.BookC_open.offsetY, this.BookC_open.offsetZ);
			GlStateManager.translate(this.BookC_open.rotationPointX * f5, this.BookC_open.rotationPointY * f5, this.BookC_open.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookC_open.offsetX, -this.BookC_open.offsetY, -this.BookC_open.offsetZ);
			GlStateManager.translate(-this.BookC_open.rotationPointX * f5, -this.BookC_open.rotationPointY * f5, -this.BookC_open.rotationPointZ * f5);
			this.BookC_open.render(f5);
			GlStateManager.popMatrix();

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
			}

		}
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

		/*		if (this.swingProgress > 0.0F) {
			EnumHandSide side = this.getMainHand(entity);
			ModelRenderer arm = this.getArmForSide(side);
			float f1 = this.swingProgress;
			f1 = 1.0F - this.swingProgress;
			f1 = f1 * f1;
			f1 = f1 * f1;
			f1 = 1.0F - f1;
			float f2 = MathHelper.sin(f1 * (float) Math.PI);
			float f3 = MathHelper.sin(this.swingProgress * (float) Math.PI) *
						-(this.bipedHead.rotateAngleX - 0.7F)* 0.75F;
			arm.rotateAngleX = (float) (arm.rotateAngleX - (f2 * 1.2D + f3));
			arm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
			arm.rotateAngleZ += MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
		}
		 */	}
	protected void setAngle(ModelRenderer m1, ModelRenderer m2) {
		m1.rotationPointX = m2.rotationPointX;
		m1.rotationPointY = m2.rotationPointY;
		m1.rotationPointZ = m2.rotationPointZ;

		m1.rotateAngleX = m2.rotateAngleX;
		m1.rotateAngleY = m2.rotateAngleY;
		m1.rotateAngleZ = m2.rotateAngleZ;
	}
}
