package rider.wmod.rendering.models.items.wizard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.wizard.ArmorWizarDriver;

/**
 * ModelWizardriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelWizarDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer backle;
	public ModelRenderer backleR;
	public ModelRenderer backleL;
	public ModelRenderer backleR2;
	public ModelRenderer backleL2;
	public ModelRenderer backleReverse;
	public ModelRenderer backleR2Reverse;
	public ModelRenderer backleL2Reverse;

	public ModelWizarDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.backleL = new ModelRenderer(this, 31, 36);
		this.backleL.mirror = true;
		this.backleL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleL.addBox(-2.5F, 8.5F, -3.0F, 1, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.backleReverse = new ModelRenderer(this, 21, 36);
		this.backleReverse.mirror = true;
		this.backleReverse.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleReverse.addBox(-1.5F, 8.0F, -3.0F, 3, 3, 1, 0.0F);
		this.backleR2 = new ModelRenderer(this, 32, 36);
		this.backleR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleR2.addBox(2.5F, 8.5F, -2.7F, 1, 1, 1, 0.0F);
		this.backleL2Reverse = new ModelRenderer(this, 32, 36);
		this.backleL2Reverse.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleL2Reverse.addBox(-3.5F, 8.5F, -2.7F, 1, 1, 1, 0.0F);
		this.backleR = new ModelRenderer(this, 31, 36);
		this.backleR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleR.addBox(1.5F, 8.5F, -3.0F, 1, 2, 1, 0.0F);
		this.backleR2Reverse = new ModelRenderer(this, 32, 36);
		this.backleR2Reverse.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleR2Reverse.addBox(2.5F, 9.5F, -2.7F, 1, 1, 1, 0.0F);
		this.backleL2 = new ModelRenderer(this, 32, 36);
		this.backleL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleL2.addBox(-3.5F, 9.5F, -2.7F, 1, 1, 1, 0.0F);
		this.backle = new ModelRenderer(this, 21, 36);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-1.5F, 8.0F, -3.0F, 3, 3, 1, 0.0F);
		this.Belt.addChild(this.backleL);
		this.Belt.addChild(this.backleReverse);
		this.Belt.addChild(this.backleR2);
		this.Belt.addChild(this.backleL2Reverse);
		this.Belt.addChild(this.backleR);
		this.Belt.addChild(this.backleR2Reverse);
		this.Belt.addChild(this.backleL2);
		this.Belt.addChild(this.backle);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorWizarDriver.isInvisible==0)
		{
			this.Belt.showModel=true;
			this.backleR.showModel=true;
			this.backleL.showModel=true;

			if(ArmorWizarDriver.DriverSide==0) {
				this.backle.showModel=true;			
				this.backleR2.showModel=true;
				this.backleL2.showModel=true;
				this.backleReverse.showModel=false;
				this.backleR2Reverse.showModel=false;
				this.backleL2Reverse.showModel=false;
			}else{
				this.backleReverse.showModel=true;
				this.backleR2Reverse.showModel=true;
				this.backleL2Reverse.showModel=true;
				this.backle.showModel=false;
				this.backleR2.showModel=false;
				this.backleL2.showModel=false;
			}
		}
		else
		{
			this.Belt.showModel=false;
			this.backleR.showModel=false;
			this.backleL.showModel=false;
			this.backle.showModel=false;
			this.backleR2.showModel=false;
			this.backleL2.showModel=false;
			this.backleReverse.showModel=false;
			this.backleR2Reverse.showModel=false;
			this.backleL2Reverse.showModel=false;
		}

		if (this.isChild) {

			this.Belt.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
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
