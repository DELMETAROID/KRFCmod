package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.exaid.ArmorExaidActionProtoLv1;

/**
 * ModelExaidActionProtoLv1 - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelExaidActionProtoLv1 extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer driver;
	public ModelRenderer Body;
	public ModelRenderer gashat;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer bootsR;
	public ModelRenderer bootsR2;
	public ModelRenderer hair1;
	public ModelRenderer hair2;
	public ModelRenderer hair3;
	public ModelRenderer hair4;
	public ModelRenderer hair5;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer bootsL;
	public ModelRenderer bootsL2;
	public ModelRenderer centor;
	public ModelRenderer beltL;
	public ModelRenderer LeverClosed;
	public ModelRenderer shapeL;
	public ModelRenderer beltR;
	public ModelRenderer shapeR;
	public ModelRenderer lever2;
	public ModelRenderer lever1;
	public ModelRenderer lever3;

	public ModelExaidActionProtoLv1() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shoulder_R = new ModelRenderer(this, 2, 38);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-6.0F, -1.5F, -2.6F, 5, 3, 1, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.17453292519943295F);
		this.Head = new ModelRenderer(this, 1, 3);
		this.Head.setRotationPoint(0.0F, 5.2F, 0.0F);
		this.Head.addBox(-4.0F, -9.0F, -4.5F, 8, 6, 7, 0.5F);
		this.hair5 = new ModelRenderer(this, 36, 0);
		this.hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair5.addBox(-3.6F, -13.0F, -5.4F, 4, 1, 5, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.5F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 2, 33);
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(1.5F, -2.5F, -2.8F, 4, 1, 1, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.17453292519943295F);
		this.hair3 = new ModelRenderer(this, 36, 2);
		this.hair3.setRotationPoint(0.0F, 0.0F, -0.0F);
		this.hair3.addBox(-4.6F, -11.0F, -5.4F, 8, 1, 5, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 2, 33);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-5.5F, -2.5F, -2.6F, 4, 1, 1, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F, 0.17453292519943295F);
		this.lever3 = new ModelRenderer(this, 10, 59);
		this.lever3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever3.addBox(-2.5F, 10.45F, 6.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(lever3, 0.010297442586766544F, 0.0F, 0.0F);
		this.bootsR = new ModelRenderer(this, 49, 60);
		this.bootsR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootsR.addBox(-2.5F, 9.0F, -3.0F, 4, 3, 1, 0.0F);
		this.hair4 = new ModelRenderer(this, 36, 1);
		this.hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair4.addBox(-4.1F, -12.0F, -5.4F, 4, 1, 5, 0.0F);
		this.LeverClosed = new ModelRenderer(this, 7, 53);
		this.LeverClosed.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeverClosed.addBox(-1.5F, 8.0F, 6.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(LeverClosed, 0.0F, 3.141592653589793F, 0.0F);
		this.shapeL = new ModelRenderer(this, 2, 58);
		this.shapeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shapeL.addBox(1.0F, 9.2F, -5.8F, 1, 1, 1, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 16, 39);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-5.5F, 1.5F, -2.6F, 4, 2, 1, 0.0F);
		this.setRotateAngle(Shoulder_R2, 0.0F, 0.0F, 0.17453292519943295F);
		this.beltL = new ModelRenderer(this, 0, 58);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(3.0F, 8.5F, -4.6F, 1, 2, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.5F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.hair1 = new ModelRenderer(this, 36, 4);
		this.hair1.setRotationPoint(0.0F, 0.0F, -0.0F);
		this.hair1.addBox(-4.6F, -9.0F, -5.4F, 9, 1, 5, 0.0F);
		this.lever1 = new ModelRenderer(this, 10, 57);
		this.lever1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever1.addBox(-2.5F, 7.75F, 6.0F, 1, 1, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-4.5F, -1.75F, -2.0F, 4, 12, 4, 0.4F);
		this.shapeR = new ModelRenderer(this, 2, 58);
		this.shapeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shapeR.addBox(3.0F, 8.8F, -5.8F, 1, 1, 1, 0.0F);
		this.lever2 = new ModelRenderer(this, 11, 57);
		this.lever2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever2.addBox(-3.5F, 8.0F, 6.0F, 1, 3, 1, 0.0F);
		this.centor = new ModelRenderer(this, 1, 60);
		this.centor.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.centor.addBox(0.9F, 7.9F, -6.2F, 2, 1, 2, 0.0F);
		this.Shoulder_L2 = new ModelRenderer(this, 16, 39);
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(1.5F, 1.5F, -2.8F, 4, 2, 1, 0.0F);
		this.setRotateAngle(Shoulder_L2, 0.0F, 0.0F, -0.17453292519943295F);
		this.gashat = new ModelRenderer(this, 0, 54);
		this.gashat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.gashat.addBox(3.0F, 6.5F, -5.9F, 1, 2, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, -0.9F, -2.0F, 8, 12, 4, 1.5F);
		this.bootsR2 = new ModelRenderer(this, 49, 57);
		this.bootsR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootsR2.addBox(-2.5F, 10.0F, -4.0F, 4, 2, 1, 0.0F);
		this.beltR = new ModelRenderer(this, 0, 58);
		this.beltR.mirror = true;
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-2.0F, 8.5F, -4.6F, 1, 2, 1, 0.0F);
		this.hair2 = new ModelRenderer(this, 36, 3);
		this.hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair2.addBox(-4.85F, -10.0F, -5.4F, 10, 1, 5, 0.0F);
		this.bootsL = new ModelRenderer(this, 49, 60);
		this.bootsL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootsL.addBox(-1.7F, 9.0F, -3.0F, 4, 3, 1, 0.0F);
		this.bootsL2 = new ModelRenderer(this, 49, 57);
		this.bootsL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootsL2.addBox(-1.7F, 10.0F, -4.0F, 4, 2, 1, 0.0F);
		this.driver = new ModelRenderer(this, 0, 47);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 8.0F, -6.0F, 4, 3, 2, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 2, 38);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(1.0F, -1.5F, -2.8F, 5, 3, 1, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.17453292519943295F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(0.5F, -1.75F, -2.0F, 4, 12, 4, 0.4F);
		this.RightArm.addChild(this.Shoulder_R);
		this.Head.addChild(this.hair5);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.Head.addChild(this.hair3);
		this.RightArm.addChild(this.Shoulder_R3);
		this.LeverClosed.addChild(this.lever3);
		this.RightLeg.addChild(this.bootsR);
		this.Head.addChild(this.hair4);
		this.driver.addChild(this.LeverClosed);
		this.driver.addChild(this.shapeL);
		this.RightArm.addChild(this.Shoulder_R2);
		this.driver.addChild(this.beltL);
		this.Head.addChild(this.hair1);
		this.LeverClosed.addChild(this.lever1);
		this.driver.addChild(this.shapeR);
		this.LeverClosed.addChild(this.lever2);
		this.driver.addChild(this.centor);
		this.LeftArm.addChild(this.Shoulder_L2);
		this.RightLeg.addChild(this.bootsR2);
		this.driver.addChild(this.beltR);
		this.Head.addChild(this.hair2);
		this.LeftLeg.addChild(this.bootsL);
		this.LeftLeg.addChild(this.bootsL2);
		this.LeftArm.addChild(this.Shoulder_L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorExaidActionProtoLv1.isInvisible==0 && ArmorExaidActionProtoLv1.GashatCheckActionlv1==1 && ArmorExaidActionProtoLv1.DriverCheckActionlv1==1)
		{
			this.RightArm.showModel=true;
			this.RightLeg.showModel=true;
			this.Head.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.driver.showModel=true;
			this.Body.showModel=true;
			this.gashat.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_R2.showModel=true;
			this.Shoulder_R3.showModel=true;
			this.bootsR.showModel=true;
			this.bootsR2.showModel=true;
			this.hair1.showModel=true;
			this.hair2.showModel=true;
			this.hair3.showModel=true;
			this.hair4.showModel=true;
			this.hair5.showModel=true;
			this.Shoulder_L.showModel=true;
			this.Shoulder_L2.showModel=true;
			this.Shoulder_L3.showModel=true;
			this.bootsL.showModel=true;
			this.bootsL2.showModel=true;
			this.centor.showModel=true;
			this.beltL.showModel=true;
			this.LeverClosed.showModel=true;
			this.shapeL.showModel=true;
			this.beltR.showModel=true;
			this.lever2.showModel=true;
			this.lever1.showModel=true;
			this.lever3.showModel=true;
		}else {
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.Head.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.driver.showModel=false;
			this.Body.showModel=false;
			this.gashat.showModel=false;
			this.Shoulder_L.showModel=false;
			this.Shoulder_L2.showModel=false;
			this.Shoulder_L3.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_R2.showModel=false;
			this.Shoulder_R3.showModel=false;
			this.bootsR.showModel=false;
			this.bootsR2.showModel=false;
			this.hair1.showModel=false;
			this.hair2.showModel=false;
			this.hair3.showModel=false;
			this.hair4.showModel=false;
			this.hair5.showModel=false;
			this.bootsL.showModel=false;
			this.bootsL2.showModel=false;
			this.centor.showModel=false;
			this.beltL.showModel=false;
			this.LeverClosed.showModel=false;
			this.shapeL.showModel=false;
			this.beltR.showModel=false;
			this.lever2.showModel=false;
			this.lever1.showModel=false;
			this.lever3.showModel=false;
		}

		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
			GlStateManager.translate(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
			GlStateManager.scale(1.3D, 1.3D, 1.0D);
			GlStateManager.translate(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
			GlStateManager.translate(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
			this.Head.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeftLeg.offsetX, this.LeftLeg.offsetY, this.LeftLeg.offsetZ);
			GlStateManager.translate(this.LeftLeg.rotationPointX * f5, this.LeftLeg.rotationPointY * f5, this.LeftLeg.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.25D);
			GlStateManager.translate(-this.LeftLeg.offsetX, -this.LeftLeg.offsetY, -this.LeftLeg.offsetZ);
			GlStateManager.translate(-this.LeftLeg.rotationPointX * f5, -this.LeftLeg.rotationPointY * f5, -this.LeftLeg.rotationPointZ * f5);
			this.LeftLeg.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RightLeg.offsetX, this.RightLeg.offsetY, this.RightLeg.offsetZ);
			GlStateManager.translate(this.RightLeg.rotationPointX * f5, this.RightLeg.rotationPointY * f5, this.RightLeg.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.25D);
			GlStateManager.translate(-this.RightLeg.offsetX, -this.RightLeg.offsetY, -this.RightLeg.offsetZ);
			GlStateManager.translate(-this.RightLeg.rotationPointX * f5, -this.RightLeg.rotationPointY * f5, -this.RightLeg.rotationPointZ * f5);
			this.RightLeg.render(f5);
			GlStateManager.popMatrix();
			this.RightArm.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			this.driver.render(f5);
			this.LeftArm.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
			GlStateManager.translate(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
			GlStateManager.scale(1.3D, 1.3D, 1.0D);
			GlStateManager.translate(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
			GlStateManager.translate(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
			this.Head.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeftLeg.offsetX, this.LeftLeg.offsetY, this.LeftLeg.offsetZ);
			GlStateManager.translate(this.LeftLeg.rotationPointX * f5, this.LeftLeg.rotationPointY * f5, this.LeftLeg.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.25D);
			GlStateManager.translate(-this.LeftLeg.offsetX, -this.LeftLeg.offsetY, -this.LeftLeg.offsetZ);
			GlStateManager.translate(-this.LeftLeg.rotationPointX * f5, -this.LeftLeg.rotationPointY * f5, -this.LeftLeg.rotationPointZ * f5);
			this.LeftLeg.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RightLeg.offsetX, this.RightLeg.offsetY, this.RightLeg.offsetZ);
			GlStateManager.translate(this.RightLeg.rotationPointX * f5, this.RightLeg.rotationPointY * f5, this.RightLeg.rotationPointZ * f5);
			GlStateManager.scale(1.25D, 1.0D, 1.25D);
			GlStateManager.translate(-this.RightLeg.offsetX, -this.RightLeg.offsetY, -this.RightLeg.offsetZ);
			GlStateManager.translate(-this.RightLeg.rotationPointX * f5, -this.RightLeg.rotationPointY * f5, -this.RightLeg.rotationPointZ * f5);
			this.RightLeg.render(f5);
			GlStateManager.popMatrix();
			this.RightArm.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			this.driver.render(f5);
			this.LeftArm.render(f5);
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

		//		setAngle(Head, this.bipedHead);
		setAngle(Body, this.bipedBody);
		setAngle(gashat, this.bipedBody);
		setAngle(driver, this.bipedBody);
		setAngle(RightArm, this.bipedRightArm);
		setAngle(LeftArm, this.bipedLeftArm);
		setAngle(RightLeg, this.bipedRightLeg);
		setAngle(LeftLeg, this.bipedLeftLeg);

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
