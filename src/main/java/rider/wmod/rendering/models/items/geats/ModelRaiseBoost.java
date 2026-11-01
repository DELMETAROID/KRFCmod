package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * ModelRaiseBoost - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRaiseBoost extends ModelBiped {
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer BlankHead;
	public ModelRenderer Body2;
	public ModelRenderer Raisebackle3_UP;
	public ModelRenderer Raisebackle2_Up;
	public ModelRenderer Raisebackle1_UP;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer HandBoosterL2;
	public ModelRenderer HandBoosterL;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer HandBoosterR;
	public ModelRenderer HandBoosterR2;
	public ModelRenderer LeftArmBase;
	public ModelRenderer RightArmBase;

	public ModelRaiseBoost() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Raisebackle2_Up = new ModelRenderer(this, 25, 41);
		this.Raisebackle2_Up.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle2_Up.addBox(-2.5F, 9.5F, -3.3F, 2, 2, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Raisebackle3_UP = new ModelRenderer(this, 28, 41);
		this.Raisebackle3_UP.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle3_UP.addBox(-0.45F, 8.0F, -3.3F, 1, 1, 1, 0.0F);
		this.HandBoosterL2 = new ModelRenderer(this, 2, 52);
		this.HandBoosterL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBoosterL2.addBox(3.3F, 1.5F, 3.0F, 1, 4, 1, 0.0F);
		this.setRotateAngle(HandBoosterL2, -0.6981317007977318F, 0.0F, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.HandBoosterR2 = new ModelRenderer(this, 2, 52);
		this.HandBoosterR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBoosterR2.addBox(-4.3F, 1.5F, 3.0F, 1, 4, 1, 0.0F);
		this.setRotateAngle(HandBoosterR2, -0.6981317007977318F, 0.0F, 0.0F);
		this.HandBoosterR = new ModelRenderer(this, 0, 51);
		this.HandBoosterR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBoosterR.addBox(-4.2F, 0.1F, 4.4F, 1, 5, 1, 0.0F);
		this.setRotateAngle(HandBoosterR, -0.7853981633974483F, 0.0F, 0.0F);
		this.Body2 = new ModelRenderer(this, 16, 17);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 5, 4, 0.5F);
		this.Shoulder_R = new ModelRenderer(this, 0, 39);
		this.Shoulder_R.mirror = true;
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-0.5F, -1.0F, -2.5F, 1, 2, 5, 0.0F);
		this.HandBoosterL = new ModelRenderer(this, 0, 51);
		this.HandBoosterL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBoosterL.addBox(3.2F, 0.1F, 4.4F, 1, 5, 1, 0.0F);
		this.setRotateAngle(HandBoosterL, -0.7853981633974483F, 0.0F, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 32);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-4.5F, -2.0F, -2.0F, 1, 3, 4, 0.0F);
		this.Shoulder_L2 = new ModelRenderer(this, 0, 39);
		this.Shoulder_L2.mirror = true;
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(1.5F, -2.4F, -2.5F, 3, 4, 5, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 39);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-3.5F, -2.4F, -2.5F, 3, 4, 5, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 32);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(4.5F, -2.0F, -2.0F, 1, 3, 4, 0.0F);
		this.Raisebackle1_UP = new ModelRenderer(this, 21, 42);
		this.Raisebackle1_UP.mirror = true;
		this.Raisebackle1_UP.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle1_UP.addBox(-3.5F, 18.5F, -3.1F, 1, 1, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 39);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.5F, -1.0F, -2.5F, 1, 2, 5, 0.0F);
		this.BlankHead = new ModelRenderer(this, 32, 31);
		this.BlankHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlankHead.addBox(-4.0F, -7.0F, -4.0F, 8, 7, 8, 0.21F);
		this.LeftArm.addChild(this.HandBoosterL2);
		this.RightArm.addChild(this.HandBoosterR2);
		this.RightArm.addChild(this.HandBoosterR);

		this.LeftArmBase = new ModelRenderer(this, 32, 48);
		this.LeftArmBase.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmBase.addBox(-1.0F, -1.75F, 0.0F, 1, 1, 1, 0.26F);
		this.RightArmBase = new ModelRenderer(this, 40, 16);
		this.RightArmBase.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArmBase.addBox(-3.0F, -1.75F, 0.0F, 1, 1, 1, 0.26F);

		this.LeftArmBase.addChild(this.HandBoosterL);
		this.RightArmBase.addChild(this.Shoulder_R3);
		this.LeftArmBase.addChild(this.Shoulder_L2);
		this.RightArmBase.addChild(this.Shoulder_R2);
		this.LeftArmBase.addChild(this.Shoulder_L3);
		this.LeftArmBase.addChild(this.Shoulder_L);
		this.RightArmBase.addChild(this.Shoulder_R);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle2_Up.offsetX, this.Raisebackle2_Up.offsetY, this.Raisebackle2_Up.offsetZ);
			GlStateManager.translate(this.Raisebackle2_Up.rotationPointX * f5, this.Raisebackle2_Up.rotationPointY * f5, this.Raisebackle2_Up.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.9D, 1.0D);
			GlStateManager.translate(-this.Raisebackle2_Up.offsetX, -this.Raisebackle2_Up.offsetY, -this.Raisebackle2_Up.offsetZ);
			GlStateManager.translate(-this.Raisebackle2_Up.rotationPointX * f5, -this.Raisebackle2_Up.rotationPointY * f5, -this.Raisebackle2_Up.rotationPointZ * f5);
			this.Raisebackle2_Up.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.Raisebackle3_UP.render(f5);
			this.RightArm.render(f5);
			this.Body2.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle1_UP.offsetX, this.Raisebackle1_UP.offsetY, this.Raisebackle1_UP.offsetZ);
			GlStateManager.translate(this.Raisebackle1_UP.rotationPointX * f5, this.Raisebackle1_UP.rotationPointY * f5, this.Raisebackle1_UP.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle1_UP.offsetX, -this.Raisebackle1_UP.offsetY, -this.Raisebackle1_UP.offsetZ);
			GlStateManager.translate(-this.Raisebackle1_UP.rotationPointX * f5, -this.Raisebackle1_UP.rotationPointY * f5, -this.Raisebackle1_UP.rotationPointZ * f5);
			this.Raisebackle1_UP.render(f5);
			GlStateManager.popMatrix();
			this.BlankHead.render(f5);
			this.LeftArmBase.render(f5);
			this.RightArmBase.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.BlankHead.render(f5);
			this.LeftArmBase.render(f5);
			this.RightArmBase.render(f5);
			this.RightArm.render(f5);
			this.Body2.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle2_Up.offsetX, this.Raisebackle2_Up.offsetY, this.Raisebackle2_Up.offsetZ);
			GlStateManager.translate(this.Raisebackle2_Up.rotationPointX * f5, this.Raisebackle2_Up.rotationPointY * f5, this.Raisebackle2_Up.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.9D, 1.0D);
			GlStateManager.translate(-this.Raisebackle2_Up.offsetX, -this.Raisebackle2_Up.offsetY, -this.Raisebackle2_Up.offsetZ);
			GlStateManager.translate(-this.Raisebackle2_Up.rotationPointX * f5, -this.Raisebackle2_Up.rotationPointY * f5, -this.Raisebackle2_Up.rotationPointZ * f5);
			this.Raisebackle2_Up.render(f5);
			GlStateManager.popMatrix();

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.02F);
			}

			this.Raisebackle3_UP.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.27F, -0.31F);
			}	

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle1_UP.offsetX, this.Raisebackle1_UP.offsetY, this.Raisebackle1_UP.offsetZ);
			GlStateManager.translate(this.Raisebackle1_UP.rotationPointX * f5, this.Raisebackle1_UP.rotationPointY * f5, this.Raisebackle1_UP.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle1_UP.offsetX, -this.Raisebackle1_UP.offsetY, -this.Raisebackle1_UP.offsetZ);
			GlStateManager.translate(-this.Raisebackle1_UP.rotationPointX * f5, -this.Raisebackle1_UP.rotationPointY * f5, -this.Raisebackle1_UP.rotationPointZ * f5);
			this.Raisebackle1_UP.render(f5);
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
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArmBase, this.bipedLeftArm);
			setAngle(RightArmBase, this.bipedRightArm);
			setAngle(Raisebackle1_UP, this.bipedBody);
			setAngle(Raisebackle2_Up, this.bipedBody);
			setAngle(Raisebackle3_UP, this.bipedBody);
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
