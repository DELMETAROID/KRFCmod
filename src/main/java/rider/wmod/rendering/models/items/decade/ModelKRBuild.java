package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRBuild;

/**
 * ModelKRBuild - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKRBuild extends ModelBiped {
	public ModelRenderer Head;
	public ModelRenderer Body;

	public ModelRenderer RightArm;
	public ModelRenderer Shoulder_R;
	public ModelRenderer LeftLeg;
	public ModelRenderer LeftArm;
	public ModelRenderer Shoulder_L;
	public ModelRenderer RightLeg;

	public ModelRenderer RabbitShape1;
	public ModelRenderer RabbitShape2;
	public ModelRenderer RabbitEye1;
	public ModelRenderer RabbitEye2;
	public ModelRenderer RabbitEye3;
	public ModelRenderer RabbitEye4;
	public ModelRenderer RabbitEye5;
	public ModelRenderer RabbitEye6;
	public ModelRenderer RabbitEye7;
	public ModelRenderer RabbitEye8;
	public ModelRenderer RabbitEye9;

	public ModelRenderer TankShape;
	public ModelRenderer TankEye1;
	public ModelRenderer TankEye3;
	public ModelRenderer TankEye4;
	public ModelRenderer TankEye5;
	public ModelRenderer TankEye6;
	public ModelRenderer TankEye7;
	public ModelRenderer TankEye2;
	public ModelRenderer TankEye8;
	public ModelRenderer TankEye9;

	public ModelKRBuild() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.TankEye4 = new ModelRenderer(this, 39, 40);
		this.TankEye4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye4.addBox(-3.5F, -6.6F, -4.8F, 1, 1, 1, 0.0F);
		this.TankShape = new ModelRenderer(this, 58, 10);
		this.TankShape.setRotationPoint(2.6F, 2.0F, 0.0F);
		this.TankShape.addBox(0.0F, -5.5F, -2.7F, 1, 7, 1, 0.26F);
		this.setRotateAngle(TankShape, 0.0F, 0.0F, 0.8726646259971648F);
		this.TankEye3 = new ModelRenderer(this, 40, 40);
		this.TankEye3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye3.addBox(-2.5F, -5.5F, -4.8F, 1, 1, 1, 0.0F);
		this.TankEye5 = new ModelRenderer(this, 39, 40);
		this.TankEye5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye5.addBox(-4.0F, -7.0F, -4.8F, 1, 1, 1, 0.0F);
		this.TankEye1 = new ModelRenderer(this, 39, 39);
		this.TankEye1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye1.addBox(-4.0F, -5.0F, -4.8F, 3, 3, 1, 0.0F);
		this.TankEye7 = new ModelRenderer(this, 40, 40);
		this.TankEye7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye7.addBox(-5.0F, -8.0F, -4.8F, 1, 1, 1, 0.0F);
		this.TankEye9 = new ModelRenderer(this, 40, 40);
		this.TankEye9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye9.addBox(-1.5F, -4.5F, -4.8F, 1, 2, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 19, 33);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.6F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.TankEye6 = new ModelRenderer(this, 40, 40);
		this.TankEye6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye6.addBox(-4.5F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.TankEye2 = new ModelRenderer(this, 40, 40);
		this.TankEye2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye2.addBox(-3.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.TankEye8 = new ModelRenderer(this, 40, 39);
		this.TankEye8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TankEye8.addBox(-3.5F, -2.5F, -4.8F, 2, 1, 1, 0.0F);

		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);

		this.RabbitEye3 = new ModelRenderer(this, 43, 35);
		this.RabbitEye3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye3.addBox(2.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.RabbitShape1 = new ModelRenderer(this, 53, 10);
		this.RabbitShape1.setRotationPoint(2.7F, 0.3F, 0.0F);
		this.RabbitShape1.addBox(0.0F, 0.0F, -2.7F, 2, 4, 1, 0.26F);
		this.setRotateAngle(RabbitShape1, 0.0F, 0.0F, 0.8726646259971648F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RabbitEye7 = new ModelRenderer(this, 43, 35);
		this.RabbitEye7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye7.addBox(2.5F, -6.5F, -4.8F, 1, 1, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RabbitEye2 = new ModelRenderer(this, 39, 35);
		this.RabbitEye2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye2.addBox(1.5F, -5.5F, -4.8F, 2, 1, 1, 0.0F);
		this.RabbitShape2 = new ModelRenderer(this, 54, 10);
		this.RabbitShape2.setRotationPoint(1.0F, -0.5F, 0.0F);
		this.RabbitShape2.addBox(0.0F, -3.5F, -2.7F, 1, 4, 1, 0.0F);
		this.setRotateAngle(RabbitShape2, 0.006283185307179587F, 0.0F, 0.0F);
		this.RabbitEye1 = new ModelRenderer(this, 52, 35);
		this.RabbitEye1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye1.addBox(1.0F, -5.0F, -4.8F, 3, 3, 1, 0.0F);
		this.RabbitEye6 = new ModelRenderer(this, 43, 35);
		this.RabbitEye6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye6.addBox(3.5F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.4F, -2.3F, -2.5F, 4, 3, 5, 0.0F);
		this.RabbitEye8 = new ModelRenderer(this, 43, 35);
		this.RabbitEye8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye8.addBox(4.0F, -8.0F, -4.8F, 1, 1, 1, 0.0F);
		this.RabbitEye5 = new ModelRenderer(this, 40, 35);
		this.RabbitEye5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye5.addBox(1.5F, -2.5F, -4.8F, 2, 1, 1, 0.0F);
		this.RabbitEye9 = new ModelRenderer(this, 48, 35);
		this.RabbitEye9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye9.addBox(0.5F, -4.5F, -4.8F, 1, 2, 1, 0.0F);
		this.RabbitEye4 = new ModelRenderer(this, 43, 35);
		this.RabbitEye4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RabbitEye4.addBox(3.0F, -7.0F, -4.8F, 1, 1, 1, 0.0F);

		this.RabbitEye1.addChild(this.RabbitEye3);
		this.RabbitEye1.addChild(this.RabbitEye7);
		this.RabbitEye1.addChild(this.RabbitEye2);
		this.RabbitShape1.addChild(this.RabbitShape2);
		this.Head.addChild(this.RabbitEye1);
		this.RabbitEye1.addChild(this.RabbitEye6);
		this.RightArm.addChild(this.Shoulder_R);
		this.RabbitEye1.addChild(this.RabbitEye8);
		this.RabbitEye1.addChild(this.RabbitEye5);
		this.RabbitEye1.addChild(this.RabbitEye9);
		this.RabbitEye1.addChild(this.RabbitEye4);
		this.TankEye1.addChild(this.TankEye4);
		this.TankEye1.addChild(this.TankEye3);
		this.TankEye1.addChild(this.TankEye5);
		this.Head.addChild(this.TankEye1);
		this.TankEye1.addChild(this.TankEye7);
		this.TankEye1.addChild(this.TankEye9);
		this.LeftArm.addChild(this.Shoulder_L);
		this.TankEye1.addChild(this.TankEye6);
		this.TankEye1.addChild(this.TankEye2);
		this.TankEye1.addChild(this.TankEye8);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorKRBuild.DriverCheck==0||ArmorKRBuild.isInvisible==1)
		{
			this.Head.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Body.showModel=false;
			this.RabbitShape1.showModel=false;
			this.TankShape.showModel=false;
			this.LeftArm.showModel=false;
			this.RightLeg.showModel=false;

		}else {
			this.Head.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Body.showModel=true;
			this.RabbitShape1.showModel=true;
			this.TankShape.showModel=true;
			this.LeftArm.showModel=true;
			this.RightLeg.showModel=true;
		}


		if (this.isChild) {
			this.Head.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.Body.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RabbitShape1.offsetX, this.RabbitShape1.offsetY, this.RabbitShape1.offsetZ);
			GlStateManager.translate(this.RabbitShape1.rotationPointX * f5, this.RabbitShape1.rotationPointY * f5, this.RabbitShape1.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RabbitShape1.offsetX, -this.RabbitShape1.offsetY, -this.RabbitShape1.offsetZ);
			GlStateManager.translate(-this.RabbitShape1.rotationPointX * f5, -this.RabbitShape1.rotationPointY * f5, -this.RabbitShape1.rotationPointZ * f5);
			this.RabbitShape1.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.TankShape.offsetX, this.TankShape.offsetY, this.TankShape.offsetZ);
			GlStateManager.translate(this.TankShape.rotationPointX * f5, this.TankShape.rotationPointY * f5, this.TankShape.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.TankShape.offsetX, -this.TankShape.offsetY, -this.TankShape.offsetZ);
			GlStateManager.translate(-this.TankShape.rotationPointX * f5, -this.TankShape.rotationPointY * f5, -this.TankShape.rotationPointZ * f5);
			this.TankShape.render(f5);
			GlStateManager.popMatrix();

			this.LeftArm.render(f5);
			this.RightLeg.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);

			}

			this.Head.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RabbitShape1.offsetX, this.RabbitShape1.offsetY, this.RabbitShape1.offsetZ);
			GlStateManager.translate(this.RabbitShape1.rotationPointX * f5, this.RabbitShape1.rotationPointY * f5, this.RabbitShape1.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RabbitShape1.offsetX, -this.RabbitShape1.offsetY, -this.RabbitShape1.offsetZ);
			GlStateManager.translate(-this.RabbitShape1.rotationPointX * f5, -this.RabbitShape1.rotationPointY * f5, -this.RabbitShape1.rotationPointZ * f5);
			this.RabbitShape1.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.TankShape.offsetX, this.TankShape.offsetY, this.TankShape.offsetZ);
			GlStateManager.translate(this.TankShape.rotationPointX * f5, this.TankShape.rotationPointY * f5, this.TankShape.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.TankShape.offsetX, -this.TankShape.offsetY, -this.TankShape.offsetZ);
			GlStateManager.translate(-this.TankShape.rotationPointX * f5, -this.TankShape.rotationPointY * f5, -this.TankShape.rotationPointZ * f5);
			this.TankShape.render(f5);
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
			setAngle(Body, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
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