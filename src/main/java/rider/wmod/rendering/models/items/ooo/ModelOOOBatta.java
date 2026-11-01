package rider.wmod.rendering.models.items.ooo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.ooo.ArmorOOOBatta;
import rider.wmod.items.armor.ooo.ArmorOOODriver;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;

/**
 * ModelOOOBatta - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOOOBatta extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer driver_battaN;
	public ModelRenderer driver_batta;

	public ModelRenderer BodyBatta;
	public ModelRenderer RightLegBatta;
	public ModelRenderer LeftLegBatta;

	public ModelOOOBatta() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.driver_batta = new ModelRenderer(this, 45, 4);
		this.driver_batta.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver_batta.addBox(1.25F, 9.55F, -2.75F, 2, 2, 1, 0.0F);
		this.driver_battaN = new ModelRenderer(this, 45, 4);
		this.driver_battaN.setRotationPoint(0.0F, 0.0F, -0.1F);
		this.driver_battaN.addBox(4.85F, 8.85F, -2.75F, 2, 2, 1, 0.0F);
		this.setRotateAngle(driver_battaN, 0.0F, 0.0F, 0.3490658503988659F);
		this.belt = new ModelRenderer(this, 32, 42);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 10.0F, -2.0F, 8, 1, 4, 0.27F);
		this.belt.addChild(this.driver_batta);
		this.belt.addChild(this.driver_battaN);

		this.BodyBatta = new ModelRenderer(this, 16, 16);
		this.BodyBatta.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyBatta.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.RightLegBatta = new ModelRenderer(this, 0, 16);
		this.RightLegBatta.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLegBatta.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftLegBatta = new ModelRenderer(this, 0, 16);
		this.LeftLegBatta.mirror = true;
		this.LeftLegBatta.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLegBatta.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorOOOBatta.DriverCheck==1&&ArmorOOOBatta.isInvisible==0)
		{
			if(ArmorOOODriver.ThreeMedalsIn==1)
			{
				this.driver_battaN.showModel=true;
				this.driver_batta.showModel=false;
				this.BodyBatta.showModel=false;
				this.RightLegBatta.showModel=false;
				this.LeftLegBatta.showModel=false;
			}
			else if(ArmorOOODriver2.ThreeMedalsIn2==1)
			{
				this.driver_battaN.showModel=true;
				this.driver_batta.showModel=false;
				this.BodyBatta.showModel=true;
				this.RightLegBatta.showModel=true;
				this.LeftLegBatta.showModel=true;
			}
			else
			{
				this.driver_battaN.showModel=false;
				this.driver_batta.showModel=true;
				this.BodyBatta.showModel=false;
				this.RightLegBatta.showModel=false;
				this.LeftLegBatta.showModel=false;
			}
		}
		else
		{
			this.driver_batta.showModel=false;
			this.driver_battaN.showModel=false;
			this.BodyBatta.showModel=false;
			this.RightLegBatta.showModel=false;
			this.LeftLegBatta.showModel=false;
		}

		if (this.isChild)
		{
			this.belt.render(f5);

			this.BodyBatta.render(f5);
			this.RightLegBatta.render(f5);
			this.LeftLegBatta.render(f5);
		}
		else
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.belt.render(f5);

			this.BodyBatta.render(f5);
			this.RightLegBatta.render(f5);
			this.LeftLegBatta.render(f5);

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
		setAngle(BodyBatta, this.bipedBody);
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
