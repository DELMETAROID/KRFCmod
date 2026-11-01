package rider.wmod.rendering.models.items.saber;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.saber.ArmorSaberSiren;

/**
 * ModelSaberSiren - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelSaberSiren extends ModelBiped {
	/*
	public ModelRenderer DragonHead;
	public ModelRenderer Body;
	public ModelRenderer Body2;
	public ModelRenderer RightArm;

	public ModelRenderer Skart1;
	public ModelRenderer Skart3;
	public ModelRenderer Skart5;
	 */
	public ModelRenderer BookL;
	public ModelRenderer BookL_open;
	/*
	public ModelRenderer Dragon1;
	public ModelRenderer Dragon2;
	public ModelRenderer Dragon3;
	public ModelRenderer Parka;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R4;
	public ModelRenderer Shoulder_R5;
	public ModelRenderer Shoulder_R6;
	public ModelRenderer HandFrame1;
	public ModelRenderer HandFrame2;
	 */

	public ModelSaberSiren() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		/*
		this.DragonHead = new ModelRenderer(this, 0, 0);
		this.DragonHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DragonHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.Dragon1 = new ModelRenderer(this, 51, 55);
		this.Dragon1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Dragon1.addBox(-1.0F, -6.0F, -4.1F, 1, 2, 1, 0.0F);
		this.setRotateAngle(Dragon1, 0.0F, 0.0F, -0.7853981633974483F);
		this.Dragon2 = new ModelRenderer(this, 51, 55);
		this.Dragon2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Dragon2.addBox(0.0F, -7.5F, -4.1F, 1, 3, 1, 0.0F);
		this.setRotateAngle(Dragon2, 0.0F, 0.0F, -0.7853981633974483F);
		this.Dragon3 = new ModelRenderer(this, 51, 55);
		this.Dragon3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Dragon3.addBox(1.0F, -9.0F, -4.1F, 1, 3, 1, 0.0F);
		this.setRotateAngle(Dragon3, 0.0F, 0.0F, -0.7853981633974483F);

		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 32);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -3.5F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, -0.17453292519943295F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 53);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-4.75F, -1.5F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_R2, 0.0F, 0.0F, -0.17453292519943295F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 51);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-2.5F, -4.5F, -1.65F, 3, 1, 1, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F, -0.17453292519943295F);
		this.Shoulder_R4 = new ModelRenderer(this, 8, 51);
		this.Shoulder_R4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R4.addBox(-0.75F, -5.5F, -2.0F, 2, 1, 1, 0.0F);
		this.setRotateAngle(Shoulder_R4, 0.0F, 0.0F, -0.17453292519943295F);
		this.Shoulder_R5 = new ModelRenderer(this, 0, 51);
		this.Shoulder_R5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R5.addBox(-2.5F, -4.5F, 0.65F, 3, 1, 1, 0.0F);
		this.setRotateAngle(Shoulder_R5, 0.0F, 0.0F, -0.17453292519943295F);
		this.Shoulder_R6 = new ModelRenderer(this, 8, 51);
		this.Shoulder_R6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R6.addBox(-0.75F, -5.5F, 1.0F, 2, 1, 1, 0.0F);
		this.setRotateAngle(Shoulder_R6, 0.0F, 0.0F, -0.17453292519943295F);
		this.HandFrame1 = new ModelRenderer(this, 0, 55);
		this.HandFrame1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandFrame1.addBox(-4.0F, 1.25F, -0.5F, 1, 2, 1, 0.0F);
		this.HandFrame2 = new ModelRenderer(this, 0, 54);
		this.HandFrame2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandFrame2.addBox(-4.0F, 4.0F, -0.5F, 1, 3, 1, 0.0F);

		this.Skart1 = new ModelRenderer(this, 40, 0);
		this.Skart1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart1.addBox(-2.5F, 10.75F, -2.75F, 1, 11, 5, 0.0F);
		this.setRotateAngle(Skart1, 0.0F, 0.0F, 0.17453292519943295F);
		this.Skart3 = new ModelRenderer(this, 52, 0);
		this.Skart3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart3.addBox(-2.45F, 10.25F, 0.35F, 4, 10, 1, 0.0F);
		this.setRotateAngle(Skart3, 0.08726646259971647F, 0.0F, 0.17453292519943295F);
		this.Skart5 = new ModelRenderer(this, 32, 0);
		this.Skart5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart5.addBox(-2.35F, 10.75F, -1.5F, 2, 13, 1, 0.0F);
		this.setRotateAngle(Skart5, -0.08726646259971647F, 0.0F, 0.17453292519943295F);

		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Body2 = new ModelRenderer(this, 18, 42);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.0F, -2.5F, 8, 5, 1, 0.26F);
		this.Parka = new ModelRenderer(this, 36, 36);
		this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Parka.addBox(-4.5F, -1.5F, -2.0F, 9, 7, 5, 0.0F);
		 */
		this.BookL = new ModelRenderer(this, 0, 5);
		this.BookL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BookL.addBox(-2.75F, 7.5F, -7.1F, 2, 2, 1, 0.0F);
		this.BookL_open = new ModelRenderer(this, 0, 1);
		this.BookL_open.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BookL_open.addBox(-3.5F, 7.5F, -7.1F, 3, 2, 1, 0.0F);
		/*
		this.DragonHead.addChild(this.Dragon1);
		this.DragonHead.addChild(this.Dragon2);	
		this.DragonHead.addChild(this.Dragon3);
		this.RightArm.addChild(this.HandFrame1);
		this.RightArm.addChild(this.HandFrame2);
		this.RightArm.addChild(this.Shoulder_R);
		this.RightArm.addChild(this.Shoulder_R2);		
		this.RightArm.addChild(this.Shoulder_R3);		
		this.RightArm.addChild(this.Shoulder_R4);
		this.RightArm.addChild(this.Shoulder_R5);
		this.RightArm.addChild(this.Shoulder_R6);

		this.Body2.addChild(this.Parka);
		 */
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorSaberSiren.DriverCheck==1&&ArmorSaberSiren.isInvisible==0) 
		{
			if(ArmorSaberSiren.isBookOpen==1) 
			{
				this.BookL.showModel=false;
				this.BookL_open.showModel=true;
				//			this.DragonHead.showModel=true;
				//			this.Body.showModel=true;
				//		this.Body2.showModel=true;
				//	this.RightArm.showModel=true;	
				//this.Skart1.showModel=true;
				//			this.Skart3.showModel=true;
				//		this.Skart5.showModel=true;
			}else {
				this.BookL.showModel=true;
				this.BookL_open.showModel=false;
				//	this.DragonHead.showModel=false;
				//	this.Body.showModel=false;
				//this.Body2.showModel=false;
				//			this.RightArm.showModel=false;	
				//		this.Skart1.showModel=false;
				//	this.Skart3.showModel=false;
				//this.Skart5.showModel=false;
			}
		}else {
			this.BookL.showModel=false;
			this.BookL_open.showModel=false;
		}


		if (this.isChild)
		{
			/*			this.DragonHead.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.RightArm.render(f5);	
			this.Skart1.render(f5);
			this.Skart3.render(f5);
			this.Skart5.render(f5);
			 */
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookL.offsetX, this.BookL.offsetY, this.BookL.offsetZ);
			GlStateManager.translate(this.BookL.rotationPointX * f5, this.BookL.rotationPointY * f5, this.BookL.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookL.offsetX, -this.BookL.offsetY, -this.BookL.offsetZ);
			GlStateManager.translate(-this.BookL.rotationPointX * f5, -this.BookL.rotationPointY * f5, -this.BookL.rotationPointZ * f5);
			this.BookL.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookL_open.offsetX, this.BookL_open.offsetY, this.BookL_open.offsetZ);
			GlStateManager.translate(this.BookL_open.rotationPointX * f5, this.BookL_open.rotationPointY * f5, this.BookL_open.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookL_open.offsetX, -this.BookL_open.offsetY, -this.BookL_open.offsetZ);
			GlStateManager.translate(-this.BookL_open.rotationPointX * f5, -this.BookL_open.rotationPointY * f5, -this.BookL_open.rotationPointZ * f5);
			this.BookL_open.render(f5);
			GlStateManager.popMatrix();
		}	
		else 
		{
			/*
			this.DragonHead.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.RightArm.render(f5);
			 */
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}

			//			this.Skart1.render(f5);
			//			this.Skart3.render(f5);
			//			this.Skart5.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookL.offsetX, this.BookL.offsetY, this.BookL.offsetZ);
			GlStateManager.translate(this.BookL.rotationPointX * f5, this.BookL.rotationPointY * f5, this.BookL.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookL.offsetX, -this.BookL.offsetY, -this.BookL.offsetZ);
			GlStateManager.translate(-this.BookL.rotationPointX * f5, -this.BookL.rotationPointY * f5, -this.BookL.rotationPointZ * f5);
			this.BookL.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.BookL_open.offsetX, this.BookL_open.offsetY, this.BookL_open.offsetZ);
			GlStateManager.translate(this.BookL_open.rotationPointX * f5, this.BookL_open.rotationPointY * f5, this.BookL_open.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.BookL_open.offsetX, -this.BookL_open.offsetY, -this.BookL_open.offsetZ);
			GlStateManager.translate(-this.BookL_open.rotationPointX * f5, -this.BookL_open.rotationPointY * f5, -this.BookL_open.rotationPointZ * f5);
			this.BookL_open.render(f5);
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


		//		setAngle(DragonHead, this.bipedHead);
		//	setAngle(Body, this.bipedBody);
		//setAngle(Body2, this.bipedBody);
		//		setAngle(RightArm, this.bipedRightArm);

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
