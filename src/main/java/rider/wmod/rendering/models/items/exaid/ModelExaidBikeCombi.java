package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.exaid.ArmorExaidBikeCombi;
import rider.wmod.items.armor.exaid.ArmorGamerDriver;

/**
 * ModelExaidBikeCombi - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelExaidBikeCombi extends ModelBiped {
	/*
	public ModelRenderer RightArm;
    public ModelRenderer RightLeg;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
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
	 */

	public ModelRenderer gashat_kimewaza;
	public ModelRenderer slot2;
	public ModelRenderer driver;
	public ModelRenderer gashat;

	public ModelExaidBikeCombi() {
		this.textureWidth = 64;
		this.textureHeight = 64;/*
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.BackBone = new ModelRenderer(this, 39, 39);
		this.BackBone.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackBone.addBox(-1.5F, 0.0F, 2.0F, 3, 5, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.hair5 = new ModelRenderer(this, 43, 2);
		this.hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair5.addBox(0.6F, -10.5F, -4.8F, 3, 1, 2, 0.0F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.hair4 = new ModelRenderer(this, 39, 3);
		this.hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair4.addBox(-3.6F, -10.3F, -4.8F, 7, 1, 2, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.hair6 = new ModelRenderer(this, 39, 1);
		this.hair6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair6.addBox(-3.0F, -11.3F, -4.8F, 3, 1, 2, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.hair0 = new ModelRenderer(this, 39, 7);
		this.hair0.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair0.addBox(-4.95F, -6.3F, -4.8F, 10, 1, 2, 0.0F);
		this.hair2 = new ModelRenderer(this, 39, 5);
		this.hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair2.addBox(-4.7F, -8.3F, -4.8F, 10, 1, 2, 0.0F);
		this.hair7 = new ModelRenderer(this, 39, 0);
		this.hair7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair7.addBox(-2.0F, -12.0F, -4.8F, 3, 1, 2, 0.0F);
		this.hair1 = new ModelRenderer(this, 39, 6);
		this.hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair1.addBox(-5.2F, -7.3F, -4.8F, 11, 1, 2, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 19, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(0.0F, -2.3F, -2.5F, 4, 5, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.hair3 = new ModelRenderer(this, 39, 4);
		this.hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hair3.addBox(-4.1F, -9.3F, -4.8F, 10, 1, 2, 0.0F);

		this.RightArm.addChild(this.Shoulder_R);
		this.Body.addChild(this.BackBone);
		this.Head.addChild(this.hair5);
		this.Head.addChild(this.hair4);
		this.Head.addChild(this.hair6);
		this.Head.addChild(this.hair0);
		this.Head.addChild(this.hair2);
		this.Head.addChild(this.hair7);
		this.Head.addChild(this.hair1);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Head.addChild(this.hair3);

		 */
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

		if(ArmorExaidBikeCombi.isInvisible==0 && ArmorExaidBikeCombi.DriverCheck==1)
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
			if(ArmorExaidBikeCombi.DoublegashatIn==1)
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
			//		this.RightLeg.render(f5);
			//		this.LeftLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			//		this.Head.render(f5);
			//		this.LeftArm.render(f5);
			//		this.RightArm.render(f5);
			//		this.Body.render(f5);
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
			//		this.RightLeg.render(f5);
			//		this.LeftLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.gashat.offsetX, this.gashat.offsetY, this.gashat.offsetZ);
			GlStateManager.translate(this.gashat.rotationPointX * f5, this.gashat.rotationPointY * f5, this.gashat.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 1.0D);
			GlStateManager.translate(-this.gashat.offsetX, -this.gashat.offsetY, -this.gashat.offsetZ);
			GlStateManager.translate(-this.gashat.rotationPointX * f5, -this.gashat.rotationPointY * f5, -this.gashat.rotationPointZ * f5);
			this.gashat.render(f5);
			GlStateManager.popMatrix();
			//		this.Head.render(f5);
			//		this.LeftArm.render(f5);
			//		this.RightArm.render(f5);
			//		this.Body.render(f5);
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

		//		setAngle(Head, this.bipedHead);
		//		setAngle(Body, this.bipedBody);
		setAngle(gashat, this.bipedBody);
		setAngle(driver, this.bipedBody);
		setAngle(gashat_kimewaza, this.bipedBody);
		//		setAngle(RightArm, this.bipedRightArm);
		//		setAngle(LeftArm, this.bipedLeftArm);
		//		setAngle(RightLeg, this.bipedRightLeg);
		//		setAngle(LeftLeg, this.bipedLeftLeg);

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
