package rider.wmod.rendering.models.items.zio;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.zio.ArmorQuiz;

/**
 * ModelQuiz - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelQuiz extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head2;
	public ModelRenderer Head3;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;

	public ModelRenderer QuizTopper1;
	public ModelRenderer QuizTopper2;

	public ModelQuiz() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head2 = new ModelRenderer(this, 32, 0);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-1.5F, -10.0F, -4.25F, 3, 2, 1, 0.51F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head3 = new ModelRenderer(this, 32, 2);
		this.Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3.addBox(-0.5F, -7.0F, -4.25F, 1, 1, 1, 0.51F);
		this.Shoulder_L = new ModelRenderer(this, 40, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm.addChild(this.Shoulder_R);

		this.QuizTopper1 = new ModelRenderer(this, 25, 40);
		this.QuizTopper1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.QuizTopper1.addBox(-1.5F, 8.0F, -13.0F, 3, 2, 1, 0.0F);
		this.QuizTopper2 = new ModelRenderer(this, 26, 40);
		this.QuizTopper2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.QuizTopper2.addBox(-0.5F, 10.0F, -13.0F, 1, 1, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (ArmorQuiz.isInvisible==1||ArmorQuiz.drivercheck==0)
		{
			this.Head.showModel=false;
			this.Head2.showModel=false;
			this.Head3.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;
			this.QuizTopper1.showModel=false;
			this.QuizTopper2.showModel=false;
		}
		else
		{
			this.Head.showModel=true;
			this.Head2.showModel=true;
			this.Head3.showModel=true;			
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;
			this.QuizTopper1.showModel=true;
			this.QuizTopper2.showModel=true;
		}


		if (this.isChild) {
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.Head2.render(f5);
			this.RightLeg.render(f5);
			this.Head3.render(f5);
			this.Head.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizTopper1.offsetX, this.QuizTopper1.offsetY, this.QuizTopper1.offsetZ);
			GlStateManager.translate(this.QuizTopper1.rotationPointX * f5, this.QuizTopper1.rotationPointY * f5, this.QuizTopper1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.25D);
			GlStateManager.translate(-this.QuizTopper1.offsetX, -this.QuizTopper1.offsetY, -this.QuizTopper1.offsetZ);
			GlStateManager.translate(-this.QuizTopper1.rotationPointX * f5, -this.QuizTopper1.rotationPointY * f5, -this.QuizTopper1.rotationPointZ * f5);
			this.QuizTopper1.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizTopper2.offsetX, this.QuizTopper2.offsetY, this.QuizTopper2.offsetZ);
			GlStateManager.translate(this.QuizTopper2.rotationPointX * f5, this.QuizTopper2.rotationPointY * f5, this.QuizTopper2.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.25D);
			GlStateManager.translate(-this.QuizTopper2.offsetX, -this.QuizTopper2.offsetY, -this.QuizTopper2.offsetZ);
			GlStateManager.translate(-this.QuizTopper2.rotationPointX * f5, -this.QuizTopper2.rotationPointY * f5, -this.QuizTopper2.rotationPointZ * f5);
			this.QuizTopper2.render(f5);
			GlStateManager.popMatrix();


		}else {
			if (entity.isSneaking()) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.Head2.render(f5);
			this.RightLeg.render(f5);
			this.Head3.render(f5);
			this.Head.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, -0.1F, 0.2F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizTopper2.offsetX, this.QuizTopper2.offsetY, this.QuizTopper2.offsetZ);
			GlStateManager.translate(this.QuizTopper2.rotationPointX * f5, this.QuizTopper2.rotationPointY * f5, this.QuizTopper2.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.25D);
			GlStateManager.translate(-this.QuizTopper2.offsetX, -this.QuizTopper2.offsetY, -this.QuizTopper2.offsetZ);
			GlStateManager.translate(-this.QuizTopper2.rotationPointX * f5, -this.QuizTopper2.rotationPointY * f5, -this.QuizTopper2.rotationPointZ * f5);
			this.QuizTopper2.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.QuizTopper1.offsetX, this.QuizTopper1.offsetY, this.QuizTopper1.offsetZ);
			GlStateManager.translate(this.QuizTopper1.rotationPointX * f5, this.QuizTopper1.rotationPointY * f5, this.QuizTopper1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.25D);
			GlStateManager.translate(-this.QuizTopper1.offsetX, -this.QuizTopper1.offsetY, -this.QuizTopper1.offsetZ);
			GlStateManager.translate(-this.QuizTopper1.rotationPointX * f5, -this.QuizTopper1.rotationPointY * f5, -this.QuizTopper1.rotationPointZ * f5);
			this.QuizTopper1.render(f5);
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
		if (entity instanceof EntityArmorStand)
		{
			EntityArmorStand entityarmorstand = (EntityArmorStand)entity;
			this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
			this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
			this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
			this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
			this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
			this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
			this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
			this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
			this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
			this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
			this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
			this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
			this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
			this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
			this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
			this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
			this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
			this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
			this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
			this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
			this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
			copyModelAngles(this.bipedHead, this.bipedHeadwear);
		}else {
			setAngle(Head, this.bipedHead);
			setAngle(Head2, this.bipedHead);
			setAngle(Head3, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(QuizTopper1, this.bipedBody);
			setAngle(QuizTopper2, this.bipedBody);
		}

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
