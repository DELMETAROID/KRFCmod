package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelRaiseMagnum_R - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelRaiseMagnum_R extends ModelBiped {
	public ModelRenderer LeftLeg;
	public ModelRenderer RightLeg;
	public ModelRenderer RaisebackleRoll;
	public ModelRenderer RaisebackleUp;
	public ModelRenderer Raisebackle_Grip;
	public ModelRenderer RaisebackleBurrel;
	public ModelRenderer Body3;
	public ModelRenderer LegGuardL2;
	public ModelRenderer LegGuardL1;
	public ModelRenderer LegGuardR1;
	public ModelRenderer LegGuardR2;

	public ModelRaiseMagnum_R() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Raisebackle_Grip = new ModelRenderer(this, 22, 42);
		this.Raisebackle_Grip.mirror = true;
		this.Raisebackle_Grip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Raisebackle_Grip.addBox(1.5F, 18.5F, -3.1F, 2, 1, 1, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Body3 = new ModelRenderer(this, 16, 29);
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3.addBox(-4.0F, 10.0F, -2.3F, 8, 2, 4, 0.26F);
		this.RaisebackleBurrel = new ModelRenderer(this, 29, 42);
		this.RaisebackleBurrel.mirror = true;
		this.RaisebackleBurrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RaisebackleBurrel.addBox(0.5F, 18.4F, -3.4F, 1, 1, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RaisebackleUp = new ModelRenderer(this, 28, 44);
		this.RaisebackleUp.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RaisebackleUp.addBox(-0.55F, 9.85F, -3.3F, 1, 1, 1, 0.0F);
		this.RaisebackleRoll = new ModelRenderer(this, 25, 44);
		this.RaisebackleRoll.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RaisebackleRoll.addBox(0.5F, 9.5F, -3.3F, 2, 2, 1, 0.0F);	
        this.LegGuardL2 = new ModelRenderer(this, 6, 33);
        this.LegGuardL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegGuardL2.addBox(-3.2F, 3.7F, -2.2F, 2, 3, 4, 0.0F);
        this.setRotateAngle(LegGuardL2, 0.0F, -1.5707963267948966F, 0.0F);
        this.LegGuardR1 = new ModelRenderer(this, 0, 31);
        this.LegGuardR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegGuardR1.addBox(3.3F, -1.8F, -3.3F, 1, 4, 5, 0.0F);
        this.setRotateAngle(LegGuardR1, 0.0F, 0.0F, 1.5707963267948966F);
        this.LegGuardL1 = new ModelRenderer(this, 0, 31);
        this.LegGuardL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegGuardL1.addBox(3.3F, -2.2F, -3.3F, 1, 4, 5, 0.0F);
        this.setRotateAngle(LegGuardL1, 0.0F, 0.0F, 1.5707963267948966F);
        this.LegGuardR2 = new ModelRenderer(this, 6, 33);
        this.LegGuardR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegGuardR2.addBox(-3.2F, 3.7F, -1.8F, 2, 3, 4, 0.0F);
        this.setRotateAngle(LegGuardR2, 0.0F, -1.5707963267948966F, 0.0F);		
		this.RightLeg.addChild(this.LegGuardR1);
		this.LeftLeg.addChild(this.LegGuardL1);
		this.LeftLeg.addChild(this.LegGuardL2);
		this.RightLeg.addChild(this.LegGuardR2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Grip.offsetX, this.Raisebackle_Grip.offsetY, this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(this.Raisebackle_Grip.rotationPointX * f5, this.Raisebackle_Grip.rotationPointY * f5, this.Raisebackle_Grip.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Grip.offsetX, -this.Raisebackle_Grip.offsetY, -this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Grip.rotationPointX * f5, -this.Raisebackle_Grip.rotationPointY * f5, -this.Raisebackle_Grip.rotationPointZ * f5);
			this.Raisebackle_Grip.render(f5);
			GlStateManager.popMatrix();
			this.LeftLeg.render(f5);
			this.Body3.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleBurrel.offsetX, this.RaisebackleBurrel.offsetY, this.RaisebackleBurrel.offsetZ);
			GlStateManager.translate(this.RaisebackleBurrel.rotationPointX * f5, this.RaisebackleBurrel.rotationPointY * f5, this.RaisebackleBurrel.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RaisebackleBurrel.offsetX, -this.RaisebackleBurrel.offsetY, -this.RaisebackleBurrel.offsetZ);
			GlStateManager.translate(-this.RaisebackleBurrel.rotationPointX * f5, -this.RaisebackleBurrel.rotationPointY * f5, -this.RaisebackleBurrel.rotationPointZ * f5);
			this.RaisebackleBurrel.render(f5);
			GlStateManager.popMatrix();
			this.RightLeg.render(f5);
			this.RaisebackleUp.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleRoll.offsetX, this.RaisebackleRoll.offsetY, this.RaisebackleRoll.offsetZ);
			GlStateManager.translate(this.RaisebackleRoll.rotationPointX * f5, this.RaisebackleRoll.rotationPointY * f5, this.RaisebackleRoll.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.9D, 1.0D);
			GlStateManager.translate(-this.RaisebackleRoll.offsetX, -this.RaisebackleRoll.offsetY, -this.RaisebackleRoll.offsetZ);
			GlStateManager.translate(-this.RaisebackleRoll.rotationPointX * f5, -this.RaisebackleRoll.rotationPointY * f5, -this.RaisebackleRoll.rotationPointZ * f5);
			this.RaisebackleRoll.render(f5);
			GlStateManager.popMatrix();


		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			
			this.LeftLeg.render(f5);
			this.Body3.render(f5);
			this.RightLeg.render(f5);  
			
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleRoll.offsetX, this.RaisebackleRoll.offsetY, this.RaisebackleRoll.offsetZ);
			GlStateManager.translate(this.RaisebackleRoll.rotationPointX * f5, this.RaisebackleRoll.rotationPointY * f5, this.RaisebackleRoll.rotationPointZ * f5);
			GlStateManager.scale(0.9D, 0.9D, 1.0D);
			GlStateManager.translate(-this.RaisebackleRoll.offsetX, -this.RaisebackleRoll.offsetY, -this.RaisebackleRoll.offsetZ);
			GlStateManager.translate(-this.RaisebackleRoll.rotationPointX * f5, -this.RaisebackleRoll.rotationPointY * f5, -this.RaisebackleRoll.rotationPointZ * f5);
			this.RaisebackleRoll.render(f5);
			GlStateManager.popMatrix();

			
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.02F);
			}	
			this.RaisebackleUp.render(f5);
			
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.27F, -0.31F);
			}	
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Raisebackle_Grip.offsetX, this.Raisebackle_Grip.offsetY, this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(this.Raisebackle_Grip.rotationPointX * f5, this.Raisebackle_Grip.rotationPointY * f5, this.Raisebackle_Grip.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.Raisebackle_Grip.offsetX, -this.Raisebackle_Grip.offsetY, -this.Raisebackle_Grip.offsetZ);
			GlStateManager.translate(-this.Raisebackle_Grip.rotationPointX * f5, -this.Raisebackle_Grip.rotationPointY * f5, -this.Raisebackle_Grip.rotationPointZ * f5);
			this.Raisebackle_Grip.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RaisebackleBurrel.offsetX, this.RaisebackleBurrel.offsetY, this.RaisebackleBurrel.offsetZ);
			GlStateManager.translate(this.RaisebackleBurrel.rotationPointX * f5, this.RaisebackleBurrel.rotationPointY * f5, this.RaisebackleBurrel.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RaisebackleBurrel.offsetX, -this.RaisebackleBurrel.offsetY, -this.RaisebackleBurrel.offsetZ);
			GlStateManager.translate(-this.RaisebackleBurrel.rotationPointX * f5, -this.RaisebackleBurrel.rotationPointY * f5, -this.RaisebackleBurrel.rotationPointZ * f5);
			this.RaisebackleBurrel.render(f5);
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
		setAngle(RaisebackleRoll, this.bipedBody);
		setAngle(RaisebackleUp, this.bipedBody);
		setAngle(Raisebackle_Grip, this.bipedBody);
		setAngle(RaisebackleBurrel, this.bipedBody);

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
