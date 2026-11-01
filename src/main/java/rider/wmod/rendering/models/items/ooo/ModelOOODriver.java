package rider.wmod.rendering.models.items.ooo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.ooo.ArmorOOODriver;

/**
 * ModelOOODriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOOODriver extends ModelBiped {

	public ModelRenderer HeadTaka;
	public ModelRenderer TakaSideR;
	public ModelRenderer TakaSideL;
	public ModelRenderer BodyTaka;

	public ModelRenderer HeadKuwa;
	public ModelRenderer KuwaHornR1;
	public ModelRenderer KuwaHornL1;
	public ModelRenderer KuwaHornR2;
	public ModelRenderer KuwaHornL2;
	public ModelRenderer KuwaHornR3;
	public ModelRenderer KuwaHornL3;
	public ModelRenderer BodyKuwa;

	public ModelRenderer BodyTora;
	public ModelRenderer RightArmTora;
	public ModelRenderer LeftArmTora;
	public ModelRenderer ShoulderTora_R;
	public ModelRenderer toracrowR;
	public ModelRenderer ShoulderTora_L;
	public ModelRenderer toracrowL;
	public ModelRenderer toracrowR2;
	public ModelRenderer toracrowL2;

	public ModelRenderer BodyKama;
	public ModelRenderer RightArmKama;
	public ModelRenderer LeftArmKama;
	public ModelRenderer ShoulderKama_R;
	public ModelRenderer kamaswordR;
	public ModelRenderer kamaswordR2;
	public ModelRenderer ShoulderKama_L;
	public ModelRenderer kamaswordL;
	public ModelRenderer kamaswordL2;

	public ModelRenderer BodyBatta;
	public ModelRenderer RightLegBatta;
	public ModelRenderer LeftLegBatta;

	public ModelRenderer belt;
	public ModelRenderer driverbase;
	public ModelRenderer driver1;
	public ModelRenderer driver2;
	public ModelRenderer driver3;
	public ModelRenderer driverbase2;
	public ModelRenderer driverbase3;

	public ModelOOODriver() {
		this.textureWidth = 256;
		this.textureHeight = 256;
		this.belt = new ModelRenderer(this, 32, 37);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 10.0F, -2.0F, 8, 1, 4, 0.27F);
		this.driverbase = new ModelRenderer(this, 34, 9);
		this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase.addBox(-2.5F, 9.5F, -2.5F, 5, 2, 1, 0.0F);
		this.driverbase2 = new ModelRenderer(this, 34, 13);
		this.driverbase2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase2.addBox(-1.0F, 9.0F, -2.4F, 2, 1, 1, 0.0F);
		this.driverbase3 = new ModelRenderer(this, 34, 13);
		this.driverbase3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase3.addBox(-1.0F, 11.0F, -2.4F, 2, 1, 1, 0.0F);
		this.driver1 = new ModelRenderer(this, 35, 0);
		this.driver1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver1.addBox(-2.75F, 9.55F, -2.75F, 2, 2, 1, 0.0F);
		this.driver2 = new ModelRenderer(this, 40, 0);
		this.driver2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver2.addBox(-0.75F, 9.55F, -2.75F, 2, 2, 1, 0.0F);
		this.driver3 = new ModelRenderer(this, 45, 0);
		this.driver3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver3.addBox(1.25F, 9.55F, -2.75F, 2, 2, 1, 0.0F);

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

		this.KuwaHornR3 = new ModelRenderer(this, 82, 0);
		this.KuwaHornR3.setRotationPoint(-5.5F, -10.5F, -5.5F);
		this.KuwaHornR3.addBox(3.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
		this.BodyKuwa = new ModelRenderer(this, 72, 16);
		this.BodyKuwa.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyKuwa.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.KuwaHornL3 = new ModelRenderer(this, 82, 0);
		this.KuwaHornL3.mirror = true;
		this.KuwaHornL3.setRotationPoint(7.5F, -10.5F, -5.5F);
		this.KuwaHornL3.addBox(-6.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
		this.KuwaHornL2 = new ModelRenderer(this, 81, 1);
		this.KuwaHornL2.mirror = true;
		this.KuwaHornL2.setRotationPoint(7.5F, -9.5F, -5.5F);
		this.KuwaHornL2.addBox(-6.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F);
		this.KuwaHornL1 = new ModelRenderer(this, 80, 2);
		this.KuwaHornL1.mirror = true;
		this.KuwaHornL1.setRotationPoint(7.5F, -8.5F, -5.5F);
		this.KuwaHornL1.addBox(-6.0F, -2.0F, 1.0F, 3, 2, 2, 0.0F);
		this.KuwaHornR2 = new ModelRenderer(this, 81, 1);
		this.KuwaHornR2.setRotationPoint(-6.5F, -9.5F, -5.5F);
		this.KuwaHornR2.addBox(3.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F);
		this.HeadKuwa = new ModelRenderer(this, 56, 0);
		this.HeadKuwa.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadKuwa.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.KuwaHornR1 = new ModelRenderer(this, 80, 2);
		this.KuwaHornR1.setRotationPoint(-7.4F, -8.5F, -5.5F);
		this.KuwaHornR1.addBox(3.0F, -2.0F, 1.0F, 3, 2, 2, 0.0F);

		this.BodyTora = new ModelRenderer(this, 0, 43);
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


		this.BodyKama = new ModelRenderer(this, 56, 43);
		this.BodyKama.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyKama.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.LeftArmKama = new ModelRenderer(this, 96, 16);
		this.LeftArmKama.mirror = true;
		this.LeftArmKama.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArmKama.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArmKama = new ModelRenderer(this, 96, 16);
		this.RightArmKama.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArmKama.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.ShoulderKama_L = new ModelRenderer(this, 56, 33);
		this.ShoulderKama_L.mirror = true;
		this.ShoulderKama_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShoulderKama_L.addBox(-0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.ShoulderKama_R = new ModelRenderer(this, 56, 33);
		this.ShoulderKama_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShoulderKama_R.addBox(-3.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.kamaswordL = new ModelRenderer(this, 76, 36);
		this.kamaswordL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.kamaswordL.addBox(0.0F, 3.65F, 2.25F, 2, 5, 1, 0.0F);
		this.kamaswordR = new ModelRenderer(this, 76, 36);
		this.kamaswordR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.kamaswordR.addBox(-2.0F, 3.65F, 2.25F, 2, 5, 1, 0.0F);
		this.kamaswordL2 = new ModelRenderer(this, 85, 32);
		this.kamaswordL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.kamaswordL2.addBox(0.5F, -0.35F, 3.0F, 1, 8, 2, 0.0F);
		this.kamaswordR2 = new ModelRenderer(this, 85, 32);
		this.kamaswordR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.kamaswordR2.addBox(-1.5F, -0.35F, 3.0F, 1, 8, 2, 0.0F);

		this.BodyBatta = new ModelRenderer(this, 25, 43);
		this.BodyBatta.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyBatta.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.RightLegBatta = new ModelRenderer(this, 0, 16);
		this.RightLegBatta.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLegBatta.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftLegBatta = new ModelRenderer(this, 0, 16);
		this.LeftLegBatta.mirror = true;
		this.LeftLegBatta.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLegBatta.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);

		this.belt.addChild(this.driverbase);
		this.driverbase.addChild(this.driverbase2);
		this.driverbase.addChild(this.driverbase3);
		this.belt.addChild(this.driver1);
		this.belt.addChild(this.driver2);
		this.belt.addChild(this.driver3);


		this.HeadTaka.addChild(this.TakaSideL);
		this.HeadTaka.addChild(this.TakaSideR);

		this.RightArmTora.addChild(this.toracrowR);
		this.LeftArmTora.addChild(this.toracrowL);
		this.RightArmTora.addChild(this.ShoulderTora_R);
		this.LeftArmTora.addChild(this.ShoulderTora_L);
		this.LeftArmTora.addChild(this.toracrowL2);
		this.RightArmTora.addChild(this.toracrowR2);

		this.HeadKuwa.addChild(this.KuwaHornL1);
		this.HeadKuwa.addChild(this.KuwaHornL2);
		this.HeadKuwa.addChild(this.KuwaHornL3);
		this.HeadKuwa.addChild(this.KuwaHornR1);
		this.HeadKuwa.addChild(this.KuwaHornR2);
		this.HeadKuwa.addChild(this.KuwaHornR3);
		this.LeftArmKama.addChild(this.ShoulderKama_L);
		this.RightArmKama.addChild(this.ShoulderKama_R);
		this.LeftArmKama.addChild(this.kamaswordL);
		this.RightArmKama.addChild(this.kamaswordR);
		this.RightArmKama.addChild(this.kamaswordR2);
		this.LeftArmKama.addChild(this.kamaswordL2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (entity.isSneaking()||ArmorOOODriver.isInvisible==1)
		{
			this.belt.showModel=false;
		}else {
			this.belt.showModel=true;
		}

		if(ArmorOOODriver.HeadMedalIn==1) {
			this.driver1.showModel=false;
		}else {
			this.driver1.showModel=true;
		}
		if(ArmorOOODriver.BodyMedalIn==1) {
			this.driver2.showModel=false;
		}else {
			this.driver2.showModel=true;
		}
		if(ArmorOOODriver.LegMedalIn==1) {
			this.driver3.showModel=false;
		}else {
			this.driver3.showModel=true;
		}

		if(ArmorOOODriver.MedalCheckTaka==1 && ArmorOOODriver.ThreeMedalsIn==1 && ArmorOOODriver.isInvisible==0) {
			this.HeadTaka.showModel=true;
			this.BodyTaka.showModel=true;
		}else {
			this.HeadTaka.showModel=false;
			this.BodyTaka.showModel=false;
		}
		if(ArmorOOODriver.MedalCheckKuwa==1 && ArmorOOODriver.ThreeMedalsIn==1 && ArmorOOODriver.isInvisible==0) {
			this.HeadKuwa.showModel=true;
			this.BodyKuwa.showModel=true;
		}else {
			this.HeadKuwa.showModel=false;
			this.BodyKuwa.showModel=false;
		}

		if(ArmorOOODriver.MedalCheckTora==1 && ArmorOOODriver.ThreeMedalsIn==1 && ArmorOOODriver.isInvisible==0) {
			this.BodyTora.showModel=true;
			this.RightArmTora.showModel=true;
			this.LeftArmTora.showModel=true;
		}else {
			this.BodyTora.showModel=false;
			this.RightArmTora.showModel=false;
			this.LeftArmTora.showModel=false;
		}

		if(ArmorOOODriver.MedalCheckKama==1 && ArmorOOODriver.ThreeMedalsIn==1 && ArmorOOODriver.isInvisible==0) {
			this.BodyKama.showModel=true;
			this.RightArmKama.showModel=true;
			this.LeftArmKama.showModel=true;
		}else {
			this.BodyKama.showModel=false;
			this.RightArmKama.showModel=false;
			this.LeftArmKama.showModel=false;
		}

		if(ArmorOOODriver.MedalCheckBatta==1 && ArmorOOODriver.ThreeMedalsIn==1 && ArmorOOODriver.isInvisible==0) {
			this.BodyBatta.showModel=true;
			this.RightLegBatta.showModel=true;
			this.LeftLegBatta.showModel=true;
		}else {
			this.BodyBatta.showModel=false;
			this.RightLegBatta.showModel=false;
			this.LeftLegBatta.showModel=false;
		}

		if (this.isChild)
		{
			this.belt.render(f5);
			this.HeadTaka.render(f5);
			this.HeadKuwa.render(f5);
			this.LeftArmTora.render(f5);
			this.RightArmTora.render(f5);
			this.LeftArmKama.render(f5);
			this.RightArmKama.render(f5);
			this.RightLegBatta.render(f5);
			this.LeftLegBatta.render(f5);

			this.BodyTaka.render(f5);
			this.BodyBatta.render(f5);
			this.BodyTora.render(f5);
			this.BodyKuwa.render(f5);
			this.BodyKama.render(f5);
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
			this.HeadKuwa.render(f5);
			this.LeftArmTora.render(f5);
			this.RightArmTora.render(f5);
			this.LeftArmKama.render(f5);
			this.RightArmKama.render(f5);
			this.RightLegBatta.render(f5);
			this.LeftLegBatta.render(f5);

			this.BodyTaka.render(f5);
			this.BodyBatta.render(f5);
			this.BodyTora.render(f5);
			this.BodyKuwa.render(f5);
			this.BodyKama.render(f5);

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

		setAngle(HeadTaka, this.bipedHead);
		setAngle(HeadKuwa, this.bipedHead);
		setAngle(BodyTaka, this.bipedBody);
		setAngle(BodyTora, this.bipedBody);
		setAngle(BodyBatta, this.bipedBody);
		setAngle(BodyKuwa, this.bipedBody);
		setAngle(BodyKama, this.bipedBody);

		setAngle(RightArmTora, this.bipedRightArm);
		setAngle(LeftArmTora, this.bipedLeftArm);
		setAngle(RightArmKama, this.bipedRightArm);
		setAngle(LeftArmKama, this.bipedLeftArm);

		setAngle(RightLegBatta, this.bipedRightLeg);
		setAngle(LeftLegBatta, this.bipedLeftLeg);

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
