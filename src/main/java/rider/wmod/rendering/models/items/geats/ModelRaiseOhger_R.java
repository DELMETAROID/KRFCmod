package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelDesirePlayerArmed - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRaiseOhger_R extends ModelBiped {
	public ModelRenderer LeftLeg;
	public ModelRenderer RightLeg;
	public ModelRenderer RaisebackleDn;
	public ModelRenderer shape172;
	public ModelRenderer shape172_1;

	public ModelRaiseOhger_R() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape172 = new ModelRenderer(this, 0, 33);
		this.shape172.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape172.addBox(-3.2F, 5.2F, -2.75F, 4, 4, 5, 0.0F);
		this.setRotateAngle(shape172, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape172_1 = new ModelRenderer(this, 0, 33);
		this.shape172_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape172_1.addBox(-3.2F, 5.2F, -2.25F, 4, 4, 5, 0.0F);
		this.setRotateAngle(shape172_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RaisebackleDn = new ModelRenderer(this, 18, 39);
		this.RaisebackleDn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RaisebackleDn.addBox(0.9F, 9.0F, -3.25F, 1, 1, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftLeg.addChild(this.shape172);
		this.RightLeg.addChild(this.shape172_1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			this.LeftLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleDn.offsetX, this.RaisebackleDn.offsetY, this.RaisebackleDn.offsetZ);
			GlStateManager.translate(this.RaisebackleDn.rotationPointX * f5, this.RaisebackleDn.rotationPointY * f5, this.RaisebackleDn.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.0D);
			GlStateManager.translate(-this.RaisebackleDn.offsetX, -this.RaisebackleDn.offsetY, -this.RaisebackleDn.offsetZ);
			GlStateManager.translate(-this.RaisebackleDn.rotationPointX * f5, -this.RaisebackleDn.rotationPointY * f5, -this.RaisebackleDn.rotationPointZ * f5);
			this.RaisebackleDn.render(f5);
			GlStateManager.popMatrix();
			this.RightLeg.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.LeftLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleDn.offsetX, this.RaisebackleDn.offsetY, this.RaisebackleDn.offsetZ);
			GlStateManager.translate(this.RaisebackleDn.rotationPointX * f5, this.RaisebackleDn.rotationPointY * f5, this.RaisebackleDn.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.0D);
			GlStateManager.translate(-this.RaisebackleDn.offsetX, -this.RaisebackleDn.offsetY, -this.RaisebackleDn.offsetZ);
			GlStateManager.translate(-this.RaisebackleDn.rotationPointX * f5, -this.RaisebackleDn.rotationPointY * f5, -this.RaisebackleDn.rotationPointZ * f5);
			this.RaisebackleDn.render(f5);
			GlStateManager.popMatrix();
			this.RightLeg.render(f5);

			if (entity.isSneaking()) {
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

		setAngle(RightLeg, this.bipedRightLeg);
		setAngle(LeftLeg, this.bipedLeftLeg);
		
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
