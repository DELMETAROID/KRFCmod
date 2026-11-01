package rider.wmod.rendering.models.items.kabuto;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.kabuto.ArmorGatackBelt;

/**
 * ModelGatackBelt - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGatackBelt extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer driverbase;
	public ModelRenderer driverbase2;
	public ModelRenderer DriverEye;
	public ModelRenderer SideR;
	public ModelRenderer SideL;
	public ModelRenderer SideBack;

	public ModelGatackBelt() {		this.textureWidth = 64;
	this.textureHeight = 64;
	this.SideL = new ModelRenderer(this, 27, 39);
	this.SideL.setRotationPoint(0.0F, 0.0F, 0.0F);
	this.SideL.addBox(-4.9F, 5.85F, -0.5F, 1, 1, 1, 0.0F);
	this.belt = new ModelRenderer(this, 16, 25);
	this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
	this.belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
	this.DriverEye = new ModelRenderer(this, 37, 12);
	this.DriverEye.setRotationPoint(0.0F, 0.0F, 0.0F);
	this.DriverEye.addBox(7.0F, 7.6F, -12.25F, 1, 2, 1, 0.0F);
	this.driverbase2 = new ModelRenderer(this, 33, 12);
	this.driverbase2.setRotationPoint(0.0F, 0.0F, 0.0F);
	this.driverbase2.addBox(1.6F, 8.5F, -6.5F, 1, 2, 1, 0.0F);
	this.SideR = new ModelRenderer(this, 27, 39);
	this.SideR.setRotationPoint(0.0F, 0.0F, 0.0F);
	this.SideR.addBox(3.9F, 5.85F, -0.5F, 1, 1, 1, 0.0F);
    this.SideBack = new ModelRenderer(this, 27, 39);
    this.SideBack.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.SideBack.addBox(-0.5F, 5.85F, 2.0F, 1, 1, 1, 0.0F);
    this.setRotateAngle(SideBack, 0.0F, 1.5707963267948966F, 0.0F);
	this.driverbase = new ModelRenderer(this, 33, 8);
	this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
	this.driverbase.addBox(-2.4F, 8.5F, -2.75F, 5, 2, 1, 0.0F);
	this.belt.addChild(this.driverbase);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGatackBelt.isInvisible==0)
		{
			this.SideL.showModel=true;
			this.belt.showModel=true;
			this.SideR.showModel=true;
			this.SideBack.showModel=true;

			if (entity.isSneaking())
			{
				this.driverbase2.showModel=false;
				this.DriverEye.showModel=false;
			}
			else
			{
				this.driverbase2.showModel=true;
				this.DriverEye.showModel=true;
			}
		}else {
			this.SideL.showModel=false;
			this.belt.showModel=false;
			this.DriverEye.showModel=false;
			this.driverbase2.showModel=false;
			this.SideR.showModel=false;
			this.SideBack.showModel=false;
		}

			if (this.isChild) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.SideL.offsetX, this.SideL.offsetY, this.SideL.offsetZ);
				GlStateManager.translate(this.SideL.rotationPointX * f5, this.SideL.rotationPointY * f5, this.SideL.rotationPointZ * f5);
				GlStateManager.scale(1.0D, 1.5D, 1.5D);
				GlStateManager.translate(-this.SideL.offsetX, -this.SideL.offsetY, -this.SideL.offsetZ);
				GlStateManager.translate(-this.SideL.rotationPointX * f5, -this.SideL.rotationPointY * f5, -this.SideL.rotationPointZ * f5);
				this.SideL.render(f5);
				GlStateManager.popMatrix();
				this.belt.render(f5);
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.DriverEye.offsetX, this.DriverEye.offsetY, this.DriverEye.offsetZ);
				GlStateManager.translate(this.DriverEye.rotationPointX * f5, this.DriverEye.rotationPointY * f5, this.DriverEye.rotationPointZ * f5);
				GlStateManager.scale(0.3D, 1.1D, 0.25D);
				GlStateManager.translate(-this.DriverEye.offsetX, -this.DriverEye.offsetY, -this.DriverEye.offsetZ);
				GlStateManager.translate(-this.DriverEye.rotationPointX * f5, -this.DriverEye.rotationPointY * f5, -this.DriverEye.rotationPointZ * f5);
				this.DriverEye.render(f5);
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.driverbase2.offsetX, this.driverbase2.offsetY, this.driverbase2.offsetZ);
				GlStateManager.translate(this.driverbase2.rotationPointX * f5, this.driverbase2.rotationPointY * f5, this.driverbase2.rotationPointZ * f5);
				GlStateManager.scale(1.0D, 1.0D, 0.5D);
				GlStateManager.translate(-this.driverbase2.offsetX, -this.driverbase2.offsetY, -this.driverbase2.offsetZ);
				GlStateManager.translate(-this.driverbase2.rotationPointX * f5, -this.driverbase2.rotationPointY * f5, -this.driverbase2.rotationPointZ * f5);
				this.driverbase2.render(f5);
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.SideR.offsetX, this.SideR.offsetY, this.SideR.offsetZ);
				GlStateManager.translate(this.SideR.rotationPointX * f5, this.SideR.rotationPointY * f5, this.SideR.rotationPointZ * f5);
				GlStateManager.scale(1.0D, 1.5D, 1.5D);
				GlStateManager.translate(-this.SideR.offsetX, -this.SideR.offsetY, -this.SideR.offsetZ);
				GlStateManager.translate(-this.SideR.rotationPointX * f5, -this.SideR.rotationPointY * f5, -this.SideR.rotationPointZ * f5);
				this.SideR.render(f5);
				GlStateManager.popMatrix();
		        GlStateManager.pushMatrix();
		        GlStateManager.translate(this.SideBack.offsetX, this.SideBack.offsetY, this.SideBack.offsetZ);
		        GlStateManager.translate(this.SideBack.rotationPointX * f5, this.SideBack.rotationPointY * f5, this.SideBack.rotationPointZ * f5);
		        GlStateManager.scale(1.5D, 1.5D, 1.0D);
		        GlStateManager.translate(-this.SideBack.offsetX, -this.SideBack.offsetY, -this.SideBack.offsetZ);
		        GlStateManager.translate(-this.SideBack.rotationPointX * f5, -this.SideBack.rotationPointY * f5, -this.SideBack.rotationPointZ * f5);
		        this.SideBack.render(f5);
		        GlStateManager.popMatrix();
			}
			else {
				if (entity.isSneaking())
				{
					GlStateManager.pushMatrix();
					GlStateManager.translate(0.0F, 0.2F, 0.0F);
				}

				GlStateManager.pushMatrix();
				GlStateManager.translate(this.SideL.offsetX, this.SideL.offsetY, this.SideL.offsetZ);
				GlStateManager.translate(this.SideL.rotationPointX * f5, this.SideL.rotationPointY * f5, this.SideL.rotationPointZ * f5);
				GlStateManager.scale(1.0D, 1.5D, 1.5D);
				GlStateManager.translate(-this.SideL.offsetX, -this.SideL.offsetY, -this.SideL.offsetZ);
				GlStateManager.translate(-this.SideL.rotationPointX * f5, -this.SideL.rotationPointY * f5, -this.SideL.rotationPointZ * f5);
				this.SideL.render(f5);
				GlStateManager.popMatrix();
				this.belt.render(f5);
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.DriverEye.offsetX, this.DriverEye.offsetY, this.DriverEye.offsetZ);
				GlStateManager.translate(this.DriverEye.rotationPointX * f5, this.DriverEye.rotationPointY * f5, this.DriverEye.rotationPointZ * f5);
				GlStateManager.scale(0.3D, 1.1D, 0.25D);
				GlStateManager.translate(-this.DriverEye.offsetX, -this.DriverEye.offsetY, -this.DriverEye.offsetZ);
				GlStateManager.translate(-this.DriverEye.rotationPointX * f5, -this.DriverEye.rotationPointY * f5, -this.DriverEye.rotationPointZ * f5);
				this.DriverEye.render(f5);
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.driverbase2.offsetX, this.driverbase2.offsetY, this.driverbase2.offsetZ);
				GlStateManager.translate(this.driverbase2.rotationPointX * f5, this.driverbase2.rotationPointY * f5, this.driverbase2.rotationPointZ * f5);
				GlStateManager.scale(1.0D, 1.0D, 0.5D);
				GlStateManager.translate(-this.driverbase2.offsetX, -this.driverbase2.offsetY, -this.driverbase2.offsetZ);
				GlStateManager.translate(-this.driverbase2.rotationPointX * f5, -this.driverbase2.rotationPointY * f5, -this.driverbase2.rotationPointZ * f5);
				this.driverbase2.render(f5);
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(this.SideR.offsetX, this.SideR.offsetY, this.SideR.offsetZ);
				GlStateManager.translate(this.SideR.rotationPointX * f5, this.SideR.rotationPointY * f5, this.SideR.rotationPointZ * f5);
				GlStateManager.scale(1.0D, 1.5D, 1.5D);
				GlStateManager.translate(-this.SideR.offsetX, -this.SideR.offsetY, -this.SideR.offsetZ);
				GlStateManager.translate(-this.SideR.rotationPointX * f5, -this.SideR.rotationPointY * f5, -this.SideR.rotationPointZ * f5);
				this.SideR.render(f5);
				GlStateManager.popMatrix();
		        GlStateManager.pushMatrix();
		        GlStateManager.translate(this.SideBack.offsetX, this.SideBack.offsetY, this.SideBack.offsetZ);
		        GlStateManager.translate(this.SideBack.rotationPointX * f5, this.SideBack.rotationPointY * f5, this.SideBack.rotationPointZ * f5);
		        GlStateManager.scale(1.5D, 1.5D, 1.0D);
		        GlStateManager.translate(-this.SideBack.offsetX, -this.SideBack.offsetY, -this.SideBack.offsetZ);
		        GlStateManager.translate(-this.SideBack.rotationPointX * f5, -this.SideBack.rotationPointY * f5, -this.SideBack.rotationPointZ * f5);
		        this.SideBack.render(f5);
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

			setAngle(belt, this.bipedBody);
			setAngle(SideL, this.bipedBody);
			setAngle(SideR, this.bipedBody);
			setAngle(SideBack, this.bipedBody);

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
