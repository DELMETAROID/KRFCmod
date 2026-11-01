package rider.wmod.rendering.models.items.zio;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.zio.ArmorZikuDriver;

/**
 * ModelMiraiDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelMiraiDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer backle;
	public ModelRenderer DriverSideL;
	public ModelRenderer DriverSideR;

	public ModelMiraiDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.DriverSideL = new ModelRenderer(this, 21, 40);
		this.DriverSideL.mirror = true;
		this.DriverSideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverSideL.addBox(-3.5F, 8.5F, -2.85F, 2, 2, 1, 0.0F);
		this.DriverSideR = new ModelRenderer(this, 21, 40);
		this.DriverSideR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverSideR.addBox(1.5F, 8.5F, -2.85F, 2, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.backle = new ModelRenderer(this, 21, 36);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-1.5F, 8.0F, -3.0F, 3, 3, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (ArmorZikuDriver.isInvisible==1)
		{
			this.DriverSideL.showModel=false;
			this.DriverSideR.showModel=false;
			this.Belt.showModel=false;
			this.backle.showModel=false;
		}
		else
		{
			this.DriverSideL.showModel=true;
			this.DriverSideR.showModel=true;
			this.Belt.showModel=true;
			this.backle.showModel=true;
		}

		if (this.isChild) {
			this.DriverSideL.render(f5);
			this.DriverSideR.render(f5);
			this.Belt.render(f5);
			this.backle.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.DriverSideL.render(f5);
			this.DriverSideR.render(f5);
			this.Belt.render(f5);
			this.backle.render(f5);

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

		setAngle(Belt, this.bipedBody);
		setAngle(DriverSideL, this.bipedBody);
		setAngle(DriverSideR, this.bipedBody);
		setAngle(backle, this.bipedBody);


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
