package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.exaid.ArmorGamerDriver;
import rider.wmod.items.armor.exaid.ArmorRidePlayer;

/**
 * ModelRidePlayer - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRidePlayer extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer gashat;
	public ModelRenderer Belt;
	public ModelRenderer Head2;
	public ModelRenderer Lever;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer backle;
	public ModelRenderer slot1;
	public ModelRenderer screen;

	public ModelRidePlayer() {

		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.slot1 = new ModelRenderer(this, 2, 48);
		this.slot1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.slot1.addBox(1.0F, 9.0F, -4.0F, 1, 2, 2, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.backle = new ModelRenderer(this, 21, 36);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-2.0F, 8.5F, -2.5F, 4, 2, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.36F);
		this.gashat = new ModelRenderer(this, 0, 54);
		this.gashat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.gashat.addBox(3.0F, 6.5F, -3.8F, 1, 2, 1, 0.0F);
		this.screen = new ModelRenderer(this, 10, 48);
		this.screen.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.screen.addBox(-1.0F, 8.0F, -4.1F, 2, 3, 1, 0.0F);
		this.Lever = new ModelRenderer(this, 7, 53);
		this.Lever.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Lever.addBox(-4.0F, 8.0F, -4.6F, 3, 3, 1, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Head2 = new ModelRenderer(this, 1, 2);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-3.5F, -8.5F, -3.5F, 7, 7, 7, 0.51F);
		this.Belt = new ModelRenderer(this, 16, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);

		this.Lever.addChild(this.slot1);
		this.Belt.addChild(this.backle);
		this.Lever.addChild(this.screen);
		this.RightArm.addChild(this.Shoulder_R);
		this.LeftArm.addChild(this.Shoulder_L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorRidePlayer.isInvisible==1)
		{
			this.RightLeg.showModel=false;
			this.Belt.showModel=false;
			this.Head.showModel=false;
			this.Head2.showModel=false;
			this.Body.showModel=false;
			this.LeftArm.showModel=false;
			this.RightArm.showModel=false;
			this.gashat.showModel=false;
			this.LeftLeg.showModel=false;
			this.Belt.showModel=false;
			this.Lever.showModel=false;
		}
		else {
			this.RightLeg.showModel=true;
			this.Head.showModel=true;
			this.Head2.showModel=true;
			this.Body.showModel=true;
			this.LeftArm.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;

			if(ArmorRidePlayer.DriverCheck==1)
			{
				this.Belt.showModel=false;
				this.gashat.showModel=true;
				if(ArmorGamerDriver.gashatIn2==1) 
				{
					this.Lever.showModel=true;
				}else {
					this.Lever.showModel=false;
				}
			}
			else//
			{
				this.Lever.showModel=false;
				this.gashat.showModel=false;

				if (entity.isSneaking())
				{
					this.Belt.showModel=false;
				}
				else
				{
					this.Belt.showModel=true;
				}
			}
		}

		if (this.isChild) {

			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			this.Lever.render(f5);
			this.Head2.render(f5);
			this.Belt.render(f5);
			this.RightArm.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			this.Lever.render(f5);
			this.Head2.render(f5);
			this.Belt.render(f5);
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
			setAngle(Head2, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(gashat, this.bipedBody);
			setAngle(Lever, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
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
