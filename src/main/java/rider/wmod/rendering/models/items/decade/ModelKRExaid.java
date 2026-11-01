package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRExaid;

/**
 * ModelKRExaid - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKRExaid extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Shoulder_R;
	public ModelRenderer hair1;
	public ModelRenderer hair2;
	public ModelRenderer hair3;
	public ModelRenderer hair4;
	public ModelRenderer hair6;
	public ModelRenderer hair7;
	public ModelRenderer hair0;
	public ModelRenderer hair5;
	public ModelRenderer BackHead;
	public ModelRenderer BackHair;
	public ModelRenderer BackHead2;
	public ModelRenderer BackHead3;
	public ModelRenderer BackHead4;
	public ModelRenderer BackHead5;
	public ModelRenderer BackHead6;
	public ModelRenderer Shoulder_L;

	public ModelKRExaid() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.hair5 = new ModelRenderer(this, 43, 2);
		this.hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair5.addBox(0.6F, -10.5F, -4.8F, 3, 1, 2, 0.0F);
		this.BackHead5 = new ModelRenderer(this, 50, 33);
		this.BackHead5.setRotationPoint(0.2F, -3.5F, 3.0F);
		this.BackHead5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.hair4 = new ModelRenderer(this, 39, 3);
		this.hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair4.addBox(-3.6F, -10.3F, -4.8F, 7, 1, 2, 0.0F);
		this.hair7 = new ModelRenderer(this, 39, 0);
		this.hair7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair7.addBox(-2.0F, -12.0F, -4.8F, 3, 1, 2, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.BackHair = new ModelRenderer(this, 43, 36);
		this.BackHair.setRotationPoint(0.0F, -1.0F, 3.0F);
		this.BackHair.addBox(-3.5F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.hair1 = new ModelRenderer(this, 39, 6);
		this.hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair1.addBox(-5.2F, -7.3F, -4.8F, 11, 1, 2, 0.0F);
		this.hair2 = new ModelRenderer(this, 39, 5);
		this.hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair2.addBox(-4.7F, -8.3F, -4.8F, 10, 1, 2, 0.0F);
		this.BackHead = new ModelRenderer(this, 39, 39);
		this.BackHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackHead.addBox(-4.5F, 0.0F, 2.0F, 9, 5, 3, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.hair6 = new ModelRenderer(this, 39, 1);
		this.hair6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair6.addBox(-3.0F, -11.3F, -4.8F, 3, 1, 2, 0.0F);
		this.BackHead3 = new ModelRenderer(this, 45, 35);
		this.BackHead3.setRotationPoint(0.0F, -2.0F, 3.0F);
		this.BackHead3.addBox(-1.75F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.hair0 = new ModelRenderer(this, 39, 7);
		this.hair0.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair0.addBox(-4.95F, -6.3F, -4.8F, 10, 1, 2, 0.0F);
		this.BackHead4 = new ModelRenderer(this, 45, 34);
		this.BackHead4.setRotationPoint(0.0F, -3.0F, 3.0F);
		this.BackHead4.addBox(-2.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
		this.BackHead2 = new ModelRenderer(this, 36, 43);
		this.BackHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackHead2.addBox(-3.0F, 5.0F, 3.0F, 6, 1, 2, 0.0F);
		this.BackHead6 = new ModelRenderer(this, 50, 33);
		this.BackHead6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackHead6.addBox(-3.75F, -1.5F, 3.0F, 2, 1, 2, 0.0F);
		this.hair3 = new ModelRenderer(this, 39, 4);
		this.hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair3.addBox(-4.1F, -9.3F, -4.8F, 10, 1, 2, 0.0F);

		this.BackHead.addChild(this.BackHead5);
		this.Head.addChild(this.hair6);
		this.Head.addChild(this.hair7);
		this.BackHead.addChild(this.BackHead4);
		this.BackHead.addChild(this.BackHead6);
		this.Head.addChild(this.hair4);
		this.Body.addChild(this.BackHead);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Head.addChild(this.hair5);
		this.Head.addChild(this.hair0);
		this.BackHead.addChild(this.BackHair);
		this.RightArm.addChild(this.Shoulder_R);
		this.BackHead.addChild(this.BackHead3);
		this.Head.addChild(this.hair3);
		this.Head.addChild(this.hair2);
		this.BackHead.addChild(this.BackHead2);
		this.Head.addChild(this.hair1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorKRExaid.isInvisible==0 && ArmorKRExaid.DriverCheck==1) 
		{
			this.Head.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;

			this.hair1.showModel=true;
			this.hair2.showModel=true;
			this.hair3.showModel=true;
			this.hair4.showModel=true;
			this.hair6.showModel=true;
			this.hair7.showModel=true;
			this.hair0.showModel=true;
			this.hair5.showModel=true;
			this.BackHead.showModel=true;
			this.BackHair.showModel=true;
			this.BackHead2.showModel=true;
			this.BackHead3.showModel=true;
			this.BackHead4.showModel=true;
			this.BackHead5.showModel=true;
			this.BackHead6.showModel=true;

		}
		else
		{
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;

			this.hair1.showModel=false;
			this.hair2.showModel=false;
			this.hair3.showModel=false;
			this.hair4.showModel=false;
			this.hair6.showModel=false;
			this.hair7.showModel=false;
			this.hair0.showModel=false;
			this.hair5.showModel=false;
			this.BackHead.showModel=false;
			this.BackHair.showModel=false;
			this.BackHead2.showModel=false;
			this.BackHead3.showModel=false;
			this.BackHead4.showModel=false;
			this.BackHead5.showModel=false;
			this.BackHead6.showModel=false;
		}


		if (this.isChild) {

			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.RightLeg.render(f5);
			this.Head.render(f5);
			this.LeftLeg.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.RightLeg.render(f5);
			this.Head.render(f5);
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
