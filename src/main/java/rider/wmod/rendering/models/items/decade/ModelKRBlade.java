package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRBlade;

/**
 * ModelKRBlade - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKRBlade extends ModelBiped {
	public ModelRenderer Body2;
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head;
	public ModelRenderer LegPieceR;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer LegPieceL;
	public ModelRenderer Horn1;
	public ModelRenderer Horn2;
	public ModelRenderer Horn3;
	public ModelRenderer Horn5;
	public ModelRenderer Horn6;

	public ModelKRBlade() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shoulder_R2 = new ModelRenderer(this, 21, 34);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-5.0F, -2.3F, -2.0F, 1, 3, 4, 0.0F);
		this.LegPieceL = new ModelRenderer(this, 44, 35);
		this.LegPieceL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegPieceL.addBox(-2.35F, 9.0F, 1.75F, 5, 1, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 39, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 6, 4, 0.5F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Horn6 = new ModelRenderer(this, 36, 2);
		this.Horn6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn6.addBox(-0.5F, -7.0F, 6.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(Horn6, 0.7853981633974483F, 0.0F, 0.0F);
		this.Horn2 = new ModelRenderer(this, 32, 4);
		this.Horn2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn2.addBox(-1.5F, -10.38F, -4.4F, 3, 1, 2, 0.0F);
		this.Shoulder_L3 = new ModelRenderer(this, 2, 43);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(-1.0F, -2.6F, -1.5F, 5, 1, 3, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 2, 43);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-4.0F, -2.6F, -1.5F, 5, 1, 3, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Horn3 = new ModelRenderer(this, 34, 4);
		this.Horn3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn3.addBox(-1.0F, -11.28F, -4.3F, 2, 1, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.1F, -2.5F, 5, 4, 5, 0.0F);
		this.Horn5 = new ModelRenderer(this, 34, 2);
		this.Horn5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn5.addBox(-0.5F, -13.18F, -4.2F, 1, 2, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L2 = new ModelRenderer(this, 21, 34);
		this.Shoulder_L2.mirror = true;
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(4.0F, -2.3F, -2.0F, 1, 3, 4, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-4.0F, -2.1F, -2.5F, 5, 4, 5, 0.0F);
		this.LegPieceR = new ModelRenderer(this, 44, 35);
		this.LegPieceR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegPieceR.addBox(-2.75F, 9.0F, 1.75F, 5, 1, 1, 0.0F);
		this.Horn1 = new ModelRenderer(this, 31, 4);
		this.Horn1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Horn1.addBox(-2.0F, -9.48F, -4.5F, 4, 1, 3, 0.0F);
		this.RightArm.addChild(this.Shoulder_R2);
		this.LeftLeg.addChild(this.LegPieceL);
		this.Head.addChild(this.Horn6);
		this.Head.addChild(this.Horn2);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.RightArm.addChild(this.Shoulder_R3);
		this.Head.addChild(this.Horn3);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Head.addChild(this.Horn5);
		this.LeftArm.addChild(this.Shoulder_L2);
		this.RightArm.addChild(this.Shoulder_R);
		this.RightLeg.addChild(this.LegPieceR);
		this.Head.addChild(this.Horn1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorKRBlade.DriverCheck==0||ArmorKRBlade.isInvisible==1) {
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

		if (this.isChild) {
			this.Body2.render(f5);
			this.Head.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
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
