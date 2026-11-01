package rider.wmod.rendering.models.items.ooo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.ooo.ArmorOOODriver;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;
import rider.wmod.items.armor.ooo.ArmorOOOTora;

/**
 * ModelOOOTora - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOOOTora extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer driver_toraN;
	public ModelRenderer driver_tora;

	public ModelRenderer BodyTora;
	public ModelRenderer RightArmTora;
	public ModelRenderer LeftArmTora;
	public ModelRenderer ShoulderTora_R;
	public ModelRenderer toracrowR;
	public ModelRenderer ShoulderTora_L;
	public ModelRenderer toracrowL;
	public ModelRenderer toracrowR2;
	public ModelRenderer toracrowL2;

	public ModelOOOTora() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.driver_tora = new ModelRenderer(this, 40, 4);
		this.driver_tora.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver_tora.addBox(-0.75F, 9.55F, -2.75F, 2, 2, 1, 0.0F);
		this.driver_toraN = new ModelRenderer(this, 40, 4);
		this.driver_toraN.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver_toraN.addBox(2.85F, 8.85F, -2.85F, 2, 2, 1, 0.0F);
		this.setRotateAngle(driver_toraN, 0.0F, 0.0F, 0.3490658503988659F);
		this.belt = new ModelRenderer(this, 32, 42);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 10.0F, -2.0F, 8, 1, 4, 0.27F);
		this.belt.addChild(this.driver_tora);
		this.belt.addChild(this.driver_toraN);

		this.BodyTora = new ModelRenderer(this, 16, 16);
		this.BodyTora.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyTora.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.RightArmTora = new ModelRenderer(this, 40, 16);
		this.RightArmTora.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArmTora.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArmTora = new ModelRenderer(this, 40, 16);
		this.LeftArmTora.mirror = true;
		this.LeftArmTora.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArmTora.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.ShoulderTora_R = new ModelRenderer(this, 0, 33);
		this.ShoulderTora_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShoulderTora_R.addBox(-3.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.ShoulderTora_L = new ModelRenderer(this, 0, 33);
		this.ShoulderTora_L.mirror = true;
		this.ShoulderTora_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShoulderTora_L.addBox(-0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.toracrowR = new ModelRenderer(this, 19, 33);
		this.toracrowR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toracrowR.addBox(-4.0F, 4.0F, -1.5F, 1, 5, 3, 0.0F);
		this.toracrowL = new ModelRenderer(this, 19, 33);
		this.toracrowL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toracrowL.addBox(3.0F, 4.0F, -1.5F, 1, 5, 3, 0.0F);
		this.toracrowL2 = new ModelRenderer(this, 19, 33);
		this.toracrowL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toracrowL2.addBox(3.5F, 3.5F, -1.5F, 1, 1, 3, 0.0F);
		this.toracrowR2 = new ModelRenderer(this, 19, 33);
		this.toracrowR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toracrowR2.addBox(-4.5F, 3.5F, -1.5F, 1, 1, 3, 0.0F);

		this.RightArmTora.addChild(this.toracrowR);
		this.LeftArmTora.addChild(this.toracrowL);
		this.RightArmTora.addChild(this.ShoulderTora_R);
		this.LeftArmTora.addChild(this.ShoulderTora_L);
		this.LeftArmTora.addChild(this.toracrowL2);
		this.RightArmTora.addChild(this.toracrowR2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorOOOTora.DriverCheck==1 && ArmorOOOTora.isInvisible==0){
			if(ArmorOOODriver.ThreeMedalsIn==1)
			{
				this.driver_toraN.showModel=true;
				this.driver_tora.showModel=false;
				this.BodyTora.showModel=false;
				this.RightArmTora.showModel=false;
				this.LeftArmTora.showModel=false;
			}
			else if(ArmorOOODriver2.ThreeMedalsIn2==1)
			{
				this.driver_toraN.showModel=true;
				this.driver_tora.showModel=false;
				this.BodyTora.showModel=true;
				this.RightArmTora.showModel=true;
				this.LeftArmTora.showModel=true;
			}
			else
			{
				this.driver_toraN.showModel=false;
				this.driver_tora.showModel=true;
				this.BodyTora.showModel=false;
				this.RightArmTora.showModel=false;
				this.LeftArmTora.showModel=false;
			}
		}
		else
		{
			this.driver_tora.showModel=false;
			this.driver_toraN.showModel=false;
			this.BodyTora.showModel=false;
			this.RightArmTora.showModel=false;
			this.LeftArmTora.showModel=false;
		}

		if (this.isChild)
		{
			this.belt.render(f5);
			this.BodyTora.render(f5);
			this.LeftArmTora.render(f5);
			this.RightArmTora.render(f5);
		}
		else
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.belt.render(f5);
			this.BodyTora.render(f5);
			this.LeftArmTora.render(f5);
			this.RightArmTora.render(f5);

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
			setAngle(BodyTora, this.bipedBody);
			setAngle(RightArmTora, this.bipedRightArm);
			setAngle(LeftArmTora, this.bipedLeftArm);
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
