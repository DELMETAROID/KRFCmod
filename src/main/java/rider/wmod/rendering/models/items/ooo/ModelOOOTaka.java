package rider.wmod.rendering.models.items.ooo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.ooo.ArmorOOODriver;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;
import rider.wmod.items.armor.ooo.ArmorOOOTaka;

/**
 * ModelOOOTaka - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOOOTaka extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer driver_takaN;
	public ModelRenderer driver_taka;

	public ModelRenderer HeadTaka;
	public ModelRenderer TakaSideR;
	public ModelRenderer TakaSideL;
	public ModelRenderer BodyTaka;

	public ModelOOOTaka() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.belt = new ModelRenderer(this, 32, 42);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 10.0F, -2.0F, 8, 1, 4, 0.27F);
		this.driver_takaN = new ModelRenderer(this, 35, 4);
		this.driver_takaN.setRotationPoint(0.0F, 0.0F, -0.1F);
		this.driver_takaN.addBox(0.85F, 8.85F, -2.75F, 2, 2, 1, 0.0F);
		this.setRotateAngle(driver_takaN, 0.0F, 0.0F, 0.3490658503988659F);
		this.driver_taka = new ModelRenderer(this, 35, 4);
		this.driver_taka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver_taka.addBox(-2.75F, 9.55F, -2.75F, 2, 2, 1, 0.0F);
		this.belt.addChild(this.driver_takaN);
		this.belt.addChild(this.driver_taka);

		this.HeadTaka = new ModelRenderer(this, 0, 0);
		this.HeadTaka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadTaka.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.BodyTaka = new ModelRenderer(this, 16, 16);
		this.BodyTaka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyTaka.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.TakaSideL = new ModelRenderer(this, 30, 0);
		this.TakaSideL.setRotationPoint(7.5F, -6.75F, -3.5F);
		this.TakaSideL.addBox(-3.0F, -2.0F, 1.0F, 1, 4, 1, 0.0F);
		this.setRotateAngle(TakaSideL, 0.0F, -0.6108652381980153F, 0.0F);
		this.TakaSideR = new ModelRenderer(this, 30, 0);
		this.TakaSideR.mirror = true;
		this.TakaSideR.setRotationPoint(-7.5F, -6.75F, -3.5F);
		this.TakaSideR.addBox(2.0F, -2.0F, 1.0F, 1, 4, 1, 0.0F);
		this.setRotateAngle(TakaSideR, 0.0F, 0.6108652381980153F, 0.0F);

		this.HeadTaka.addChild(this.TakaSideL);
		this.HeadTaka.addChild(this.TakaSideR);
	}


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorOOOTaka.DriverCheck==1&&ArmorOOOTaka.isInvisible==0)
		{
			if(ArmorOOODriver.ThreeMedalsIn==1)
			{
				this.driver_takaN.showModel=true;
				this.driver_taka.showModel=false;
				this.HeadTaka.showModel=false;
				this.BodyTaka.showModel=false;
			}
			else if(ArmorOOODriver2.ThreeMedalsIn2==1)
			{
				this.driver_takaN.showModel=true;
				this.driver_taka.showModel=false;
				this.HeadTaka.showModel=true;
				this.BodyTaka.showModel=true;
			}
			else
			{
				this.driver_takaN.showModel=false;
				this.driver_taka.showModel=true;
				this.HeadTaka.showModel=false;
				this.BodyTaka.showModel=false;
			}
		}
		else
		{
			this.driver_taka.showModel=false;
			this.driver_takaN.showModel=false;
			this.HeadTaka.showModel=false;
			this.BodyTaka.showModel=false;
		}

		if (this.isChild)
		{
			this.belt.render(f5);
			this.HeadTaka.render(f5);
			this.BodyTaka.render(f5);
		}
		else
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.belt.render(f5);
			this.HeadTaka.render(f5);
			this.BodyTaka.render(f5);

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
			setAngle(belt, this.bipedBody);
			setAngle(HeadTaka, this.bipedHead);
			setAngle(BodyTaka, this.bipedBody);
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
