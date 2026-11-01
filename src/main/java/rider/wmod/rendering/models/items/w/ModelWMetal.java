package rider.wmod.rendering.models.items.w;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.w.ArmorWMetal;

/**
 * ModelWMetal - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelWMetal extends ModelBiped {
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head;
	public ModelRenderer Body2;
	public ModelRenderer LeftMemory;
	public ModelRenderer driver;
	public ModelRenderer driverbase;
	public ModelRenderer Shoulder_L;
	public ModelRenderer AntenaBase;
	public ModelRenderer Antena1L;
	public ModelRenderer Antena2L;
	public ModelRenderer Antena3L;
	public ModelRenderer Antena4L;
	public ModelRenderer LeftMemorySide;

	public ModelWMetal() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.AntenaBase = new ModelRenderer(this, 36, 13);
		this.AntenaBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase.addBox(-1.0F, -5.5F, -4.8F, 2, 1, 1, 0.0F);
		this.driver = new ModelRenderer(this, 33, 0);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 9.5F, -3.35F, 2, 2, 1, 0.0F);
		this.driverbase = new ModelRenderer(this, 33, 8);
		this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase.addBox(-2.5F, 9.0F, -2.85F, 5, 2, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 39, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);

		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 19, 33);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);


		this.Antena1L = new ModelRenderer(this, 10, 44);
		this.Antena1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1L.addBox(1.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena2L = new ModelRenderer(this, 10, 44);
		this.Antena2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2L.addBox(2.0F, -6.75F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena3L = new ModelRenderer(this, 10, 44);
		this.Antena3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3L.addBox(3.0F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena4L = new ModelRenderer(this, 10, 44);
		this.Antena4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4L.addBox(4.0F, -8.25F, -4.8F, 1, 1, 1, 0.0F);

		this.LeftMemory = new ModelRenderer(this, 53, 0);
		this.LeftMemory.setRotationPoint(-0.5F, -1.0F, -0.3F);
		this.LeftMemory.addBox(17.0F, 9.5F, -3.0F, 2, 5, 1, 0.0F);
		this.setRotateAngle(LeftMemory, 0.0F, 0.0F, 0.7853981633974483F);
		this.LeftMemorySide = new ModelRenderer(this, 46, 8);
		this.LeftMemorySide.mirror = true;
		this.LeftMemorySide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftMemorySide.addBox(19.0F, 11.5F, -3.0F, 1, 3, 1, 0.0F);

		this.LeftArm.addChild(this.Shoulder_L);
		this.driver.addChild(this.driverbase);
		this.LeftMemory.addChild(this.LeftMemorySide);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorWMetal.DriverCheck>0 && ArmorWMetal.SoulSideCheck==1 && ArmorWMetal.isInvisible==0)
		{
			this.AntenaBase.showModel=true;
			this.Antena1L.showModel=true;
			this.Antena2L.showModel=true;
			this.Antena3L.showModel=true;
			this.Antena4L.showModel=true;

			this.Head.showModel=true;
			this.Body.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_L.showModel=true;
			this.Body2.showModel=true;

			if (entity.isSneaking())
			{
				this.driver.showModel=false;
				this.LeftMemory.showModel=false;
			}else {
				this.driver.showModel=true;
				this.LeftMemory.showModel=true;
			}

		}else{
			this.AntenaBase.showModel=false;
			this.Antena1L.showModel=false;
			this.Antena2L.showModel=false;
			this.Antena3L.showModel=false;
			this.Antena4L.showModel=false;

			this.Head.showModel=false;
			this.Body.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_L.showModel=false;
			this.Body2.showModel=false;

			this.driver.showModel=false;
			this.LeftMemory.showModel=false;
		}


		if (this.isChild) {
			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.driver.render(f5);
			this.Body2.render(f5);

			this.AntenaBase.render(f5);
			this.Antena1L.render(f5);
			this.Antena2L.render(f5);
			this.Antena3L.render(f5);
			this.Antena4L.render(f5);

			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeftMemory.offsetX, this.LeftMemory.offsetY, this.LeftMemory.offsetZ);
			GlStateManager.translate(this.LeftMemory.rotationPointX * f5, this.LeftMemory.rotationPointY * f5, this.LeftMemory.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.LeftMemory.offsetX, -this.LeftMemory.offsetY, -this.LeftMemory.offsetZ);
			GlStateManager.translate(-this.LeftMemory.rotationPointX * f5, -this.LeftMemory.rotationPointY * f5, -this.LeftMemory.rotationPointZ * f5);
			this.LeftMemory.render(f5);
			GlStateManager.popMatrix();
		}else {
			if (entity.isSneaking()) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Head.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.driver.render(f5);
			this.Body2.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.LeftMemory.offsetX, this.LeftMemory.offsetY, this.LeftMemory.offsetZ);
			GlStateManager.translate(this.LeftMemory.rotationPointX * f5, this.LeftMemory.rotationPointY * f5, this.LeftMemory.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.LeftMemory.offsetX, -this.LeftMemory.offsetY, -this.LeftMemory.offsetZ);
			GlStateManager.translate(-this.LeftMemory.rotationPointX * f5, -this.LeftMemory.rotationPointY * f5, -this.LeftMemory.rotationPointZ * f5);
			this.LeftMemory.render(f5);
			GlStateManager.popMatrix();

			this.AntenaBase.render(f5);
			this.Antena1L.render(f5);
			this.Antena2L.render(f5);
			this.Antena3L.render(f5);
			this.Antena4L.render(f5);

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
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(Body2, this.bipedBody);

			setAngle(AntenaBase, this.bipedHead);
			setAngle(Antena1L, this.bipedHead);
			setAngle(Antena2L, this.bipedHead);
			setAngle(Antena3L, this.bipedHead);
			setAngle(Antena4L, this.bipedHead);
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
