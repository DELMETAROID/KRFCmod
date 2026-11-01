package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * ModelDesirePlayerArmed - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRaiseArmed extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer BlankHead;
	public ModelRenderer Body2;
	public ModelRenderer RaisebackleUp;
	public ModelRenderer Shoulder_R;

	public ModelRaiseArmed() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.7F, -2.7F, -2.5F, 4, 4, 5, 0.0F);
		this.BlankHead = new ModelRenderer(this, 32, 31);
		this.BlankHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlankHead.addBox(-4.0F, -7.0F, -4.0F, 8, 7, 8, 0.21F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body2 = new ModelRenderer(this, 16, 17);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 5, 4, 0.5F);
		this.RaisebackleUp = new ModelRenderer(this, 18, 39);
		this.RaisebackleUp.mirror = true;
		this.RaisebackleUp.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RaisebackleUp.addBox(-1.9F, 9.0F, -3.25F, 1, 1, 1, 0.0F);
		this.RightArm.addChild(this.Shoulder_R);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {

			this.BlankHead.render(f5);
			this.RightArm.render(f5);
			this.Body2.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleUp.offsetX, this.RaisebackleUp.offsetY, this.RaisebackleUp.offsetZ);
			GlStateManager.translate(this.RaisebackleUp.rotationPointX * f5, this.RaisebackleUp.rotationPointY * f5, this.RaisebackleUp.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.0D);
			GlStateManager.translate(-this.RaisebackleUp.offsetX, -this.RaisebackleUp.offsetY, -this.RaisebackleUp.offsetZ);
			GlStateManager.translate(-this.RaisebackleUp.rotationPointX * f5, -this.RaisebackleUp.rotationPointY * f5, -this.RaisebackleUp.rotationPointZ * f5);
			this.RaisebackleUp.render(f5);
			GlStateManager.popMatrix();

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.BlankHead.render(f5);
			this.RightArm.render(f5);
			this.Body2.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleUp.offsetX, this.RaisebackleUp.offsetY, this.RaisebackleUp.offsetZ);
			GlStateManager.translate(this.RaisebackleUp.rotationPointX * f5, this.RaisebackleUp.rotationPointY * f5, this.RaisebackleUp.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.0D);
			GlStateManager.translate(-this.RaisebackleUp.offsetX, -this.RaisebackleUp.offsetY, -this.RaisebackleUp.offsetZ);
			GlStateManager.translate(-this.RaisebackleUp.rotationPointX * f5, -this.RaisebackleUp.rotationPointY * f5, -this.RaisebackleUp.rotationPointZ * f5);
			this.RaisebackleUp.render(f5);
			GlStateManager.popMatrix();

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
		if (entity instanceof EntityArmorStand)
		{
			EntityArmorStand entityarmorstand = (EntityArmorStand)entity;
			this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
			this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
			this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
			this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
			this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
			this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
			this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
			this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
			this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
			this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
			this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
			this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
			this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
			this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
			this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
			this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
			this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
			this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
			this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
			this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
			this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
			copyModelAngles(this.bipedHead, this.bipedHeadwear);
		}else {
			setAngle(BlankHead, this.bipedHead);
			setAngle(Body2, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
		}
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
