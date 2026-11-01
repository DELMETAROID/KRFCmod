package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRKabuto;

/**
 * ModelKRKabuto - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKRKabuto extends ModelBiped {
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer Body2;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer AntenaBase;
	public ModelRenderer UpHorn;
	public ModelRenderer AntenaBase2;
	public ModelRenderer AntenaBase3;
	public ModelRenderer AntenaBase4;
	public ModelRenderer AntenaBase5;
	public ModelRenderer AntenaBase6;
	public ModelRenderer AntenaBase7;
	public ModelRenderer AntenaBase8;
	public ModelRenderer Antena2;
	public ModelRenderer AntenaShape1L;
	public ModelRenderer AntenaShape2L;
	public ModelRenderer AntenaShape3L;
	public ModelRenderer AntenaShape1R;
	public ModelRenderer AntenaShape2R;
	public ModelRenderer AntenaShape3R;
	public ModelRenderer AntenaShape4L;
	public ModelRenderer AntenaShape4R;
	public ModelRenderer AntenaShape5R;
	public ModelRenderer AntenaShape5L;
	public ModelRenderer UpHorn2;
	public ModelRenderer Antena1R;
	public ModelRenderer Antena1L;
	public ModelRenderer Antena1Centor;
	public ModelRenderer AntenaBase9;

	public ModelKRKabuto() {

		this.textureWidth = 64;
		this.textureHeight = 64;
		this.AntenaShape3L = new ModelRenderer(this, 0, 41);
		this.AntenaShape3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape3L.addBox(2.5F, -4.5F, -4.25F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape3L, 0.0F, 0.6108652381980153F, 0.0F);

		this.Antena1L = new ModelRenderer(this, 18, 33);
		this.Antena1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1L.addBox(1.0F, -10.7F, -7.5F, 2, 1, 1, 0.0F);
		this.AntenaBase6 = new ModelRenderer(this, 0, 42);
		this.AntenaBase6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase6.addBox(-0.5F, -4.5F, -6.0F, 1, 1, 2, 0.0F);
		this.AntenaShape2R = new ModelRenderer(this, 0, 42);
		this.AntenaShape2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape2R.addBox(-3.75F, -5.5F, -4.5F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape2R, 0.0F, -0.6108652381980153F, 0.0F);
		this.Antena1R = new ModelRenderer(this, 18, 33);
		this.Antena1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1R.addBox(-3.0F, -10.7F, -7.5F, 2, 1, 1, 0.0F);
		this.AntenaShape2L = new ModelRenderer(this, 0, 42);
		this.AntenaShape2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape2L.addBox(2.75F, -5.5F, -4.75F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape2L, 0.0F, 0.6108652381980153F, 0.0F);
		this.UpHorn = new ModelRenderer(this, 24, 0);
		this.UpHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.UpHorn.addBox(-0.5F, -9.5F, -2.5F, 1, 1, 2, 0.0F);
		this.AntenaBase9 = new ModelRenderer(this, 0, 42);
		this.AntenaBase9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase9.addBox(-0.5F, -1.6F, -5.25F, 1, 2, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.25F, -2.5F, -2.5F, 5, 4, 5, 0.0F);
		this.Antena2 = new ModelRenderer(this, 20, 35);
		this.Antena2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2.addBox(-1.5F, -9.5F, -7.25F, 3, 1, 1, 0.0F);
		this.AntenaShape4L = new ModelRenderer(this, 0, 41);
		this.AntenaShape4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape4L.addBox(2.25F, -3.5F, -4.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape4L, 0.0F, 0.6108652381980153F, 0.0F);
		this.AntenaBase5 = new ModelRenderer(this, 0, 41);
		this.AntenaBase5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase5.addBox(-0.5F, -5.5F, -6.25F, 1, 1, 2, 0.0F);
		this.AntenaBase8 = new ModelRenderer(this, 0, 42);
		this.AntenaBase8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase8.addBox(-0.5F, -2.5F, -5.5F, 1, 1, 1, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.5F, -2.5F, 5, 4, 5, 0.0F);
		this.UpHorn2 = new ModelRenderer(this, 24, 0);
		this.UpHorn2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.UpHorn2.addBox(-0.5F, -10.0F, -3.0F, 1, 1, 2, 0.0F);
		this.Body2 = new ModelRenderer(this, 39, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.6F, 8, 3, 4, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.AntenaShape1L = new ModelRenderer(this, 0, 42);
		this.AntenaShape1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape1L.addBox(3.0F, -6.5F, -5.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(AntenaShape1L, 0.0F, 0.6108652381980153F, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.setRotateAngle(Head, 0.0F, -0.0030636248309382106F, 0.0F);
		this.AntenaShape4R = new ModelRenderer(this, 0, 42);
		this.AntenaShape4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape4R.addBox(-3.25F, -3.5F, -4.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape4R, 0.0F, -0.6108652381980153F, 0.0F);
		this.AntenaBase4 = new ModelRenderer(this, 0, 42);
		this.AntenaBase4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase4.addBox(-0.5F, -6.5F, -6.5F, 1, 1, 2, 0.0F);
		this.AntenaBase = new ModelRenderer(this, 0, 46);
		this.AntenaBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase.addBox(-1.0F, -0.25F, -5.0F, 2, 1, 1, 0.0F);
		this.AntenaShape1R = new ModelRenderer(this, 0, 42);
		this.AntenaShape1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape1R.addBox(-4.0F, -6.5F, -5.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(AntenaShape1R, 0.0F, -0.6108652381980153F, 0.0F);
		this.AntenaBase2 = new ModelRenderer(this, 0, 42);
		this.AntenaBase2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase2.addBox(-1.0F, -8.5F, -7.0F, 2, 1, 1, 0.0F);
		this.AntenaShape5L = new ModelRenderer(this, 0, 42);
		this.AntenaShape5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape5L.addBox(2.75F, -7.5F, -4.75F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape5L, 0.0F, 0.6108652381980153F, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.AntenaShape3R = new ModelRenderer(this, 0, 42);
		this.AntenaShape3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape3R.addBox(-3.5F, -4.5F, -4.25F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape3R, 0.0F, -0.6108652381980153F, 0.0F);
		this.AntenaShape5R = new ModelRenderer(this, 0, 42);
		this.AntenaShape5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaShape5R.addBox(-3.75F, -7.5F, -4.5F, 1, 1, 2, 0.0F);
		this.setRotateAngle(AntenaShape5R, 0.0F, -0.6108652381980153F, 0.0F);
		this.AntenaBase3 = new ModelRenderer(this, 0, 42);
		this.AntenaBase3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase3.addBox(-0.5F, -7.5F, -6.75F, 1, 1, 3, 0.0F);
		this.Antena1Centor = new ModelRenderer(this, 24, 33);
		this.Antena1Centor.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1Centor.addBox(-1.0F, -10.5F, -7.5F, 2, 1, 1, 0.0F);
		this.AntenaBase7 = new ModelRenderer(this, 0, 42);
		this.AntenaBase7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase7.addBox(-0.5F, -3.5F, -5.75F, 1, 1, 2, 0.0F);

		this.AntenaBase.addChild(this.AntenaShape3L);
		this.AntenaBase2.addChild(this.Antena1L);
		this.Head.addChild(this.AntenaBase6);
		this.AntenaBase.addChild(this.AntenaShape2R);
		this.AntenaBase2.addChild(this.Antena1R);
		this.AntenaBase.addChild(this.AntenaShape2L);
		this.Head.addChild(this.UpHorn);
		this.AntenaBase2.addChild(this.AntenaBase9);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Head.addChild(this.Antena2);
		this.AntenaBase.addChild(this.AntenaShape4L);
		this.Head.addChild(this.AntenaBase5);
		this.Head.addChild(this.AntenaBase8);
		this.RightArm.addChild(this.Shoulder_R);
		this.UpHorn.addChild(this.UpHorn2);
		this.AntenaBase.addChild(this.AntenaShape1L);
		this.AntenaBase.addChild(this.AntenaShape4R);
		this.Head.addChild(this.AntenaBase4);
		this.Head.addChild(this.AntenaBase);
		this.AntenaBase.addChild(this.AntenaShape1R);
		this.Head.addChild(this.AntenaBase2);
		this.AntenaBase.addChild(this.AntenaShape5L);
		this.AntenaBase.addChild(this.AntenaShape3R);
		this.AntenaBase.addChild(this.AntenaShape5R);
		this.Head.addChild(this.AntenaBase3);
		this.AntenaBase2.addChild(this.Antena1Centor);
		this.Head.addChild(this.AntenaBase7);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorKRKabuto.DriverCheck==1 && ArmorKRKabuto.isInvisible==0)
		{
			this. Head.showModel=true;
			this. Body.showModel=true;
			this. Body2.showModel=true;
			this. RightArm.showModel=true;
			this. LeftArm.showModel=true;
			this. RightLeg.showModel=true;
			this. LeftLeg.showModel=true;


			this. AntenaBase.showModel=true;
			this. UpHorn.showModel=true;
			this. AntenaBase2.showModel=true;
			this. AntenaBase3.showModel=true;
			this. AntenaBase4.showModel=true;
			this. AntenaBase5.showModel=true;
			this. AntenaBase6.showModel=true;
			this. AntenaBase7.showModel=true;
			this. AntenaBase8.showModel=true;
			this. Antena2.showModel=true;

		}
		else
		{
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.RightArm.showModel=false;
			this.LeftArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftLeg.showModel=false;
		}

		if (this.isChild)
		{
			this.Head.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.Body2.render(f5);
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Head.render(f5);
			this.RightLeg.render(f5);
			this.Body2.render(f5);
			this.LeftArm.render(f5);
			this.Body.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);

			if (entity.isSneaking())
			{
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
			setAngle(Head, this.bipedHeadwear);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
		}
		//		setAngle(ZectorOpen, this.bipedBody);
		//		setAngle(ZectorHornUnderOpen, this.bipedBody);
		//		setAngle(ZectorLeg1, this.bipedBody);
		//		setAngle(ZectorHornOpen1, this.bipedBody);


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
