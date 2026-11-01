package rider.wmod.rendering.models.items.zio;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.zio.ArmorHattari;

/**
 * ModelHattari - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelHattari extends ModelBiped {
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer RightLeg;
	public ModelRenderer Body2;
	public ModelRenderer tire1;
	public ModelRenderer Head2L;
	public ModelRenderer Head2R;
	public ModelRenderer Head3R;
	public ModelRenderer Head3L;
	public ModelRenderer Head4R;
	public ModelRenderer Head4R_1;
	public ModelRenderer Head5L;
	public ModelRenderer Head5L_1;
	public ModelRenderer muffler2;
	public ModelRenderer HeadShuriken4;
	public ModelRenderer HeadShuriken2;
	public ModelRenderer HeadShuriken1;
	public ModelRenderer HeadShuriken7;
	public ModelRenderer HeadShuriken6;
	public ModelRenderer HeadShuriken9;
	public ModelRenderer HeadShuriken3;
	public ModelRenderer HeadShuriken8;
	public ModelRenderer HeadShuriken5;
	public ModelRenderer platebase;
	public ModelRenderer shuriken2;
	public ModelRenderer shuriken1;
	public ModelRenderer shuriken3;
	public ModelRenderer Shoulder_L;
	public ModelRenderer HandCoverL;
	public ModelRenderer Shoulder_R;
	public ModelRenderer HandCoverR;

	public ModelHattari() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.HeadShuriken7 = new ModelRenderer(this, 40, 0);
		this.HeadShuriken7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken7.addBox(-2.5F, -9.0F, -5.5F, 4, 2, 1, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.platebase = new ModelRenderer(this, 27, 40);
		this.platebase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.platebase.addBox(-0.5F, 9.0F, -3.25F, 4, 1, 1, 0.0F);
		this.HeadShuriken3 = new ModelRenderer(this, 44, 3);
		this.HeadShuriken3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken3.addBox(-3.5F, -3.0F, -5.5F, 3, 1, 1, 0.0F);
		this.HeadShuriken5 = new ModelRenderer(this, 34, 2);
		this.HeadShuriken5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken5.addBox(0.5F, -5.0F, -5.5F, 1, 1, 1, 0.0F);
		this.Head5L = new ModelRenderer(this, 0, 0);
		this.Head5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5L.addBox(-5.0F, -3.25F, -4.6F, 1, 2, 4, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.25F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head4R_1 = new ModelRenderer(this, 0, 0);
		this.Head4R_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4R_1.addBox(-3.0F, -2.0F, -4.85F, 1, 2, 1, 0.0F);
		this.Head5L_1 = new ModelRenderer(this, 0, 0);
		this.Head5L_1.mirror = true;
		this.Head5L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5L_1.addBox(4.0F, -3.25F, -4.6F, 1, 2, 4, 0.0F);
		this.HeadShuriken2 = new ModelRenderer(this, 36, 0);
		this.HeadShuriken2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken2.addBox(-2.5F, -5.0F, -5.5F, 3, 2, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Head2R = new ModelRenderer(this, 24, 0);
		this.Head2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2R.addBox(0.9F, -10.0F, -2.0F, 1, 2, 3, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head2L = new ModelRenderer(this, 24, 0);
		this.Head2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2L.addBox(-2.0F, -10.0F, -2.0F, 1, 2, 3, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.25F, -2.6F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Body2 = new ModelRenderer(this, 37, 37);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.HeadShuriken6 = new ModelRenderer(this, 37, 4);
		this.HeadShuriken6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken6.addBox(2.5F, -6.5F, -5.5F, 2, 4, 1, 0.0F);
		this.HandCoverL = new ModelRenderer(this, 1, 49);
		this.HandCoverL.mirror = true;
		this.HandCoverL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverL.addBox(2.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.HeadShuriken9 = new ModelRenderer(this, 47, 1);
		this.HeadShuriken9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken9.addBox(1.5F, -9.0F, -5.5F, 2, 1, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.HeadShuriken4 = new ModelRenderer(this, 32, 0);
		this.HeadShuriken4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken4.addBox(-4.5F, -6.0F, -5.5F, 2, 3, 1, 0.0F);
		this.Head3R = new ModelRenderer(this, 1, 0);
		this.Head3R.mirror = true;
		this.Head3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3R.addBox(3.0F, -3.0F, -4.7F, 1, 3, 4, 0.0F);
		this.Head3L = new ModelRenderer(this, 1, 0);
		this.Head3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3L.addBox(-4.0F, -3.0F, -4.7F, 1, 3, 4, 0.0F);
		this.tire1 = new ModelRenderer(this, 52, 0);
		this.tire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire1.addBox(2.0F, -3.75F, -1.5F, 2, 12, 3, 0.0F);
		this.setRotateAngle(tire1, 0.0F, 0.0F, 0.8726646259971648F);
		this.shuriken2 = new ModelRenderer(this, 29, 38);
		this.shuriken2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken2.addBox(-1.5F, 10.0F, -3.5F, 2, 1, 1, 0.0F);
		this.Head4R = new ModelRenderer(this, 0, 0);
		this.Head4R.mirror = true;
		this.Head4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4R.addBox(2.0F, -2.0F, -4.85F, 1, 2, 1, 0.0F);
		this.HeadShuriken1 = new ModelRenderer(this, 31, 4);
		this.HeadShuriken1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken1.addBox(-1.5F, -7.0F, -5.5F, 4, 2, 1, 0.0F);
		this.muffler2 = new ModelRenderer(this, 57, 0);
		this.muffler2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.muffler2.addBox(-1.0F, -6.5F, 4.0F, 2, 15, 1, 0.0F);
		this.HeadShuriken8 = new ModelRenderer(this, 45, 0);
		this.HeadShuriken8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadShuriken8.addBox(-1.5F, -10.0F, -5.5F, 4, 1, 1, 0.0F);
		this.shuriken3 = new ModelRenderer(this, 31, 37);
		this.shuriken3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken3.addBox(0.5F, 9.0F, -3.5F, 1, 1, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.shuriken1 = new ModelRenderer(this, 29, 36);
		this.shuriken1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken1.addBox(-1.5F, 8.0F, -3.5F, 2, 2, 1, 0.0F);
		this.HandCoverR = new ModelRenderer(this, 1, 49);
		this.HandCoverR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverR.addBox(-3.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Head.addChild(this.HeadShuriken7);
		this.Body.addChild(this.platebase);
		this.Head.addChild(this.HeadShuriken3);
		this.Head.addChild(this.HeadShuriken5);
		this.Head.addChild(this.Head5L);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Head.addChild(this.Head4R_1);
		this.Head.addChild(this.Head5L_1);
		this.Head.addChild(this.HeadShuriken2);
		this.Head.addChild(this.Head2R);
		this.Head.addChild(this.Head2L);
		this.RightArm.addChild(this.Shoulder_R);
		this.Head.addChild(this.HeadShuriken6);
		this.LeftArm.addChild(this.HandCoverL);
		this.Head.addChild(this.HeadShuriken9);
		this.Head.addChild(this.HeadShuriken4);
		this.Head.addChild(this.Head3R);
		this.Head.addChild(this.Head3L);
		this.Body.addChild(this.shuriken2);
		this.Head.addChild(this.Head4R);
		this.Head.addChild(this.HeadShuriken1);
		this.Head.addChild(this.muffler2);
		this.Head.addChild(this.HeadShuriken8);
		this.Body.addChild(this.shuriken3);
		this.Body.addChild(this.shuriken1);
		this.RightArm.addChild(this.HandCoverR);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (ArmorHattari.isInvisible==1||ArmorHattari.drivercheck==0)
		{
			this.Head.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.Body.showModel=false;
			this.tire1.showModel=false;
			this.Body2.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;
		}
		else
		{
			this.Head.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.Body.showModel=true;
			this.tire1.showModel=true;
			this.Body2.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;
		}

		if (this.isChild) {
			this.LeftLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.Body2.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			this.RightArm.render(f5);

		}else {
			if (entity.isSneaking()) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.LeftLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.Body2.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			this.RightArm.render(f5);

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
			setAngle(Head, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
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
