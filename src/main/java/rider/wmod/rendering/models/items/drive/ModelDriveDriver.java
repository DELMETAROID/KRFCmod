package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * ModelDriveDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDriveDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer ShiftBless;
	public ModelRenderer backle;
	public ModelRenderer DriverBase;
	public ModelRenderer DriverTop;
	public ModelRenderer DriverPlug;
	public ModelRenderer LeftArmShift;

	public ModelDriveDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Belt = new ModelRenderer(this, 24, 31);
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
		this.LeftArmShift.addBox(-1.0F, 7.0F, -2.0F, 4, 1, 4, 0.16F);
		this.Belt.addChild(this.DriverBase);
		this.Belt.addChild(this.backle);
		this.Belt.addChild(this.DriverTop);
		this.Belt.addChild(this.DriverPlug);
		this.LeftArmShift.addChild(this.ShiftBless);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (this.isChild) {		
			this.LeftArmShift.render(f5);
			this.Belt.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Belt.render(f5);
			this.LeftArmShift.render(f5);

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
