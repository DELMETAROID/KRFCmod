package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * ModelRaiseMagnum - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRaiseMagnum extends ModelBiped {
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer BlankHead;
	public ModelRenderer Body2;
	public ModelRenderer Raisebackle_Roll;
	public ModelRenderer Raisebackle_Top;
	public ModelRenderer Raisebackle_Grip;
	public ModelRenderer Raisebackle_Burrel;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer LeftArmBase;
	public ModelRenderer RightArmBase;

	public ModelRaiseMagnum() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 41);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.5F, -3.0F, -2.5F, 2, 4, 5, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 50);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-4.5F, -2.4F, -2.5F, 2, 3, 5, 0.0F);
		this.Raisebackle_Burrel = new ModelRenderer(this, 29, 42);
		this.Raisebackle_Burrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle_Burrel.addBox(-1.5F, 18.4F, -3.4F, 1, 1, 1, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 50);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(2.5F, -2.4F, -2.5F, 2, 3, 5, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 41);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-2.5F, -3.0F, -2.5F, 2, 4, 5, 0.0F);
		this.Raisebackle_Top = new ModelRenderer(this, 28, 41);
		this.Raisebackle_Top.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle_Top.addBox(-0.45F, 8.0F, -3.3F, 1, 1, 1, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 32);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-0.5F, -3.6F, -2.5F, 1, 4, 5, 0.0F);
		this.Raisebackle_Roll = new ModelRenderer(this, 25, 41);
		this.Raisebackle_Roll.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle_Roll.addBox(-2.5F, 9.5F, -3.3F, 2, 2, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.BlankHead = new ModelRenderer(this, 32, 31);
		this.BlankHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlankHead.addBox(-4.0F, -7.0F, -4.0F, 8, 7, 8, 0.21F);
		this.Raisebackle_Grip = new ModelRenderer(this, 22, 42);
		this.Raisebackle_Grip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle_Grip.addBox(-3.5F, 18.5F, -3.1F, 2, 1, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L2 = new ModelRenderer(this, 0, 32);
		this.Shoulder_L2.mirror = true;
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(-0.5F, -3.6F, -2.5F, 1, 4, 5, 0.0F);
		this.Body2 = new ModelRenderer(this, 16, 17);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 5, 4, 0.5F);
		this.LeftArmBase = new ModelRenderer(this, 32, 48);
		this.LeftArmBase.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmBase.addBox(-1.0F, -1.75F, 0.0F, 1, 1, 1, 0.26F);
		this.RightArmBase = new ModelRenderer(this, 40, 16);
		this.RightArmBase.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArmBase.addBox(-3.0F, -1.75F, 0.0F, 1, 1, 1, 0.26F);
		this.RightArmBase.addChild(this.Shoulder_R3);
		this.RightArmBase.addChild(this.Shoulder_R2);
		this.LeftArmBase.addChild(this.Shoulder_L2);
		this.LeftArmBase.addChild(this.Shoulder_L3);
		this.LeftArmBase.addChild(this.Shoulder_L);
		this.RightArmBase.addChild(this.Shoulder_R);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.BlankHead.render(f5);
			this.LeftArm.render(f5);
			this.Body2.render(f5);
			this.LeftArmBase.render(f5);
			this.RightArmBase.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Burrel.offsetX, this.Raisebackle_Burrel.offsetY, this.Raisebackle_Burrel.offsetZ);
			GlStateManager.translate(this.Raisebackle_Burrel.rotationPointX * f5, this.Raisebackle_Burrel.rotationPointY * f5, this.Raisebackle_Burrel.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Burrel.offsetX, -this.Raisebackle_Burrel.offsetY, -this.Raisebackle_Burrel.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Burrel.rotationPointX * f5, -this.Raisebackle_Burrel.rotationPointY * f5, -this.Raisebackle_Burrel.rotationPointZ * f5);
			this.Raisebackle_Burrel.render(f5);
			GlStateManager.popMatrix();
			this.Raisebackle_Top.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Roll.offsetX, this.Raisebackle_Roll.offsetY, this.Raisebackle_Roll.offsetZ);
			GlStateManager.translate(this.Raisebackle_Roll.rotationPointX * f5, this.Raisebackle_Roll.rotationPointY * f5, this.Raisebackle_Roll.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.9D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Roll.offsetX, -this.Raisebackle_Roll.offsetY, -this.Raisebackle_Roll.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Roll.rotationPointX * f5, -this.Raisebackle_Roll.rotationPointY * f5, -this.Raisebackle_Roll.rotationPointZ * f5);
			this.Raisebackle_Roll.render(f5);
			GlStateManager.popMatrix();;
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Grip.offsetX, this.Raisebackle_Grip.offsetY, this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(this.Raisebackle_Grip.rotationPointX * f5, this.Raisebackle_Grip.rotationPointY * f5, this.Raisebackle_Grip.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Grip.offsetX, -this.Raisebackle_Grip.offsetY, -this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Grip.rotationPointX * f5, -this.Raisebackle_Grip.rotationPointY * f5, -this.Raisebackle_Grip.rotationPointZ * f5);
			this.Raisebackle_Grip.render(f5);
			GlStateManager.popMatrix();

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Body.render(f5);
			this.RightArm.render(f5);
			this.BlankHead.render(f5);
			this.LeftArm.render(f5);
			this.Body2.render(f5);
			this.LeftArmBase.render(f5);
			this.RightArmBase.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Roll.offsetX, this.Raisebackle_Roll.offsetY, this.Raisebackle_Roll.offsetZ);
			GlStateManager.translate(this.Raisebackle_Roll.rotationPointX * f5, this.Raisebackle_Roll.rotationPointY * f5, this.Raisebackle_Roll.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.9D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Roll.offsetX, -this.Raisebackle_Roll.offsetY, -this.Raisebackle_Roll.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Roll.rotationPointX * f5, -this.Raisebackle_Roll.rotationPointY * f5, -this.Raisebackle_Roll.rotationPointZ * f5);
			this.Raisebackle_Roll.render(f5);
			GlStateManager.popMatrix();


			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.02F);
			}	
			this.Raisebackle_Top.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.27F, -0.31F);
			}	

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Grip.offsetX, this.Raisebackle_Grip.offsetY, this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(this.Raisebackle_Grip.rotationPointX * f5, this.Raisebackle_Grip.rotationPointY * f5, this.Raisebackle_Grip.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Grip.offsetX, -this.Raisebackle_Grip.offsetY, -this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Grip.rotationPointX * f5, -this.Raisebackle_Grip.rotationPointY * f5, -this.Raisebackle_Grip.rotationPointZ * f5);
			this.Raisebackle_Grip.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Burrel.offsetX, this.Raisebackle_Burrel.offsetY, this.Raisebackle_Burrel.offsetZ);
			GlStateManager.translate(this.Raisebackle_Burrel.rotationPointX * f5, this.Raisebackle_Burrel.rotationPointY * f5, this.Raisebackle_Burrel.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Burrel.offsetX, -this.Raisebackle_Burrel.offsetY, -this.Raisebackle_Burrel.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Burrel.rotationPointX * f5, -this.Raisebackle_Burrel.rotationPointY * f5, -this.Raisebackle_Burrel.rotationPointZ * f5);
			this.Raisebackle_Burrel.render(f5);
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
			 setAngle(Raisebackle_Roll, this.bipedBody);
			 setAngle(Raisebackle_Top, this.bipedBody);
			 setAngle(Raisebackle_Grip, this.bipedBody);
			 setAngle(Raisebackle_Burrel, this.bipedBody);
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
