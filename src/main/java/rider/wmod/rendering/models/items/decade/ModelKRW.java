package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRW;

/**
 * ModelKRW - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKRW extends ModelBiped {
	public ModelRenderer Body2;
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head;
	public ModelRenderer Shoulder_R;
	public ModelRenderer WindyStabilizer;
	public ModelRenderer Shoulder_L;
	public ModelRenderer AntenaBase;
	public ModelRenderer Antena1;
	public ModelRenderer Antena2;
	public ModelRenderer Antena3;
	public ModelRenderer Antena4;
	public ModelRenderer Antena1_1;
	public ModelRenderer Antena2_1;
	public ModelRenderer Antena3_1;
	public ModelRenderer Antena4_1;

	public ModelKRW() {
		this.textureWidth = 64;
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.3F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Antena4 = new ModelRenderer(this, 0, 44);
		this.Antena4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4.addBox(-4.9F, -8.25F, -4.8F, 1, 1, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Antena3_1 = new ModelRenderer(this, 10, 44);
		this.Antena3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3_1.addBox(3.0F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 39, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.Antena1 = new ModelRenderer(this, 0, 44);
		this.Antena1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1.addBox(-2.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena1_1 = new ModelRenderer(this, 10, 44);
		this.Antena1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1_1.addBox(1.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.AntenaBase = new ModelRenderer(this, 36, 13);
		this.AntenaBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase.addBox(-1.0F, -5.5F, -4.8F, 2, 1, 1, 0.0F);
		this.Antena2 = new ModelRenderer(this, 0, 44);
		this.Antena2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2.addBox(-2.9F, -6.75F, -4.8F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Antena2, 0.0F, 0.0F, -0.012042771838760872F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.7F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Antena3 = new ModelRenderer(this, 0, 44);
		this.Antena3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3.addBox(-3.9F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.WindyStabilizer = new ModelRenderer(this, 57, 8);
		this.WindyStabilizer.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.WindyStabilizer.addBox(-2.0F, 0.0F, 1.5F, 2, 10, 1, 0.0F);
		this.setRotateAngle(WindyStabilizer, 0.17453292519943295F, 0.03490658503988659F, 0.3490658503988659F);
		this.Antena2_1 = new ModelRenderer(this, 10, 44);
		this.Antena2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2_1.addBox(2.0F, -6.75F, -4.8F, 1, 1, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 19, 33);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.Antena4_1 = new ModelRenderer(this, 10, 44);
		this.Antena4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4_1.addBox(4.0F, -8.25F, -4.8F, 1, 1, 1, 0.0F);
		this.Head.addChild(this.Antena4);
		this.Head.addChild(this.Antena3_1);
		this.Head.addChild(this.Antena1);
		this.Head.addChild(this.Antena1_1);
		this.Head.addChild(this.AntenaBase);
		this.Head.addChild(this.Antena2);
		this.Head.addChild(this.Antena3);
		this.Body.addChild(this.WindyStabilizer);
		this.Head.addChild(this.Antena2_1);
		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm.addChild(this.Shoulder_R);
		this.Head.addChild(this.Antena4_1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorKRW.DriverCheck==0||ArmorKRW.isInvisible==1) {
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
			this.RightLeg.render(f5);
			this.RightArm.render(f5);
			this.Head.render(f5);
			this.Body2.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.RightLeg.render(f5);
			this.RightArm.render(f5);
			this.Head.render(f5);
			this.Body2.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
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
			setAngle(Body2, this.bipedBody);
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
