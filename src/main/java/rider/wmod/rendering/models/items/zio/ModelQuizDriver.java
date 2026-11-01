package rider.wmod.rendering.models.items.zio;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.zio.ArmorQuizDriver;

/**
 * ModelQuizDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelQuizDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer backle;
	public ModelRenderer DriverSideR;
	public ModelRenderer DriverSideL;

	public ModelRenderer QuizBase1;
	public ModelRenderer QuizBase2;
	public ModelRenderer QuizBase1_1;
	public ModelRenderer QuizBase2_1;

	public ModelQuizDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.DriverSideR = new ModelRenderer(this, 21, 40);
		this.DriverSideR.mirror = true;
		this.DriverSideR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverSideR.addBox(-3.5F, 8.5F, -2.85F, 2, 2, 1, 0.0F);
		this.QuizBase1 = new ModelRenderer(this, 29, 40);
		this.QuizBase1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.QuizBase1.addBox(-2.6F, 13.0F, -4.5F, 2, 2, 1, 0.0F);
		this.backle = new ModelRenderer(this, 21, 36);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-1.5F, 8.0F, -3.0F, 3, 3, 1, 0.0F);
		this.QuizBase2_1 = new ModelRenderer(this, 32, 40);
		this.QuizBase2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.QuizBase2_1.addBox(2.0F, 17.5F, -4.5F, 2, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.DriverSideL = new ModelRenderer(this, 21, 40);
		this.DriverSideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverSideL.addBox(1.5F, 8.5F, -2.85F, 2, 2, 1, 0.0F);
		this.QuizBase2 = new ModelRenderer(this, 32, 40);
		this.QuizBase2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.QuizBase2.addBox(0.6F, 13.0F, -4.5F, 2, 2, 1, 0.0F);
		this.QuizBase1_1 = new ModelRenderer(this, 29, 40);
		this.QuizBase1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.QuizBase1_1.addBox(-4.0F, 17.5F, -4.5F, 2, 2, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (ArmorQuizDriver.isInvisible==1)
		{
			this.Belt.showModel=false;
			this.backle.showModel=false;
			this.DriverSideR.showModel=false;
			this.DriverSideL.showModel=false;
			this.QuizBase1.showModel=false;
			this.QuizBase2.showModel=false;
			this.QuizBase1_1.showModel=false;
			this.QuizBase2_1.showModel=false;
		}
		else
		{
			this.Belt.showModel=true;
			this.backle.showModel=true;
			this.DriverSideR.showModel=true;
			this.DriverSideL.showModel=true;
			this.QuizBase1.showModel=true;
			this.QuizBase2.showModel=true;
			this.QuizBase1_1.showModel=true;
			this.QuizBase2_1.showModel=true;
		}

		if (this.isChild) {
			this.DriverSideR.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase1.offsetX, this.QuizBase1.offsetY, this.QuizBase1.offsetZ);
			GlStateManager.translate(this.QuizBase1.rotationPointX * f5, this.QuizBase1.rotationPointY * f5, this.QuizBase1.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.75D, 0.75D);
			GlStateManager.translate(-this.QuizBase1.offsetX, -this.QuizBase1.offsetY, -this.QuizBase1.offsetZ);
			GlStateManager.translate(-this.QuizBase1.rotationPointX * f5, -this.QuizBase1.rotationPointY * f5, -this.QuizBase1.rotationPointZ * f5);
			this.QuizBase1.render(f5);
			GlStateManager.popMatrix();
			this.backle.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase2_1.offsetX, this.QuizBase2_1.offsetY, this.QuizBase2_1.offsetZ);
			GlStateManager.translate(this.QuizBase2_1.rotationPointX * f5, this.QuizBase2_1.rotationPointY * f5, this.QuizBase2_1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 0.5D, 0.75D);
			GlStateManager.translate(-this.QuizBase2_1.offsetX, -this.QuizBase2_1.offsetY, -this.QuizBase2_1.offsetZ);
			GlStateManager.translate(-this.QuizBase2_1.rotationPointX * f5, -this.QuizBase2_1.rotationPointY * f5, -this.QuizBase2_1.rotationPointZ * f5);
			this.QuizBase2_1.render(f5);
			GlStateManager.popMatrix();
			this.Belt.render(f5);
			this.DriverSideL.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase2.offsetX, this.QuizBase2.offsetY, this.QuizBase2.offsetZ);
			GlStateManager.translate(this.QuizBase2.rotationPointX * f5, this.QuizBase2.rotationPointY * f5, this.QuizBase2.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.75D, 0.75D);
			GlStateManager.translate(-this.QuizBase2.offsetX, -this.QuizBase2.offsetY, -this.QuizBase2.offsetZ);
			GlStateManager.translate(-this.QuizBase2.rotationPointX * f5, -this.QuizBase2.rotationPointY * f5, -this.QuizBase2.rotationPointZ * f5);
			this.QuizBase2.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase1_1.offsetX, this.QuizBase1_1.offsetY, this.QuizBase1_1.offsetZ);
			GlStateManager.translate(this.QuizBase1_1.rotationPointX * f5, this.QuizBase1_1.rotationPointY * f5, this.QuizBase1_1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 0.5D, 0.75D);
			GlStateManager.translate(-this.QuizBase1_1.offsetX, -this.QuizBase1_1.offsetY, -this.QuizBase1_1.offsetZ);
			GlStateManager.translate(-this.QuizBase1_1.rotationPointX * f5, -this.QuizBase1_1.rotationPointY * f5, -this.QuizBase1_1.rotationPointZ * f5);
			this.QuizBase1_1.render(f5);
			GlStateManager.popMatrix();

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			
			this.DriverSideR.render(f5);
			this.backle.render(f5);	        
			this.Belt.render(f5);
			this.DriverSideL.render(f5);
		
			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.15F, -0.01F);
			}
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase2.offsetX, this.QuizBase2.offsetY, this.QuizBase2.offsetZ);
			GlStateManager.translate(this.QuizBase2.rotationPointX * f5, this.QuizBase2.rotationPointY * f5, this.QuizBase2.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.75D, 0.75D);
			GlStateManager.translate(-this.QuizBase2.offsetX, -this.QuizBase2.offsetY, -this.QuizBase2.offsetZ);
			GlStateManager.translate(-this.QuizBase2.rotationPointX * f5, -this.QuizBase2.rotationPointY * f5, -this.QuizBase2.rotationPointZ * f5);
			this.QuizBase2.render(f5);
			GlStateManager.popMatrix();
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase1.offsetX, this.QuizBase1.offsetY, this.QuizBase1.offsetZ);
			GlStateManager.translate(this.QuizBase1.rotationPointX * f5, this.QuizBase1.rotationPointY * f5, this.QuizBase1.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.75D, 0.75D);
			GlStateManager.translate(-this.QuizBase1.offsetX, -this.QuizBase1.offsetY, -this.QuizBase1.offsetZ);
			GlStateManager.translate(-this.QuizBase1.rotationPointX * f5, -this.QuizBase1.rotationPointY * f5, -this.QuizBase1.rotationPointZ * f5);
			this.QuizBase1.render(f5);
			GlStateManager.popMatrix();
			
			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, -0.15F);
			}
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase1_1.offsetX, this.QuizBase1_1.offsetY, this.QuizBase1_1.offsetZ);
			GlStateManager.translate(this.QuizBase1_1.rotationPointX * f5, this.QuizBase1_1.rotationPointY * f5, this.QuizBase1_1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 0.5D, 0.75D);
			GlStateManager.translate(-this.QuizBase1_1.offsetX, -this.QuizBase1_1.offsetY, -this.QuizBase1_1.offsetZ);
			GlStateManager.translate(-this.QuizBase1_1.rotationPointX * f5, -this.QuizBase1_1.rotationPointY * f5, -this.QuizBase1_1.rotationPointZ * f5);
			this.QuizBase1_1.render(f5);
			GlStateManager.popMatrix();
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizBase2_1.offsetX, this.QuizBase2_1.offsetY, this.QuizBase2_1.offsetZ);
			GlStateManager.translate(this.QuizBase2_1.rotationPointX * f5, this.QuizBase2_1.rotationPointY * f5, this.QuizBase2_1.rotationPointZ * f5);
			GlStateManager.scale(0.75D, 0.5D, 0.75D);
			GlStateManager.translate(-this.QuizBase2_1.offsetX, -this.QuizBase2_1.offsetY, -this.QuizBase2_1.offsetZ);
			GlStateManager.translate(-this.QuizBase2_1.rotationPointX * f5, -this.QuizBase2_1.rotationPointY * f5, -this.QuizBase2_1.rotationPointZ * f5);
			this.QuizBase2_1.render(f5);
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

		setAngle(Belt, this.bipedBody);
		setAngle(backle, this.bipedBody);
		setAngle(DriverSideR, this.bipedBody);
		setAngle(DriverSideL, this.bipedBody);
		setAngle(QuizBase1, this.bipedBody);
		setAngle(QuizBase2, this.bipedBody);
		setAngle(QuizBase1_1, this.bipedBody);
		setAngle(QuizBase2_1, this.bipedBody);

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
