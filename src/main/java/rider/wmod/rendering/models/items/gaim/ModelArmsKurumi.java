package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.gaim.ls.ArmorGaimKurumi;

/**
 * ModelArmsKurumi - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelArmsKurumi extends ModelBiped {
	public ModelRenderer ArmsHead;
	public ModelRenderer ArmsHelm;
	public ModelRenderer LS_up;
	public ModelRenderer LS_down;
	public ModelRenderer LS_close;
	public ModelRenderer ArmsBody;
	public ModelRenderer ArmsKnuckleL;
	public ModelRenderer ArmsKnuckleR;
	public ModelRenderer ArmsHeadHeta;
	public ModelRenderer ArmsHeadHetaL;
	public ModelRenderer ArmsHeadHetaR;
	public ModelRenderer ArmsHeadHeta2;
	public ModelRenderer ArmsHeadHeta3;
	public ModelRenderer LS_up2;
	public ModelRenderer ArmsBodyFrame;
	public ModelRenderer ArmsShoulderL;
	public ModelRenderer ArmsShoulderR;
	public ModelRenderer ArmsBodyBack;
	public ModelRenderer ArmsBodyFrame2;
	public ModelRenderer ArmsShoulderL3;
	public ModelRenderer ArmsShoulderL2;
	public ModelRenderer ArmsShoulderR3;
	public ModelRenderer ArmsShoulderR2;
	public ModelRenderer ArmsKnuckleL2;
	public ModelRenderer ArmsKnuckleR2;

	public ModelArmsKurumi() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.ArmsKnuckleR = new ModelRenderer(this, 44, 41);
		this.ArmsKnuckleR.mirror = true;
		this.ArmsKnuckleR.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.ArmsKnuckleR.addBox(-1.0F, 6.5F, -2.5F, 5, 6, 5, 0.5F);
		this.ArmsBodyFrame2 = new ModelRenderer(this, 38, 39);
		this.ArmsBodyFrame2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyFrame2.addBox(3.0F, -0.6F, -2.0F, 2, 1, 3, 0.0F);
		this.ArmsShoulderR = new ModelRenderer(this, 0, 32);
		this.ArmsShoulderR.mirror = true;
		this.ArmsShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderR.addBox(4.5F, -1.0F, -3.0F, 3, 4, 6, 0.0F);
		this.ArmsBodyBack = new ModelRenderer(this, 40, 32);
		this.ArmsBodyBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyBack.addBox(-4.0F, 0.0F, 2.0F, 8, 5, 1, 0.0F);
		this.ArmsShoulderL2 = new ModelRenderer(this, 0, 42);
		this.ArmsShoulderL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderL2.addBox(-8.5F, -0.5F, -2.5F, 1, 6, 5, 0.0F);
		this.ArmsHead = new ModelRenderer(this, 32, 4);
		this.ArmsHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHead.addBox(-4.0F, -8.0F, -3.75F, 8, 8, 4, 0.4F);
		this.ArmsKnuckleL = new ModelRenderer(this, 44, 41);
		this.ArmsKnuckleL.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.ArmsKnuckleL.addBox(-4.0F, 6.5F, -2.5F, 5, 6, 5, 0.5F);
		this.ArmsKnuckleR2 = new ModelRenderer(this, 30, 48);
		this.ArmsKnuckleR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsKnuckleR2.addBox(1.0F, 6.5F, -4.0F, 2, 3, 1, 0.0F);
		this.setRotateAngle(ArmsKnuckleR2, 0.0F, 0.0F, 0.2617993877991494F);
		this.ArmsShoulderL3 = new ModelRenderer(this, 0, 54);
		this.ArmsShoulderL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderL3.addBox(-9.5F, 0.5F, -2.0F, 1, 6, 4, 0.0F);
		this.ArmsKnuckleL2 = new ModelRenderer(this, 30, 48);
		this.ArmsKnuckleL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsKnuckleL2.addBox(-3.0F, 6.5F, -4.0F, 2, 3, 1, 0.0F);
		this.setRotateAngle(ArmsKnuckleL2, 0.0F, 0.0F, -0.2617993877991494F);
		this.ArmsHeadHetaL = new ModelRenderer(this, 56, 9);
		this.ArmsHeadHetaL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHetaL.addBox(-5.8F, -7.5F, -0.75F, 1, 6, 1, 0.0F);
		this.ArmsHelm = new ModelRenderer(this, 32, 4);
		this.ArmsHelm.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm.addBox(-4.0F, -8.0F, 0.0F, 8, 8, 4, 0.81F);
		this.ArmsShoulderR2 = new ModelRenderer(this, 0, 43);
		this.ArmsShoulderR2.mirror = true;
		this.ArmsShoulderR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderR2.addBox(7.5F, -0.5F, -2.5F, 1, 6, 5, 0.0F);
		this.ArmsHeadHeta2 = new ModelRenderer(this, 24, 6);
		this.ArmsHeadHeta2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHeta2.addBox(-1.5F, -9.8F, -0.75F, 3, 1, 1, 0.0F);
		this.ArmsShoulderL = new ModelRenderer(this, 0, 32);
		this.ArmsShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderL.addBox(-7.5F, -1.0F, -3.0F, 3, 4, 6, 0.0F);
		this.ArmsHeadHetaR = new ModelRenderer(this, 56, 9);
		this.ArmsHeadHetaR.mirror = true;
		this.ArmsHeadHetaR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHetaR.addBox(4.8F, -7.5F, -0.75F, 1, 6, 1, 0.0F);
		this.ArmsBody = new ModelRenderer(this, 40, 32);
		this.ArmsBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBody.addBox(-4.0F, -0.5F, -3.0F, 8, 6, 1, 0.0F);
		this.ArmsHeadHeta = new ModelRenderer(this, 24, 6);
		this.ArmsHeadHeta.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHeta.addBox(-4.5F, -9.5F, -0.75F, 2, 1, 1, 0.0F);
		this.ArmsBodyFrame = new ModelRenderer(this, 38, 39);
		this.ArmsBodyFrame.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyFrame.addBox(-5.0F, -0.6F, -2.0F, 2, 1, 3, 0.0F);
		this.ArmsShoulderR3 = new ModelRenderer(this, 0, 54);
		this.ArmsShoulderR3.mirror = true;
		this.ArmsShoulderR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderR3.addBox(8.5F, 0.5F, -2.0F, 1, 6, 4, 0.0F);
		this.ArmsHeadHeta3 = new ModelRenderer(this, 24, 6);
		this.ArmsHeadHeta3.mirror = true;
		this.ArmsHeadHeta3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHeta3.addBox(2.5F, -9.5F, -0.75F, 2, 1, 1, 0.0F);

		this.LS_up = new ModelRenderer(this, 28, 41);
		this.LS_up.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LS_up.addBox(-0.5F, 8.75F, -3.2F, 1, 1, 1, 0.2F);
		this.LS_up2 = new ModelRenderer(this, 30, 41);
		this.LS_up2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LS_up2.addBox(-0.5F, 8.75F, -3.6F, 1, 1, 1, 0.0F);
		this.LS_down = new ModelRenderer(this, 32, 41);
		this.LS_down.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LS_down.addBox(-0.5F, 10.05F, -3.3F, 1, 1, 1, 0.1F);
		this.LS_close = new ModelRenderer(this, 34, 41);
		this.LS_close.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LS_close.addBox(-0.5F, 8.75F, -3.25F, 1, 1, 1, 0.2F);

		this.ArmsBody.addChild(this.ArmsBodyFrame2);
		this.ArmsBody.addChild(this.ArmsShoulderR);
		this.ArmsBody.addChild(this.ArmsBodyBack);
		this.ArmsShoulderL.addChild(this.ArmsShoulderL2);
		this.ArmsKnuckleR.addChild(this.ArmsKnuckleR2);
		this.ArmsShoulderL.addChild(this.ArmsShoulderL3);
		this.ArmsKnuckleL.addChild(this.ArmsKnuckleL2);
		this.ArmsHelm.addChild(this.ArmsHeadHetaL);
		this.ArmsShoulderR.addChild(this.ArmsShoulderR2);
		this.LS_up.addChild(this.LS_up2);
		this.ArmsHelm.addChild(this.ArmsHeadHeta2);
		this.ArmsBody.addChild(this.ArmsShoulderL);
		this.ArmsHelm.addChild(this.ArmsHeadHetaR);
		this.ArmsHelm.addChild(this.ArmsHeadHeta);
		this.ArmsBody.addChild(this.ArmsBodyFrame);
		this.ArmsShoulderR.addChild(this.ArmsShoulderR3);
		this.ArmsHelm.addChild(this.ArmsHeadHeta3);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGaimKurumi.DriverCheck==1)
		{
			this.ArmsHead.showModel=true;
			this.ArmsBody.showModel=true;
			this.ArmsHelm.showModel=true;
			this.ArmsKnuckleL.showModel=true;
			this.ArmsKnuckleR.showModel=true;
			this.LS_up.showModel=true;
			this.LS_down.showModel=true;
			this.LS_close.showModel=false;			
		}else	if(ArmorGaimKurumi.DriverCheck==2) {
			this.ArmsHead.showModel=false;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=false;
			this.ArmsKnuckleL.showModel=false;
			this.ArmsKnuckleR.showModel=false;
			this.LS_up.showModel=true;
			this.LS_down.showModel=false;
			this.LS_close.showModel=true;
		}else	if(ArmorGaimKurumi.DriverCheck==3) {
			this.ArmsHead.showModel=true;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=true;
			this.LS_up.showModel=true;
			this.LS_down.showModel=true;
			this.LS_close.showModel=false;
			this.ArmsKnuckleL.showModel=false;
			this.ArmsKnuckleR.showModel=false;
		}else {
			this.ArmsHead.showModel=false;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=false;
			this.ArmsKnuckleL.showModel=false;
			this.ArmsKnuckleR.showModel=false;
			this.LS_up.showModel=false;
			this.LS_down.showModel=false;
			this.LS_close.showModel=false;
		}

		if (this.isChild) {

			this.LS_down.render(f5);

			this.LS_up.render(f5);
			this.ArmsHead.render(f5);
			this.ArmsKnuckleL.render(f5);
			this.ArmsKnuckleR.render(f5);
			this.LS_close.render(f5);
			this.ArmsHelm.render(f5);
			this.ArmsBody.render(f5);
		}else	{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.ArmsHead.render(f5);
			this.ArmsHelm.render(f5);	
			this.ArmsBody.render(f5);
			this.ArmsKnuckleL.render(f5);
			this.ArmsKnuckleR.render(f5);
			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}
			this.LS_up.render(f5);
			this.LS_down.render(f5);
			this.LS_close.render(f5);

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
			setAngle(ArmsHead, this.bipedHead);
			setAngle(ArmsBody, this.bipedBody);
			setAngle(ArmsHelm, this.bipedHead);
			setAngle(ArmsKnuckleL, this.bipedRightArm);
			setAngle(ArmsKnuckleR, this.bipedLeftArm);
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
