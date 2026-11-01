package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverKNUCKLE;

/**
 * ModelKnuckle - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKnuckle extends ModelBiped {
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftLeg;

	public ModelRenderer Head_jimber;
	public ModelRenderer AntenaC1;
	public ModelRenderer AntenaC2;
	public ModelRenderer AntenaC3;
	public ModelRenderer AntenaC4;
	public ModelRenderer AntenaC5;
	public ModelRenderer ANtenaC6;
	public ModelRenderer AntenaC7;
	public ModelRenderer AntenaC8;
	public ModelRenderer AntenaC9;

	public ModelRenderer buckle;
	public ModelRenderer buckleL;
	public ModelRenderer buckleR;
	public ModelRenderer CuttingBlade;
	public ModelRenderer CuttingBlade2;
	public ModelRenderer Belt;
	public ModelRenderer beltL;
	public ModelRenderer beltR;

	public ModelKnuckle() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);

		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);

		this.Belt = new ModelRenderer(this, 16, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.beltL = new ModelRenderer(this, 24, 40);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(-3.25F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.beltR = new ModelRenderer(this, 24, 40);
		this.beltR.mirror = true;
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(2.25F, 8.5F, -2.7F, 1, 2, 1, 0.0F);

		this.CuttingBlade = new ModelRenderer(this, 18, 40);
		this.CuttingBlade.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CuttingBlade.addBox(4.5F, 5.25F, -7.1F, 1, 4, 1, 0.0F);
		this.setRotateAngle(CuttingBlade, 0.0F, 0.0F, 0.7853981633974483F);
		this.CuttingBlade2 = new ModelRenderer(this, 20, 42);
		this.CuttingBlade2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CuttingBlade2.addBox(-2.1F, 9.0F, -6.3F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CuttingBlade2, 0.0F, 0.0F, -0.7853981633974483F);

		this.buckle = new ModelRenderer(this, 30, 37);
		this.buckle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckle.addBox(-1.0F, 8.0F, -3.0F, 2, 3, 1, 0.2F);
		this.buckleL = new ModelRenderer(this, 24, 37);
		this.buckleL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleL.addBox(-2.25F, 8.5F, -3.0F, 1, 2, 1, 0.1F);
		this.buckleR = new ModelRenderer(this, 27, 37);
		this.buckleR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleR.addBox(1.25F, 8.5F, -3.0F, 1, 2, 1, 0.15F);

		this.Head_jimber = new ModelRenderer(this, 32, 0);
		this.Head_jimber.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head_jimber.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.AntenaC1 = new ModelRenderer(this, 32, 0);
		this.AntenaC1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC1.addBox(-1.0F, -8.5F, -5.0F, 2, 2, 1, 0.0F);
		this.AntenaC2 = new ModelRenderer(this, 35, 0);
		this.AntenaC2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC2.addBox(-0.5F, -10.5F, -5.0F, 1, 2, 1, 0.0F);
		this.AntenaC3 = new ModelRenderer(this, 35, 3);
		this.AntenaC3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC3.addBox(1.0F, -9.25F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaC4 = new ModelRenderer(this, 32, 3);
		this.AntenaC4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC4.addBox(1.0F, -8.0F, -5.0F, 2, 1, 1, 0.0F);
		this.AntenaC5 = new ModelRenderer(this, 35, 3);
		this.AntenaC5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC5.addBox(1.0F, -6.75F, -5.0F, 1, 1, 1, 0.0F);
		this.ANtenaC6 = new ModelRenderer(this, 35, 1);
		this.ANtenaC6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ANtenaC6.addBox(-0.5F, -6.5F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaC7 = new ModelRenderer(this, 35, 3);
		this.AntenaC7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC7.addBox(-2.0F, -6.75F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaC8 = new ModelRenderer(this, 32, 3);
		this.AntenaC8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC8.addBox(-3.0F, -8.0F, -5.0F, 2, 1, 1, 0.0F);
		this.AntenaC9 = new ModelRenderer(this, 35, 3);
		this.AntenaC9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaC9.addBox(-2.0F, -9.25F, -5.0F, 1, 1, 1, 0.0F);

		this.Belt.addChild(this.beltL);
		this.Belt.addChild(this.beltR);
		this.CuttingBlade.addChild(this.CuttingBlade2);

		this.Head_jimber.addChild(this.AntenaC1);
		this.Head_jimber.addChild(this.AntenaC2);
		this.Head_jimber.addChild(this.AntenaC3);
		this.Head_jimber.addChild(this.AntenaC4);
		this.Head_jimber.addChild(this.AntenaC5);
		this.Head_jimber.addChild(this.ANtenaC6);
		this.Head_jimber.addChild(this.AntenaC7);
		this.Head_jimber.addChild(this.AntenaC8);
		this.Head_jimber.addChild(this.AntenaC9);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorSengokuDriverKNUCKLE.isInvisible==0)
		{
			this.Belt.showModel=true;	
			this.CuttingBlade.showModel=true;		
			this.buckleL.showModel=true;		
			this.buckleR.showModel=true;		
			this.buckle.showModel=true;		

			if(ArmorSengokuDriverKNUCKLE.isHenshin==1)
			{
				this.Head.showModel=true;
				this.Head_jimber.showModel=false;
				this.Body.showModel=true;
				this.RightArm.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftArm.showModel=true;
				this.LeftLeg.showModel=true;
			}else	if(ArmorSengokuDriverKNUCKLE.isHenshin==2)
			{
				this.Head.showModel=false;
				this.Head_jimber.showModel=true;
				this.Body.showModel=true;
				this.RightArm.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftArm.showModel=true;
				this.LeftLeg.showModel=true;

			}else {
				this.Head.showModel=false;
				this.Head_jimber.showModel=false;
				this.Body.showModel=false;
				this.RightArm.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftArm.showModel=false;
				this.LeftLeg.showModel=false;
			}
		}else {
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;		
			this.Belt.showModel=false;		    	
			this.CuttingBlade.showModel=false;		
			this.buckleL.showModel=false;		
			this.buckleR.showModel=false;		
			this.buckle.showModel=false;
			this.Head_jimber.showModel=false;
		}

		if (this.isChild) {
			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			this.Belt.render(f5); 
			this.buckle.render(f5);
			this.buckleL.render(f5);
			this.buckleR.render(f5);				
			this.Head_jimber.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.CuttingBlade.offsetX, this.CuttingBlade.offsetY, this.CuttingBlade.offsetZ);
			GlStateManager.translate(this.CuttingBlade.rotationPointX * f5, this.CuttingBlade.rotationPointY * f5, this.CuttingBlade.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.CuttingBlade.offsetX, -this.CuttingBlade.offsetY, -this.CuttingBlade.offsetZ);
			GlStateManager.translate(-this.CuttingBlade.rotationPointX * f5, -this.CuttingBlade.rotationPointY * f5, -this.CuttingBlade.rotationPointZ * f5);
			this.CuttingBlade.render(f5);
			GlStateManager.popMatrix();		



		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			this.Belt.render(f5); 
			this.buckle.render(f5);
			this.buckleL.render(f5);
			this.buckleR.render(f5);	
			this.Head_jimber.render(f5);

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.3F, 0.25F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.CuttingBlade.offsetX, this.CuttingBlade.offsetY, this.CuttingBlade.offsetZ);
			GlStateManager.translate(this.CuttingBlade.rotationPointX * f5, this.CuttingBlade.rotationPointY * f5, this.CuttingBlade.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.CuttingBlade.offsetX, -this.CuttingBlade.offsetY, -this.CuttingBlade.offsetZ);
			GlStateManager.translate(-this.CuttingBlade.rotationPointX * f5, -this.CuttingBlade.rotationPointY * f5, -this.CuttingBlade.rotationPointZ * f5);
			this.CuttingBlade.render(f5);
			GlStateManager.popMatrix();		

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
			setAngle(Belt, this.bipedBody);
			setAngle(buckle, this.bipedBody);
			setAngle(buckleL, this.bipedBody);
			setAngle(buckleR, this.bipedBody);
			setAngle(Head_jimber, this.bipedHead);
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
