package rider.wmod.rendering.models.items.zio;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.zio.ArmorShinobi;

/**
 * ModelShinobi - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelShinobi extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head2;
	public ModelRenderer Body;
	public ModelRenderer Head;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Body2;
	public ModelRenderer muffler2;
	public ModelRenderer muffler;
	public ModelRenderer platebase;
	public ModelRenderer shuriken1;
	public ModelRenderer shuriken2;
	public ModelRenderer shuriken3;
	public ModelRenderer shuriken4;
	public ModelRenderer shuriken1_1;
	public ModelRenderer AntenaL1;
	public ModelRenderer AntenaL2;
	public ModelRenderer AntenaL3;
	public ModelRenderer AntenaL4;
	public ModelRenderer AntenaR1;
	public ModelRenderer AntenaR2;
	public ModelRenderer AntenaR3;
	public ModelRenderer AntenaR4;
	public ModelRenderer ShinobiHead1;
	public ModelRenderer ShinobiHead2;
	public ModelRenderer ShinobiHead3;
	public ModelRenderer ShinobiHead4;
	public ModelRenderer ShinobiHead5;
	public ModelRenderer ShinobiHead6;

	public ModelShinobi() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Body2 = new ModelRenderer(this, 15, 16);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 1.0F, -2.5F, 8, 5, 5, 0.0F);
		this.AntenaR4 = new ModelRenderer(this, 33, 11);
		this.AntenaR4.mirror = true;
		this.AntenaR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaR4.addBox(4.0F, -6.75F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaR1 = new ModelRenderer(this, 33, 11);
		this.AntenaR1.mirror = true;
		this.AntenaR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaR1.addBox(1.0F, -4.75F, -5.0F, 1, 1, 1, 0.0F);
		this.ShinobiHead6 = new ModelRenderer(this, 33, 9);
		this.ShinobiHead6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShinobiHead6.addBox(-0.5F, -3.2F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaR3 = new ModelRenderer(this, 33, 11);
		this.AntenaR3.mirror = true;
		this.AntenaR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaR3.addBox(3.0F, -6.2F, -5.0F, 1, 1, 1, 0.0F);
		this.shuriken1 = new ModelRenderer(this, 29, 36);
		this.shuriken1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken1.addBox(-0.5F, 9.0F, -3.3F, 1, 1, 1, 0.0F);
		this.shuriken1_1 = new ModelRenderer(this, 33, 38);
		this.shuriken1_1.mirror = true;
		this.shuriken1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken1_1.addBox(-1.25F, 9.75F, -3.35F, 1, 1, 1, 0.0F);
		this.shuriken4 = new ModelRenderer(this, 33, 38);
		this.shuriken4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken4.addBox(0.25F, 9.75F, -3.35F, 1, 1, 1, 0.0F);
		this.ShinobiHead2 = new ModelRenderer(this, 33, 8);
		this.ShinobiHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShinobiHead2.addBox(0.5F, -2.5F, -5.0F, 1, 1, 1, 0.0F);
		this.ShinobiHead4 = new ModelRenderer(this, 33, 8);
		this.ShinobiHead4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShinobiHead4.addBox(-1.5F, -2.5F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaL4 = new ModelRenderer(this, 33, 11);
		this.AntenaL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaL4.addBox(-4.9F, -6.75F, -5.0F, 1, 1, 1, 0.0F);
		this.ShinobiHead1 = new ModelRenderer(this, 33, 8);
		this.ShinobiHead1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShinobiHead1.addBox(-1.0F, -4.2F, -5.0F, 2, 1, 1, 0.0F);
		this.AntenaR2 = new ModelRenderer(this, 33, 11);
		this.AntenaR2.mirror = true;
		this.AntenaR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaR2.addBox(2.0F, -5.5F, -5.0F, 1, 1, 1, 0.0F);
		this.AntenaL1 = new ModelRenderer(this, 33, 11);
		this.AntenaL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaL1.addBox(-2.0F, -4.75F, -5.0F, 1, 1, 1, 0.0F);
		this.ShinobiHead3 = new ModelRenderer(this, 33, 8);
		this.ShinobiHead3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShinobiHead3.addBox(1.5F, -2.0F, -5.0F, 1, 1, 1, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.AntenaL3 = new ModelRenderer(this, 33, 11);
		this.AntenaL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaL3.addBox(-3.9F, -6.25F, -5.0F, 1, 1, 1, 0.0F);
		this.muffler = new ModelRenderer(this, 32, 0);
		this.muffler.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.muffler.addBox(-4.5F, -0.25F, -3.2F, 9, 2, 6, 0.0F);
		this.AntenaL2 = new ModelRenderer(this, 33, 11);
		this.AntenaL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaL2.addBox(-2.9F, -5.5F, -5.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(AntenaL2, 0.0F, 0.0F, -0.012042771838760872F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head2 = new ModelRenderer(this, 1, 0);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-3.5F, -8.5F, -3.5F, 7, 7, 7, 0.51F);
		this.muffler2 = new ModelRenderer(this, 57, 8);
		this.muffler2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.muffler2.addBox(-4.0F, 0.0F, 1.5F, 2, 15, 1, 0.0F);
		this.setRotateAngle(muffler2, 0.17453292519943295F, 0.0F, 0.0F);
		this.shuriken3 = new ModelRenderer(this, 33, 36);
		this.shuriken3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken3.addBox(-1.25F, 8.25F, -3.35F, 1, 1, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.platebase = new ModelRenderer(this, 27, 40);
		this.platebase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.platebase.addBox(-0.5F, 9.0F, -3.25F, 4, 1, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.36F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.shuriken2 = new ModelRenderer(this, 33, 36);
		this.shuriken2.mirror = true;
		this.shuriken2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shuriken2.addBox(0.25F, 8.25F, -3.35F, 1, 1, 1, 0.0F);
		this.ShinobiHead5 = new ModelRenderer(this, 33, 8);
		this.ShinobiHead5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShinobiHead5.addBox(-2.5F, -2.0F, -5.0F, 1, 1, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Body.addChild(this.Body2);
		this.Head.addChild(this.AntenaR4);
		this.Head.addChild(this.AntenaR1);
		this.Head.addChild(this.ShinobiHead6);
		this.Head.addChild(this.AntenaR3);
		this.Body.addChild(this.shuriken1);
		this.Body.addChild(this.shuriken1_1);
		this.Body.addChild(this.shuriken4);
		this.Head.addChild(this.ShinobiHead2);
		this.Head.addChild(this.ShinobiHead4);
		this.Head.addChild(this.AntenaL4);
		this.Head.addChild(this.ShinobiHead1);
		this.Head.addChild(this.AntenaR2);
		this.Head.addChild(this.AntenaL1);
		this.Head.addChild(this.ShinobiHead3);
		this.Head.addChild(this.AntenaL3);
		this.Body.addChild(this.muffler);
		this.Head.addChild(this.AntenaL2);
		this.Body.addChild(this.muffler2);
		this.Body.addChild(this.shuriken3);
		this.Body.addChild(this.platebase);
		this.RightArm.addChild(this.Shoulder_R);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Body.addChild(this.shuriken2);
		this.Head.addChild(this.ShinobiHead5);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (ArmorShinobi.isInvisible==1||ArmorShinobi.drivercheck==0)
		{
			this.Head.showModel=false;
			this.Head2.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;
		}
		else
		{
			this.Head.showModel=true;
			this.Head2.showModel=true;	
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;
		}

		if (this.isChild) {
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);
			this.Head.render(f5);
			this.Head2.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);

		}else {
			if (entity.isSneaking()) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);
			this.Head.render(f5);
			this.Head2.render(f5);
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
			setAngle(Head2, this.bipedHead);
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
