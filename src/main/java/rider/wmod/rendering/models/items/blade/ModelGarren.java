package rider.wmod.rendering.models.items.blade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.blade.ArmorGarren;

/**
 * ModelGarren - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGarren extends ModelBiped {
	public ModelRenderer Body2;
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head;
	public ModelRenderer shape61;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer Shoulder_R6;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R1;
	public ModelRenderer Shoulder_R7;
	public ModelRenderer Shoulder_R4;
	public ModelRenderer Shoulder_R9;
	public ModelRenderer Shoulder_R5;
	public ModelRenderer Shoulder_R8;
	//	public ModelRenderer Backle;
	public ModelRenderer Shoulder_R1_1;
	public ModelRenderer Shoulder_R2_1;
	public ModelRenderer Shoulder_R3_1;
	public ModelRenderer Shoulder_R4_1;
	public ModelRenderer Shoulder_R5_1;
	public ModelRenderer Shoulder_R6_1;
	public ModelRenderer Shoulder_R7_1;
	public ModelRenderer Shoulder_R8_1;
	public ModelRenderer Shoulder_R9_1;
	public ModelRenderer shape61_1;
	public ModelRenderer Horn4R;
	public ModelRenderer Horn4L;
	public ModelRenderer Horn2R;
	public ModelRenderer Horn3L;
	public ModelRenderer HeadSideR;
	public ModelRenderer Horn1L;
	public ModelRenderer Horn3R;
	public ModelRenderer Horn2L;
	public ModelRenderer Horn1R;
	public ModelRenderer HeadSideL;

	public ModelGarren() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shoulder_R4_1 = new ModelRenderer(this, 22, 33);
		this.Shoulder_R4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R4_1.addBox(3.3F, -4.3F, -1.5F, 1, 1, 3, 0.0F);
		this.Shoulder_R3_1 = new ModelRenderer(this, 0, 35);
		this.Shoulder_R3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3_1.addBox(1.3F, -1.7F, -2.5F, 1, 3, 5, 0.0F);
		this.Shoulder_R6_1 = new ModelRenderer(this, 20, 32);
		this.Shoulder_R6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R6_1.addBox(-4.3F, -2.3F, -3.0F, 2, 3, 6, 0.0F);
		this.setRotateAngle(Shoulder_R6_1, 0.0F, 3.141592653589793F, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Horn2L = new ModelRenderer(this, 35, 4);
		this.Horn2L.mirror = true;
		this.Horn2L.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn2L.addBox(1.35F, -10.5F, -4.51F, 3, 1, 1, 0.0F);
		this.Shoulder_R8_1 = new ModelRenderer(this, 0, 39);
		this.Shoulder_R8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R8_1.addBox(3.3F, 1.7F, -1.5F, 1, 1, 3, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.shape61_1 = new ModelRenderer(this, 29, 23);
		this.shape61_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape61_1.addBox(-1.75F, 9.0F, 2.25F, 4, 1, 1, 0.0F);
		this.HeadSideL = new ModelRenderer(this, 30, 2);
		this.HeadSideL.mirror = true;
		this.HeadSideL.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.HeadSideL.addBox(4.0F, -8.6F, -4.41F, 1, 5, 1, 0.0F);
		this.Horn1R = new ModelRenderer(this, 34, 6);
		this.Horn1R.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn1R.addBox(-4.6F, -9.5F, -4.51F, 4, 1, 1, 0.0F);
		this.Shoulder_R2_1 = new ModelRenderer(this, 0, 35);
		this.Shoulder_R2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2_1.addBox(0.3F, -1.2F, -2.5F, 1, 2, 5, 0.0F);
		this.Shoulder_R7_1 = new ModelRenderer(this, 21, 36);
		this.Shoulder_R7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R7_1.addBox(-4.3F, 0.7F, -2.5F, 2, 1, 5, 0.0F);
		this.setRotateAngle(Shoulder_R7_1, 0.0F, 3.141592653589793F, 0.0F);
		this.Shoulder_R6 = new ModelRenderer(this, 20, 32);
		this.Shoulder_R6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R6.addBox(-4.3F, -2.3F, -3.0F, 2, 3, 6, 0.0F);
		this.HeadSideR = new ModelRenderer(this, 30, 2);
		this.HeadSideR.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.HeadSideR.addBox(-5.0F, -8.6F, -4.41F, 1, 5, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Horn2R = new ModelRenderer(this, 35, 4);
		this.Horn2R.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn2R.addBox(-4.35F, -10.5F, -4.51F, 3, 1, 1, 0.0F);
		this.Shoulder_R7 = new ModelRenderer(this, 21, 36);
		this.Shoulder_R7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R7.addBox(-4.3F, 0.7F, -2.5F, 2, 1, 5, 0.0F);
		this.Shoulder_R2 = new ModelRenderer(this, 0, 35);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-1.3F, -1.2F, -2.5F, 1, 2, 5, 0.0F);
		this.shape61 = new ModelRenderer(this, 29, 23);
		this.shape61.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape61.addBox(-2.25F, 9.0F, 2.25F, 4, 1, 1, 0.0F);
		this.Horn4L = new ModelRenderer(this, 35, 1);
		this.Horn4L.mirror = true;
		this.Horn4L.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn4L.addBox(0.85F, -12.5F, -4.51F, 3, 1, 1, 0.0F);
		this.Horn1L = new ModelRenderer(this, 34, 6);
		this.Horn1L.mirror = true;
		this.Horn1L.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn1L.addBox(0.6F, -9.5F, -4.51F, 4, 1, 1, 0.0F);
		this.Horn3R = new ModelRenderer(this, 35, 2);
		this.Horn3R.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn3R.addBox(-4.1F, -11.5F, -4.51F, 3, 1, 1, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 35);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-2.3F, -1.7F, -2.5F, 1, 3, 5, 0.0F);
		this.Shoulder_R8 = new ModelRenderer(this, 0, 39);
		this.Shoulder_R8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R8.addBox(-4.3F, 1.7F, -1.5F, 1, 1, 3, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R4 = new ModelRenderer(this, 22, 33);
		this.Shoulder_R4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R4.addBox(-4.3F, -4.3F, -1.5F, 1, 1, 3, 0.0F);
		this.Shoulder_R5_1 = new ModelRenderer(this, 20, 32);
		this.Shoulder_R5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R5_1.addBox(-4.3F, -3.3F, -2.5F, 2, 1, 5, 0.0F);
		this.setRotateAngle(Shoulder_R5_1, 0.0F, 3.141592653589793F, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R9 = new ModelRenderer(this, 0, 33);
		this.Shoulder_R9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R9.addBox(-3.65F, 1.7F, -2.5F, 5, 1, 5, 0.0F);
		this.setRotateAngle(Shoulder_R9, 0.0F, 0.0F, 0.003490658503988659F);
		this.Shoulder_R1_1 = new ModelRenderer(this, 0, 35);
		this.Shoulder_R1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R1_1.addBox(-0.7F, -0.7F, -2.5F, 1, 1, 5, 0.0F);
		this.Shoulder_R9_1 = new ModelRenderer(this, 0, 33);
		this.Shoulder_R9_1.mirror = true;
		this.Shoulder_R9_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R9_1.addBox(-1.35F, 1.7F, -2.5F, 5, 1, 5, 0.0F);
		this.setRotateAngle(Shoulder_R9_1, 0.0F, 0.0F, 0.003490658503988659F);
		this.Horn4R = new ModelRenderer(this, 35, 1);
		this.Horn4R.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn4R.addBox(-3.85F, -12.5F, -4.51F, 3, 1, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 39, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 6, 4, 0.5F);
		this.Shoulder_R1 = new ModelRenderer(this, 0, 35);
		this.Shoulder_R1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R1.addBox(-0.3F, -0.7F, -2.5F, 1, 1, 5, 0.0F);
		this.Shoulder_R5 = new ModelRenderer(this, 20, 32);
		this.Shoulder_R5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R5.addBox(-4.3F, -3.3F, -2.5F, 2, 1, 5, 0.0F);
		this.Horn3L = new ModelRenderer(this, 35, 2);
		this.Horn3L.mirror = true;
		this.Horn3L.setRotationPoint(-0.0F, 0.0F, 0.0F);
		this.Horn3L.addBox(1.1F, -11.5F, -4.51F, 3, 1, 1, 0.0F);
		this.LeftArm.addChild(this.Shoulder_R4_1);
		this.LeftArm.addChild(this.Shoulder_R3_1);
		this.LeftArm.addChild(this.Shoulder_R6_1);
		this.Head.addChild(this.Horn2L);
		this.LeftArm.addChild(this.Shoulder_R8_1);
		this.LeftLeg.addChild(this.shape61_1);
		this.Head.addChild(this.HeadSideL);
		this.Head.addChild(this.Horn1R);
		this.LeftArm.addChild(this.Shoulder_R2_1);
		this.LeftArm.addChild(this.Shoulder_R7_1);
		this.RightArm.addChild(this.Shoulder_R6);
		this.Head.addChild(this.HeadSideR);
		this.Head.addChild(this.Horn2R);
		this.RightArm.addChild(this.Shoulder_R7);
		this.RightArm.addChild(this.Shoulder_R2);
		this.RightLeg.addChild(this.shape61);
		this.Head.addChild(this.Horn4L);
		this.Head.addChild(this.Horn1L);
		this.Head.addChild(this.Horn3R);
		this.RightArm.addChild(this.Shoulder_R3);
		this.RightArm.addChild(this.Shoulder_R8);
		this.RightArm.addChild(this.Shoulder_R4);
		this.LeftArm.addChild(this.Shoulder_R5_1);
		this.RightArm.addChild(this.Shoulder_R9);
		this.LeftArm.addChild(this.Shoulder_R1_1);
		this.LeftArm.addChild(this.Shoulder_R9_1);
		this.Head.addChild(this.Horn4R);
		this.RightArm.addChild(this.Shoulder_R1);
		this.RightArm.addChild(this.Shoulder_R5);
		this.Head.addChild(this.Horn3L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGarren.isHenshin==0||ArmorGarren.isInvisible==1) {
			this.Body2.showModel=false;
			this.Head.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
		}else {
			this.Body2.showModel=true;
			this.Head.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;
		}

		if (this.isChild)
		{
			this.RightArm.render(f5);
			this.Head.render(f5);
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.Body2.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Body2.render(f5);
			this.Head.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);

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
			setAngle(Body, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(Body2, this.bipedBody);
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
