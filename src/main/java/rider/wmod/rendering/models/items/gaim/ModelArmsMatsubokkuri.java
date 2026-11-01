package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.gaim.ls.ArmorGaimMatsubokkuri;

/**
 * ModelArmsMatsubokkuri - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelArmsMatsubokkuri extends ModelBiped {
	public ModelRenderer ArmsHead;
	public ModelRenderer ArmsHelm;
	public ModelRenderer ArmsBody;
	public ModelRenderer LS_up;
	public ModelRenderer LS_down;
	public ModelRenderer LS_close;
	public ModelRenderer ArmsHelm2L;
	public ModelRenderer ArmsHelm2R;
	public ModelRenderer ArmsHelm3;
	public ModelRenderer ArmsHelm4;
	public ModelRenderer ArmsBodyL1;
	public ModelRenderer ArmsBodyL2;
	public ModelRenderer ArmsBodyR2;
	public ModelRenderer ArmsHingeL;
	public ModelRenderer ArmsHingeR;
	public ModelRenderer ArmsBodyBack2;
	public ModelRenderer ArmsBodyFrame;
	public ModelRenderer ArmsBodyBack;
	public ModelRenderer ArmsBodyR3;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer LS_up2;

	public ModelRenderer ArmsHelm_jimber;
	public ModelRenderer ArmsHelm2L_jimber;
	public ModelRenderer ArmsHelm2R_jimber;
	public ModelRenderer ArmsHelm3_jimber;
	public ModelRenderer ArmsHelm4_jimber;

	public ModelArmsMatsubokkuri() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.ArmsHingeL = new ModelRenderer(this, 56, 24);
		this.ArmsHingeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHingeL.addBox(-7.5F, -1.0F, -1.0F, 2, 1, 2, 0.0F);
		this.ArmsBody = new ModelRenderer(this, 40, 32);
		this.ArmsBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBody.addBox(-3.5F, 0.0F, -2.4F, 7, 7, 1, 0.0F);
		this.ArmsBodyL1 = new ModelRenderer(this, 54, 17);
		this.ArmsBodyL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL1.addBox(-4.1F, 1.5F, -3.5F, 4, 2, 1, 0.0F);
		this.ArmsBodyR2 = new ModelRenderer(this, 56, 20);
		this.ArmsBodyR2.mirror = true;
		this.ArmsBodyR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR2.addBox(0.0F, 3.5F, -3.0F, 3, 3, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-8.5F, 0.0F, -2.5F, 2, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, 0.08726646259971647F);
		this.ArmsHingeR = new ModelRenderer(this, 56, 24);
		this.ArmsHingeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHingeR.addBox(5.5F, -0.75F, -1.0F, 2, 1, 2, 0.0F);
		this.Shoulder_L2 = new ModelRenderer(this, 0, 44);
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(-9.5F, 0.5F, -2.0F, 1, 4, 4, 0.0F);
		this.setRotateAngle(Shoulder_L2, 0.0F, 0.0F, 0.08726646259971647F);
		this.ArmsHead = new ModelRenderer(this, 32, 4);
		this.ArmsHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHead.addBox(-4.0F, -8.0F, -3.75F, 8, 8, 4, 0.4F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.mirror = true;
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(6.5F, 0.0F, -2.5F, 2, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, -0.08726646259971647F);
		this.ArmsHelm2L = new ModelRenderer(this, 48, 53);
		this.ArmsHelm2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm2L.addBox(-5.5F, -5.0F, -0.75F, 1, 5, 6, 0.0F);
		this.ArmsHelm3 = new ModelRenderer(this, 36, 2);
		this.ArmsHelm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm3.addBox(-4.5F, -5.0F, 4.75F, 9, 5, 1, 0.0F);
		this.ArmsHelm2R = new ModelRenderer(this, 48, 53);
		this.ArmsHelm2R.mirror = true;
		this.ArmsHelm2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm2R.addBox(4.5F, -5.0F, -0.75F, 1, 5, 6, 0.0F);
		this.ArmsHelm4 = new ModelRenderer(this, 38, 40);
		this.ArmsHelm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm4.addBox(-2.5F, -9.8F, -0.8F, 5, 1, 3, 0.0F);
		this.ArmsBodyL2 = new ModelRenderer(this, 56, 20);
		this.ArmsBodyL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL2.addBox(-3.0F, 3.5F, -3.0F, 3, 3, 1, 0.0F);
		this.ArmsBodyFrame = new ModelRenderer(this, 31, 44);
		this.ArmsBodyFrame.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyFrame.addBox(-6.5F, -0.5F, -1.5F, 13, 1, 3, 0.0F);
		this.ArmsBodyR3 = new ModelRenderer(this, 54, 17);
		this.ArmsBodyR3.mirror = true;
		this.ArmsBodyR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR3.addBox(0.1F, 1.5F, -3.5F, 4, 2, 1, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 44);
		this.Shoulder_R2.mirror = true;
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(8.5F, 0.5F, -2.0F, 1, 4, 4, 0.0F);
		this.setRotateAngle(Shoulder_R2, 0.0F, 0.0F, -0.08726646259971647F);
		this.ArmsHelm = new ModelRenderer(this, 32, 4);
		this.ArmsHelm.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm.addBox(-4.0F, -8.0F, 0.0F, 8, 4, 4, 0.81F);
		this.ArmsBodyBack = new ModelRenderer(this, 40, 32);
		this.ArmsBodyBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyBack.addBox(-3.5F, 0.0F, 1.5F, 7, 6, 1, 0.0F);
		this.ArmsBodyBack2 = new ModelRenderer(this, 49, 35);
		this.ArmsBodyBack2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyBack2.addBox(-2.5F, 0.5F, 2.5F, 5, 4, 1, 0.0F);

		this.ArmsHelm_jimber = new ModelRenderer(this, 0, 4);
		this.ArmsHelm_jimber.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm_jimber.addBox(-4.0F, -8.0F, 0.0F, 8, 4, 4, 0.81F);
		this.ArmsHelm2L_jimber = new ModelRenderer(this, 0, 53);
		this.ArmsHelm2L_jimber.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm2L_jimber.addBox(-5.5F, -5.0F, -0.75F, 1, 5, 6, 0.0F);
		this.ArmsHelm2R_jimber = new ModelRenderer(this, 0, 53);
		this.ArmsHelm2R_jimber.mirror = true;
		this.ArmsHelm2R_jimber.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm2R_jimber.addBox(4.5F, -5.0F, -0.75F, 1, 5, 6, 0.0F);
		this.ArmsHelm3_jimber = new ModelRenderer(this, 4, 2);
		this.ArmsHelm3_jimber.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm3_jimber.addBox(-4.5F, -5.0F, 4.75F, 9, 5, 1, 0.0F);
		this.ArmsHelm4_jimber = new ModelRenderer(this, 44, 48);
		this.ArmsHelm4_jimber.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm4_jimber.addBox(-2.5F, -9.8F, -0.8F, 5, 1, 3, 0.0F);

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

		this.ArmsBody.addChild(this.ArmsHingeL);
		this.ArmsBody.addChild(this.ArmsBodyL1);
		this.LS_up.addChild(this.LS_up2);
		this.ArmsBody.addChild(this.ArmsBodyR2);
		this.ArmsHingeL.addChild(this.Shoulder_L);
		this.ArmsBody.addChild(this.ArmsHingeR);
		this.ArmsHingeL.addChild(this.Shoulder_L2);
		this.ArmsHingeR.addChild(this.Shoulder_R);
		this.ArmsHelm.addChild(this.ArmsHelm2L);
		this.ArmsHelm.addChild(this.ArmsHelm3);
		this.ArmsHelm.addChild(this.ArmsHelm2R);
		this.ArmsHelm.addChild(this.ArmsHelm4);
		this.ArmsBody.addChild(this.ArmsBodyL2);
		this.ArmsBody.addChild(this.ArmsBodyBack2);
		this.ArmsBody.addChild(this.ArmsBodyFrame);
		this.ArmsBody.addChild(this.ArmsBodyR3);
		this.ArmsHingeR.addChild(this.Shoulder_R2);
		this.ArmsBody.addChild(this.ArmsBodyBack);

		this.ArmsHelm_jimber.addChild(this.ArmsHelm2R_jimber);
		this.ArmsHelm_jimber.addChild(this.ArmsHelm2L_jimber);
		this.ArmsHelm_jimber.addChild(this.ArmsHelm4_jimber);
		this.ArmsHelm_jimber.addChild(this.ArmsHelm3_jimber);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGaimMatsubokkuri.DriverCheck==1)
		{
			this.ArmsHead.showModel=true;
			this.ArmsBody.showModel=true;
			this.ArmsHelm.showModel=true;
			this.ArmsHelm_jimber.showModel=false;
			this.LS_up.showModel=true;
			this.LS_down.showModel=true;
			this.LS_close.showModel=false;			
		}else	if(ArmorGaimMatsubokkuri.DriverCheck==2) {
			this.ArmsHead.showModel=false;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=false;
			this.ArmsHelm_jimber.showModel=false;
			this.LS_up.showModel=true;
			this.LS_down.showModel=false;
			this.LS_close.showModel=true;
		}else	if(ArmorGaimMatsubokkuri.DriverCheck==3) {
			this.ArmsHead.showModel=true;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=false;
			this.ArmsHelm_jimber.showModel=true;
			this.LS_up.showModel=true;
			this.LS_down.showModel=true;
			this.LS_close.showModel=false;
		}else {
			this.ArmsHead.showModel=false;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=false;
			this.LS_up.showModel=false;
			this.LS_down.showModel=false;
			this.LS_close.showModel=false;
			this.ArmsHelm_jimber.showModel=false;
		}

		if (this.isChild) {
			this.ArmsBody.render(f5);
			this.LS_up.render(f5);
			this.LS_down.render(f5);
			this.ArmsHead.render(f5);
			this.LS_close.render(f5);
			this.ArmsHelm.render(f5);
			this.ArmsHelm_jimber.render(f5);
		}else	{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.ArmsBody.render(f5);
			this.ArmsHelm.render(f5);
			this.ArmsHead.render(f5);
			this.ArmsHelm_jimber.render(f5);

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
			setAngle(ArmsHelm_jimber, this.bipedHead);
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
