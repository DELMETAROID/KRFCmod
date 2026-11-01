package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelDesireDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDesireDriver extends ModelBiped {
    public ModelRenderer Belt;
    public ModelRenderer RevolveSwitch;
    public ModelRenderer id;
    public ModelRenderer backleL;
    public ModelRenderer backleL_1;
    public ModelRenderer backle_1;

    public ModelDesireDriver() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.backleL_1 = new ModelRenderer(this, 21, 38);
        this.backleL_1.mirror = true;
        this.backleL_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleL_1.addBox(1.0F, 8.5F, -2.75F, 1, 2, 1, 0.0F);
        this.backleL = new ModelRenderer(this, 21, 38);
        this.backleL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleL.addBox(-2.0F, 8.5F, -2.75F, 1, 2, 1, 0.0F);
        this.id = new ModelRenderer(this, 18, 39);
        this.id.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.id.addBox(-0.5F, 9.0F, -3.0F, 1, 1, 1, 0.0F);
        this.Belt = new ModelRenderer(this, 16, 32);
        this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
        this.RevolveSwitch = new ModelRenderer(this, 17, 38);
        this.RevolveSwitch.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RevolveSwitch.addBox(-3.5F, 16.0F, -4.55F, 1, 1, 1, 0.0F);
        this.backle_1 = new ModelRenderer(this, 23, 38);
        this.backle_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backle_1.addBox(-1.0F, 6.6F, -2.75F, 2, 2, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
    	
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backleL_1.offsetX, this.backleL_1.offsetY, this.backleL_1.offsetZ);
        GlStateManager.translate(this.backleL_1.rotationPointX * f5, this.backleL_1.rotationPointY * f5, this.backleL_1.rotationPointZ * f5);
        GlStateManager.scale(1.25D, 1.0D, 1.0D);
        GlStateManager.translate(-this.backleL_1.offsetX, -this.backleL_1.offsetY, -this.backleL_1.offsetZ);
        GlStateManager.translate(-this.backleL_1.rotationPointX * f5, -this.backleL_1.rotationPointY * f5, -this.backleL_1.rotationPointZ * f5);
        this.backleL_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backleL.offsetX, this.backleL.offsetY, this.backleL.offsetZ);
        GlStateManager.translate(this.backleL.rotationPointX * f5, this.backleL.rotationPointY * f5, this.backleL.rotationPointZ * f5);
        GlStateManager.scale(1.25D, 1.0D, 1.0D);
        GlStateManager.translate(-this.backleL.offsetX, -this.backleL.offsetY, -this.backleL.offsetZ);
        GlStateManager.translate(-this.backleL.rotationPointX * f5, -this.backleL.rotationPointY * f5, -this.backleL.rotationPointZ * f5);
        this.backleL.render(f5);
        GlStateManager.popMatrix();
        this.id.render(f5);
        this.Belt.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.RevolveSwitch.offsetX, this.RevolveSwitch.offsetY, this.RevolveSwitch.offsetZ);
        GlStateManager.translate(this.RevolveSwitch.rotationPointX * f5, this.RevolveSwitch.rotationPointY * f5, this.RevolveSwitch.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.5D, 0.5D);
        GlStateManager.translate(-this.RevolveSwitch.offsetX, -this.RevolveSwitch.offsetY, -this.RevolveSwitch.offsetZ);
        GlStateManager.translate(-this.RevolveSwitch.rotationPointX * f5, -this.RevolveSwitch.rotationPointY * f5, -this.RevolveSwitch.rotationPointZ * f5);
        this.RevolveSwitch.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backle_1.offsetX, this.backle_1.offsetY, this.backle_1.offsetZ);
        GlStateManager.translate(this.backle_1.rotationPointX * f5, this.backle_1.rotationPointY * f5, this.backle_1.rotationPointZ * f5);
        GlStateManager.scale(1.25D, 1.25D, 1.0D);
        GlStateManager.translate(-this.backle_1.offsetX, -this.backle_1.offsetY, -this.backle_1.offsetZ);
        GlStateManager.translate(-this.backle_1.rotationPointX * f5, -this.backle_1.rotationPointY * f5, -this.backle_1.rotationPointZ * f5);
        this.backle_1.render(f5);
        GlStateManager.popMatrix();
        
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, -0.0F);
			}
	        this.Belt.render(f5);     

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}
	        this.id.render(f5);
	        
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.02F);
			}
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.backleL_1.offsetX, this.backleL_1.offsetY, this.backleL_1.offsetZ);
	        GlStateManager.translate(this.backleL_1.rotationPointX * f5, this.backleL_1.rotationPointY * f5, this.backleL_1.rotationPointZ * f5);
	        GlStateManager.scale(1.25D, 1.0D, 1.0D);
	        GlStateManager.translate(-this.backleL_1.offsetX, -this.backleL_1.offsetY, -this.backleL_1.offsetZ);
	        GlStateManager.translate(-this.backleL_1.rotationPointX * f5, -this.backleL_1.rotationPointY * f5, -this.backleL_1.rotationPointZ * f5);
	        this.backleL_1.render(f5);
	        GlStateManager.popMatrix();
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.backleL.offsetX, this.backleL.offsetY, this.backleL.offsetZ);
	        GlStateManager.translate(this.backleL.rotationPointX * f5, this.backleL.rotationPointY * f5, this.backleL.rotationPointZ * f5);
	        GlStateManager.scale(1.25D, 1.0D, 1.0D);
	        GlStateManager.translate(-this.backleL.offsetX, -this.backleL.offsetY, -this.backleL.offsetZ);
	        GlStateManager.translate(-this.backleL.rotationPointX * f5, -this.backleL.rotationPointY * f5, -this.backleL.rotationPointZ * f5);
	        this.backleL.render(f5);
	        GlStateManager.popMatrix();

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, -0.0F);
			}
			
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.backle_1.offsetX, this.backle_1.offsetY, this.backle_1.offsetZ);
	        GlStateManager.translate(this.backle_1.rotationPointX * f5, this.backle_1.rotationPointY * f5, this.backle_1.rotationPointZ * f5);
	        GlStateManager.scale(1.25D, 1.25D, 1.0D);
	        GlStateManager.translate(-this.backle_1.offsetX, -this.backle_1.offsetY, -this.backle_1.offsetZ);
	        GlStateManager.translate(-this.backle_1.rotationPointX * f5, -this.backle_1.rotationPointY * f5, -this.backle_1.rotationPointZ * f5);
	        this.backle_1.render(f5);
	        GlStateManager.popMatrix();
	        
			
			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.25F, 0.2F);
			}
			
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.RevolveSwitch.offsetX, this.RevolveSwitch.offsetY, this.RevolveSwitch.offsetZ);
	        GlStateManager.translate(this.RevolveSwitch.rotationPointX * f5, this.RevolveSwitch.rotationPointY * f5, this.RevolveSwitch.rotationPointZ * f5);
	        GlStateManager.scale(0.5D, 0.5D, 0.5D);
	        GlStateManager.translate(-this.RevolveSwitch.offsetX, -this.RevolveSwitch.offsetY, -this.RevolveSwitch.offsetZ);
	        GlStateManager.translate(-this.RevolveSwitch.rotationPointX * f5, -this.RevolveSwitch.rotationPointY * f5, -this.RevolveSwitch.rotationPointZ * f5);
	        this.RevolveSwitch.render(f5);
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
		setAngle(id, this.bipedBody);
		setAngle(backle_1, this.bipedBody);
		setAngle(backleL, this.bipedBody);
		setAngle(backleL_1, this.bipedBody);

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
