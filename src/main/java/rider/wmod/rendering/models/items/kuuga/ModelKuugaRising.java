package rider.wmod.rendering.models.items.kuuga;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelKuugaRising - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKuugaRising extends ModelBiped{

	public ModelRenderer Belt;
	public ModelRenderer driver;
	public ModelRenderer beltL;
	public ModelRenderer beltR;
	public ModelRenderer sideL;
	public ModelRenderer sideL_1;
	public ModelRenderer beltL2;
	public ModelRenderer beltR2;

	public ModelKuugaRising() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.sideL_1 = new ModelRenderer(this, 43, 35);
		this.sideL_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.sideL_1.addBox(-4.75F, 8.5F, -1.0F, 1, 2, 2, 0.0F);
		
		this.beltR2 = new ModelRenderer(this, 38, 36);
		this.beltR2.mirror = true;
		this.beltR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR2.addBox(-4.0F, 9.0F, -2.5F, 1, 1, 1, 0.0F);
		this.driver = new ModelRenderer(this, 25, 36);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 8.5F, -3.0F, 2, 2, 1, 0.0F);
		this.sideL = new ModelRenderer(this, 43, 35);
		this.sideL.mirror = true;
		this.sideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.sideL.addBox(3.75F, 8.5F, -1.0F, 1, 2, 2, 0.0F);

		this.beltL = new ModelRenderer(this, 31, 36);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(1.0F, 8.5F, -2.7F, 2, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.beltR = new ModelRenderer(this, 19, 36);
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-3.0F, 8.5F, -2.7F, 2, 2, 1, 0.0F);
		this.beltL2 = new ModelRenderer(this, 38, 36);
		this.beltL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL2.addBox(3.0F, 9.0F, -2.5F, 1, 1, 1, 0.0F);
		this.Belt.addChild(this.sideL_1);
		this.Belt.addChild(this.beltR2);
		this.Belt.addChild(this.driver);
		this.Belt.addChild(this.sideL);
		this.Belt.addChild(this.beltR);
		this.Belt.addChild(this.beltL2);
		this.Belt.addChild(this.beltL);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild)
		{
			this.Belt.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			
			this.Belt.render(f5);
			
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
