package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRDecade;

/**
 * ModelDecade - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDecade extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Body2;
	public ModelRenderer Head2;
	public ModelRenderer HeadL;
	public ModelRenderer HeadL2;
	public ModelRenderer HeadL3;
	public ModelRenderer HeadR;
	public ModelRenderer HeadR2;
	public ModelRenderer HeadR3;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer bar_R;
	public ModelRenderer ber_R2;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer LegBolt_R1;
	public ModelRenderer LegBolt_R2;
	public ModelRenderer LegBolt_R3;
	public ModelRenderer LegBolt_R4;
	public ModelRenderer LegBolt_R6;
	public ModelRenderer LegBolt_R5;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer bar_L;
	public ModelRenderer ber_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer LegBolt_L2;
	public ModelRenderer LegBolt_L1;
	public ModelRenderer LegBolt_L3;
	public ModelRenderer LegBolt_L4;
	public ModelRenderer LegBolt_L5;
	public ModelRenderer LegBolt_L6;

	public ModelDecade() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.bar_L = new ModelRenderer(this, 4, 41);
		this.bar_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bar_L.addBox(-1.0F, 4.0F, -2.5F, 5, 1, 5, 0.0F);
		this.LegBolt_L5 = new ModelRenderer(this, 0, 44);
		this.LegBolt_L5.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L5.addBox(-2.6F, -6.0F, -3.0F, 1, 3, 1, 0.0F);
		this.LegBolt_L4 = new ModelRenderer(this, 2, 44);
		this.LegBolt_L4.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L4.addBox(-1.4F, -7.75F, -2.75F, 1, 2, 1, 0.0F);
		this.Shoulder_L2 = new ModelRenderer(this, 0, 33);
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(2.0F, 0.7F, -2.5F, 2, 2, 5, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LegBolt_R2 = new ModelRenderer(this, 0, 44);
		this.LegBolt_R2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.LegBolt_R2.addBox(0.4F, -10.7F, -3.0F, 1, 3, 1, 0.0F);
		this.LegBolt_R3 = new ModelRenderer(this, 2, 44);
		this.LegBolt_R3.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.LegBolt_R3.addBox(0.4F, -7.75F, -2.75F, 1, 2, 1, 0.0F);
		this.LegBolt_L1 = new ModelRenderer(this, 0, 44);
		this.LegBolt_L1.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L1.addBox(-2.6F, -10.7F, -3.0F, 1, 3, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-4.0F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.LegBolt_R5 = new ModelRenderer(this, 0, 44);
		this.LegBolt_R5.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.LegBolt_R5.addBox(0.4F, -6.0F, -3.0F, 1, 3, 1, 0.0F);
		this.LegBolt_R6 = new ModelRenderer(this, 0, 44);
		this.LegBolt_R6.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.LegBolt_R6.addBox(1.6F, -6.0F, -3.0F, 1, 3, 1, 0.0F);
		this.LegBolt_L6 = new ModelRenderer(this, 0, 44);
		this.LegBolt_L6.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L6.addBox(-1.4F, -6.0F, -3.0F, 1, 3, 1, 0.0F);
		this.HeadR2 = new ModelRenderer(this, 56, 28);
		this.HeadR2.mirror = true;
		this.HeadR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadR2.addBox(2.0F, -11.0F, -4.8F, 1, 11, 3, 0.0F);
		this.HeadL2 = new ModelRenderer(this, 56, 28);
		this.HeadL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadL2.addBox(-3.0F, -11.0F, -4.8F, 1, 11, 3, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_R3 = new ModelRenderer(this, 31, 40);
		this.Shoulder_R3.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Shoulder_R3.addBox(-5.1F, -2.5F, -3.0F, 5, 2, 6, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F, 0.1308996938995747F);
		this.ber_R2 = new ModelRenderer(this, 4, 41);
		this.ber_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ber_R2.addBox(-4.0F, 5.5F, -2.5F, 5, 1, 5, 0.0F);
		this.Body2 = new ModelRenderer(this, 16, 16);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.0F, -2.5F, 8, 5, 4, 0.36F);
		this.HeadL3 = new ModelRenderer(this, 56, 46);
		this.HeadL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadL3.addBox(-4.25F, -9.0F, -4.7F, 1, 8, 3, 0.0F);
		this.HeadR = new ModelRenderer(this, 53, 46);
		this.HeadR.mirror = true;
		this.HeadR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadR.addBox(0.75F, -9.5F, -5.0F, 1, 10, 3, 0.0F);
		this.ber_L2 = new ModelRenderer(this, 4, 41);
		this.ber_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ber_L2.addBox(-1.0F, 5.5F, -2.5F, 5, 1, 5, 0.0F);
		this.HeadR3 = new ModelRenderer(this, 56, 46);
		this.HeadR3.mirror = true;
		this.HeadR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadR3.addBox(3.25F, -9.0F, -4.7F, 1, 8, 3, 0.0F);
		this.HeadL = new ModelRenderer(this, 53, 46);
		this.HeadL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadL.addBox(-1.75F, -9.5F, -5.0F, 1, 10, 3, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 32, 32);
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(0.0F, -1.5F, -3.0F, 5, 2, 6, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.1308996938995747F);
		this.Head2 = new ModelRenderer(this, 56, 18);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-0.5F, -8.5F, -5.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(Head2, 0.08726646259971647F, 0.0F, 0.0F);
		this.LegBolt_R4 = new ModelRenderer(this, 2, 44);
		this.LegBolt_R4.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.LegBolt_R4.addBox(1.6F, -7.75F, -2.75F, 1, 2, 1, 0.0F);
		this.LegBolt_R1 = new ModelRenderer(this, 0, 44);
		this.LegBolt_R1.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.LegBolt_R1.addBox(1.6F, -10.7F, -3.0F, 1, 3, 1, 0.0F);
		this.LegBolt_L2 = new ModelRenderer(this, 0, 44);
		this.LegBolt_L2.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L2.addBox(-1.4F, -10.7F, -3.0F, 1, 3, 1, 0.0F);
		this.LegBolt_L3 = new ModelRenderer(this, 2, 44);
		this.LegBolt_L3.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L3.addBox(-2.6F, -7.75F, -2.75F, 1, 2, 1, 0.0F);
		this.bar_R = new ModelRenderer(this, 4, 41);
		this.bar_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bar_R.addBox(-4.0F, 4.0F, -2.5F, 5, 1, 5, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 33);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-4.0F, 0.7F, -2.5F, 2, 2, 5, 0.0F);
		this.LeftArm.addChild(this.bar_L);
		this.LeftLeg.addChild(this.LegBolt_L5);
		this.LeftLeg.addChild(this.LegBolt_L4);
		this.LeftArm.addChild(this.Shoulder_L2);
		this.RightLeg.addChild(this.LegBolt_R2);
		this.RightLeg.addChild(this.LegBolt_R3);
		this.LeftLeg.addChild(this.LegBolt_L1);
		this.RightArm.addChild(this.Shoulder_R);
		this.RightLeg.addChild(this.LegBolt_R5);
		this.RightLeg.addChild(this.LegBolt_R6);
		this.LeftLeg.addChild(this.LegBolt_L6);
		this.RightArm.addChild(this.Shoulder_R3);
		this.RightArm.addChild(this.ber_R2);
		this.LeftArm.addChild(this.ber_L2);
		this.LeftArm.addChild(this.Shoulder_L);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.RightLeg.addChild(this.LegBolt_R4);
		this.RightLeg.addChild(this.LegBolt_R1);
		this.LeftLeg.addChild(this.LegBolt_L2);
		this.LeftLeg.addChild(this.LegBolt_L3);
		this.RightArm.addChild(this.bar_R);
		this.RightArm.addChild(this.Shoulder_R2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorKRDecade.DriverCheck==0||ArmorKRDecade.isInvisible==1) {

			this.RightArm.showModel=false;
			this.Head.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.HeadR2.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.HeadL3.showModel=false;
			this.HeadR.showModel=false;
			this.HeadR3.showModel=false;
			this.HeadL.showModel=false;
			this.HeadL2.showModel=false;
			this.LeftLeg.showModel=false;
			this.Head2.showModel=false;
		}else {
			this.RightArm.showModel=true;
			this.Head.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.HeadR2.showModel=true;
			this.Body.showModel=true;
			this.Body2.showModel=true;
			this.HeadL3.showModel=true;
			this.HeadR.showModel=true;
			this.HeadR3.showModel=true;
			this.HeadL.showModel=true;
			this.HeadL2.showModel=true;
			this.LeftLeg.showModel=true;
			this.Head2.showModel=true;
		}		

		if (this.isChild) {
			this.RightArm.render(f5);
			this.Head.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.HeadR2.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.HeadL3.render(f5);
			this.HeadR.render(f5);
			this.HeadR3.render(f5);
			this.HeadL.render(f5);
			this.HeadL2.render(f5);
			this.LeftLeg.render(f5);
			this.Head2.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.RightArm.render(f5);
			this.Head.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.HeadR2.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.HeadL3.render(f5);
			this.HeadR.render(f5);
			this.HeadR3.render(f5);
			this.HeadL.render(f5);
			this.HeadL2.render(f5);
			this.LeftLeg.render(f5);
			this.Head2.render(f5);

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
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(Body2, this.bipedBody);

			setAngle(Head2, this.bipedHead);		
			setAngle(HeadL, this.bipedHead);
			setAngle(HeadR, this.bipedHead);
			setAngle(HeadL2, this.bipedHead);
			setAngle(HeadR2, this.bipedHead);
			setAngle(HeadL3, this.bipedHead);
			setAngle(HeadR3, this.bipedHead);
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
