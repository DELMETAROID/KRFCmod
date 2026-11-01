package rider.wmod.rendering.models.items.zeztz;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.zeztz.ArmorZeztzImpact;

/**
 * ModelZeztz - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelZeztz extends ModelBiped {
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;

	public ModelRenderer Head2L;
	public ModelRenderer Head2R;
	public ModelRenderer Head3L;
	public ModelRenderer Head3R;
	public ModelRenderer HeadL;
	public ModelRenderer HeadR;
	public ModelRenderer Head4R;
	public ModelRenderer Head4L;
	public ModelRenderer HeadC;
	public ModelRenderer Head5L;
	public ModelRenderer Head5R;
	
	public ModelZeztz() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head4L = new ModelRenderer(this, 0, 0);
		this.Head4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4L.addBox(-2.5F, -10.5F, -4.0F, 1, 2, 1, 0.0F);
		this.Head5L = new ModelRenderer(this, 0, 0);
		this.Head5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5L.addBox(-2.5F, -12.0F, -3.0F, 1, 2, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.HeadR = new ModelRenderer(this, 0, 0);
		this.HeadR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadR.addBox(0.5F, -5.0F, -5.0F, 1, 1, 1, 0.0F);
		this.Head3R = new ModelRenderer(this, 0, 0);
		this.Head3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3R.addBox(1.5F, -9.5F, -5.0F, 1, 3, 1, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head3L = new ModelRenderer(this, 0, 0);
		this.Head3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3L.addBox(-2.5F, -9.5F, -5.0F, 1, 3, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Head2L = new ModelRenderer(this, 0, 0);
		this.Head2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2L.addBox(-2.0F, -6.5F, -5.0F, 1, 2, 1, 0.0F);
		this.HeadL = new ModelRenderer(this, 0, 0);
		this.HeadL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadL.addBox(-1.5F, -5.0F, -5.0F, 1, 1, 1, 0.0F);
		this.Head4R = new ModelRenderer(this, 0, 0);
		this.Head4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4R.addBox(1.5F, -10.5F, -4.0F, 1, 2, 1, 0.0F);
		this.Head2R = new ModelRenderer(this, 0, 0);
		this.Head2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2R.addBox(1.0F, -6.5F, -5.0F, 1, 2, 1, 0.0F);
		this.Head5R = new ModelRenderer(this, 0, 0);
		this.Head5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5R.addBox(1.5F, -12.0F, -3.0F, 1, 2, 1, 0.0F);
		this.HeadC = new ModelRenderer(this, 0, 0);
		this.HeadC.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadC.addBox(-0.5F, -4.5F, -5.0F, 1, 1, 1, 0.0F);
		

		
		this.Head.addChild(this.Head4L);
		this.Head.addChild(this.Head5L);
		this.Head.addChild(this.HeadR);
		this.Head.addChild(this.Head3R);
		this.Head.addChild(this.Head3L);
		this.Head.addChild(this.Head2L);
		this.Head.addChild(this.HeadL);
		this.Head.addChild(this.Head4R);
		this.Head.addChild(this.Head2R);
		this.Head.addChild(this.Head5R);
		this.Head.addChild(this.HeadC);
	
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorZeztzImpact.isHenshin==1) 
		{
			this.LeftLeg.showModel=true;
			this.Head.showModel=true;
			this.LeftArm.showModel=true;
			this.RightArm.showModel=true;
			this.RightLeg.showModel=true;
			this.Body.showModel=true;
		}else {
			this.LeftLeg.showModel=false;
			this.Head.showModel=false;
			this.LeftArm.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.Body.showModel=false;
		}



		if (this.isChild) {
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.RightLeg.render(f5);
			this.Body.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
	        
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
			}

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.15F);
			}

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
