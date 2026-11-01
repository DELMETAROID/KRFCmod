package rider.wmod.rendering.models.items.blade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.blade.ArmorGarrenBuckle;

/**
 * ModelGarrenBuckle - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGarrenBuckle extends ModelBiped {
	public ModelRenderer belt;
	public ModelRenderer Buckle_card;
	public ModelRenderer Buckle_turn;

	public ModelGarrenBuckle() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Buckle_turn = new ModelRenderer(this, 34, 12);
		this.Buckle_turn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Buckle_turn.addBox(-3.0F, 8.0F, -3.2F, 6, 3, 1, 0.0F);
		this.belt = new ModelRenderer(this, 16, 26);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.Buckle_card = new ModelRenderer(this, 34, 8);
		this.Buckle_card.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Buckle_card.addBox(-3.0F, 8.0F, -3.2F, 6, 3, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGarrenBuckle.isInvisible==1)
		{
			this.Buckle_card.showModel=false;
			this.Buckle_turn.showModel=false;
			this.belt.showModel=false;
		}
		else 
		{
			this.belt.showModel=true;
			if(ArmorGarrenBuckle.TurnUp==0) 
			{
				this.Buckle_card.showModel=true;
				this.Buckle_turn.showModel=false;
			}else {
				this.Buckle_card.showModel=false;
				this.Buckle_turn.showModel=true;
			}
		}

		if (this.isChild) {
			this.Buckle_turn.render(f5);
			this.belt.render(f5);
			this.Buckle_card.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Buckle_turn.render(f5);
			this.belt.render(f5);
			this.Buckle_card.render(f5);

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
		setAngle(Buckle_card, this.bipedBody);
		setAngle(Buckle_turn, this.bipedBody);

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
