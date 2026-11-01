package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.drive.ArmorDriveProto;

/**
 * ModelDriveProto - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDriveProto extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Belt;
	public ModelRenderer Body2;
	public ModelRenderer tire1;
	public ModelRenderer ShiftSpeed;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_R3;
	public ModelRenderer HandCoverR;
	public ModelRenderer Head2L;
	public ModelRenderer Head2R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer HandCoverL;
	public ModelRenderer LeftArmShift;
	public ModelRenderer tire2;
	public ModelRenderer tire3;
	public ModelRenderer ShiftSpeed2;
	public ModelRenderer Head3L;
	public ModelRenderer Head3R;
	public ModelRenderer DriverBaseMach;

	public ModelDriveProto() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.tire1 = new ModelRenderer(this, 39, 0);
		this.tire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire1.addBox(2.0F, -3.75F, -1.5F, 2, 2, 3, 0.0F);
		this.setRotateAngle(tire1, 0.0F, 0.0F, 0.8726646259971648F);
		this.tire2 = new ModelRenderer(this, 52, 1);
		this.tire2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire2.addBox(2.0F, -1.75F, -1.5F, 2, 8, 3, 0.0F);
		this.tire3 = new ModelRenderer(this, 39, 7);
		this.tire3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire3.addBox(2.0F, 6.25F, -1.5F, 2, 2, 3, 0.0F);

		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-4.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R3 = new ModelRenderer(this, 0, 42);
		this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R3.addBox(-5.0F, -2.2F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_R3, 0.0F, 0.0F, 0.08726646259971647F);
		this.Belt = new ModelRenderer(this, 24, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.HandCoverL = new ModelRenderer(this, 1, 42);
		this.HandCoverL.mirror = true;
		this.HandCoverL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverL.addBox(2.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 42);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(4.0F, -2.2F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.08726646259971647F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Head2R = new ModelRenderer(this, 0, 0);
		this.Head2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2R.addBox(3.0F, -9.5F, -4.0F, 1, 1, 3, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.HandCoverR = new ModelRenderer(this, 1, 42);
		this.HandCoverR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverR.addBox(-3.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Head2L = new ModelRenderer(this, 0, 0);
		this.Head2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2L.addBox(-4.0F, -9.5F, -4.0F, 1, 1, 3, 0.0F);
		this.Head3L = new ModelRenderer(this, 0, 0);
		this.Head3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3L.addBox(-4.5F, -10.0F, -1.0F, 1, 1, 3, 0.0F);
		this.Head3R = new ModelRenderer(this, 0, 0);
		this.Head3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3R.addBox(3.5F, -10.0F, -1.0F, 1, 1, 3, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Body2 = new ModelRenderer(this, 37, 37);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.LeftArmShift = new ModelRenderer(this, 32, 48);
		this.LeftArmShift.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmShift.addBox(-1.0F, -1.75F, -2.0F, 1, 1, 1, 0.26F);
		this.ShiftSpeed = new ModelRenderer(this, 58, 17);
		this.ShiftSpeed.mirror = true;
		this.ShiftSpeed.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShiftSpeed.addBox(3.25F, 3.25F, -6.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(ShiftSpeed, 0.7853981633974483F, 0.0F, 0.0F);
		this.ShiftSpeed2 = new ModelRenderer(this, 58, 15);
		this.ShiftSpeed2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShiftSpeed2.addBox(0.5F, 4.5F, -6.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(ShiftSpeed2, 0.0F, 0.0F, -0.7853981633974483F);

		this.DriverBaseMach = new ModelRenderer(this, 22, 43);
		this.DriverBaseMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBaseMach.addBox(-3.5F, 8.5F, -3.35F, 6, 2, 1, 0.0F);

		this.tire1.addChild(this.tire3);
		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm.addChild(this.Shoulder_R);
		this.tire1.addChild(this.tire2);
		this.RightArm.addChild(this.Shoulder_R3);
		this.LeftArm.addChild(this.HandCoverL);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.Head.addChild(this.Head2R);
		this.Head.addChild(this.Head3L);
		this.Head.addChild(this.Head3R);
		this.ShiftSpeed.addChild(this.ShiftSpeed2);
		this.RightArm.addChild(this.HandCoverR);
		this.Head.addChild(this.Head2L);
		this.LeftArmShift.addChild(this.ShiftSpeed); 
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorDriveProto.DriverCheck==1) 
		{
			this.RightArm.showModel=true;
			this.Body.showModel=true;
			this.Body2.showModel=true;
			this.LeftLeg.showModel=true;
			this.Head.showModel=true;
			this.tire1.showModel=true;
			this.LeftArmShift.showModel=true;
			this.LeftArm.showModel=true;
			this.RightLeg.showModel=true;
			this.DriverBaseMach.showModel=false;
		}else if(ArmorDriveProto.DriverCheck==2) 
		{
			this.DriverBaseMach.showModel=true;
			this.RightArm.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.LeftLeg.showModel=false;
			this.Head.showModel=false;
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.LeftArm.showModel=false;
			this.RightLeg.showModel=false;		
		}
		else {
			this.DriverBaseMach.showModel=false;
			this.RightArm.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.LeftLeg.showModel=false;
			this.Head.showModel=false;
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.LeftArm.showModel=false;
			this.RightLeg.showModel=false;			
		}

		if (this.isChild) {	
			this.DriverBaseMach.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			//        GlStateManager.enableBlend();
			//        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			//        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.997F);
			this.LeftArmShift.render(f5);
			//        GlStateManager.disableBlend();
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.DriverBaseMach.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.Body2.render(f5);
			this.LeftLeg.render(f5);
			this.Head.render(f5);
			//        GlStateManager.enableBlend();
			//        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			//        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.997F);
			this.LeftArmShift.render(f5);
			//        GlStateManager.disableBlend();
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);


			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.1F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
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
			setAngle(Head, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(LeftArmShift, this.bipedLeftArm);
			setAngle(DriverBaseMach, this.bipedBody);
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
