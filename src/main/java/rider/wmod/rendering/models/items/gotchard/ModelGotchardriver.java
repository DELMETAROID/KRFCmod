package rider.wmod.rendering.models.items.gotchard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.gotchard.ArmorGotchardriver;

/**
 * ModelGotchardriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGotchardriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer LeverL;
	public ModelRenderer backle;
	public ModelRenderer LeverR;

	public ModelGotchardriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.backle = new ModelRenderer(this, 23, 37);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-2.0F, 6.6F, -3.0F, 4, 2, 1, 0.0F);
		this.LeverR = new ModelRenderer(this, 19, 37);
		this.LeverR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeverR.addBox(4.5F, 8.0F, -5.0F, 1, 2, 1, 0.0F);
		this.LeverL = new ModelRenderer(this, 19, 37);
		this.LeverL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeverL.addBox(-5.5F, 8.0F, -5.0F, 1, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGotchardriver.isInvisible==0)
		{
			this.Belt.showModel=true;
			this.backle.showModel=true;
			this.LeverL.showModel=true;
			this.LeverR.showModel=true;
		}
		else 
		{
			this.Belt.showModel=false;
			this.backle.showModel=false;
			this.LeverL.showModel=false;
			this.LeverR.showModel=false;			
		}
		
		if (this.isChild) {			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.backle.offsetX, this.backle.offsetY, this.backle.offsetZ);
			GlStateManager.translate(this.backle.rotationPointX * f5, this.backle.rotationPointY * f5, this.backle.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.25D, 1.0D);
			GlStateManager.translate(-this.backle.offsetX, -this.backle.offsetY, -this.backle.offsetZ);
			GlStateManager.translate(-this.backle.rotationPointX * f5, -this.backle.rotationPointY * f5, -this.backle.rotationPointZ * f5);
			this.backle.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeverR.offsetX, this.LeverR.offsetY, this.LeverR.offsetZ);
			GlStateManager.translate(this.LeverR.rotationPointX * f5, this.LeverR.rotationPointY * f5, this.LeverR.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 0.5D);
			GlStateManager.translate(-this.LeverR.offsetX, -this.LeverR.offsetY, -this.LeverR.offsetZ);
			GlStateManager.translate(-this.LeverR.rotationPointX * f5, -this.LeverR.rotationPointY * f5, -this.LeverR.rotationPointZ * f5);
			this.LeverR.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeverL.offsetX, this.LeverL.offsetY, this.LeverL.offsetZ);
			GlStateManager.translate(this.LeverL.rotationPointX * f5, this.LeverL.rotationPointY * f5, this.LeverL.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 0.5D);
			GlStateManager.translate(-this.LeverL.offsetX, -this.LeverL.offsetY, -this.LeverL.offsetZ);
			GlStateManager.translate(-this.LeverL.rotationPointX * f5, -this.LeverL.rotationPointY * f5, -this.LeverL.rotationPointZ * f5);
			this.LeverL.render(f5);
			GlStateManager.popMatrix();
			this.Belt.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.backle.offsetX, this.backle.offsetY, this.backle.offsetZ);
			GlStateManager.translate(this.backle.rotationPointX * f5, this.backle.rotationPointY * f5, this.backle.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.25D, 1.0D);
			GlStateManager.translate(-this.backle.offsetX, -this.backle.offsetY, -this.backle.offsetZ);
			GlStateManager.translate(-this.backle.rotationPointX * f5, -this.backle.rotationPointY * f5, -this.backle.rotationPointZ * f5);
			this.backle.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeverR.offsetX, this.LeverR.offsetY, this.LeverR.offsetZ);
			GlStateManager.translate(this.LeverR.rotationPointX * f5, this.LeverR.rotationPointY * f5, this.LeverR.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 0.5D);
			GlStateManager.translate(-this.LeverR.offsetX, -this.LeverR.offsetY, -this.LeverR.offsetZ);
			GlStateManager.translate(-this.LeverR.rotationPointX * f5, -this.LeverR.rotationPointY * f5, -this.LeverR.rotationPointZ * f5);
			this.LeverR.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeverL.offsetX, this.LeverL.offsetY, this.LeverL.offsetZ);
			GlStateManager.translate(this.LeverL.rotationPointX * f5, this.LeverL.rotationPointY * f5, this.LeverL.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 0.5D);
			GlStateManager.translate(-this.LeverL.offsetX, -this.LeverL.offsetY, -this.LeverL.offsetZ);
			GlStateManager.translate(-this.LeverL.rotationPointX * f5, -this.LeverL.rotationPointY * f5, -this.LeverL.rotationPointZ * f5);
			this.LeverL.render(f5);
			GlStateManager.popMatrix();
			this.Belt.render(f5);

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

		setAngle(Belt, this.bipedBody);
		setAngle(backle, this.bipedBody);
		setAngle(LeverL, this.bipedBody);
		setAngle(LeverR, this.bipedBody);
		
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
