package rider.wmod.rendering.models.items.hibiki;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.hibiki.ArmorHibikiBody;

/**
 * ModelHibikiBody - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelHibikiBody extends ModelBiped {
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Body2;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer belt;
	public ModelRenderer driverbaseL1;
	public ModelRenderer ongekiko;
	public ModelRenderer driverbaseR1;
	public ModelRenderer driverbaseL2;
	public ModelRenderer ongekiko_backle;
	public ModelRenderer driverbaseR2;
	public ModelRenderer BodyflameL1;
	public ModelRenderer BodyflameL2;
	public ModelRenderer BodyflameL3;
	public ModelRenderer BodyflameR1;
	public ModelRenderer BodyflameR2;
	public ModelRenderer BodyflameR3;
	public ModelRenderer Bodyflamecenter;

	public ModelHibikiBody() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.driverbaseR1 = new ModelRenderer(this, 0, 43);
		this.driverbaseR1.mirror = true;
		this.driverbaseR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbaseR1.addBox(1.5F, 12.5F, -2.75F, 2, 2, 1, 0.0F);
		this.BodyflameL3 = new ModelRenderer(this, 20, 33);
		this.BodyflameL3.mirror = true;
		this.BodyflameL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyflameL3.addBox(-4.6F, 3.9F, -3.0F, 2, 1, 6, 0.26F);
		this.driverbaseL2 = new ModelRenderer(this, 8, 50);
		this.driverbaseL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbaseL2.addBox(-3.4F, 9.0F, -2.75F, 1, 1, 1, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.BodyflameR1 = new ModelRenderer(this, 20, 32);
		this.BodyflameR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyflameR1.addBox(2.8F, -0.1F, -3.0F, 1, 2, 6, 0.26F);
		this.driverbaseL1 = new ModelRenderer(this, 0, 43);
		this.driverbaseL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbaseL1.addBox(-3.5F, 12.5F, -2.5F, 2, 2, 1, 0.0F);
		this.BodyflameR3 = new ModelRenderer(this, 20, 33);
		this.BodyflameR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyflameR3.addBox(2.6F, 3.9F, -3.0F, 2, 1, 6, 0.26F);
		this.belt = new ModelRenderer(this, 16, 25);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.Bodyflamecenter = new ModelRenderer(this, 20, 40);
		this.Bodyflamecenter.mirror = true;
		this.Bodyflamecenter.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Bodyflamecenter.addBox(-1.0F, 3.3F, -3.0F, 2, 1, 6, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.BodyflameL1 = new ModelRenderer(this, 20, 32);
		this.BodyflameL1.mirror = true;
		this.BodyflameL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyflameL1.addBox(-3.8F, -0.1F, -3.0F, 1, 2, 6, 0.26F);
		this.BodyflameR2 = new ModelRenderer(this, 20, 33);
		this.BodyflameR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyflameR2.addBox(1.5F, 2.4F, -3.0F, 1, 1, 6, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.driverbaseR2 = new ModelRenderer(this, 8, 50);
		this.driverbaseR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbaseR2.addBox(2.5F, 9.0F, -2.75F, 1, 1, 1, 0.0F);
		this.ongekiko_backle = new ModelRenderer(this, 2, 53);
		this.ongekiko_backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ongekiko_backle.addBox(-1.5F, 12.0F, -2.5F, 3, 3, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 37, 34);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.5F, 8, 3, 5, 0.5F);
		this.BodyflameL2 = new ModelRenderer(this, 20, 33);
		this.BodyflameL2.mirror = true;
		this.BodyflameL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyflameL2.addBox(-2.5F, 2.4F, -3.0F, 1, 1, 6, 0.26F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.ongekiko = new ModelRenderer(this, 2, 49);
		this.ongekiko.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ongekiko.addBox(-1.5F, 12.0F, -3.0F, 3, 3, 1, 0.0F);
		this.RightArm.addChild(this.Shoulder_R);
		this.LeftArm.addChild(this.Shoulder_L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);


		if (ArmorHibikiBody.isInvisible==1||ArmorHibikiBody.isCrimson==1)
		{
			this.RightLeg.showModel=false;
			this.RightArm.showModel=false;
			this.Body.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Body2.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;
			this.belt.showModel=false;
			this.driverbaseL1.showModel=false;
			this.ongekiko.showModel=false;
			this.driverbaseR1.showModel=false;
			this.driverbaseL2.showModel=false;
			this.ongekiko_backle.showModel=false;
			this.driverbaseR2.showModel=false;
			this.BodyflameL1.showModel=false;
			this.BodyflameL2.showModel=false;
			this.BodyflameL3.showModel=false;
			this.BodyflameR1.showModel=false;
			this.BodyflameR2.showModel=false;
			this.BodyflameR3.showModel=false;
			this.Bodyflamecenter.showModel=false;
		}
		else
		{

			this.RightLeg.showModel=true;
			this.RightArm.showModel=true;
			this.Body.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Body2.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;
			this.BodyflameL1.showModel=true;
			this.BodyflameL2.showModel=true;
			this.BodyflameL3.showModel=true;
			this.BodyflameR1.showModel=true;
			this.BodyflameR2.showModel=true;
			this.BodyflameR3.showModel=true;
			this.Bodyflamecenter.showModel=true;

			if(ArmorHibikiBody.BeltCheck==1) {
				this.belt.showModel=false;
				this.driverbaseL1.showModel=false;
				this.driverbaseR1.showModel=false;
				this.driverbaseL2.showModel=false;
				this.ongekiko_backle.showModel=false;
				this.driverbaseR2.showModel=false;
			}
			else {
				this.belt.showModel=true;
				this.driverbaseL1.showModel=true;
				this.driverbaseR1.showModel=true;
				this.driverbaseL2.showModel=true;
				this.ongekiko_backle.showModel=true;
				this.driverbaseR2.showModel=true;
			}

			if(ArmorHibikiBody.HaveOngekiko==1||ArmorHibikiBody.BeltCheck==1) {
				this.ongekiko.showModel=false;
			}else {
				this.ongekiko.showModel=true;
			}
		}

		if (this.isChild) {
			this.RightArm.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.driverbaseR1.offsetX, this.driverbaseR1.offsetY, this.driverbaseR1.offsetZ);
			GlStateManager.translate(this.driverbaseR1.rotationPointX * f5, this.driverbaseR1.rotationPointY * f5, this.driverbaseR1.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.driverbaseR1.offsetX, -this.driverbaseR1.offsetY, -this.driverbaseR1.offsetZ);
			GlStateManager.translate(-this.driverbaseR1.rotationPointX * f5, -this.driverbaseR1.rotationPointY * f5, -this.driverbaseR1.rotationPointZ * f5);
			this.driverbaseR1.render(f5);
			GlStateManager.popMatrix();
			this.BodyflameL3.render(f5);
			this.driverbaseL2.render(f5);
			this.BodyflameR1.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.driverbaseL1.offsetX, this.driverbaseL1.offsetY, this.driverbaseL1.offsetZ);
			GlStateManager.translate(this.driverbaseL1.rotationPointX * f5, this.driverbaseL1.rotationPointY * f5, this.driverbaseL1.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.driverbaseL1.offsetX, -this.driverbaseL1.offsetY, -this.driverbaseL1.offsetZ);
			GlStateManager.translate(-this.driverbaseL1.rotationPointX * f5, -this.driverbaseL1.rotationPointY * f5, -this.driverbaseL1.rotationPointZ * f5);
			this.driverbaseL1.render(f5);
			GlStateManager.popMatrix();
			this.BodyflameR3.render(f5);
			this.belt.render(f5);
			this.Bodyflamecenter.render(f5);
			this.Body.render(f5);
			this.BodyflameL1.render(f5);
			this.BodyflameR2.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.driverbaseR2.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ongekiko_backle.offsetX, this.ongekiko_backle.offsetY, this.ongekiko_backle.offsetZ);
			GlStateManager.translate(this.ongekiko_backle.rotationPointX * f5, this.ongekiko_backle.rotationPointY * f5, this.ongekiko_backle.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.ongekiko_backle.offsetX, -this.ongekiko_backle.offsetY, -this.ongekiko_backle.offsetZ);
			GlStateManager.translate(-this.ongekiko_backle.rotationPointX * f5, -this.ongekiko_backle.rotationPointY * f5, -this.ongekiko_backle.rotationPointZ * f5);
			this.ongekiko_backle.render(f5);
			GlStateManager.popMatrix();
			this.Body2.render(f5);
			this.BodyflameL2.render(f5);
			this.LeftLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ongekiko.offsetX, this.ongekiko.offsetY, this.ongekiko.offsetZ);
			GlStateManager.translate(this.ongekiko.rotationPointX * f5, this.ongekiko.rotationPointY * f5, this.ongekiko.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.ongekiko.offsetX, -this.ongekiko.offsetY, -this.ongekiko.offsetZ);
			GlStateManager.translate(-this.ongekiko.rotationPointX * f5, -this.ongekiko.rotationPointY * f5, -this.ongekiko.rotationPointZ * f5);
			this.ongekiko.render(f5);
			GlStateManager.popMatrix();

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.RightArm.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.driverbaseR1.offsetX, this.driverbaseR1.offsetY, this.driverbaseR1.offsetZ);
			GlStateManager.translate(this.driverbaseR1.rotationPointX * f5, this.driverbaseR1.rotationPointY * f5, this.driverbaseR1.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.driverbaseR1.offsetX, -this.driverbaseR1.offsetY, -this.driverbaseR1.offsetZ);
			GlStateManager.translate(-this.driverbaseR1.rotationPointX * f5, -this.driverbaseR1.rotationPointY * f5, -this.driverbaseR1.rotationPointZ * f5);
			this.driverbaseR1.render(f5);
			GlStateManager.popMatrix();
			this.BodyflameL3.render(f5);
			this.driverbaseL2.render(f5);
			this.BodyflameR1.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.driverbaseL1.offsetX, this.driverbaseL1.offsetY, this.driverbaseL1.offsetZ);
			GlStateManager.translate(this.driverbaseL1.rotationPointX * f5, this.driverbaseL1.rotationPointY * f5, this.driverbaseL1.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.driverbaseL1.offsetX, -this.driverbaseL1.offsetY, -this.driverbaseL1.offsetZ);
			GlStateManager.translate(-this.driverbaseL1.rotationPointX * f5, -this.driverbaseL1.rotationPointY * f5, -this.driverbaseL1.rotationPointZ * f5);
			this.driverbaseL1.render(f5);
			GlStateManager.popMatrix();
			this.BodyflameR3.render(f5);
			this.belt.render(f5);
			this.Bodyflamecenter.render(f5);
			this.Body.render(f5);
			this.BodyflameL1.render(f5);
			this.BodyflameR2.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.driverbaseR2.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ongekiko_backle.offsetX, this.ongekiko_backle.offsetY, this.ongekiko_backle.offsetZ);
			GlStateManager.translate(this.ongekiko_backle.rotationPointX * f5, this.ongekiko_backle.rotationPointY * f5, this.ongekiko_backle.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.ongekiko_backle.offsetX, -this.ongekiko_backle.offsetY, -this.ongekiko_backle.offsetZ);
			GlStateManager.translate(-this.ongekiko_backle.rotationPointX * f5, -this.ongekiko_backle.rotationPointY * f5, -this.ongekiko_backle.rotationPointZ * f5);
			this.ongekiko_backle.render(f5);
			GlStateManager.popMatrix();
			this.Body2.render(f5);
			this.BodyflameL2.render(f5);
			this.LeftLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ongekiko.offsetX, this.ongekiko.offsetY, this.ongekiko.offsetZ);
			GlStateManager.translate(this.ongekiko.rotationPointX * f5, this.ongekiko.rotationPointY * f5, this.ongekiko.rotationPointZ * f5);
			GlStateManager.scale(0.7D, 0.7D, 1.0D);
			GlStateManager.translate(-this.ongekiko.offsetX, -this.ongekiko.offsetY, -this.ongekiko.offsetZ);
			GlStateManager.translate(-this.ongekiko.rotationPointX * f5, -this.ongekiko.rotationPointY * f5, -this.ongekiko.rotationPointZ * f5);
			this.ongekiko.render(f5);
			GlStateManager.popMatrix();

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
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(BodyflameL1, this.bipedBody);
			setAngle(BodyflameL2, this.bipedBody);
			setAngle(BodyflameL3, this.bipedBody);
			setAngle(BodyflameR1, this.bipedBody);
			setAngle(BodyflameR2, this.bipedBody);
			setAngle(BodyflameR3, this.bipedBody);
			setAngle(Bodyflamecenter, this.bipedBody);
			setAngle(belt, this.bipedBody);
			setAngle(driverbaseL1, this.bipedBody);
			setAngle(ongekiko, this.bipedBody);
			setAngle(driverbaseR1, this.bipedBody);
			setAngle(driverbaseL2, this.bipedBody);
			setAngle(ongekiko_backle, this.bipedBody);
			setAngle(driverbaseR2, this.bipedBody);

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
