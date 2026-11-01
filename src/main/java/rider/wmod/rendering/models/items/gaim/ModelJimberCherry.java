package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.gaim.ls.ArmorJimberCherry;

/**
 * ModelJimberCherry - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelJimberCherry extends ModelBiped {

	public ModelRenderer ArmsBody;
	public ModelRenderer ELS_up;
	public ModelRenderer ELS_up2;
	public ModelRenderer ArmsBodyL1;
	public ModelRenderer ArmsBodyR1;
	public ModelRenderer ArmsBodyR4;
	public ModelRenderer ArmsBodyFrame;
	public ModelRenderer ArmsBodyBack;
	public ModelRenderer ArmsBody2;
	public ModelRenderer ArmsBodyL4;
	public ModelRenderer ArmsBodyR3;
	public ModelRenderer ArmsBodyL2;
	public ModelRenderer ArmsBodyR2;
	public ModelRenderer ArmsBackL1;
	public ModelRenderer ArmsBackR1;
	public ModelRenderer ArmsBackL2;
	public ModelRenderer ArmsBackR2;
	public ModelRenderer ArmsBodyL3;
	public ModelRenderer ArmsHingeL;
	public ModelRenderer ArmsHingeR;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R3;


	public ModelJimberCherry() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shoulder_L2 = new ModelRenderer(this, 0, 36);
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(-8.5F, -0.25F, -2.5F, 4, 1, 5, 0.0F);
		this.setRotateAngle(Shoulder_L2, 0.0F, 0.0F, 0.08726646259971647F);
		this.ArmsBodyL4 = new ModelRenderer(this, 57, 14);
		this.ArmsBodyL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL4.addBox(-5.0F, 8.0F, -2.75F, 2, 3, 1, 0.0F);
		this.ArmsBodyR1 = new ModelRenderer(this, 56, 8);
		this.ArmsBodyR1.mirror = true;
		this.ArmsBodyR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR1.addBox(2.25F, 0.0F, -3.1F, 3, 5, 1, 0.0F);
		this.ArmsBodyFrame = new ModelRenderer(this, 31, 44);
		this.ArmsBodyFrame.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyFrame.addBox(-6.5F, -0.5F, -1.5F, 13, 1, 3, 0.0F);
		this.ArmsBackL2 = new ModelRenderer(this, 52, 16);
		this.ArmsBackL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBackL2.addBox(-4.0F, 5.0F, 2.0F, 1, 1, 1, 0.0F);
		this.ArmsBody = new ModelRenderer(this, 40, 32);
		this.ArmsBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBody.addBox(-3.5F, 0.0F, -2.7F, 7, 7, 1, 0.0F);
		this.ELS_up2 = new ModelRenderer(this, 40, 41);
		this.ELS_up2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ELS_up2.addBox(1.5F, 8.95F, -3.6F, 1, 1, 1, 0.0F);

		this.Shoulder_R = new ModelRenderer(this, 0, 32);
		this.Shoulder_R.mirror = true;
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(5.5F, -1.25F, -2.0F, 4, 1, 4, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, -0.08726646259971647F);
		this.Shoulder_R3 = new ModelRenderer(this, 49, 52);
		this.Shoulder_R3.mirror = true;
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(7.25F, 0.5F, -3.0F, 1, 6, 6, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F, -0.08726646259971647F);
		this.ArmsBackL1 = new ModelRenderer(this, 56, 1);
		this.ArmsBackL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBackL1.addBox(-5.0F, 0.0F, 2.0F, 2, 5, 1, 0.0F);
		this.ArmsBody2 = new ModelRenderer(this, 48, 57);
		this.ArmsBody2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBody2.addBox(-3.0F, 1.0F, -3.2F, 6, 6, 1, 0.0F);
		this.ArmsBackR2 = new ModelRenderer(this, 52, 16);
		this.ArmsBackR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBackR2.addBox(3.0F, 5.0F, 2.0F, 1, 1, 1, 0.0F);
		this.ArmsBodyL3 = new ModelRenderer(this, 52, 18);
		this.ArmsBodyL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL3.addBox(-4.25F, 7.0F, -2.75F, 2, 1, 1, 0.0F);
		this.ArmsBackR1 = new ModelRenderer(this, 56, 8);
		this.ArmsBackR1.mirror = true;
		this.ArmsBackR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBackR1.addBox(3.0F, 0.0F, 2.0F, 2, 5, 1, 0.0F);
		this.ArmsBodyL1 = new ModelRenderer(this, 56, 1);
		this.ArmsBodyL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL1.addBox(-5.25F, 0.0F, -3.1F, 3, 5, 1, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 36);
		this.Shoulder_R2.mirror = true;
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(4.5F, -0.25F, -2.5F, 4, 1, 5, 0.0F);
		this.setRotateAngle(Shoulder_R2, 0.0F, 0.0F, -0.08726646259971647F);

		this.ArmsHingeR = new ModelRenderer(this, 33, 45);
		this.ArmsHingeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHingeR.addBox(5.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F);

		this.ArmsBodyR4 = new ModelRenderer(this, 57, 14);
		this.ArmsBodyR4.mirror = true;
		this.ArmsBodyR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR4.addBox(3.0F, 8.0F, -2.75F, 2, 3, 1, 0.0F);

		this.ArmsBodyBack = new ModelRenderer(this, 48, 57);
		this.ArmsBodyBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyBack.addBox(-3.0F, 1.0F, 2.0F, 6, 6, 1, 0.0F);
		this.ArmsBodyR2 = new ModelRenderer(this, 52, 16);
		this.ArmsBodyR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR2.addBox(3.0F, 5.0F, -3.0F, 1, 1, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 32);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-9.5F, -1.25F, -2.0F, 4, 1, 4, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, 0.08726646259971647F);
		this.ELS_up = new ModelRenderer(this, 38, 41);
		this.ELS_up.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ELS_up.addBox(1.5F, 8.95F, -3.2F, 1, 1, 1, 0.2F);
		this.ArmsBodyR3 = new ModelRenderer(this, 52, 18);
		this.ArmsBodyR3.mirror = true;
		this.ArmsBodyR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyR3.addBox(2.25F, 7.0F, -2.75F, 2, 1, 1, 0.0F);
		this.ArmsBodyL2 = new ModelRenderer(this, 52, 16);
		this.ArmsBodyL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsBodyL2.addBox(-4.0F, 5.0F, -3.0F, 1, 1, 1, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 49, 52);
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(-8.25F, 0.5F, -3.0F, 1, 6, 6, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, 0.08726646259971647F);
		this.ArmsHingeL = new ModelRenderer(this, 33, 45);
		this.ArmsHingeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmsHingeL.addBox(-7.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F);

		this.ArmsHingeL.addChild(this.Shoulder_L2);
		this.ArmsBody.addChild(this.ArmsBodyL4);
		this.ArmsBody.addChild(this.ArmsBodyR1);
		this.ArmsBody.addChild(this.ArmsBodyFrame);
		this.ArmsBody.addChild(this.ArmsBackL2);
		this.ELS_up.addChild(this.ELS_up2);

		this.ArmsHingeR.addChild(this.Shoulder_R);

		this.ArmsHingeR.addChild(this.Shoulder_R3);
		this.ArmsBody.addChild(this.ArmsBackL1);
		this.ArmsBody.addChild(this.ArmsBody2);
		this.ArmsBody.addChild(this.ArmsBackR2);
		this.ArmsBody.addChild(this.ArmsBodyL3);
		this.ArmsBody.addChild(this.ArmsBackR1);
		this.ArmsBody.addChild(this.ArmsBodyL1);
		this.ArmsHingeR.addChild(this.Shoulder_R2);
		this.ArmsBody.addChild(this.ArmsHingeR);
		this.ArmsBody.addChild(this.ArmsBodyR4);
		this.ArmsBody.addChild(this.ArmsBodyBack);
		this.ArmsBody.addChild(this.ArmsBodyR2);
		this.ArmsHingeL.addChild(this.Shoulder_L);
		this.ArmsBody.addChild(this.ArmsBodyR3);
		this.ArmsBody.addChild(this.ArmsBodyL2);
		this.ArmsHingeL.addChild(this.Shoulder_L3);
		this.ArmsBody.addChild(this.ArmsHingeL);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorJimberCherry.DriverCheck==1)
		{
			this.ArmsBody.showModel=true;
			this.ELS_up.showModel=true;
		}else {
			this.ArmsBody.showModel=false;
			this.ELS_up.showModel=false;
		}

		if (this.isChild) {
			this.ArmsBody.render(f5);
			this.ELS_up.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.ArmsBody.render(f5);

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}
			this.ELS_up.render(f5);
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
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

		setAngle(ArmsBody, this.bipedBody);
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
