package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelDespider - MirrorWorld
 * Created using Tabula 7.0.1
 */
public class ModelDespider extends ModelBiped{
	public ModelRenderer RightArm;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer Belt;
	public ModelRenderer Body2;
	public ModelRenderer field_78208_c;
	public ModelRenderer field_78207_b;
	public ModelRenderer LLeg1;
	public ModelRenderer LLeg2;
	public ModelRenderer LLeg3;
	public ModelRenderer LLeg4;
	public ModelRenderer RLeg1;
	public ModelRenderer RLeg2;
	public ModelRenderer RLeg3;
	public ModelRenderer RLeg4;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer backle;
	public ModelRenderer L2Leg1;
	public ModelRenderer L2Leg2;
	public ModelRenderer L2Leg3;
	public ModelRenderer L2Leg4;
	public ModelRenderer R2Leg1;
	public ModelRenderer R2Leg2;
	public ModelRenderer R2Leg3;
	public ModelRenderer R2Leg4;

	public ModelDespider() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LLeg3 = new ModelRenderer(this, 52, 0);
		this.LLeg3.setRotationPoint(7.0F, 15.5F, 3.5F);
		this.LLeg3.addBox(0.0F, -5.5F, 0.0F, 3, 9, 3, 0.0F);
		this.setRotateAngle(LLeg3, -0.17453292519943295F, 0.0F, 0.7853981633974483F);
		this.Body2 = new ModelRenderer(this, 16, 16);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.0F, -2.5F, 8, 4, 4, 0.26F);
		this.L2Leg2 = new ModelRenderer(this, 52, 0);
		this.L2Leg2.setRotationPoint(0.0F, -5.5F, 0.0F);
		this.L2Leg2.addBox(0.0F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(L2Leg2, 0.0F, 0.0F, -1.5707963267948966F);
		this.L2Leg3 = new ModelRenderer(this, 52, 0);
		this.L2Leg3.setRotationPoint(0.0F, -5.5F, 0.0F);
		this.L2Leg3.addBox(0.0F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(L2Leg3, 0.0F, 0.0F, -1.5707963267948966F);
		this.RLeg2 = new ModelRenderer(this, 52, 0);
		this.RLeg2.setRotationPoint(-7.0F, 16.0F, -1.0F);
		this.RLeg2.addBox(-3.0F, -5.5F, 0.0F, 3, 9, 3, 0.0F);
		this.setRotateAngle(RLeg2, 0.2617993877991494F, 0.0F, -0.7853981633974483F);
		this.LLeg2 = new ModelRenderer(this, 52, 0);
		this.LLeg2.mirror = true;
		this.LLeg2.setRotationPoint(7.0F, 16.0F, -1.0F);
		this.LLeg2.addBox(0.0F, -5.5F, 0.0F, 3, 9, 3, 0.0F);
		this.setRotateAngle(LLeg2, 0.17453292519943295F, 0.0F, 0.7853981633974483F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.setRotateAngle(RightArm, -1.0471975511965976F, 0.5235987755982988F, 0.0F);
		this.LLeg4 = new ModelRenderer(this, 52, 0);
		this.LLeg4.setRotationPoint(7.0F, 16.0F, 7.0F);
		this.LLeg4.addBox(0.0F, -5.5F, 0.0F, 3, 9, 3, 0.0F);
		this.setRotateAngle(LLeg4, -0.3490658503988659F, -0.3490658503988659F, 0.7853981633974483F);
		this.R2Leg1 = new ModelRenderer(this, 52, 0);
		this.R2Leg1.mirror = true;
		this.R2Leg1.setRotationPoint(0.0F, -9.0F, 0.0F);
		this.R2Leg1.addBox(-1.5F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(R2Leg1, 0.0F, 0.0F, 1.5707963267948966F);
		this.field_78208_c = new ModelRenderer(this, 4, 32);
		this.field_78208_c.setRotationPoint(0.0F, 15.0F, 10.0F);
		this.field_78208_c.addBox(-7.0F, -6.5F, 0.0F, 14, 9, 13, 0.0F);
		this.RLeg1 = new ModelRenderer(this, 52, 0);
		this.RLeg1.setRotationPoint(-6.5F, 16.5F, -5.0F);
		this.RLeg1.addBox(-3.0F, -7.5F, 0.0F, 3, 11, 3, 0.0F);
		this.setRotateAngle(RLeg1, 0.5235987755982988F, 0.0F, -0.8726646259971648F);
		this.LeftArm = new ModelRenderer(this, 40, 16);
		this.LeftArm.mirror = true;
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.setRotateAngle(LeftArm, -1.0471975511965976F, -0.5235987755982988F, 0.0F);
		this.field_78207_b = new ModelRenderer(this, 4, 32);
		this.field_78207_b.setRotationPoint(-7.0F, 12.0F, -3.5F);
		this.field_78207_b.addBox(0.0F, 0.0F, 0.0F, 14, 9, 13, 0.0F);
		this.LLeg1 = new ModelRenderer(this, 52, 0);
		this.LLeg1.setRotationPoint(6.5F, 16.5F, -5.0F);
		this.LLeg1.addBox(0.0F, -7.5F, 0.0F, 3, 11, 3, 0.0F);
		this.setRotateAngle(LLeg1, 0.5235987755982988F, 0.0F, 0.8726646259971648F);
		this.L2Leg4 = new ModelRenderer(this, 52, 0);
		this.L2Leg4.setRotationPoint(0.0F, -5.5F, 0.0F);
		this.L2Leg4.addBox(0.0F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(L2Leg4, 0.0F, -0.0F, -1.5707963267948966F);
		this.RLeg3 = new ModelRenderer(this, 52, 0);
		this.RLeg3.setRotationPoint(-7.0F, 15.5F, 3.5F);
		this.RLeg3.addBox(-3.0F, -5.5F, 0.0F, 3, 9, 3, 0.0F);
		this.setRotateAngle(RLeg3, -0.17453292519943295F, 0.0F, -0.7853981633974483F);
		this.R2Leg3 = new ModelRenderer(this, 52, 0);
		this.R2Leg3.mirror = true;
		this.R2Leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.R2Leg3.addBox(-8.5F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(R2Leg3, 0.0F, 0.0F, 1.5707963267948966F);
		this.Shoulder_R = new ModelRenderer(this, 32, 0);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.backle = new ModelRenderer(this, 21, 36);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-2.0F, 8.5F, -2.5F, 4, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.R2Leg2 = new ModelRenderer(this, 52, 0);
		this.R2Leg2.mirror = true;
		this.R2Leg2.setRotationPoint(0.0F, 0.0F, -0.0F);
		this.R2Leg2.addBox(-8.5F, 0.0F, -0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(R2Leg2, 0.0F, 0.0F, 1.5707963267948966F);
		this.RLeg4 = new ModelRenderer(this, 52, 0);
		this.RLeg4.setRotationPoint(-7.0F, 16.0F, 7.0F);
		this.RLeg4.addBox(-3.0F, -5.5F, 0.0F, 3, 9, 3, 0.0F);
		this.setRotateAngle(RLeg4, -0.3490658503988659F, 0.3490658503988659F, -0.7853981633974483F);
		this.Shoulder_L = new ModelRenderer(this, 32, 0);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.L2Leg1 = new ModelRenderer(this, 52, 0);
		this.L2Leg1.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.L2Leg1.addBox(1.5F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(L2Leg1, 0.0F, 0.0F, -1.5707963267948966F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.R2Leg4 = new ModelRenderer(this, 52, 0);
		this.R2Leg4.mirror = true;
		this.R2Leg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.R2Leg4.addBox(-8.5F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
		this.setRotateAngle(R2Leg4, 0.0F, 0.0F, 1.5707963267948966F);
		this.LLeg2.addChild(this.L2Leg2);
		this.LLeg3.addChild(this.L2Leg3);
		this.RLeg1.addChild(this.R2Leg1);
		this.LLeg4.addChild(this.L2Leg4);
		this.RLeg3.addChild(this.R2Leg3);
		this.RightArm.addChild(this.Shoulder_R);
		this.Belt.addChild(this.backle);
		this.RLeg2.addChild(this.R2Leg2);
		this.LeftArm.addChild(this.Shoulder_L);
		this.LLeg1.addChild(this.L2Leg1);
		this.RLeg4.addChild(this.R2Leg4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (this.isChild)
		{
			this.LLeg3.render(f5);
			this.Body2.render(f5);
			this.RLeg2.render(f5);
			this.LLeg2.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.LLeg4.render(f5);
			this.field_78208_c.render(f5);
			this.RLeg1.render(f5);
			this.LeftArm.render(f5);
			this.field_78207_b.render(f5);
			this.LLeg1.render(f5);
			this.RLeg3.render(f5);
			this.Belt.render(f5);
			this.RLeg4.render(f5);
			this.Head.render(f5);
		}
		else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.LLeg3.render(f5);
			this.Body2.render(f5);
			this.RLeg2.render(f5);
			this.LLeg2.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.LLeg4.render(f5);
			this.field_78208_c.render(f5);
			this.RLeg1.render(f5);
			this.LeftArm.render(f5);
			this.field_78207_b.render(f5);
			this.LLeg1.render(f5);
			this.RLeg3.render(f5);
			this.Belt.render(f5);
			this.RLeg4.render(f5);
			this.Head.render(f5);
			
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

		setAngle(Head, this.bipedHead);
		setAngle(Body, this.bipedBody);
		setAngle(Body2, this.bipedBody);
		setAngle(RightArm, this.bipedRightArm);
		setAngle(LeftArm, this.bipedLeftArm);

/*		setAngle(field_78208_c,this.spiderBody);
//		setAngle(field_78207_b,this.spiderNeck);
		setAngle(LLeg1,this.spiderLeg8);
		setAngle(LLeg2,this.spiderLeg6);
		setAngle(LLeg3,this.spiderLeg4);
		setAngle(LLeg4,this.spiderLeg2);
		setAngle(RLeg1,this.spiderLeg7);
		setAngle(RLeg2,this.spiderLeg5);
		setAngle(RLeg3,this.spiderLeg3);
		setAngle(RLeg4,this.spiderLeg1);
*/
		setAngle(backle,this.bipedBody);

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
