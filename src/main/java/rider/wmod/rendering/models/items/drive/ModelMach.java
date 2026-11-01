package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.drive.ArmorSignalMach;

/**
 * ModelMach - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelMach extends ModelBiped {
	public ModelRenderer Head;
	public ModelRenderer HeadMach;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer Body2;
	public ModelRenderer Body3;
	public ModelRenderer Body5;
	public ModelRenderer Body4;
	public ModelRenderer DriverBaseMach;
	public ModelRenderer LeftLeg2;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftArm2;
	public ModelRenderer RightArm2;
	public ModelRenderer RightLeg2;
	public ModelRenderer LeftLeg;
	public ModelRenderer AntenaMachR;
	public ModelRenderer AntenaMachR2;
	public ModelRenderer AntenaMachL;
	public ModelRenderer AntenaMachL2;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer HandCoverR;
	public ModelRenderer muffler;

	public ModelMach() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.AntenaMachL = new ModelRenderer(this, 50, 0);
		this.AntenaMachL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachL.addBox(-1.5F, -7.25F, -5.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(AntenaMachL, 0.0F, 0.0F, 0.003490658503988659F);
		this.AntenaMachR = new ModelRenderer(this, 50, 0);
		this.AntenaMachR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachR.addBox(0.5F, -7.25F, -5.5F, 1, 1, 1, 0.0F);
		this.AntenaMachL2 = new ModelRenderer(this, 50, 0);
		this.AntenaMachL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachL2.addBox(-2.0F, -9.25F, -6.0F, 1, 2, 1, 0.0F);

		this.Shoulder_L = new ModelRenderer(this, 0, 32);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);

		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 10, 4, 0.26F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 10, 4, 0.26F);
		this.Body4 = new ModelRenderer(this, 44, 46);
		this.Body4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body4.addBox(-8.5F, 0.5F, -3.75F, 5, 3, 1, 0.2F);
		this.HeadMach = new ModelRenderer(this, 32, 6);
		this.HeadMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadMach.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 2, 0.56F);
		this.Body2 = new ModelRenderer(this, 40, 37);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.DriverBaseMach = new ModelRenderer(this, 22, 43);
		this.DriverBaseMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBaseMach.addBox(-3.5F, 8.5F, -3.35F, 6, 2, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.HandCoverR = new ModelRenderer(this, 1, 42);
		this.HandCoverR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverR.addBox(-3.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Body5 = new ModelRenderer(this, 45, 50);
		this.Body5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body5.addBox(-8.0F, 3.9F, -3.75F, 4, 1, 1, 0.2F);
		this.Shoulder_R = new ModelRenderer(this, 1, 42);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.2F, -2.5F, 4, 2, 4, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Body3 = new ModelRenderer(this, 45, 44);
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3.addBox(-8.0F, -0.9F, -3.75F, 4, 1, 1, 0.2F);
		this.AntenaMachR2 = new ModelRenderer(this, 50, 0);
		this.AntenaMachR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachR2.addBox(1.0F, -9.25F, -6.0F, 1, 2, 1, 0.0F);

		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 6, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 6, 4, 0.26F);

		this.LeftArm2 = new ModelRenderer(this, 32, 54);
		this.LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm2.addBox(-1.0F, 4.25F, -2.0F, 4, 6, 4, 0.26F);
		this.LeftArm2.mirror = true;
		this.RightArm2 = new ModelRenderer(this, 40, 22);
		this.RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm2.addBox(-3.0F, 4.25F, -2.0F, 4, 6, 4, 0.26F);
		this.RightArm2.mirror = true;

		this.LeftLeg2 = new ModelRenderer(this, 0, 58);
		this.LeftLeg2.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg2.addBox(-1.8F, 10.0F, -2.0F, 4, 2, 4, 0.26F);
		this.RightLeg2 = new ModelRenderer(this, 0, 58);
		this.RightLeg2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg2.addBox(-2.2F, 10.0F, -2.0F, 4, 2, 4, 0.26F);

		this.muffler = new ModelRenderer(this, 57, 8);
		this.muffler.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.muffler.addBox(3.0F, 0.50F, 1.5F, 2, 10, 1, 0.0F);
		this.setRotateAngle(muffler, 0.17453301598906276F, 0.03490658503988659F, 0F);
		this.HeadMach.addChild(this.AntenaMachL);
		this.HeadMach.addChild(this.AntenaMachR);
		this.HeadMach.addChild(this.AntenaMachL2);
		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm2.addChild(this.HandCoverR);
		this.RightArm.addChild(this.Shoulder_R);
		this.HeadMach.addChild(this.AntenaMachR2);
		this.Body2.addChild(this.muffler);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorSignalMach.DriverCheck>=1) 
		{
			this.Head.showModel=true;
			this.HeadMach.showModel=true;
			this.Body2.showModel=true;
			this.Body3.showModel=true;
			this.Body4.showModel=true;
			this.Body5.showModel=true;
			this.LeftArm.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg2.showModel=true;
			this.RightLeg2.showModel=true;

			if(ArmorSignalMach.SetShiftcar==1)  
			{
				this.DriverBaseMach.showModel=false;				
			}else{
				this.DriverBaseMach.showModel=true;
			}

			if(ArmorSignalMach.DriverCheck==2)  
			{
				this.Body.showModel=false;
				this.LeftArm2.showModel=false;
				this.RightArm2.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftLeg.showModel=false;
			}else 
			{
				this.Body.showModel=true;
				this.LeftArm2.showModel=true;
				this.RightArm2.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
			}
		}
		else 
		{
			this.Head.showModel=false;
			this.HeadMach.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.Body3.showModel=false;
			this.Body4.showModel=false;
			this.Body5.showModel=false;
			this.LeftArm.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg2.showModel=false;
			this.RightLeg2.showModel=false;
			this.DriverBaseMach.showModel=false;

			this.LeftArm2.showModel=false;
			this.RightArm2.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftLeg.showModel=false;
		}

		if (this.isChild) {	
			this.Head.render(f5);
			this.HeadMach.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.Body3.render(f5);		
			this.Body4.render(f5);	
			this.Body5.render(f5);
			this.LeftArm.render(f5);
			this.LeftArm2.render(f5);
			this.RightArm.render(f5);
			this.RightArm2.render(f5);
			this.LeftLeg.render(f5);
			this.LeftLeg2.render(f5);
			this.RightLeg.render(f5);
			this.RightLeg2.render(f5);
			this.DriverBaseMach.render(f5);
		}
		else 
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Head.render(f5);
			this.HeadMach.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.Body3.render(f5);		
			this.Body4.render(f5);	
			this.Body5.render(f5);
			this.LeftArm.render(f5);
			this.LeftArm2.render(f5);
			this.RightArm.render(f5);
			this.RightArm2.render(f5);
			this.LeftLeg.render(f5);
			this.LeftLeg2.render(f5);
			this.RightLeg.render(f5);
			this.RightLeg2.render(f5);
			this.DriverBaseMach.render(f5);
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
			setAngle(HeadMach, this.bipedHead);

			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(Body3, this.bipedBody);
			setAngle(Body4, this.bipedBody);
			setAngle(Body5, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(RightArm2, this.bipedRightArm);
			setAngle(LeftArm2, this.bipedLeftArm);
			setAngle(RightLeg2, this.bipedRightLeg);
			setAngle(LeftLeg2, this.bipedLeftLeg);
			setAngle(DriverBaseMach, this.bipedBody);
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
