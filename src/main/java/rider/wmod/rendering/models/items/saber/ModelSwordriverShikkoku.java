package rider.wmod.rendering.models.items.saber;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.saber.ArmorSwordriverShikkoku;

/**
 * ModelSwordriverShikkoku - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelSwordriverShikkoku extends ModelBiped {
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

	public ModelSwordriverShikkoku() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.beltR = new ModelRenderer(this, 35, 37);
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-3.25F, 8.5F, -2.5F, 1, 2, 1, 0.0F);
		this.beltL = new ModelRenderer(this, 35, 37);
		this.beltL.mirror = true;
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(2.75F, 8.5F, -2.5F, 1, 2, 1, 0.0F);
		this.Embrem2 = new ModelRenderer(this, 39, 32);
		this.Embrem2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Embrem2.addBox(-3.25F, 8.15F, -6.5F, 1, 1, 1, 0.0F);
		this.driver = new ModelRenderer(this, 24, 37);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-2.25F, 8.5F, -3.25F, 5, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.driver3 = new ModelRenderer(this, 25, 37);
		this.driver3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver3.addBox(2.25F, 8.75F, -2.75F, 1, 1, 1, 0.0F);
		this.Embrem3 = new ModelRenderer(this, 43, 32);
		this.Embrem3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Embrem3.addBox(-3.25F, 9.35F, -6.5F, 1, 1, 1, 0.0F);
		this.Sword = new ModelRenderer(this, 36, 34);
		this.Sword.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Sword.addBox(-5.25F, 8.75F, -3.0F, 3, 1, 1, 0.0F);
		this.Embrem = new ModelRenderer(this, 36, 32);
		this.Embrem.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Embrem.addBox(-3.25F, 8.75F, -7.0F, 1, 1, 1, 0.0F);
		this.driver2 = new ModelRenderer(this, 31, 38);
		this.driver2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver2.addBox(-3.0F, 8.75F, -2.55F, 1, 1, 1, 0.0F);
		this.Belt.addChild(this.beltR);
		this.Belt.addChild(this.beltL);
		this.Embrem.addChild(this.Embrem2);
		this.Belt.addChild(this.driver);
		this.Belt.addChild(this.driver3);
		this.Embrem.addChild(this.Embrem3);
		this.Belt.addChild(this.driver2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorSwordriverShikkoku.isInvisible==0)
		{
			this.Belt.showModel=true;
			if(ArmorSwordriverShikkoku.isSwordIn==1) 
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


		if (this.isChild) {
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

		//		setAngle(Head, this.bipedHead);
		//		setAngle(Body, this.bipedBody);
		//		setAngle(Body2, this.bipedBody);
		//		setAngle(LeftArm, this.bipedLeftArm);
		//		setAngle(RightLeg, this.bipedRightLeg);
		//		setAngle(LeftLeg, this.bipedLeftLeg);

		setAngle(Belt, this.bipedBody);
		setAngle(Sword, this.bipedBody);
		setAngle(Embrem, this.bipedBody);

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
