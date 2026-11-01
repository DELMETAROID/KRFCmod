package rider.wmod.rendering.models.items.kabuto;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.entity.EntityEnemyDarkKabuto;
import rider.wmod.items.armor.kabuto.ArmorKabutoMasked;

/**
 * ModelKabutoMasked - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKabutoMasked extends ModelBiped {
	public ModelRenderer Body_Masked;
	public ModelRenderer Head_Masked;
	public ModelRenderer LeftArm_Masked;
	public ModelRenderer RightArm_Masked;
	public ModelRenderer Body2_Masked;
	public ModelRenderer Body3_Masked;
	public ModelRenderer AntenaBase_Masked;
	public ModelRenderer Antena1R_Masked;
	public ModelRenderer Antena2R_Masked;
	public ModelRenderer Antena3R_Masked;
	public ModelRenderer Antena1L_Masked;
	public ModelRenderer Antena2L_Masked;
	public ModelRenderer Antena3L_Masked;
	public ModelRenderer Antena4R_Masked;
	public ModelRenderer Antena5R_Masked;
	public ModelRenderer AntenaBase2_Masked;
	public ModelRenderer Antena4L_Masked;
	public ModelRenderer Antena5L_Masked;
	public ModelRenderer AntenaBase3_Masked;
	public ModelRenderer Shoulder_L_Masked;
	public ModelRenderer Shoulder_R_Masked;

	public ModelKabutoMasked() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.Antena5L_Masked = new ModelRenderer(this, 26, 3);
		this.Antena5L_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena5L_Masked.addBox(1.9F, -7.6F, -5.5F, 1, 1, 1, 0.0F);
		this.Shoulder_R_Masked = new ModelRenderer(this, 0, 32);
		this.Shoulder_R_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R_Masked.addBox(-4.75F, -2.6F, -3.0F, 6, 4, 6, 0.0F);
		this.Antena5R_Masked = new ModelRenderer(this, 26, 3);
		this.Antena5R_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena5R_Masked.addBox(-2.0F, -7.1F, -5.5F, 1, 1, 1, 0.0F);
		this.RightArm_Masked = new ModelRenderer(this, 44, 16);
		this.RightArm_Masked.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm_Masked.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.36F);
		this.Shoulder_L_Masked = new ModelRenderer(this, 25, 32);
		this.Shoulder_L_Masked.mirror = true;
		this.Shoulder_L_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L_Masked.addBox(-1.2F, -2.6F, -3.0F, 6, 4, 6, 0.0F);
		this.Antena2L_Masked = new ModelRenderer(this, 24, 5);
		this.Antena2L_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2L_Masked.addBox(1.8F, -8.0F, -5.2F, 1, 1, 1, 0.0F);
		this.AntenaBase_Masked = new ModelRenderer(this, 24, 5);
		this.AntenaBase_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase_Masked.addBox(-1.0F, -7.0F, -5.2F, 2, 1, 1, 0.0F);

		this.Antena1L_Masked = new ModelRenderer(this, 24, 5);
		this.Antena1L_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1L_Masked.addBox(0.8F, -7.5F, -5.2F, 1, 1, 1, 0.0F);
		this.Antena2R_Masked = new ModelRenderer(this, 24, 5);
		this.Antena2R_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2R_Masked.addBox(-2.8F, -8.0F, -5.2F, 1, 1, 1, 0.0F);
		this.Body3_Masked = new ModelRenderer(this, 17, 19);
		this.Body3_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3_Masked.addBox(-4.0F, 4.4F, -2.75F, 8, 2, 5, 0.26F);
		this.Body2_Masked = new ModelRenderer(this, 22, 25);
		this.Body2_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2_Masked.addBox(-3.0F, 6.6F, -2.75F, 6, 1, 1, 0.0F);
		this.AntenaBase3_Masked = new ModelRenderer(this, 24, 0);
		this.AntenaBase3_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase3_Masked.addBox(-0.5F, -6.1F, -5.5F, 1, 1, 1, 0.0F);
		this.LeftArm_Masked = new ModelRenderer(this, 44, 16);
		this.LeftArm_Masked.mirror = true;
		this.LeftArm_Masked.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm_Masked.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.36F);
		this.Antena1R_Masked = new ModelRenderer(this, 24, 5);
		this.Antena1R_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1R_Masked.addBox(-1.9F, -7.5F, -5.2F, 1, 1, 1, 0.0F);
		this.Body_Masked = new ModelRenderer(this, 16, 14);
		this.Body_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body_Masked.addBox(-4.0F, -0.1F, -3.5F, 8, 4, 6, 0.26F);
		this.Head_Masked = new ModelRenderer(this, 0, 0);
		this.Head_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head_Masked.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.61F);
		this.Antena3L_Masked = new ModelRenderer(this, 24, 5);
		this.Antena3L_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3L_Masked.addBox(2.8F, -8.25F, -5.2F, 1, 1, 1, 0.0F);
		this.Antena3R_Masked = new ModelRenderer(this, 24, 5);
		this.Antena3R_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3R_Masked.addBox(-3.8F, -8.25F, -5.2F, 1, 1, 1, 0.0F);
		this.AntenaBase2_Masked = new ModelRenderer(this, 24, 2);
		this.AntenaBase2_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase2_Masked.addBox(-1.0F, -6.6F, -5.6F, 2, 1, 1, 0.0F);
		this.Antena4R_Masked = new ModelRenderer(this, 26, 3);
		this.Antena4R_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4R_Masked.addBox(-2.9F, -7.6F, -5.5F, 1, 1, 1, 0.0F);
		this.Antena4L_Masked = new ModelRenderer(this, 26, 3);
		this.Antena4L_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4L_Masked.addBox(0.9F, -7.1F, -5.5F, 1, 1, 1, 0.0F);
		this.Head_Masked.addChild(this.Antena5L_Masked);
		this.RightArm_Masked.addChild(this.Shoulder_R_Masked);
		this.Head_Masked.addChild(this.Antena5R_Masked);
		this.LeftArm_Masked.addChild(this.Shoulder_L_Masked);
		this.Head_Masked.addChild(this.Antena2L_Masked);


		this.Head_Masked.addChild(this.AntenaBase_Masked);
		this.Head_Masked.addChild(this.Antena1L_Masked);
		this.Head_Masked.addChild(this.Antena2R_Masked);
		this.Head_Masked.addChild(this.AntenaBase3_Masked);
		this.Head_Masked.addChild(this.Antena1R_Masked);
		this.Head_Masked.addChild(this.Antena3L_Masked);
		this.Head_Masked.addChild(this.Antena3R_Masked);
		this.Head_Masked.addChild(this.AntenaBase2_Masked);
		this.Head_Masked.addChild(this.Antena4R_Masked);
		this.Head_Masked.addChild(this.Antena4L_Masked);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if((ArmorKabutoMasked.isInvisible==0 && ArmorKabutoMasked.BeltCheck==1&&ArmorKabutoMasked.ZectorIn==1)
				||entity instanceof EntityEnemyDarkKabuto)
		{
			this. Head_Masked.showModel=true;
			this. Body_Masked.showModel=true;
			this. Body2_Masked.showModel=true;
			this. Body3_Masked.showModel=true;
			this. RightArm_Masked.showModel=true;
			this. LeftArm_Masked.showModel=true;
		}
		else
		{
			this. Head_Masked.showModel=false;
			this. Body_Masked.showModel=false;
			this. Body2_Masked.showModel=false;
			this. Body3_Masked.showModel=false;
			this. RightArm_Masked.showModel=false;
			this. LeftArm_Masked.showModel=false;
		}

		if (this.isChild)
		{
			this.LeftArm_Masked.render(f5);
			this.Body_Masked.render(f5);
			this.Body3_Masked.render(f5);
			this.Body2_Masked.render(f5);
			this.RightArm_Masked.render(f5);
			this.Head_Masked.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.LeftArm_Masked.render(f5);
			this.Body_Masked.render(f5);
			this.Body3_Masked.render(f5);
			this.Body2_Masked.render(f5);
			this.RightArm_Masked.render(f5);
			this.Head_Masked.render(f5);

			if (entity.isSneaking())
			{
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
			setAngle(Head_Masked, this.bipedHead);
			setAngle(Body_Masked, this.bipedBody);
			setAngle(Body2_Masked, this.bipedBody);
			setAngle(Body3_Masked, this.bipedBody);
			setAngle(RightArm_Masked, this.bipedRightArm);
			setAngle(LeftArm_Masked, this.bipedLeftArm);
		}
		//		setAngle(ZectorOpen, this.bipedBody);
		//		setAngle(ZectorHornUnderOpen, this.bipedBody);
		//		setAngle(ZectorLeg1, this.bipedBody);
		//		setAngle(ZectorHornOpen1, this.bipedBody);


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
