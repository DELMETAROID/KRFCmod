package rider.wmod.rendering.models.items.kuuga;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.kuuga.ArmorArcle;
import rider.wmod.items.armor.kuuga.ArmorKuugaPegasas;

/**
 * ModelKuugaPegasas - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKuugaPegasas extends ModelBiped{
	public ModelRenderer Head;
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Shoulder_R;
	public ModelRenderer HornR;
	public ModelRenderer HornL;
	public ModelRenderer HornR_1;
	public ModelRenderer HornL_1;
	public ModelRenderer Shoulder_L;

	public ModelRenderer Body_rising;
	public ModelRenderer LeftArm_rising;
	public ModelRenderer LeftLeg_rising;
	public ModelRenderer RightArm_rising;
	public ModelRenderer RightLeg_rising;
	public ModelRenderer Shoulder_R_rising;
	public ModelRenderer Shoulder_L_rising;

	public ModelRenderer RightArm_amazing;
	public ModelRenderer RightLeg_amazing;
	public ModelRenderer Body_amazing;
	public ModelRenderer LeftArm_amazing;
	public ModelRenderer LeftLeg_amazing;
	public ModelRenderer Shoulder_R_amazing;
	public ModelRenderer Shoulder_L_amazing;

	public ModelKuugaPegasas() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.HornL = new ModelRenderer(this, 0, 0);
		this.HornL.mirror = true;
		this.HornL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL.addBox(3.25F, -9.5F, -4.5F, 1, 1, 1, 0.0F);
		this.HornR = new ModelRenderer(this, 1, 0);
		this.HornR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR.addBox(-4.25F, -9.5F, -4.5F, 1, 1, 1, 0.0F);
		this.HornR_1 = new ModelRenderer(this, 0, 0);
		this.HornR_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR_1.addBox(-4.75F, -10.25F, -4.4F, 1, 3, 1, 0.0F);
		this.HornL_1 = new ModelRenderer(this, 0, 0);
		this.HornL_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL_1.addBox(3.75F, -10.25F, -4.4F, 1, 3, 1, 0.0F);
		this.Head.addChild(this.HornL);
		this.Head.addChild(this.HornR);
		this.Head.addChild(this.HornL_1);
		this.Head.addChild(this.HornR_1);

		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 42);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.3F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.05235987755982988F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm.addChild(this.Shoulder_R);

		this.LeftLeg_rising = new ModelRenderer(this, 80, 48);
		this.LeftLeg_rising.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg_rising.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm_rising = new ModelRenderer(this, 104, 16);
		this.RightArm_rising.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm_rising.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body_rising = new ModelRenderer(this, 80, 16);
		this.Body_rising.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body_rising.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_L_rising = new ModelRenderer(this, 64, 42);
		this.Shoulder_L_rising.mirror = true;
		this.Shoulder_L_rising.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L_rising.addBox(-0.3F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.RightLeg_rising = new ModelRenderer(this, 64, 16);
		this.RightLeg_rising.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg_rising.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R_rising = new ModelRenderer(this, 64, 33);
		this.Shoulder_R_rising.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R_rising.addBox(-3.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R_rising, 0.0F, 0.0F, 0.05235987755982988F);
		this.LeftArm_rising = new ModelRenderer(this, 96, 48);
		this.LeftArm_rising.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm_rising.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm_rising.addChild(this.Shoulder_R_rising);
		this.LeftArm_rising.addChild(this.Shoulder_L_rising);

		this.LeftLeg_amazing = new ModelRenderer(this, 16, 112);
		this.LeftLeg_amazing.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg_amazing.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm_amazing = new ModelRenderer(this, 40, 80);
		this.RightArm_amazing.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm_amazing.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body_amazing = new ModelRenderer(this, 16, 80);
		this.Body_amazing.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body_amazing.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_L_amazing = new ModelRenderer(this, 0, 106);
		this.Shoulder_L_amazing.mirror = true;
		this.Shoulder_L_amazing.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L_amazing.addBox(-0.3F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.RightLeg_amazing = new ModelRenderer(this, 0, 80);
		this.RightLeg_amazing.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg_amazing.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R_amazing = new ModelRenderer(this, 0, 97);
		this.Shoulder_R_amazing.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R_amazing.addBox(-3.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R_amazing, 0.0F, 0.0F, 0.05235987755982988F);
		this.LeftArm_amazing = new ModelRenderer(this, 32, 112);
		this.LeftArm_amazing.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm_amazing.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm_amazing.addChild(this.Shoulder_L_amazing);
		this.RightArm_amazing.addChild(this.Shoulder_R_amazing);		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorKuugaPegasas.isInvisible==0)
		{		
			if((ArmorKuugaPegasas.ArcleCheck==1||ArmorKuugaPegasas.ArcleCheckRising==1||ArmorKuugaPegasas.ArcleCheckAmazing==1)&&ArmorArcle.AmadamCheckGrowing==0)
			{
				this.Head.showModel=true;

				if(ArmorKuugaPegasas.ArcleCheck==1) 
				{
					this.LeftLeg.showModel=true;
					this.RightArm.showModel=true;
					this.Body.showModel=true;
					this.RightLeg.showModel=true;
					this.LeftArm.showModel=true;
				}
				else {
					this.LeftLeg.showModel=false;
					this.RightArm.showModel=false;
					this.Body.showModel=false;
					this.RightLeg.showModel=false;
					this.LeftArm.showModel=false;
				}

				if(ArmorKuugaPegasas.ArcleCheckRising==1)
				{
					this.LeftLeg_rising.showModel=true;
					this.RightArm_rising.showModel=true;
					this.Body_rising.showModel=true;
					this.RightLeg_rising.showModel=true;
					this.LeftArm_rising.showModel=true;
				}
				else 
				{
					this.LeftLeg_rising.showModel=false;
					this.RightArm_rising.showModel=false;
					this.Body_rising.showModel=false;
					this.RightLeg_rising.showModel=false;
					this.LeftArm_rising.showModel=false;
				}

				if(ArmorKuugaPegasas.ArcleCheckAmazing==1)
				{
					this.LeftLeg_amazing.showModel=true;
					this.RightArm_amazing.showModel=true;
					this.Body_amazing.showModel=true;
					this.RightLeg_amazing.showModel=true;
					this.LeftArm_amazing.showModel=true;
				}
				else 
				{
					this.LeftLeg_amazing.showModel=false;
					this.RightArm_amazing.showModel=false;
					this.Body_amazing.showModel=false;
					this.RightLeg_amazing.showModel=false;
					this.LeftArm_amazing.showModel=false;
				}

			}else {
				this.Head.showModel=false;	
				this.LeftLeg.showModel=false;
				this.RightArm.showModel=false;
				this.Body.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftArm.showModel=false;

				this.LeftLeg_rising.showModel=false;
				this.RightArm_rising.showModel=false;
				this.Body_rising.showModel=false;
				this.RightLeg_rising.showModel=false;
				this.LeftArm_rising.showModel=false;

				this.LeftLeg_amazing.showModel=false;
				this.RightArm_amazing.showModel=false;
				this.Body_amazing.showModel=false;
				this.RightLeg_amazing.showModel=false;
				this.LeftArm_amazing.showModel=false;
			}
		}
		else {
			this.Head.showModel=false;	
			this.LeftLeg.showModel=false;
			this.RightArm.showModel=false;
			this.Body.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;

			this.LeftLeg_rising.showModel=false;
			this.RightArm_rising.showModel=false;
			this.Body_rising.showModel=false;
			this.RightLeg_rising.showModel=false;
			this.LeftArm_rising.showModel=false;

			this.LeftLeg_amazing.showModel=false;
			this.RightArm_amazing.showModel=false;
			this.Body_amazing.showModel=false;
			this.RightLeg_amazing.showModel=false;
			this.LeftArm_amazing.showModel=false;
		}

		if (this.isChild)
		{
			this.Head.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);

			this.LeftLeg_rising.render(f5);
			this.RightArm_rising.render(f5);
			this.Body_rising.render(f5);
			this.RightLeg_rising.render(f5);
			this.LeftArm_rising.render(f5);

			this.LeftLeg_amazing.render(f5);
			this.RightArm_amazing.render(f5);
			this.Body_amazing.render(f5);
			this.RightLeg_amazing.render(f5);
			this.LeftArm_amazing.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Head.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);

			this.LeftLeg_rising.render(f5);
			this.RightArm_rising.render(f5);
			this.Body_rising.render(f5);
			this.RightLeg_rising.render(f5);
			this.LeftArm_rising.render(f5);

			this.LeftLeg_amazing.render(f5);
			this.RightArm_amazing.render(f5);
			this.Body_amazing.render(f5);
			this.RightLeg_amazing.render(f5);
			this.LeftArm_amazing.render(f5);

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
			setAngle(Head, this.bipedHeadwear);
			setAngle(Body, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);

			setAngle(Body_rising, this.bipedBody);
			setAngle(RightArm_rising, this.bipedRightArm);
			setAngle(LeftArm_rising, this.bipedLeftArm);
			setAngle(RightLeg_rising, this.bipedRightLeg);
			setAngle(LeftLeg_rising, this.bipedLeftLeg);

			setAngle(Body_amazing, this.bipedBody);
			setAngle(RightArm_amazing, this.bipedRightArm);
			setAngle(LeftArm_amazing, this.bipedLeftArm);
			setAngle(RightLeg_amazing, this.bipedRightLeg);
			setAngle(LeftLeg_amazing, this.bipedLeftLeg);
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
