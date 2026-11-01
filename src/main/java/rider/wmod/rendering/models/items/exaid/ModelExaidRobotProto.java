package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.exaid.ArmorExaidRobotProto;
import rider.wmod.items.armor.exaid.ArmorGamerDriver;

/**
 * ModelExaidRobotProto - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelExaidRobotProto extends ModelBiped {
	public ModelRenderer gashat_kimewaza;
	public ModelRenderer slot2;
	public ModelRenderer driver;
	public ModelRenderer gashat;

	public ModelExaidRobotProto() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.gashat_kimewaza = new ModelRenderer(this, 0, 54);
		this.gashat_kimewaza.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.gashat_kimewaza.addBox(9.0F, 7.0F, -0.5F, 1, 2, 1, 0.0F);
		this.gashat = new ModelRenderer(this, 0, 54);
		this.gashat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.gashat.addBox(4.5F, 6.5F, -3.8F, 1, 2, 1, 0.0F);
		this.slot2 = new ModelRenderer(this, 3, 48);
		this.slot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.slot2.addBox(2.0F, 9.0F, -4.0F, 1, 2, 2, 0.0F);
		this.driver = new ModelRenderer(this, 0, 47);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 8.0F, -4.0F, 2, 3, 2, 0.0F);
		this.driver.addChild(this.slot2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		if(ArmorExaidRobotProto.isInvisible==0 && ArmorExaidRobotProto.DriverCheck==1)
		{
			if(ArmorGamerDriver.MutekiFlag==1||ArmorGamerDriver.FumetsuFlag==1||ArmorGamerDriver.DoublegashatIn==1) 
			{
				this.gashat.showModel=false;
				this.driver.showModel=false;
				this.slot2.showModel=false;
			}else {
				this.gashat.showModel=true;
				this.driver.showModel=true;
				this.slot2.showModel=true;		 
			}
			if(ArmorExaidRobotProto.DoublegashatIn==1)
			{
				this.gashat_kimewaza.showModel=true;			
			}else {
				this.gashat_kimewaza.showModel=false;
			}
		}else 
		{
			this.gashat.showModel=false;
			this.driver.showModel=false;
			this.slot2.showModel=false;
			this.gashat_kimewaza.showModel=false;
		}
		
		if (this.isChild) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
		GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 1.0D, 1.0D);
		GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
		GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
		this.gashat.render(f5);
		GlStateManager.popMatrix();
		this.driver.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.gashat_kimewaza.offsetX, this.gashat_kimewaza.offsetY, this.gashat_kimewaza.offsetZ);
		GlStateManager.translate(this.gashat_kimewaza.rotationPointX * f5, this.gashat_kimewaza.rotationPointY * f5, this.gashat_kimewaza.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 1.0D, 1.25D);
		GlStateManager.translate(-this.gashat_kimewaza.offsetX, -this.gashat_kimewaza.offsetY, -this.gashat_kimewaza.offsetZ);
		GlStateManager.translate(-this.gashat_kimewaza.rotationPointX * f5, -this.gashat_kimewaza.rotationPointY * f5, -this.gashat_kimewaza.rotationPointZ * f5);
		this.gashat_kimewaza.render(f5);
		GlStateManager.popMatrix();
	}else {
		
		if (entity.isSneaking())
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.0F, 0.2F, 0.0F);
		}
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
		GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 1.0D, 1.0D);
		GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
		GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
		this.gashat.render(f5);
		GlStateManager.popMatrix();
		this.driver.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.gashat_kimewaza.offsetX, this.gashat_kimewaza.offsetY, this.gashat_kimewaza.offsetZ);
		GlStateManager.translate(this.gashat_kimewaza.rotationPointX * f5, this.gashat_kimewaza.rotationPointY * f5, this.gashat_kimewaza.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 1.0D, 1.25D);
		GlStateManager.translate(-this.gashat_kimewaza.offsetX, -this.gashat_kimewaza.offsetY, -this.gashat_kimewaza.offsetZ);
		GlStateManager.translate(-this.gashat_kimewaza.rotationPointX * f5, -this.gashat_kimewaza.rotationPointY * f5, -this.gashat_kimewaza.rotationPointZ * f5);
		this.gashat_kimewaza.render(f5);
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

		setAngle(gashat, this.bipedBody);
		setAngle(driver, this.bipedBody);
		setAngle(gashat_kimewaza, this.bipedBody);

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
