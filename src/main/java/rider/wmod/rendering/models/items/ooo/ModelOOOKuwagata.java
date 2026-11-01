package rider.wmod.rendering.models.items.ooo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.ooo.ArmorOOODriver;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;
import rider.wmod.items.armor.ooo.ArmorOOOKuwagata;

/**
 * ModelOOOKuwagata - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOOOKuwagata extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer driver_kuwaN;
	public ModelRenderer driver_kuwa;

	public ModelRenderer HeadKuwa;
	public ModelRenderer KuwaHornR1;
	public ModelRenderer KuwaHornL1;
	public ModelRenderer KuwaHornR2;
	public ModelRenderer KuwaHornL2;
	public ModelRenderer KuwaHornR3;
	public ModelRenderer KuwaHornL3;
	public ModelRenderer BodyKuwa;

	public ModelOOOKuwagata() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.belt = new ModelRenderer(this, 32, 42);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 10.0F, -2.0F, 8, 1, 4, 0.27F);
		this.driver_kuwaN = new ModelRenderer(this, 35, 4);
		this.driver_kuwaN.setRotationPoint(0.0F, 0.0F, -0.1F);
		this.driver_kuwaN.addBox(0.85F, 8.85F, -2.75F, 2, 2, 1, 0.0F);
		this.setRotateAngle(driver_kuwaN, 0.0F, 0.0F, 0.3490658503988659F);
		this.driver_kuwa = new ModelRenderer(this, 35, 4);
		this.driver_kuwa.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver_kuwa.addBox(-2.75F, 9.55F, -2.75F, 2, 2, 1, 0.0F);
		this.belt.addChild(this.driver_kuwaN);
		this.belt.addChild(this.driver_kuwa);

		this.KuwaHornR3 = new ModelRenderer(this, 26, 0);
		this.KuwaHornR3.setRotationPoint(-5.5F, -10.5F, -5.5F);
		this.KuwaHornR3.addBox(3.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
		this.BodyKuwa = new ModelRenderer(this, 16, 16);
		this.BodyKuwa.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyKuwa.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.KuwaHornL3 = new ModelRenderer(this, 26, 0);
		this.KuwaHornL3.mirror = true;
		this.KuwaHornL3.setRotationPoint(7.5F, -10.5F, -5.5F);
		this.KuwaHornL3.addBox(-6.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
		this.KuwaHornL2 = new ModelRenderer(this, 25, 1);
		this.KuwaHornL2.mirror = true;
		this.KuwaHornL2.setRotationPoint(7.5F, -9.5F, -5.5F);
		this.KuwaHornL2.addBox(-6.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F);
		this.KuwaHornL1 = new ModelRenderer(this, 24, 2);
		this.KuwaHornL1.mirror = true;
		this.KuwaHornL1.setRotationPoint(7.5F, -8.5F, -5.5F);
		this.KuwaHornL1.addBox(-6.0F, -2.0F, 1.0F, 3, 2, 2, 0.0F);
		this.KuwaHornR2 = new ModelRenderer(this, 25, 1);
		this.KuwaHornR2.setRotationPoint(-6.5F, -9.5F, -5.5F);
		this.KuwaHornR2.addBox(3.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F);
		this.HeadKuwa = new ModelRenderer(this, 0, 0);
		this.HeadKuwa.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadKuwa.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.KuwaHornR1 = new ModelRenderer(this, 24, 2);
		this.KuwaHornR1.setRotationPoint(-7.4F, -8.5F, -5.5F);
		this.KuwaHornR1.addBox(3.0F, -2.0F, 1.0F, 3, 2, 2, 0.0F);

		this.HeadKuwa.addChild(this.KuwaHornL1);
		this.HeadKuwa.addChild(this.KuwaHornL2);
		this.HeadKuwa.addChild(this.KuwaHornL3);
		this.HeadKuwa.addChild(this.KuwaHornR1);
		this.HeadKuwa.addChild(this.KuwaHornR2);
		this.HeadKuwa.addChild(this.KuwaHornR3);
	}


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorOOOKuwagata.DriverCheck==1 && ArmorOOOKuwagata.isInvisible==0)
		{
			if(ArmorOOODriver.ThreeMedalsIn==1)
			{
				this.driver_kuwaN.showModel=true;
				this.driver_kuwa.showModel=false;
				this.HeadKuwa.showModel=false;
				this.BodyKuwa.showModel=false;
			}
			else if(ArmorOOODriver2.ThreeMedalsIn2==1)
			{
				this.driver_kuwaN.showModel=true;
				this.driver_kuwa.showModel=false;
				this.HeadKuwa.showModel=true;
				this.BodyKuwa.showModel=true;
			}
			else
			{
				this.driver_kuwaN.showModel=false;
				this.driver_kuwa.showModel=true;
				this.HeadKuwa.showModel=false;
				this.BodyKuwa.showModel=false;
			}
		}
		else
		{
			this.driver_kuwa.showModel=false;
			this.driver_kuwaN.showModel=false;
			this.HeadKuwa.showModel=false;
			this.BodyKuwa.showModel=false;
		}

		if (this.isChild)
		{
			this.belt.render(f5);
			this.HeadKuwa.render(f5);
			this.BodyKuwa.render(f5);
		}
		else
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.belt.render(f5);
			this.HeadKuwa.render(f5);
			this.BodyKuwa.render(f5);

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
			setAngle(HeadKuwa, this.bipedHead);
			setAngle(BodyKuwa, this.bipedBody);
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
