package rider.wmod.rendering.models.items.saber;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.saber.ArmorSwordriverRekka;

/**
 * ModelSwordriverRekka - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelSwordriverRekka extends ModelBiped {
	public ModelRenderer Head;
	public ModelRenderer Head2;
	public ModelRenderer Head3;
	public ModelRenderer SaberCenter;
	public ModelRenderer Saber1L;
	public ModelRenderer Saber2L;
	public ModelRenderer Saber3L;
	public ModelRenderer Saber4L;
	public ModelRenderer Saber1R;
	public ModelRenderer Saber2R;
	public ModelRenderer Saber3R;
	public ModelRenderer Saber4R;
	public ModelRenderer Saber5R;
	public ModelRenderer Saber6R;

	public ModelRenderer Body;
	public ModelRenderer Body2;
	public ModelRenderer Parka;
	public ModelRenderer LeftLeg;	
	public ModelRenderer RightLeg;
	public ModelRenderer LeftArm;
	public ModelRenderer Shoulder_L;


	public ModelRenderer Belt;
	public ModelRenderer Sword;
	public ModelRenderer Embrem;
	public ModelRenderer driver;
	public ModelRenderer beltL;
	public ModelRenderer beltR;
	public ModelRenderer driver2;
	public ModelRenderer driver3;
	public ModelRenderer Embrem2;
	public ModelRenderer Embrem3;

	public ModelSwordriverRekka() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Head2 = new ModelRenderer(this, 56, 18);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-0.5F, -10.0F, -4.5F, 1, 10, 3, 0.0F);
		this.setRotateAngle(Head2, 0.17453292519943295F, 0.0F, 0.0F);
		this.Head3 = new ModelRenderer(this, 52, 16);
		this.Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3.addBox(-0.5F, -12.0F, -4.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(Head3, 0.17453292519943295F, 0.0F, 0.0F);

		this.SaberCenter = new ModelRenderer(this, 52, 58);
		this.SaberCenter.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SaberCenter.addBox(-0.5F, -3.75F, -5.25F, 1, 1, 1, 0.0F);
		this.Saber1L = new ModelRenderer(this, 52, 61);
		this.Saber1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber1L.addBox(-1.5F, -4.5F, -5.15F, 1, 2, 1, 0.0F);
		this.Saber2L = new ModelRenderer(this, 50, 60);
		this.Saber2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber2L.addBox(-2.5F, -5.0F, -5.05F, 1, 3, 1, 0.0F);
		this.Saber3L = new ModelRenderer(this, 48, 57);
		this.Saber3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber3L.addBox(-3.5F, -7.45F, -4.95F, 1, 6, 1, 0.0F);
		this.Saber4L = new ModelRenderer(this, 51, 56);
		this.Saber4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber4L.addBox(-4.1F, -8.25F, -4.85F, 1, 3, 1, 0.0F);

		this.Saber1R = new ModelRenderer(this, 52, 61);
		this.Saber1R.mirror = true;
		this.Saber1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber1R.addBox(0.5F, -4.5F, -5.15F, 1, 2, 1, 0.0F);
		this.Saber2R = new ModelRenderer(this, 54, 60);
		this.Saber2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber2R.addBox(1.5F, -5.0F, -5.05F, 1, 3, 1, 0.0F);
		this.Saber3R = new ModelRenderer(this, 57, 57);
		this.Saber3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber3R.addBox(2.5F, -7.5F, -4.95F, 1, 6, 1, 0.0F);
		this.Saber4R = new ModelRenderer(this, 59, 57);
		this.Saber4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber4R.addBox(3.5F, -8.75F, -4.85F, 1, 4, 1, 0.0F);
		this.Saber5R = new ModelRenderer(this, 58, 62);
		this.Saber5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber5R.addBox(3.25F, -2.25F, -4.85F, 1, 1, 1, 0.0F);
		this.Saber6R = new ModelRenderer(this, 58, 62);
		this.Saber6R.mirror = true;
		this.Saber6R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saber6R.addBox(-4.25F, -2.25F, -4.85F, 1, 1, 1, 0.0F);

		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Body2 = new ModelRenderer(this, 18, 42);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.0F, -2.5F, 8, 5, 1, 0.26F);
		this.Parka = new ModelRenderer(this, 36, 36);
		this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Parka.addBox(-4.5F, -1.5F, -2.0F, 9, 7, 5, 0.0F);

		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 41);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);

		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);


		this.driver2 = new ModelRenderer(this, 31, 38);
		this.driver2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver2.addBox(-3.0F, 8.75F, -2.55F, 1, 1, 1, 0.0F);
		this.beltR = new ModelRenderer(this, 35, 37);
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-3.25F, 8.5F, -2.5F, 1, 2, 1, 0.0F);
		this.driver = new ModelRenderer(this, 24, 37);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-2.25F, 8.5F, -3.25F, 5, 2, 1, 0.0F);
		this.beltL = new ModelRenderer(this, 35, 37);
		this.beltL.mirror = true;
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(2.75F, 8.5F, -2.5F, 1, 2, 1, 0.0F);
		this.Embrem2 = new ModelRenderer(this, 39, 32);
		this.Embrem2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Embrem2.addBox(-3.35F, 8.25F, -6.5F, 1, 1, 1, 0.0F);
		this.Sword = new ModelRenderer(this, 36, 34);
		this.Sword.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Sword.addBox(-5.25F, 8.75F, -3.0F, 3, 1, 1, 0.0F);
		this.Embrem = new ModelRenderer(this, 36, 32);
		this.Embrem.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Embrem.addBox(-3.25F, 8.75F, -7.0F, 1, 1, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.driver3 = new ModelRenderer(this, 25, 37);
		this.driver3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver3.addBox(2.25F, 8.75F, -2.75F, 1, 1, 1, 0.0F);
		this.Embrem3 = new ModelRenderer(this, 43, 32);
		this.Embrem3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Embrem3.addBox(-3.55F, 9.25F, -6.5F, 1, 1, 1, 0.0F);

		this.Head.addChild(this.Head2);	
		this.Head.addChild(this.Head3);
		this.Head.addChild(this.SaberCenter);		
		this.Head.addChild(this.Saber1L);
		this.Head.addChild(this.Saber2L);	
		this.Head.addChild(this.Saber3L);
		this.Head.addChild(this.Saber4L);

		this.Head.addChild(this.Saber1R);
		this.Head.addChild(this.Saber2R);		
		this.Head.addChild(this.Saber3R);
		this.Head.addChild(this.Saber4R);
		this.Head.addChild(this.Saber5R);
		this.Head.addChild(this.Saber6R);

		this.Body2.addChild(this.Parka);
		this.LeftArm.addChild(this.Shoulder_L);

		this.Belt.addChild(this.beltL);
		this.Belt.addChild(this.beltR);
		this.Belt.addChild(this.driver);
		this.Belt.addChild(this.driver2);
		this.Belt.addChild(this.driver3);
		this.Embrem.addChild(this.Embrem2);
		this.Embrem.addChild(this.Embrem3);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorSwordriverRekka.isInvisible==0)
		{
			this.Belt.showModel=true;
			if(ArmorSwordriverRekka.isSwordIn==1) 
			{
				this.Sword.showModel=true;
				this.Embrem.showModel=true;	
			}
			else
			{
				this.Sword.showModel=false;
				this.Embrem.showModel=false;	
			}
		}else {
			this.Belt.showModel=false;
			this.Sword.showModel=false;
			this.Embrem.showModel=false;	
		}

		if(ArmorSwordriverRekka.isHenshin==1) 
		{
			this.Head.showModel=true;
			this.Body.showModel=true;
			this.Body2.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.RightLeg.showModel=true;
		}
		else
		{
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.RightLeg.showModel=false;
		}

		if (this.isChild) {
			this.Head.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);	

			this.Belt.render(f5);
			this.Sword.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Embrem.offsetX, this.Embrem.offsetY, this.Embrem.offsetZ);
			GlStateManager.translate(this.Embrem.rotationPointX * f5, this.Embrem.rotationPointY * f5, this.Embrem.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.Embrem.offsetX, -this.Embrem.offsetY, -this.Embrem.offsetZ);
			GlStateManager.translate(-this.Embrem.rotationPointX * f5, -this.Embrem.rotationPointY * f5, -this.Embrem.rotationPointZ * f5);
			this.Embrem.render(f5);
			GlStateManager.popMatrix();
		}	
		else 
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, -0.0F);
			}
			this.Head.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);	

			this.Belt.render(f5);
			this.Sword.render(f5);

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.1F, 0.15F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Embrem.offsetX, this.Embrem.offsetY, this.Embrem.offsetZ);
			GlStateManager.translate(this.Embrem.rotationPointX * f5, this.Embrem.rotationPointY * f5, this.Embrem.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.Embrem.offsetX, -this.Embrem.offsetY, -this.Embrem.offsetZ);
			GlStateManager.translate(-this.Embrem.rotationPointX * f5, -this.Embrem.rotationPointY * f5, -this.Embrem.rotationPointZ * f5);
			this.Embrem.render(f5);
			GlStateManager.popMatrix();

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
			setAngle(Head, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);

			setAngle(Belt, this.bipedBody);
			setAngle(Sword, this.bipedBody);
			setAngle(Embrem, this.bipedBody);
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
