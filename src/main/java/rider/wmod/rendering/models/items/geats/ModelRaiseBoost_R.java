package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelRaiseBoost_R - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRaiseBoost_R extends ModelBiped {

    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer Raisebackle2_Dn;
    public ModelRenderer Raisebackle3_Dn;
    public ModelRenderer Raisebackle1_Dn;
    public ModelRenderer LegGuardL2;
    public ModelRenderer LegBoosterL;
    public ModelRenderer LegBoosterL2;
    public ModelRenderer LegGuardR2;
    public ModelRenderer LegBoosterR;
    public ModelRenderer LegBoosterR2;
    public ModelRenderer Body3;

	public ModelRaiseBoost_R() {
	    this.textureWidth = 64;
        this.textureHeight = 64;
        this.LegBoosterR = new ModelRenderer(this, 2, 52);
        this.LegBoosterR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegBoosterR.addBox(-3.5F, 3.0F, 7.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LegBoosterR, -0.7853981633974483F, 0.0F, 0.0F);
        this.Raisebackle3_Dn = new ModelRenderer(this, 28, 44);
        this.Raisebackle3_Dn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Raisebackle3_Dn.addBox(-0.55F, 9.85F, -3.3F, 1, 1, 1, 0.0F);
        this.Raisebackle2_Dn = new ModelRenderer(this, 25, 44);
        this.Raisebackle2_Dn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Raisebackle2_Dn.addBox(0.5F, 9.5F, -3.3F, 2, 2, 1, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
        this.LegBoosterR2 = new ModelRenderer(this, 0, 51);
        this.LegBoosterR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegBoosterR2.addBox(-3.5F, 2.5F, 5.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(LegBoosterR2, -0.6981317007977318F, 0.0F, 0.0F);
        this.LegBoosterL = new ModelRenderer(this, 2, 52);
        this.LegBoosterL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegBoosterL.addBox(2.3F, 3.0F, 7.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LegBoosterL, -0.7853981633974483F, 0.0F, 0.0F);
        this.LegBoosterL2 = new ModelRenderer(this, 0, 51);
        this.LegBoosterL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegBoosterL2.addBox(2.3F, 2.5F, 5.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(LegBoosterL2, -0.6981317007977318F, 0.0F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 16, 48);
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
        this.LegGuardR2 = new ModelRenderer(this, 0, 32);
        this.LegGuardR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegGuardR2.addBox(-3.2F, 3.7F, -1.8F, 2, 3, 4, 0.0F);
        this.setRotateAngle(LegGuardR2, 0.0F, -1.5707963267948966F, 0.0F);
        this.LegGuardL2 = new ModelRenderer(this, 0, 32);
        this.LegGuardL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegGuardL2.addBox(-3.2F, 3.7F, -2.2F, 2, 3, 4, 0.0F);
        this.setRotateAngle(LegGuardL2, 0.0F, -1.5707963267948966F, 0.0F);
        this.Raisebackle1_Dn = new ModelRenderer(this, 21, 42);
        this.Raisebackle1_Dn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Raisebackle1_Dn.addBox(2.25F, 18.5F, -3.1F, 1, 1, 1, 0.0F);
        this.RightLeg.addChild(this.LegBoosterR);
        this.RightLeg.addChild(this.LegBoosterR2);
        this.LeftLeg.addChild(this.LegBoosterL);
        this.LeftLeg.addChild(this.LegBoosterL2);
        this.RightLeg.addChild(this.LegGuardR2);
        this.LeftLeg.addChild(this.LegGuardL2);
		this.Body3 = new ModelRenderer(this, 16, 29);
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3.addBox(-4.0F, 10.0F, -2.3F, 8, 2, 4, 0.26F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
		        this.Raisebackle3_Dn.render(f5);
		        GlStateManager.pushMatrix();
		        GlStateManager.translate(this.Raisebackle2_Dn.offsetX, this.Raisebackle2_Dn.offsetY, this.Raisebackle2_Dn.offsetZ);
		        GlStateManager.translate(this.Raisebackle2_Dn.rotationPointX * f5, this.Raisebackle2_Dn.rotationPointY * f5, this.Raisebackle2_Dn.rotationPointZ * f5);
		        GlStateManager.scale(0.9D, 0.9D, 1.0D);
		        GlStateManager.translate(-this.Raisebackle2_Dn.offsetX, -this.Raisebackle2_Dn.offsetY, -this.Raisebackle2_Dn.offsetZ);
		        GlStateManager.translate(-this.Raisebackle2_Dn.rotationPointX * f5, -this.Raisebackle2_Dn.rotationPointY * f5, -this.Raisebackle2_Dn.rotationPointZ * f5);
		        this.Raisebackle2_Dn.render(f5);
		        GlStateManager.popMatrix();
		        this.RightLeg.render(f5);
		        this.LeftLeg.render(f5);
				this.Body3.render(f5);
		        GlStateManager.pushMatrix();
		        GlStateManager.translate(this.Raisebackle1_Dn.offsetX, this.Raisebackle1_Dn.offsetY, this.Raisebackle1_Dn.offsetZ);
		        GlStateManager.translate(this.Raisebackle1_Dn.rotationPointX * f5, this.Raisebackle1_Dn.rotationPointY * f5, this.Raisebackle1_Dn.rotationPointZ * f5);
		        GlStateManager.scale(1.0D, 0.5D, 1.0D);
		        GlStateManager.translate(-this.Raisebackle1_Dn.offsetX, -this.Raisebackle1_Dn.offsetY, -this.Raisebackle1_Dn.offsetZ);
		        GlStateManager.translate(-this.Raisebackle1_Dn.rotationPointX * f5, -this.Raisebackle1_Dn.rotationPointY * f5, -this.Raisebackle1_Dn.rotationPointZ * f5);
		        this.Raisebackle1_Dn.render(f5);
		        GlStateManager.popMatrix();

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
	        this.RightLeg.render(f5);
	        this.LeftLeg.render(f5);
			this.Body3.render(f5);
	        
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.Raisebackle2_Dn.offsetX, this.Raisebackle2_Dn.offsetY, this.Raisebackle2_Dn.offsetZ);
	        GlStateManager.translate(this.Raisebackle2_Dn.rotationPointX * f5, this.Raisebackle2_Dn.rotationPointY * f5, this.Raisebackle2_Dn.rotationPointZ * f5);
	        GlStateManager.scale(0.9D, 0.9D, 1.0D);
	        GlStateManager.translate(-this.Raisebackle2_Dn.offsetX, -this.Raisebackle2_Dn.offsetY, -this.Raisebackle2_Dn.offsetZ);
	        GlStateManager.translate(-this.Raisebackle2_Dn.rotationPointX * f5, -this.Raisebackle2_Dn.rotationPointY * f5, -this.Raisebackle2_Dn.rotationPointZ * f5);
	        this.Raisebackle2_Dn.render(f5);
	        GlStateManager.popMatrix();
	        
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.02F);
			}	
			this.Raisebackle3_Dn.render(f5);	        
	        
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.27F, -0.31F);
			}	
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.Raisebackle1_Dn.offsetX, this.Raisebackle1_Dn.offsetY, this.Raisebackle1_Dn.offsetZ);
	        GlStateManager.translate(this.Raisebackle1_Dn.rotationPointX * f5, this.Raisebackle1_Dn.rotationPointY * f5, this.Raisebackle1_Dn.rotationPointZ * f5);
	        GlStateManager.scale(1.0D, 0.5D, 1.0D);
	        GlStateManager.translate(-this.Raisebackle1_Dn.offsetX, -this.Raisebackle1_Dn.offsetY, -this.Raisebackle1_Dn.offsetZ);
	        GlStateManager.translate(-this.Raisebackle1_Dn.rotationPointX * f5, -this.Raisebackle1_Dn.rotationPointY * f5, -this.Raisebackle1_Dn.rotationPointZ * f5);
	        this.Raisebackle1_Dn.render(f5);
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

		setAngle(Body3, this.bipedBody);
		setAngle(LeftLeg, this.bipedLeftLeg);
		setAngle(RightLeg, this.bipedRightLeg);
		setAngle(Raisebackle1_Dn, this.bipedBody);
		setAngle(Raisebackle2_Dn, this.bipedBody);
		setAngle(Raisebackle3_Dn, this.bipedBody);

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
