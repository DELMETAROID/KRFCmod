package rider.wmod.rendering.models.items.ghost;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.ghost.ArmorGhostZero;

/**
 * ModelZeroGhost - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelZeroGhost extends ModelBiped {
	public ModelRenderer LeftArmT;
	public ModelRenderer RightArmT;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftLeg;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer BodyT;
	public ModelRenderer HeadT;
	public ModelRenderer Parka;
	public ModelRenderer Horn1;
	public ModelRenderer Horn2;
	public ModelRenderer Horn3;
	public ModelRenderer HornHead;

	public ModelZeroGhost() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LeftArmT = new ModelRenderer(this, 32, 48);
		this.LeftArmT.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmT.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArmT = new ModelRenderer(this, 40, 16);
		this.RightArmT.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArmT.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.BodyT = new ModelRenderer(this, 16, 16);
		this.BodyT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyT.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Horn1 = new ModelRenderer(this, 0, 51);
		this.Horn1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn1.addBox(-0.5F, -7.0F, -5.5F, 1, 2, 1, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Parka = new ModelRenderer(this, 18, 36);
		this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Parka.addBox(-4.0F, 0.0F, 3.0F, 8, 4, 3, 0.36F);
		this.setRotateAngle(Parka, -0.2617993877991494F, 0.0F, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.3F, -2.5F, 4, 6, 5, 0.26F);
		this.Horn2 = new ModelRenderer(this, 4, 51);
		this.Horn2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn2.addBox(-0.5F, -8.0F, -6.5F, 1, 2, 1, 0.0F);
		this.Body = new ModelRenderer(this, 40, 32);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.36F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.3F, -2.5F, 4, 6, 5, 0.26F);
		this.Horn3 = new ModelRenderer(this, 0, 49);
		this.Horn3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn3.addBox(-0.5F, -9.0F, -7.5F, 1, 2, 1, 0.0F);
		this.HeadT = new ModelRenderer(this, 32, 0);
		this.HeadT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadT.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.HornHead = new ModelRenderer(this, 0, 0);
		this.HornHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornHead.addBox(0.0F, -4.0F, 0.0F, 1, 1, 1, 0.51F);
		this.HornHead.addChild(this.Horn1);
		this.HornHead.addChild(this.Horn2);
		this.HornHead.addChild(this.Horn3);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGhostZero.isInvisible==0 && ArmorGhostZero.DriverCheck==1) 
		{
			if(ArmorGhostZero.EyeconIn2==0 && ArmorGhostZero.HaveEyecon==0&&ArmorGhostZero.isHenshin==1)
			{
				this.LeftArmT.showModel=true;
				this.RightArmT.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
				this.BodyT.showModel=true;
				this.HeadT.showModel=false;
				this.HornHead.showModel=true;

				this.Head.showModel=true;
				this.Body.showModel=true;
				this.Parka.showModel=true;
				this.Shoulder_L.showModel=true;
				this.Shoulder_R.showModel=true;

			}
			else if((ArmorGhostZero.EyeconIn2==0 && ArmorGhostZero.HaveEyecon==1)
					||(ArmorGhostZero.isHenshin==0))
			{
				this.LeftArmT.showModel=true;
				this.RightArmT.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
				this.BodyT.showModel=true;
				this.HeadT.showModel=true;
				this.HornHead.showModel=false;

				this.Head.showModel=false;
				this.Body.showModel=false;
				this.Parka.showModel=false;
				this.Shoulder_L.showModel=false;
				this.Shoulder_R.showModel=false;
			}
			else if(ArmorGhostZero.EyeconIn2==1 && ArmorGhostZero.HaveEyecon==1)
			{
				this.LeftArmT.showModel=true;
				this.RightArmT.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
				this.BodyT.showModel=true;
				this.HeadT.showModel=false;
				this.HornHead.showModel=true;

				this.Head.showModel=false;
				this.Body.showModel=false;
				this.Parka.showModel=false;
				this.Shoulder_L.showModel=false;
				this.Shoulder_R.showModel=false;
			}

			else
			{
				this.LeftArmT.showModel=true;
				this.RightArmT.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
				this.HornHead.showModel=true;
				this.BodyT.showModel=true;

				this.HeadT.showModel=false;
				this.Head.showModel=false;
				this.Parka.showModel=false;
				this.Body.showModel=false;
				this.Shoulder_L.showModel=false;
				this.Shoulder_R.showModel=false;
			}
		}
		else {
			this.LeftArmT.showModel=false;
			this.RightArmT.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_L.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.BodyT.showModel=false;
			this.HeadT.showModel=false;
			this.Parka.showModel=false;
			this.HornHead.showModel=false;
		}

		if (this.isChild) {
			this.LeftArmT.render(f5);
			this.RightArmT.render(f5);
			this.BodyT.render(f5);
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			this.Parka.render(f5);
			this.Shoulder_L.render(f5);
			this.HornHead.render(f5);
			this.Body.render(f5);
			this.Shoulder_R.render(f5);
			this.HeadT.render(f5);
			this.RightLeg.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.LeftArmT.render(f5);
			this.RightArmT.render(f5);
			this.BodyT.render(f5);
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			this.Parka.render(f5);
			this.Shoulder_L.render(f5);
			this.HornHead.render(f5);
			this.Body.render(f5);
			this.Shoulder_R.render(f5);
			this.HeadT.render(f5);
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
			setAngle(Head, this.bipedHead);
			setAngle(HeadT, this.bipedHead);
			setAngle(HornHead, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(BodyT, this.bipedBody);
			setAngle(Parka, this.bipedBody);
			setAngle(RightArmT, this.bipedRightArm);
			setAngle(LeftArmT, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(Shoulder_R, this.bipedRightArm);
			setAngle(Shoulder_L, this.bipedLeftArm);
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

