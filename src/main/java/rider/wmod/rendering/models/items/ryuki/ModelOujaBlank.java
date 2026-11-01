package rider.wmod.rendering.models.items.ryuki;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.ryuki.ArmorOujaBlank;

/**
 * ModelOujaBlank - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOujaBlank extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer HandBolt_R;
	public ModelRenderer HandBolt_R2;
	public ModelRenderer LegBolt_L;
	public ModelRenderer Head2;
	public ModelRenderer Body2;
	public ModelRenderer LegBolt_R;
	public ModelRenderer LegBolt_R_1;
	public ModelRenderer Body3;
	public ModelRenderer backle;
	public ModelRenderer Body3_1;
	public ModelRenderer Body3_2;
	public ModelRenderer HandBolt_L;
	public ModelRenderer HandBolt_L_1;
	public ModelRenderer LegBolt_R_2;

	public ModelOujaBlank() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.HandBolt_R = new ModelRenderer(this, 44, 12);
		this.HandBolt_R.mirror = true;
		this.HandBolt_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBolt_R.addBox(-4.25F, 5.0F, -1.0F, 1, 2, 2, 0.0F);
		this.HandBolt_L_1 = new ModelRenderer(this, 44, 12);
		this.HandBolt_L_1.mirror = true;
		this.HandBolt_L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBolt_L_1.addBox(3.25F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.Head2 = new ModelRenderer(this, 33, 34);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F);
		this.Body3_2 = new ModelRenderer(this, 0, 32);
		this.Body3_2.mirror = true;
		this.Body3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3_2.addBox(4.0F, -0.25F, -2.5F, 1, 4, 5, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-3.5F, -7.5F, -4.0F, 7, 7, 8, 0.51F);
		this.LegBolt_R = new ModelRenderer(this, 43, 13);
		this.LegBolt_R.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_R.addBox(-5.5F, -11.5F, 2.4F, 2, 2, 1, 0.0F);
		this.Body3_1 = new ModelRenderer(this, 0, 32);
		this.Body3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3_1.addBox(-5.0F, -0.25F, -2.5F, 1, 4, 5, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.1F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.1F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.backle = new ModelRenderer(this, 21, 36);
		this.backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backle.addBox(-2.0F, 8.5F, -2.5F, 4, 2, 1, 0.0F);
		this.HandBolt_R2 = new ModelRenderer(this, 44, 12);
		this.HandBolt_R2.mirror = true;
		this.HandBolt_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBolt_R2.addBox(-4.25F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.Body3 = new ModelRenderer(this, 42, 4);
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3.addBox(-4.0F, -0.25F, 1.5F, 8, 8, 1, 0.0F);
		this.HandBolt_L = new ModelRenderer(this, 44, 12);
		this.HandBolt_L.mirror = true;
		this.HandBolt_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandBolt_L.addBox(3.25F, 5.0F, -1.0F, 1, 2, 2, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LegBolt_R_1 = new ModelRenderer(this, 43, 13);
		this.LegBolt_R_1.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_R_1.addBox(-0.25F, -11.5F, 2.4F, 2, 2, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 42, 4);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, -0.25F, -2.5F, 8, 5, 1, 0.0F);
		this.LegBolt_R_2 = new ModelRenderer(this, 46, 13);
		this.LegBolt_R_2.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_R_2.addBox(-2.7F, -7.95F, -3.0F, 2, 2, 1, 0.0F);
		this.LegBolt_L = new ModelRenderer(this, 46, 13);
		this.LegBolt_L.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LegBolt_L.addBox(-3.1F, -7.95F, -3.0F, 2, 2, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm.addChild(this.HandBolt_R);
		this.LeftArm.addChild(this.HandBolt_L_1);
		this.Head.addChild(this.Head2);
		this.Body.addChild(this.Body3_2);
		this.Body.addChild(this.LegBolt_R);
		this.Body.addChild(this.Body3_1);
		this.Body.addChild(this.backle);
		this.RightArm.addChild(this.HandBolt_R2);
		this.Body.addChild(this.Body3);
		this.LeftArm.addChild(this.HandBolt_L);
		this.Body.addChild(this.LegBolt_R_1);
		this.Body.addChild(this.Body2);
		this.LeftLeg.addChild(this.LegBolt_R_2);
		this.RightLeg.addChild(this.LegBolt_L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorOujaBlank.DriverCheck==1) {
			this.RightLeg.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.Head.showModel=true;		
		}else {
			this.RightLeg.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.Head.showModel=false;	
		}

		if (this.isChild)
		{
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			this.Head.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			this.Head.render(f5);

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
