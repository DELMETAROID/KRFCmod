package rider.wmod.rendering.models.items.ooo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;

/**
 * ModelOOODriver2 - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOOODriver2 extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer driverbase;
	public ModelRenderer driver1;
	public ModelRenderer driver2;
	public ModelRenderer driver3;
	public ModelRenderer driverbase2;
	public ModelRenderer driverbase3;

	public ModelOOODriver2() {
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

		this.belt.addChild(this.driverbase);
		this.driverbase.addChild(this.driverbase2);
		this.driverbase.addChild(this.driverbase3);
		this.belt.addChild(this.driver1);
		this.belt.addChild(this.driver2);
		this.belt.addChild(this.driver3);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (entity.isSneaking()||ArmorOOODriver2.isInvisible==1)
		{
			this.belt.showModel=false;
		}
		else {
			this.belt.showModel=true;
		}

		if(ArmorOOODriver2.HeadMedalIn2==1) {
			this.driver1.showModel=false;
		}else {
			this.driver1.showModel=true;
		}
		if(ArmorOOODriver2.BodyMedalIn2==1) {
			this.driver2.showModel=false;
		}else {
			this.driver2.showModel=true;
		}
		if(ArmorOOODriver2.LegMedalIn2==1) {
			this.driver3.showModel=false;
		}else {
			this.driver3.showModel=true;
		}


		if (this.isChild)
		{
			this.belt.render(f5);
		}
		else
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.belt.render(f5);

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
