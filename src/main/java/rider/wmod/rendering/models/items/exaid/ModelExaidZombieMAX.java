package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.exaid.ArmorExaidZombieMAX;

/**
 * ModelExaidZombieMAX - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelExaidZombieMAX extends ModelBiped {

	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer gashat;
	public ModelRenderer driver;
	public ModelRenderer miniHead;
	public ModelRenderer miniHeadPressed;
	public ModelRenderer Shoulder_R;
	public ModelRenderer hair1;
	public ModelRenderer hair2;
	public ModelRenderer hair3;
	public ModelRenderer hair4;
	public ModelRenderer hair6;
	public ModelRenderer hair7;
	public ModelRenderer hair0;
	public ModelRenderer hair5;
	public ModelRenderer BackBone;
	public ModelRenderer Shoulder_L;
	public ModelRenderer spike;
	public ModelRenderer spike2;
	public ModelRenderer spike3;
	public ModelRenderer Lever;
	public ModelRenderer centor;
	public ModelRenderer beltL;
	public ModelRenderer beltR;

	public ModelExaidZombieMAX() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.miniHead = new ModelRenderer(this, 14, 46);
		this.miniHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.miniHead.addBox(1.4F, 6.2F, -3.6F, 1, 1, 1, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 35);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-4.25F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
		this.gashat = new ModelRenderer(this, 0, 53);
		this.gashat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.gashat.addBox(1.25F, 7.0F, -4.0F, 1, 2, 2, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.driver = new ModelRenderer(this, 0, 47);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 8.0F, -4.0F, 4, 3, 2, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 19, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.spike3 = new ModelRenderer(this, 18, 0);
		this.spike3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike3.addBox(3.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(spike3, 0.0F, 0.0F, -0.08726646259971647F);
		this.spike = new ModelRenderer(this, 18, 0);
		this.spike.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike.addBox(1.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(spike, 0.0F, 0.0F, -0.08726646259971647F);
		this.miniHeadPressed = new ModelRenderer(this, 14, 46);
		this.miniHeadPressed.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.miniHeadPressed.addBox(1.4F, 6.95F, -3.6F, 1, 1, 1, 0.0F);
		this.hair7 = new ModelRenderer(this, 39, 0);
		this.hair7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair7.addBox(-2.0F, -12.0F, -4.8F, 3, 1, 2, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.hair6 = new ModelRenderer(this, 39, 1);
		this.hair6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair6.addBox(-3.0F, -11.3F, -4.8F, 3, 1, 2, 0.0F);
		this.BackBone = new ModelRenderer(this, 39, 39);
		this.BackBone.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackBone.addBox(-1.5F, 0.0F, 2.0F, 3, 5, 1, 0.0F);
		this.centor = new ModelRenderer(this, 1, 60);
		this.centor.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.centor.addBox(1.1F, 7.9F, -4.2F, 2, 1, 2, 0.0F);
		this.beltR = new ModelRenderer(this, 0, 58);
		this.beltR.mirror = true;
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-2.0F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.hair0 = new ModelRenderer(this, 39, 7);
		this.hair0.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair0.addBox(-4.95F, -6.3F, -4.8F, 10, 1, 2, 0.0F);
		this.hair5 = new ModelRenderer(this, 43, 2);
		this.hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair5.addBox(0.6F, -10.5F, -4.8F, 3, 1, 2, 0.0F);
		this.hair1 = new ModelRenderer(this, 39, 6);
		this.hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair1.addBox(-5.2F, -7.3F, -4.8F, 11, 1, 2, 0.0F);
		this.hair3 = new ModelRenderer(this, 39, 4);
		this.hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair3.addBox(-4.1F, -9.3F, -4.8F, 10, 1, 2, 0.0F);
		this.hair4 = new ModelRenderer(this, 39, 3);
		this.hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair4.addBox(-3.6F, -10.3F, -4.8F, 7, 1, 2, 0.0F);
		this.hair2 = new ModelRenderer(this, 39, 5);
		this.hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair2.addBox(-4.7F, -8.3F, -4.8F, 10, 1, 2, 0.0F);
		this.spike2 = new ModelRenderer(this, 18, 0);
		this.spike2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike2.addBox(3.5F, -2.75F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(spike2, 0.0F, 0.0F, -0.08726646259971647F);
		this.Lever = new ModelRenderer(this, 7, 53);
		this.Lever.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Lever.addBox(-4.0F, 8.0F, -4.6F, 3, 3, 1, 0.0F);
		this.beltL = new ModelRenderer(this, 0, 58);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(3.0F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.RightArm.addChild(this.Shoulder_R);
		this.LeftArm.addChild(this.Shoulder_L);
		this.LeftArm.addChild(this.spike3);
		this.LeftArm.addChild(this.spike);
		this.Head.addChild(this.hair7);
		this.Head.addChild(this.hair6);
		this.Body.addChild(this.BackBone);
		this.driver.addChild(this.centor);
		this.driver.addChild(this.beltR);
		this.Head.addChild(this.hair0);
		this.Head.addChild(this.hair5);
		this.Head.addChild(this.hair1);
		this.Head.addChild(this.hair3);
		this.Head.addChild(this.hair4);
		this.Head.addChild(this.hair2);
		this.LeftArm.addChild(this.spike2);
		this.driver.addChild(this.Lever);
		this.driver.addChild(this.beltL);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorExaidZombieMAX.isInvisible==0 && ArmorExaidZombieMAX.DriverCheck==1)
		{   
			this.gashat.showModel=true;
			this.driver.showModel=true;
			this.Head.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;

			this.hair1.showModel=true;
			this.hair2.showModel=true;
			this.hair3.showModel=true;
			this.hair4.showModel=true;
			this.hair6.showModel=true;
			this.hair7.showModel=true;
			this.hair0.showModel=true;
			this.hair5.showModel=true;

			this.gashat.showModel=true;
			this.driver.showModel=true;
			this.miniHead.showModel=true;
			this.miniHeadPressed.showModel=false;

		}
		else
		{
			this.gashat.showModel=false;
			this.driver.showModel=false;
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;

			this.hair1.showModel=false;
			this.hair2.showModel=false;
			this.hair3.showModel=false;
			this.hair4.showModel=false;
			this.hair6.showModel=false;
			this.hair7.showModel=false;
			this.hair0.showModel=false;
			this.hair5.showModel=false;

			this.driver.showModel=false;
			this.gashat.showModel=false;
			this.miniHead.showModel=false;
			this.miniHeadPressed.showModel=false;
		}

		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.miniHead.offsetX, this.miniHead.offsetY, this.miniHead.offsetZ);
			GlStateManager.translate(this.miniHead.rotationPointX * f5, this.miniHead.rotationPointY * f5, this.miniHead.rotationPointZ * f5);
			GlStateManager.scale(1.2D, 1.0D, 1.0D);
			GlStateManager.translate(-this.miniHead.offsetX, -this.miniHead.offsetY, -this.miniHead.offsetZ);
			GlStateManager.translate(-this.miniHead.rotationPointX * f5, -this.miniHead.rotationPointY * f5, -this.miniHead.rotationPointZ * f5);
			this.miniHead.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(1.3D, 1.0D, 1.3D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			this.RightLeg.render(f5);
			this.driver.render(f5);
			this.Body.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.miniHeadPressed.offsetX, this.miniHeadPressed.offsetY, this.miniHeadPressed.offsetZ);
			GlStateManager.translate(this.miniHeadPressed.rotationPointX * f5, this.miniHeadPressed.rotationPointY * f5, this.miniHeadPressed.rotationPointZ * f5);
			GlStateManager.scale(1.2D, 1.0D, 1.0D);
			GlStateManager.translate(-this.miniHeadPressed.offsetX, -this.miniHeadPressed.offsetY, -this.miniHeadPressed.offsetZ);
			GlStateManager.translate(-this.miniHeadPressed.rotationPointX * f5, -this.miniHeadPressed.rotationPointY * f5, -this.miniHeadPressed.rotationPointZ * f5);
			this.miniHeadPressed.render(f5);
			GlStateManager.popMatrix();
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			this.RightArm.render(f5);
			this.LeftArm.render(f5);
		}
		else
		{

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.RightArm.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(1.3D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightLeg.render(f5);
			this.driver.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.miniHead.offsetX, this.miniHead.offsetY, this.miniHead.offsetZ);
			GlStateManager.translate(this.miniHead.rotationPointX * f5, this.miniHead.rotationPointY * f5, this.miniHead.rotationPointZ * f5);
			GlStateManager.scale(1.2D, 1.0D, 1.0D);
			GlStateManager.translate(-this.miniHead.offsetX, -this.miniHead.offsetY, -this.miniHead.offsetZ);
			GlStateManager.translate(-this.miniHead.rotationPointX * f5, -this.miniHead.rotationPointY * f5, -this.miniHead.rotationPointZ * f5);
			this.miniHead.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.miniHeadPressed.offsetX, this.miniHeadPressed.offsetY, this.miniHeadPressed.offsetZ);
			GlStateManager.translate(this.miniHeadPressed.rotationPointX * f5, this.miniHeadPressed.rotationPointY * f5, this.miniHeadPressed.rotationPointZ * f5);
			GlStateManager.scale(1.2D, 1.0D, 1.0D);
			GlStateManager.translate(-this.miniHeadPressed.offsetX, -this.miniHeadPressed.offsetY, -this.miniHeadPressed.offsetZ);
			GlStateManager.translate(-this.miniHeadPressed.rotationPointX * f5, -this.miniHeadPressed.rotationPointY * f5, -this.miniHeadPressed.rotationPointZ * f5);
			this.miniHeadPressed.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);

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
			setAngle(gashat, this.bipedBody);
			setAngle(driver, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(miniHead, this.bipedBody);
			setAngle(miniHeadPressed, this.bipedBody);
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
