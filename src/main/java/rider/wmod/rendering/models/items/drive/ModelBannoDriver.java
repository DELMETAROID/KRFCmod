package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * ModelBannoDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelBannoDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer ShiftBless;
	public ModelRenderer backle;
	public ModelRenderer DriverBase;
	public ModelRenderer DriverTop;
	public ModelRenderer DriverPlug;
	public ModelRenderer LeftArmShift;

	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Body2;
	public ModelRenderer tire1;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer HandCoverR;
	public ModelRenderer Head2L;
	public ModelRenderer Head2R;
	public ModelRenderer Head3L;
	public ModelRenderer Head3R;
	public ModelRenderer Head4L;
	public ModelRenderer Head4R;
	public ModelRenderer HeadBar;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer HandCoverL;
	public ModelRenderer tire2;
	public ModelRenderer tire3;

	public ModelBannoDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Belt = new ModelRenderer(this, 25, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.DriverBase = new ModelRenderer(this, 21, 41);
		this.DriverBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBase.addBox(-3.5F, 8.5F, -2.5F, 7, 2, 1, 0.0F);
		this.ShiftBless = new ModelRenderer(this, 52, 15);
		this.ShiftBless.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShiftBless.addBox(2.75F, 3.0F, -7.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(ShiftBless, 0.7853981633974483F, 0.0F, 0.0F);
		this.backle = new ModelRenderer(this, 27, 37);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-2.5F, 2.8F, -10.0F, 5, 2, 2, 0.0F);
		this.setRotateAngle(backle, 0.9599310885968813F, 0.0F, 0.0F);
		this.DriverTop = new ModelRenderer(this, 29, 42);
		this.DriverTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverTop.addBox(-1.5F, 7.75F, -2.2F, 3, 1, 1, 0.0F);
		this.DriverPlug = new ModelRenderer(this, 23, 42);
		this.DriverPlug.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverPlug.addBox(-6.5F, 5.75F, -2.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(DriverPlug, 0.0F, 0.0F, -0.5235987755982988F);
		this.LeftArmShift = new ModelRenderer(this, 0, 0);
		this.LeftArmShift.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmShift.addBox(-1.0F, -1.75F, 0.0F, 1, 1, 1, 0.16F);
		this.Belt.addChild(this.DriverBase);
		this.Belt.addChild(this.backle);
		this.Belt.addChild(this.DriverTop);
		this.Belt.addChild(this.DriverPlug);
		this.LeftArmShift.addChild(this.ShiftBless);

		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.HandCoverR = new ModelRenderer(this, 1, 42);
		this.HandCoverR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverR.addBox(-3.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 42);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(4.0F, -2.2F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.08726646259971647F);
		this.Head3R = new ModelRenderer(this, 0, 0);
		this.Head3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3R.addBox(3.5F, -10.0F, -1.0F, 1, 1, 3, 0.0F);
		this.Head2R = new ModelRenderer(this, 0, 0);
		this.Head2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2R.addBox(3.0F, -9.5F, -4.0F, 1, 1, 3, 0.0F);
		this.Head3L = new ModelRenderer(this, 0, 0);
		this.Head3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3L.addBox(-4.5F, -10.0F, -1.0F, 1, 1, 3, 0.0F);
		this.Head4R = new ModelRenderer(this, 24, 3);
		this.Head4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4R.addBox(3.5F, -10.5F, 2.0F, 1, 1, 4, 0.0F);
		this.Head4L = new ModelRenderer(this, 24, 3);
		this.Head4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4L.addBox(-4.5F, -10.5F, 2.0F, 1, 1, 4, 0.0F);
		this.Body2 = new ModelRenderer(this, 37, 37);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);

		this.Head2L = new ModelRenderer(this, 0, 0);
		this.Head2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2L.addBox(-4.0F, -9.5F, -4.0F, 1, 1, 3, 0.0F);
		this.HandCoverL = new ModelRenderer(this, 1, 42);
		this.HandCoverL.mirror = true;
		this.HandCoverL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverL.addBox(2.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-4.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 42);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-5.0F, -2.2F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F,  0.08726646259971647F);

		this.tire1 = new ModelRenderer(this, 39, 0);
		this.tire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire1.addBox(2.0F, -3.75F, -1.5F, 2, 2, 3, 0.0F);
		this.setRotateAngle(tire1, 0.0F, 0.0F, 0.8726646259971648F);
		this.tire2 = new ModelRenderer(this, 52, 1);
		this.tire2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire2.addBox(2.0F, -1.75F, -1.5F, 2, 8, 3, 0.0F);
		this.tire3 = new ModelRenderer(this, 39, 7);
		this.tire3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire3.addBox(2.0F, 6.25F, -1.5F, 2, 2, 3, 0.0F);

		this.HeadBar = new ModelRenderer(this, 24, 0);
		this.HeadBar.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.HeadBar.addBox(-3.5F, -7.25F, 3.0F, 7, 1, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);

		this.RightArm.addChild(this.HandCoverR);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.Head.addChild(this.Head3R);
		this.Head.addChild(this.Head2R);
		this.Head.addChild(this.Head3L);
		this.tire1.addChild(this.tire2);
		this.Head.addChild(this.Head4R);
		this.Head.addChild(this.Head4L);
		this.tire1.addChild(this.tire3);
		this.Head.addChild(this.Head2L);
		this.LeftArm.addChild(this.HandCoverL);
		this.RightArm.addChild(this.Shoulder_R);
		this.RightArm.addChild(this.Shoulder_R3);
		this.Head.addChild(this.HeadBar);
		this.LeftArm.addChild(this.Shoulder_L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (this.isChild) {		
			this.LeftArmShift.render(f5);
			this.Belt.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			this.LeftArmShift.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Belt.render(f5);
			this.LeftArmShift.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			this.LeftArmShift.render(f5);
			this.LeftArm.render(f5);
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
			setAngle(LeftArmShift, this.bipedLeftArm);
			setAngle(Belt, this.bipedBody);
			setAngle(Head, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(LeftArmShift, this.bipedLeftArm);
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
