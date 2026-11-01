package rider.wmod.rendering.models.items.ghost;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.ghost.ArmorGhostMusashi;

/**
 * ModelGhostMusashi - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGhostMusashi extends ModelBiped {
	public ModelRenderer LeftArmT;
	public ModelRenderer RightArmT;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftLeg;
	public ModelRenderer Body;
	public ModelRenderer BodyT;
	public ModelRenderer Parka;
	public ModelRenderer Head;
	public ModelRenderer HeadGhost;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R1;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_LBase;
	public ModelRenderer Shoulder_L1;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer Shoulder_L4;
	public ModelRenderer Shoulder_R4;
	public ModelRenderer RightSword;
	public ModelRenderer LeftSword;
	public ModelRenderer mage1;
	public ModelRenderer mage2;

	public ModelGhostMusashi() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shoulder_L2 = new ModelRenderer(this, 0, 54);
		this.Shoulder_L2.mirror = true;
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(2.75F, 2.0F, -2.75F, 1, 1, 1, 0.26F);
		this.HeadGhost = new ModelRenderer(this, 18, 34);
		this.HeadGhost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadGhost.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 2, 0.51F);
		this.Shoulder_R4 = new ModelRenderer(this, 0, 54);
		this.Shoulder_R4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R4.addBox(-6.25F, -0.75F, -2.75F, 1, 2, 1, 0.26F);
		this.RightArmT = new ModelRenderer(this, 40, 16);
		this.RightArmT.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArmT.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 54);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-3.75F, 2.0F, -2.75F, 1, 1, 1, 0.26F);
		this.BodyT = new ModelRenderer(this, 16, 16);
		this.BodyT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyT.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 4, 33);
		this.Shoulder_R.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.Shoulder_R.addBox(-0.5F, -2.0F, -2.5F, 1, 3, 5, 0.26F);
		this.mage2 = new ModelRenderer(this, 8, 0);
		this.mage2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mage2.addBox(-1.5F, -11.0F, -4.0F, 3, 1, 3, 0.0F);
		this.setRotateAngle(mage2, -0.6981317007977318F, 0.0F, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftSword = new ModelRenderer(this, 48, 48);
		this.LeftSword.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftSword.addBox(4.0F, 1.25F, 3.0F, 1, 15, 1, 0.26F);
		this.Shoulder_LBase = new ModelRenderer(this, 0, 33);
		this.Shoulder_LBase.mirror = true;
		this.Shoulder_LBase.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.Shoulder_LBase.addBox(-0.5F, -2.0F, -2.5F, 1, 3, 5, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Shoulder_R1 = new ModelRenderer(this, 0, 54);
		this.Shoulder_R1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R1.addBox(-3.75F, 1.0F, -2.75F, 1, 1, 1, 0.26F);
		this.Body = new ModelRenderer(this, 40, 32);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.36F);
		this.Shoulder_L1 = new ModelRenderer(this, 0, 54);
		this.Shoulder_L1.mirror = true;
		this.Shoulder_L1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L1.addBox(2.75F, 1.0F, -2.75F, 1, 1, 1, 0.26F);
		this.mage1 = new ModelRenderer(this, 8, 0);
		this.mage1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mage1.addBox(-0.5F, -14.0F, -3.5F, 1, 6, 2, 0.0F);
		this.setRotateAngle(mage1, -0.6981317007977318F, 0.0F, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 54);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-5.25F, 1.0F, -2.75F, 1, 1, 1, 0.26F);
		this.Parka = new ModelRenderer(this, 32, 0);
		this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Parka.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.61F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightSword = new ModelRenderer(this, 48, 48);
		this.RightSword.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightSword.addBox(-5.0F, 1.25F, 3.0F, 1, 15, 1, 0.26F);
		this.LeftArmT = new ModelRenderer(this, 32, 48);
		this.LeftArmT.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmT.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 54);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(4.25F, 1.25F, -2.75F, 1, 1, 1, 0.26F);
		this.Shoulder_L4 = new ModelRenderer(this, 0, 54);
		this.Shoulder_L4.mirror = true;
		this.Shoulder_L4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L4.addBox(5.25F, -0.75F, -2.75F, 1, 2, 1, 0.26F);
		this.Parka.addChild(this.mage2);
		this.Parka.addChild(this.mage1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGhostMusashi.isInvisible==0) 
		{
			if(ArmorGhostMusashi.DriverCheck==1)
			{
				this.LeftArmT.showModel=false;
				this.RightArmT.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftLeg.showModel=false;
				this.HeadGhost.showModel=false;
				this.BodyT.showModel=false;

				if(ArmorGhostMusashi.EyeconIn==1 && ArmorGhostMusashi.HaveEyecon==0)
				{
					this.Body.showModel=true;
					this.Head.showModel=true;
					this.Parka.showModel=true;	
					this.Shoulder_R3.showModel=true;
					this.Shoulder_R2.showModel=true;
					this.Shoulder_R1.showModel=true;
					this.Shoulder_R.showModel=true;
					this.Shoulder_LBase.showModel=true;
					this.Shoulder_L1.showModel=true;
					this.Shoulder_L2.showModel=true;
					this.Shoulder_L3.showModel=true;
					this.Shoulder_L4.showModel=true;
					this.Shoulder_R4.showModel=true;
					this.RightSword.showModel=true;
					this.LeftSword.showModel=true;
				}
				else if(ArmorGhostMusashi.HaveEyecon==1)
				{
					this.Body.showModel=false;
					this.Head.showModel=false;
					this.Parka.showModel=false;
					this.Shoulder_R3.showModel=false;
					this.Shoulder_R2.showModel=false;
					this.Shoulder_R1.showModel=false;
					this.Shoulder_R.showModel=false;
					this.Shoulder_LBase.showModel=false;
					this.Shoulder_L1.showModel=false;
					this.Shoulder_L2.showModel=false;
					this.Shoulder_L3.showModel=false;
					this.Shoulder_L4.showModel=false;
					this.Shoulder_R4.showModel=false;
					this.RightSword.showModel=false;
					this.LeftSword.showModel=false;
				}else {
					this.Body.showModel=false;
					this.Head.showModel=false;
					this.Parka.showModel=false;
					this.Shoulder_R3.showModel=false;
					this.Shoulder_R2.showModel=false;
					this.Shoulder_R1.showModel=false;
					this.Shoulder_R.showModel=false;
					this.Shoulder_LBase.showModel=false;
					this.Shoulder_L1.showModel=false;
					this.Shoulder_L2.showModel=false;
					this.Shoulder_L3.showModel=false;
					this.Shoulder_L4.showModel=false;
					this.Shoulder_R4.showModel=false;
					this.RightSword.showModel=false;
					this.LeftSword.showModel=false;
				}
			}else {
				//ゴースト体

				this.LeftArmT.showModel=true;
				this.RightArmT.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
				this.HeadGhost.showModel=true;
				this.BodyT.showModel=true;
				this.Parka.showModel=true;
				this.Body.showModel=true;
				this.Shoulder_R3.showModel=true;
				this.Shoulder_R2.showModel=true;
				this.Shoulder_R1.showModel=true;
				this.Shoulder_R.showModel=true;
				this.Shoulder_LBase.showModel=true;
				this.Shoulder_L1.showModel=true;
				this.Shoulder_L2.showModel=true;
				this.Shoulder_L3.showModel=true;
				this.Shoulder_L4.showModel=true;
				this.Shoulder_R4.showModel=true;
				this.RightSword.showModel=true;
				this.LeftSword.showModel=true;

				this.Head.showModel=false;
			}
		}
		else
		{
			this.LeftArmT.showModel=false;
			this.RightArmT.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftLeg.showModel=false;
			this.HeadGhost.showModel=false;
			this.BodyT.showModel=false;

			this.Body.showModel=false;
			this.Head.showModel=false;
			this.Parka.showModel=false;
			this.Shoulder_R3.showModel=false;
			this.Shoulder_R2.showModel=false;
			this.Shoulder_R1.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_LBase.showModel=false;
			this.Shoulder_L1.showModel=false;
			this.Shoulder_L2.showModel=false;
			this.Shoulder_L3.showModel=false;
			this.Shoulder_L4.showModel=false;
			this.Shoulder_R4.showModel=false;
			this.RightSword.showModel=false;
			this.LeftSword.showModel=false;

		}

		if (this.isChild) {
			this.Shoulder_L2.render(f5);
			this.HeadGhost.render(f5);
			this.Shoulder_R4.render(f5);
			this.RightArmT.render(f5);
			this.Shoulder_R2.render(f5);
			this.BodyT.render(f5);
			this.Shoulder_R.render(f5);
			this.LeftLeg.render(f5);
			this.LeftSword.render(f5);
			this.Shoulder_LBase.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Shoulder_R1.offsetX, this.Shoulder_R1.offsetY, this.Shoulder_R1.offsetZ);
			GlStateManager.translate(this.Shoulder_R1.rotationPointX * f5, this.Shoulder_R1.rotationPointY * f5, this.Shoulder_R1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 1.0D);
			GlStateManager.translate(-this.Shoulder_R1.offsetX, -this.Shoulder_R1.offsetY, -this.Shoulder_R1.offsetZ);
			GlStateManager.translate(-this.Shoulder_R1.rotationPointX * f5, -this.Shoulder_R1.rotationPointY * f5, -this.Shoulder_R1.rotationPointZ * f5);
			this.Shoulder_R1.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Shoulder_L1.offsetX, this.Shoulder_L1.offsetY, this.Shoulder_L1.offsetZ);
			GlStateManager.translate(this.Shoulder_L1.rotationPointX * f5, this.Shoulder_L1.rotationPointY * f5, this.Shoulder_L1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 1.0D);
			GlStateManager.translate(-this.Shoulder_L1.offsetX, -this.Shoulder_L1.offsetY, -this.Shoulder_L1.offsetZ);
			GlStateManager.translate(-this.Shoulder_L1.rotationPointX * f5, -this.Shoulder_L1.rotationPointY * f5, -this.Shoulder_L1.rotationPointZ * f5);
			this.Shoulder_L1.render(f5);
			GlStateManager.popMatrix();
			this.Shoulder_R3.render(f5);
			this.Parka.render(f5);
			this.RightLeg.render(f5);
			this.RightSword.render(f5);
			this.LeftArmT.render(f5);
			this.Shoulder_L3.render(f5);
			this.Shoulder_L4.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Shoulder_L2.render(f5);
			this.HeadGhost.render(f5);
			this.Shoulder_R4.render(f5);
			this.RightArmT.render(f5);
			this.Shoulder_R2.render(f5);
			this.BodyT.render(f5);
			this.Shoulder_R.render(f5);
			this.LeftLeg.render(f5);
			this.LeftSword.render(f5);
			this.Shoulder_LBase.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Shoulder_R1.offsetX, this.Shoulder_R1.offsetY, this.Shoulder_R1.offsetZ);
			GlStateManager.translate(this.Shoulder_R1.rotationPointX * f5, this.Shoulder_R1.rotationPointY * f5, this.Shoulder_R1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 1.0D);
			GlStateManager.translate(-this.Shoulder_R1.offsetX, -this.Shoulder_R1.offsetY, -this.Shoulder_R1.offsetZ);
			GlStateManager.translate(-this.Shoulder_R1.rotationPointX * f5, -this.Shoulder_R1.rotationPointY * f5, -this.Shoulder_R1.rotationPointZ * f5);
			this.Shoulder_R1.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Shoulder_L1.offsetX, this.Shoulder_L1.offsetY, this.Shoulder_L1.offsetZ);
			GlStateManager.translate(this.Shoulder_L1.rotationPointX * f5, this.Shoulder_L1.rotationPointY * f5, this.Shoulder_L1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 1.0D);
			GlStateManager.translate(-this.Shoulder_L1.offsetX, -this.Shoulder_L1.offsetY, -this.Shoulder_L1.offsetZ);
			GlStateManager.translate(-this.Shoulder_L1.rotationPointX * f5, -this.Shoulder_L1.rotationPointY * f5, -this.Shoulder_L1.rotationPointZ * f5);
			this.Shoulder_L1.render(f5);
			GlStateManager.popMatrix();
			this.Shoulder_R3.render(f5);
			this.Parka.render(f5);
			this.RightLeg.render(f5);
			this.RightSword.render(f5);
			this.LeftArmT.render(f5);
			this.Shoulder_L3.render(f5);
			this.Shoulder_L4.render(f5);

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
			setAngle(HeadGhost, this.bipedHead);
			setAngle(Parka, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(BodyT, this.bipedBody);
			setAngle(RightSword, this.bipedBody);
			setAngle(LeftSword, this.bipedBody);
			setAngle(RightArmT, this.bipedRightArm);
			setAngle(LeftArmT, this.bipedLeftArm);

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
