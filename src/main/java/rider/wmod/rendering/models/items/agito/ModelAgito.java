package rider.wmod.rendering.models.items.agito;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.agito.ArmorAgitoGround;
import rider.wmod.items.armor.agito.ArmorAltering;

/**
 * ModelAgito - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelAgito extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer HeadOpenHorn;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R2;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer HornR1;
	public ModelRenderer HornR2;
	public ModelRenderer HornR3;
	public ModelRenderer HornR4;
	public ModelRenderer HornL1;
	public ModelRenderer HornL2;
	public ModelRenderer HornL3;
	public ModelRenderer HornL4;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L2;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer HornOpenR1;
	public ModelRenderer HornOpenR2;
	public ModelRenderer HornOpenR3;
	public ModelRenderer HornOpenR4;
	public ModelRenderer HornOpenL1;
	public ModelRenderer HornOpenL2;
	public ModelRenderer HornOpenL3;
	public ModelRenderer HornOpenL4;

	public ModelAgito() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.Shoulder_L2 = new ModelRenderer(this, 2, 45);
		this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L2.addBox(3.3F, -2.5F, -1.5F, 1, 2, 3, 0.0F);
		this.setRotateAngle(Shoulder_L2, 0.0F, 0.0F, -0.05235987755982988F);
		this.HornL2 = new ModelRenderer(this, 0, 5);
		this.HornL2.mirror = true;
		this.HornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL2.addBox(2.75F, -10.5F, -4.3F, 2, 1, 2, 0.0F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 47);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-4.8F, -2.8F, -1.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F, 0.05235987755982988F);
		this.HornL1 = new ModelRenderer(this, 31, 0);
		this.HornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL1.addBox(2.25F, -9.5F, -4.5F, 3, 1, 2, 0.0F);
		this.HornR4 = new ModelRenderer(this, 0, 0);
		this.HornR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR4.addBox(-3.25F, -12.5F, -4.25F, 2, 1, 1, 0.0F);
		this.HornOpenL3 = new ModelRenderer(this, 30, 6);
		this.HornOpenL3.mirror = true;
		this.HornOpenL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenL3.addBox(5.75F, -7.25F, -5.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(HornOpenL3, 0.0F, -0.20943951023931953F, -0.08726646259971647F);
		this.HornOpenR2 = new ModelRenderer(this, 24, 3);
		this.HornOpenR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenR2.addBox(-7.0F, -8.0F, -5.25F, 3, 2, 1, 0.0F);
		this.setRotateAngle(HornOpenR2, 0.0F, 0.17453292519943295F, 0.17453292519943295F);
		this.HornL3 = new ModelRenderer(this, 0, 2);
		this.HornL3.mirror = true;
		this.HornL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL3.addBox(2.25F, -11.5F, -4.25F, 2, 1, 2, 0.0F);
		this.HeadOpenHorn = new ModelRenderer(this, 0, 0);
		this.HeadOpenHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadOpenHorn.addBox(0.0F, -4.0F, 0.0F, 1, 1, 1, 0.51F);
		this.Shoulder_R2 = new ModelRenderer(this, 2, 45);
		this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R2.addBox(-4.3F, -2.5F, -1.5F, 1, 2, 3, 0.0F);
		this.setRotateAngle(Shoulder_R2, 0.0F, 0.0F, 0.05235987755982988F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.HornOpenR3 = new ModelRenderer(this, 30, 6);
		this.HornOpenR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenR3.addBox(-7.0F, -7.25F, -5.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(HornOpenR3, 0.0F, 0.20943951023931953F, 0.08726646259971647F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.05235987755982988F);
		this.HornOpenR4 = new ModelRenderer(this, 24, 6);
		this.HornOpenR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenR4.addBox(-6.0F, -6.75F, -5.25F, 2, 1, 1, 0.0F);
		this.setRotateAngle(HornOpenR4, 0.0F, 0.20943951023931953F, 0.08726646259971647F);
		this.HornOpenR1 = new ModelRenderer(this, 24, 0);
		this.HornOpenR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenR1.addBox(-8.0F, -9.0F, -5.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(HornOpenR1, 0.0F, 0.17453292519943295F, 0.17453292519943295F);
		this.HornOpenL4 = new ModelRenderer(this, 24, 6);
		this.HornOpenL4.mirror = true;
		this.HornOpenL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenL4.addBox(3.75F, -6.75F, -5.25F, 2, 1, 1, 0.0F);
		this.setRotateAngle(HornOpenL4, 0.0F, -0.20943951023931953F, -0.08726646259971647F);
		this.HornR1 = new ModelRenderer(this, 31, 0);
		this.HornR1.mirror = true;
		this.HornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR1.addBox(-5.25F, -9.5F, -4.5F, 3, 1, 2, 0.0F);
		this.HornR2 = new ModelRenderer(this, 0, 5);
		this.HornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR2.addBox(-4.75F, -10.5F, -4.3F, 2, 1, 2, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.05235987755982988F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 47);
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(3.8F, -2.8F, -1.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.05235987755982988F);
		this.HornOpenL1 = new ModelRenderer(this, 24, 0);
		this.HornOpenL1.mirror = true;
		this.HornOpenL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornOpenL1.addBox(6.0F, -9.0F, -5.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(HornOpenL1, 0.0F, -0.17453292519943295F, -0.17453292519943295F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.HornR3 = new ModelRenderer(this, 0, 2);
		this.HornR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR3.addBox(-4.25F, -11.5F, -4.25F, 2, 1, 2, 0.0F);
		this.HornL4 = new ModelRenderer(this, 0, 0);
		this.HornL4.mirror = true;
		this.HornL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL4.addBox(1.25F, -12.5F, -4.25F, 2, 1, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.LeftArm.addChild(this.Shoulder_L2);
		this.Head.addChild(this.HornL2);
		this.RightArm.addChild(this.Shoulder_R3);
		this.Head.addChild(this.HornL1);
		this.Head.addChild(this.HornR4);
		this.HeadOpenHorn.addChild(this.HornOpenL3);
		this.HeadOpenHorn.addChild(this.HornOpenR2);
		this.Head.addChild(this.HornL3);
		this.RightArm.addChild(this.Shoulder_R2);
		this.HeadOpenHorn.addChild(this.HornOpenR3);
		this.RightArm.addChild(this.Shoulder_R);
		this.HeadOpenHorn.addChild(this.HornOpenR4);
		this.HeadOpenHorn.addChild(this.HornOpenR1);
		this.HeadOpenHorn.addChild(this.HornOpenL4);
		this.Head.addChild(this.HornR1);
		this.Head.addChild(this.HornR2);
		this.LeftArm.addChild(this.Shoulder_L);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.HeadOpenHorn.addChild(this.HornOpenL1);
		this.Head.addChild(this.HornR3);
		this.Head.addChild(this.HornL4);
		this.HeadOpenHorn.addChild(this.HornOpenL2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorAgitoGround.isInvisible==1||ArmorAgitoGround.armorcheck==0||ArmorAgitoGround.haveelement==1) {
			this.Head.showModel=false;
			this.HeadOpenHorn.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
		}else {
			this.Head.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;

			if(ArmorAltering.hornopen==1) 
			{
				this.HeadOpenHorn.showModel=true;
			}else {
				this.HeadOpenHorn.showModel=false;
			}
		}

		if (this.isChild) {
			this.HeadOpenHorn.render(f5);
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			this.Head.render(f5);
			this.RightArm.render(f5);
			this.LeftArm.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.HeadOpenHorn.render(f5);
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			this.Head.render(f5);
			this.RightArm.render(f5);
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
			setAngle(HeadOpenHorn, this.bipedHead);
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
