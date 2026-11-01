package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.decade.ArmorDecadriverNeo;

/**
 * ModelDecadriverNeo - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDecadriverNeo extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer buckle;
	public ModelRenderer buckle_open;
	public ModelRenderer buckleR_open;
	public ModelRenderer buckleL_open;
	public ModelRenderer buckle_back;
	public ModelRenderer buckleR;
	public ModelRenderer buckleL;

	public ModelDecadriverNeo() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.buckleR = new ModelRenderer(this, 21, 38);
		this.buckleR.mirror = true;
		this.buckleR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleR.addBox(0.75F, 8.5F, -2.7F, 2, 2, 1, 0.0F);
		this.buckleL = new ModelRenderer(this, 21, 38);
		this.buckleL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleL.addBox(-2.75F, 8.5F, -2.7F, 2, 2, 1, 0.0F);
		this.buckleR_open = new ModelRenderer(this, 21, 38);
		this.buckleR_open.mirror = true;
		this.buckleR_open.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleR_open.addBox(2.25F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.buckle_back = new ModelRenderer(this, 25, 38);
		this.buckle_back.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckle_back.addBox(-2.5F, 8.5F, -2.5F, 5, 2, 1, 0.0F);
		this.buckleL_open = new ModelRenderer(this, 21, 38);
		this.buckleL_open.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleL_open.addBox(-3.25F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 0, 28);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.buckle = new ModelRenderer(this, 21, 34);
		this.buckle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckle.addBox(-1.5F, 8.0F, -3.25F, 3, 3, 1, 0.0F);
		this.buckle_open = new ModelRenderer(this, 29, 34);
		this.buckle_open.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckle_open.addBox(-1.5F, 8.0F, -3.25F, 3, 3, 1, 0.0F);
		this.buckle.addChild(this.buckleR);
		this.buckle.addChild(this.buckleL);
		this.buckle_open.addChild(this.buckleR_open);
		this.Belt.addChild(this.buckle_back);
		this.buckle_open.addChild(this.buckleL_open);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorDecadriverNeo.isInvisible==0)
		{
			this.Belt.showModel=true;

			if(ArmorDecadriverNeo.HaveCard==0) 
			{
				this.buckle.showModel=true;
				this.buckle_open.showModel=false;
			}else {
				this.buckle.showModel=false;
				this.buckle_open.showModel=true;
			}
		}
		else {
			this.Belt.showModel=false;
			this.buckle.showModel=false;
			this.buckle_open.showModel=false;
		}

		if (this.isChild) {

			this.buckle.render(f5);
			this.buckle_open.render(f5);
			this.Belt.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.buckle.render(f5);
			this.buckle_open.render(f5);
			this.Belt.render(f5);

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

		setAngle(Belt, this.bipedBody);
		setAngle(buckle, this.bipedBody);
		setAngle(buckle_open, this.bipedBody);

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
