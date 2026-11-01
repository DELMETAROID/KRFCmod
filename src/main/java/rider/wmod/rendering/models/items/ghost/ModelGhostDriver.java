package rider.wmod.rendering.models.items.ghost;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.ghost.ArmorGhostDriver;

/**
 * ModelGhostDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGhostDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer lever;
	public ModelRenderer lever_1;
	public ModelRenderer lever_2;
	public ModelRenderer lever_3;
	public ModelRenderer backle;

	public ModelGhostDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.backle = new ModelRenderer(this, 0, 44);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-2.0F, 8.0F, -3.25F, 4, 3, 1, 0.0F);
		this.lever_3 = new ModelRenderer(this, 5, 49);
		this.lever_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever_3.addBox(-2.75F, 8.5F, -3.0F, 1, 2, 1, 0.0F);
		this.lever_1 = new ModelRenderer(this, 6, 50);
		this.lever_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever_1.addBox(-3.5F, 21.0F, -3.0F, 1, 1, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 0, 28);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.lever = new ModelRenderer(this, 4, 50);
		this.lever.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever.addBox(-3.5F, 16.0F, -3.0F, 1, 1, 1, 0.0F);
		this.lever_2 = new ModelRenderer(this, 10, 44);
		this.lever_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever_2.addBox(-4.5F, 8.0F, -3.0F, 1, 3, 1, 0.0F);
		this.Belt.addChild(this.backle);
		this.Belt.addChild(this.lever_3);
		this.Belt.addChild(this.lever_2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGhostDriver.isInvisible==0) 
		{
			this.Belt.showModel=true;
			this.lever.showModel=true;
			this.lever_1.showModel=true;
			this.lever_2.showModel=true;
			this.lever_3.showModel=true;
			this.backle.showModel=true;
		}

		else {
			this.lever.showModel=false;
			this.lever_1.showModel=false;
			this.Belt.showModel=false;
			this.lever_2.showModel=false;
			this.lever_3.showModel=false;
			this.backle.showModel=false;
		}

		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.lever_1.offsetX, this.lever_1.offsetY, this.lever_1.offsetZ);
			GlStateManager.translate(this.lever_1.rotationPointX * f5, this.lever_1.rotationPointY * f5, this.lever_1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.lever_1.offsetX, -this.lever_1.offsetY, -this.lever_1.offsetZ);
			GlStateManager.translate(-this.lever_1.rotationPointX * f5, -this.lever_1.rotationPointY * f5, -this.lever_1.rotationPointZ * f5);
			this.lever_1.render(f5);
			GlStateManager.popMatrix();
			this.Belt.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.lever.offsetX, this.lever.offsetY, this.lever.offsetZ);
			GlStateManager.translate(this.lever.rotationPointX * f5, this.lever.rotationPointY * f5, this.lever.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.lever.offsetX, -this.lever.offsetY, -this.lever.offsetZ);
			GlStateManager.translate(-this.lever.rotationPointX * f5, -this.lever.rotationPointY * f5, -this.lever.rotationPointZ * f5);
			this.lever.render(f5);
			GlStateManager.popMatrix();

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.lever_1.offsetX, this.lever_1.offsetY, this.lever_1.offsetZ);
			GlStateManager.translate(this.lever_1.rotationPointX * f5, this.lever_1.rotationPointY * f5, this.lever_1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.lever_1.offsetX, -this.lever_1.offsetY, -this.lever_1.offsetZ);
			GlStateManager.translate(-this.lever_1.rotationPointX * f5, -this.lever_1.rotationPointY * f5, -this.lever_1.rotationPointZ * f5);
			this.lever_1.render(f5);
			GlStateManager.popMatrix();
			this.Belt.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.lever.offsetX, this.lever.offsetY, this.lever.offsetZ);
			GlStateManager.translate(this.lever.rotationPointX * f5, this.lever.rotationPointY * f5, this.lever.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.5D, 1.0D);
			GlStateManager.translate(-this.lever.offsetX, -this.lever.offsetY, -this.lever.offsetZ);
			GlStateManager.translate(-this.lever.rotationPointX * f5, -this.lever.rotationPointY * f5, -this.lever.rotationPointZ * f5);
			this.lever.render(f5);
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

		setAngle(lever, this.bipedBody);
		setAngle(lever_1, this.bipedBody);
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

