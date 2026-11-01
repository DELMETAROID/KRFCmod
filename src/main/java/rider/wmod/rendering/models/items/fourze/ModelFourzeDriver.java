package rider.wmod.rendering.models.items.fourze;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.fourze.ArmorFourzeDriver;

/**
 * ModelFourzeDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelFourzeDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer switchsample1;
	public ModelRenderer switchsample2;
	public ModelRenderer switchsample3;
	public ModelRenderer switchsample4;
	public ModelRenderer backle;
	public ModelRenderer backle2;
	public ModelRenderer Lever1;
	public ModelRenderer Lever2;
	public ModelRenderer socket1;
	public ModelRenderer socket2;
	public ModelRenderer socket3;
	public ModelRenderer socket4;
	public ModelRenderer center;
	public ModelRenderer center2;

	public ModelFourzeDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Belt = new ModelRenderer(this, 16, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.switchsample4 = new ModelRenderer(this, 22, 46);
		this.switchsample4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.switchsample4.addBox(1.0F, 8.5F, -4.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(switchsample4, 0.0F, -0.2617993877991494F, 0.0F);
		this.socket1 = new ModelRenderer(this, 30, 37);
		this.socket1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.socket1.addBox(-2.0F, 9.0F, -4.75F, 1, 1, 2, 0.0F);
		this.setRotateAngle(socket1, 0.0F, 0.2617993877991494F, 0.0F);
		this.socket3 = new ModelRenderer(this, 30, 37);
		this.socket3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.socket3.addBox(0.5F, 9.0F, -4.5F, 1, 2, 2, 0.0F);
		this.setRotateAngle(socket3, 0.0F, -0.08726646259971647F, 0.0F);
		this.Lever1 = new ModelRenderer(this, 26, 44);
		this.Lever1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Lever1.addBox(-3.7F, 10.0F, -4.05F, 2, 1, 1, 0.0F);
		this.socket4 = new ModelRenderer(this, 30, 37);
		this.socket4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.socket4.addBox(1.0F, 9.0F, -4.75F, 1, 1, 2, 0.0F);
		this.setRotateAngle(socket4, 0.0F, -0.2617993877991494F, 0.0F);
		this.backle2 = new ModelRenderer(this, 18, 37);
		this.backle2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle2.addBox(-3.0F, 9.25F, -3.75F, 6, 2, 1, 0.0F);
		this.Lever2 = new ModelRenderer(this, 26, 40);
		this.Lever2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Lever2.addBox(-4.7F, 8.0F, -3.75F, 1, 3, 1, 0.0F);
		this.switchsample3 = new ModelRenderer(this, 18, 46);
		this.switchsample3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.switchsample3.addBox(0.5F, 8.5F, -4.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(switchsample3, 0.0F, -0.08726646259971647F, 0.0F);
		this.backle = new ModelRenderer(this, 18, 37);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-3.0F, 8.5F, -3.1F, 6, 2, 1, 0.0F);
		this.switchsample1 = new ModelRenderer(this, 18, 44);
		this.switchsample1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.switchsample1.addBox(-2.0F, 8.5F, -4.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(switchsample1, 0.0F, 0.2617993877991494F, 0.0F);
		this.socket2 = new ModelRenderer(this, 30, 37);
		this.socket2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.socket2.addBox(-1.5F, 9.0F, -4.5F, 1, 2, 2, 0.0F);
		this.setRotateAngle(socket2, 0.0F, 0.08726646259971647F, 0.0F);
		this.center = new ModelRenderer(this, 18, 40);
		this.center.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.center.addBox(-1.0F, 8.0F, 4.25F, 2, 2, 1, 0.0F);
		this.setRotateAngle(center, -0.8726646259971648F, 0.0F, 0.0F);
		this.center2 = new ModelRenderer(this, 24, 37);
		this.center2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.center2.addBox(-0.5F, 10.0F, -4.5F, 1, 1, 1, 0.0F);
		this.switchsample2 = new ModelRenderer(this, 22, 44);
		this.switchsample2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.switchsample2.addBox(-1.5F, 8.5F, -4.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(switchsample2, 0.0F, 0.08726646259971647F, 0.0F);
		this.Belt.addChild(this.socket1);
		this.Belt.addChild(this.socket3);
		this.Belt.addChild(this.Lever1);
		this.Belt.addChild(this.socket4);
		this.Belt.addChild(this.backle2);
		this.Belt.addChild(this.Lever2);
		this.Belt.addChild(this.backle);
		this.Belt.addChild(this.socket2);
		this.Belt.addChild(this.center);
		this.Belt.addChild(this.center2);
		this.Belt.addChild(this.switchsample1);
		this.Belt.addChild(this.switchsample2);
		this.Belt.addChild(this.switchsample3);
		this.Belt.addChild(this.switchsample4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorFourzeDriver.isInvisible==0) 
		{
			this.Belt.showModel=true;
		}else {
			this.Belt.showModel=false;
		}

		if (this.isChild) {
			this.Belt.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, -0.0F);
			}
			this.Belt.render(f5); 
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
