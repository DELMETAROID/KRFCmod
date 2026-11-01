package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.gaim.ls.ArmorGaimDorian;

/**
 * ModelArmsDorian - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelArmsDorian extends ModelBiped {
	public ModelRenderer ArmsHead;
	public ModelRenderer ArmsHelm;
	public ModelRenderer LS_up;
	public ModelRenderer LS_down;
	public ModelRenderer LS_close;
	public ModelRenderer ArmsBody;
	public ModelRenderer ArmsHeadL;
	public ModelRenderer ArmsHeadR;
	public ModelRenderer ArmsHeadHeta;
	public ModelRenderer ArmsHeadHeta2;
	public ModelRenderer ArmsHeadL2;
	public ModelRenderer ArmsHeadR_1;
	public ModelRenderer LS_up2;
	public ModelRenderer ArmsBodyL1;
	public ModelRenderer ArmsBody2;
	public ModelRenderer ArmsBodyR1;
	public ModelRenderer ArmsBodyFrame;
	public ModelRenderer ArmsShoulderL;
	public ModelRenderer ArmsShoulderR;
	public ModelRenderer ArmsBodyBack;
	public ModelRenderer ArmsBodySpike1;
	public ModelRenderer ArmsShoulderL2;
	public ModelRenderer ArmsShoulderSpikeL;
	public ModelRenderer ArmsShoulderSpikeL3;
	public ModelRenderer ArmsShoulderSpikeL4;
	public ModelRenderer ArmsShoulderSpikeL5;
	public ModelRenderer ArmsShoulderSpikeL6;
	public ModelRenderer ArmsShoulderSpikeL2;
	public ModelRenderer ArmsShoulderR2;
	public ModelRenderer ArmsShoulderSpikeR;
	public ModelRenderer ArmsShoulderSpikeR2;
	public ModelRenderer ArmsShoulderSpikeR3;
	public ModelRenderer ArmsShoulderSpikeR4;
	public ModelRenderer ArmsShoulderSpikeR5;
	public ModelRenderer ArmsShoulderSpikeR6;
	public ModelRenderer ArmsBodySpike2;
	public ModelRenderer ArmsBodySpike3;
	public ModelRenderer ArmsBodySpike4;
	public ModelRenderer ArmsBodySpike5;
	public ModelRenderer ArmsBodySpike6;
	public ModelRenderer ArmsBodySpike7;
	public ModelRenderer ArmsBodySpike8;

	public ModelArmsDorian() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.ArmsShoulderSpikeL = new ModelRenderer(this, 6, 45);
		this.ArmsShoulderSpikeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeL.addBox(-10.0F, 4.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(ArmsShoulderSpikeL, 0.0F, 0.0F, 0.6981317007977318F);
		this.ArmsShoulderSpikeL6 = new ModelRenderer(this, 30, 16);
		this.ArmsShoulderSpikeL6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeL6.addBox(-6.75F, 1.3F, 2.7F, 1, 1, 1, 0.0F);
		this.ArmsShoulderSpikeR4 = new ModelRenderer(this, 30, 16);
		this.ArmsShoulderSpikeR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeR4.addBox(5.4F, 1.3F, -3.7F, 1, 1, 1, 0.0F);
		this.ArmsHeadHeta = new ModelRenderer(this, 48, 50);
		this.ArmsHeadHeta.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHeta.addBox(-0.5F, -13.0F, -0.75F, 1, 7, 7, 0.0F);
		this.ArmsShoulderSpikeR = new ModelRenderer(this, 6, 45);
		this.ArmsShoulderSpikeR.mirror = true;
		this.ArmsShoulderSpikeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeR.addBox(7.0F, 4.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(ArmsShoulderSpikeR, 0.0F, 0.0F, -0.6981317007977318F);
		this.ArmsBodySpike1 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike1.addBox(-0.5F, 1.6F, -4.6F, 1, 1, 2, 0.0F);

		this.ArmsHeadR_1 = new ModelRenderer(this, 24, 5);
		this.ArmsHeadR_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadR_1.addBox(5.75F, -5.0F, 0.0F, 2, 1, 1, 0.0F);
		this.ArmsBodyBack = new ModelRenderer(this, 40, 32);
		this.ArmsBodyBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyBack.addBox(-4.0F, 0.0F, 2.0F, 8, 7, 1, 0.0F);
		this.ArmsBodySpike7 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike7.addBox(-0.5F, 4.2F, -3.8F, 1, 1, 1, 0.0F);
		this.ArmsHeadL = new ModelRenderer(this, 24, 0);
		this.ArmsHeadL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadL.addBox(-5.75F, -5.5F, -0.5F, 1, 2, 2, 0.0F);

		this.ArmsShoulderR = new ModelRenderer(this, 0, 32);
		this.ArmsShoulderR.mirror = true;
		this.ArmsShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderR.addBox(4.5F, -1.5F, -2.5F, 4, 5, 5, 0.0F);
		this.ArmsShoulderL = new ModelRenderer(this, 0, 32);
		this.ArmsShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderL.addBox(-8.5F, -1.5F, -2.5F, 4, 5, 5, 0.0F);
		this.ArmsBody2 = new ModelRenderer(this, 56, 20);
		this.ArmsBody2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBody2.addBox(-1.0F, 3.0F, -3.3F, 2, 4, 1, 0.0F);
		this.ArmsShoulderSpikeL2 = new ModelRenderer(this, 0, 60);
		this.ArmsShoulderSpikeL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeL2.addBox(-7.8F, 4.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(ArmsShoulderSpikeL2, 0.0F, 0.0F, 0.6981317007977318F);
		this.ArmsBodySpike5 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike5.addBox(2.8F, 1.5F, -3.8F, 1, 1, 1, 0.0F);
		this.ArmsShoulderL2 = new ModelRenderer(this, 0, 43);
		this.ArmsShoulderL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderL2.addBox(-9.5F, -0.5F, -2.0F, 1, 5, 4, 0.0F);
		this.ArmsBodySpike4 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike4.addBox(1.2F, 1.5F, -4.2F, 1, 1, 1, 0.0F);

		this.ArmsBody = new ModelRenderer(this, 40, 32);
		this.ArmsBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBody.addBox(-4.0F, 0.0F, -2.4F, 8, 7, 1, 0.0F);
		this.setRotateAngle(ArmsBody, 0.0F, 0.0F, 0.005934119456780721F);
		this.ArmsShoulderSpikeR3 = new ModelRenderer(this, 6, 42);
		this.ArmsShoulderSpikeR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeR3.addBox(4.9F, 0.8F, -3.0F, 2, 2, 1, 0.0F);
		this.ArmsHeadR = new ModelRenderer(this, 24, 0);
		this.ArmsHeadR.mirror = true;
		this.ArmsHeadR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadR.addBox(4.75F, -5.5F, -0.5F, 1, 2, 2, 0.0F);

		this.ArmsBodyR1 = new ModelRenderer(this, 54, 16);
		this.ArmsBodyR1.mirror = true;
		this.ArmsBodyR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR1.addBox(0.0F, 1.0F, -3.3F, 4, 2, 1, 0.0F);
		this.ArmsShoulderR2 = new ModelRenderer(this, 0, 43);
		this.ArmsShoulderR2.mirror = true;
		this.ArmsShoulderR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderR2.addBox(8.5F, -0.5F, -2.0F, 1, 5, 4, 0.0F);
		this.ArmsShoulderSpikeR6 = new ModelRenderer(this, 30, 16);
		this.ArmsShoulderSpikeR6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeR6.addBox(5.4F, 1.3F, 2.7F, 1, 1, 1, 0.0F);
		this.ArmsShoulderSpikeL4 = new ModelRenderer(this, 30, 16);
		this.ArmsShoulderSpikeL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeL4.addBox(-6.4F, 1.3F, -3.7F, 1, 1, 1, 0.0F);
		this.ArmsShoulderSpikeL3 = new ModelRenderer(this, 6, 42);
		this.ArmsShoulderSpikeL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeL3.addBox(-6.9F, 0.8F, -3.0F, 2, 2, 1, 0.0F);
		this.ArmsBodySpike6 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike6.addBox(-0.5F, 3.0F, -4.0F, 1, 1, 1, 0.0F);
		this.ArmsBodySpike2 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike2.addBox(-3.7F, 1.5F, -3.8F, 1, 1, 1, 0.0F);
		this.ArmsHeadL2 = new ModelRenderer(this, 24, 5);
		this.ArmsHeadL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadL2.addBox(-7.75F, -5.0F, 0.0F, 2, 1, 1, 0.0F);
		this.ArmsBodySpike3 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike3.addBox(-2.2F, 1.5F, -4.2F, 1, 1, 1, 0.0F);
		this.ArmsBodyFrame = new ModelRenderer(this, 31, 43);
		this.ArmsBodyFrame.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyFrame.addBox(-5.5F, -0.6F, -2.0F, 11, 1, 3, 0.0F);
		this.ArmsHeadHeta2 = new ModelRenderer(this, 48, 51);
		this.ArmsHeadHeta2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHeadHeta2.addBox(-0.5F, -6.0F, 4.25F, 1, 3, 2, 0.0F);
		this.ArmsBodySpike8 = new ModelRenderer(this, 30, 16);
		this.ArmsBodySpike8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodySpike8.addBox(-0.5F, 5.4F, -3.8F, 1, 1, 1, 0.0F);
		this.ArmsHelm = new ModelRenderer(this, 32, 4);
		this.ArmsHelm.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHelm.addBox(-4.0F, -8.0F, 0.0F, 8, 8, 4, 0.81F);
		this.ArmsBodyL1 = new ModelRenderer(this, 54, 16);
		this.ArmsBodyL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL1.addBox(-4.0F, 1.0F, -3.3F, 4, 2, 1, 0.0F);
		this.ArmsHead = new ModelRenderer(this, 32, 4);
		this.ArmsHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHead.addBox(-4.0F, -8.0F, -3.75F, 8, 8, 4, 0.4F);
		this.ArmsShoulderSpikeR2 = new ModelRenderer(this, 0, 60);
		this.ArmsShoulderSpikeR2.mirror = true;
		this.ArmsShoulderSpikeR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeR2.addBox(6.8F, 4.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(ArmsShoulderSpikeR2, 0.0F, 0.0F, -0.6981317007977318F);
		this.ArmsShoulderSpikeR5 = new ModelRenderer(this, 6, 42);
		this.ArmsShoulderSpikeR5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeR5.addBox(4.9F, 0.8F, 2.0F, 2, 2, 1, 0.0F);
		this.ArmsShoulderSpikeL5 = new ModelRenderer(this, 6, 42);
		this.ArmsShoulderSpikeL5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsShoulderSpikeL5.addBox(-7.15F, 0.8F, 2.0F, 2, 2, 1, 0.0F);

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

		this.ArmsShoulderL.addChild(this.ArmsShoulderSpikeL);
		this.ArmsShoulderL.addChild(this.ArmsShoulderSpikeL6);
		this.ArmsShoulderR.addChild(this.ArmsShoulderSpikeR4);
		this.ArmsHelm.addChild(this.ArmsHeadHeta);
		this.ArmsShoulderR.addChild(this.ArmsShoulderSpikeR);
		this.ArmsBody.addChild(this.ArmsBodySpike1);
		this.LS_up.addChild(this.LS_up2);
		this.ArmsHeadR.addChild(this.ArmsHeadR_1);
		this.ArmsBody.addChild(this.ArmsBodyBack);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike7);
		this.ArmsHelm.addChild(this.ArmsHeadL);
		this.ArmsBody.addChild(this.ArmsShoulderR);
		this.ArmsBody.addChild(this.ArmsShoulderL);
		this.ArmsBody.addChild(this.ArmsBody2);
		this.ArmsShoulderL.addChild(this.ArmsShoulderSpikeL2);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike5);
		this.ArmsShoulderL.addChild(this.ArmsShoulderL2);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike4);
		this.ArmsShoulderR.addChild(this.ArmsShoulderSpikeR3);
		this.ArmsHelm.addChild(this.ArmsHeadR);
		this.ArmsBody.addChild(this.ArmsBodyR1);
		this.ArmsShoulderR.addChild(this.ArmsShoulderR2);
		this.ArmsShoulderR.addChild(this.ArmsShoulderSpikeR6);
		this.ArmsShoulderL.addChild(this.ArmsShoulderSpikeL4);
		this.ArmsShoulderL.addChild(this.ArmsShoulderSpikeL3);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike6);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike2);
		this.ArmsHeadL.addChild(this.ArmsHeadL2);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike3);
		this.ArmsBody.addChild(this.ArmsBodyFrame);
		this.ArmsHelm.addChild(this.ArmsHeadHeta2);
		this.ArmsBodySpike1.addChild(this.ArmsBodySpike8);
		this.ArmsBody.addChild(this.ArmsBodyL1);
		this.ArmsShoulderR.addChild(this.ArmsShoulderSpikeR2);
		this.ArmsShoulderR.addChild(this.ArmsShoulderSpikeR5);
		this.ArmsShoulderL.addChild(this.ArmsShoulderSpikeL5);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGaimDorian.DriverCheck==1)
		{
			this.ArmsHead.showModel=true;
			this.ArmsBody.showModel=true;
			this.ArmsHelm.showModel=true;
			this.LS_up.showModel=true;
			this.LS_down.showModel=true;
			this.LS_close.showModel=false;			
		}else	if(ArmorGaimDorian.DriverCheck==2) {
			this.ArmsHead.showModel=false;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=false;
			this.LS_up.showModel=true;
			this.LS_down.showModel=false;
			this.LS_close.showModel=true;
		}else	if(ArmorGaimDorian.DriverCheck==3) {
			this.ArmsHead.showModel=true;
			this.ArmsBody.showModel=false;
			this.ArmsHelm.showModel=true;
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
		}

		if (this.isChild) {
			this.ArmsHead.render(f5);
			this.ArmsHelm.render(f5);	
			this.ArmsBody.render(f5);
			this.LS_up.render(f5);
			this.LS_down.render(f5);
			this.LS_close.render(f5);
		}else	{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.ArmsHead.render(f5);
			this.ArmsHelm.render(f5);	
			this.ArmsBody.render(f5);
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
