package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.geats.ArmorIDDoomsGeats;

/**
 * ModelDoomsGeats - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelIDDoomsGeats extends ModelBiped {
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer RightLeg;
	public ModelRenderer BlankHead;
	public ModelRenderer Body2;
	public ModelRenderer id;
	public ModelRenderer Head;
	public ModelRenderer GeatsTail;
	public ModelRenderer Antena2R;
	public ModelRenderer Antena4R;
	public ModelRenderer Antena5R;
	public ModelRenderer EarSideR2;
	public ModelRenderer Antena1L;
	public ModelRenderer Antena3L;
	public ModelRenderer Antena4L;
	public ModelRenderer Antena5L;
	public ModelRenderer EarSideL2;
	public ModelRenderer Antena3R;
	public ModelRenderer AntenaSideL;
	public ModelRenderer Antena7L;
	public ModelRenderer Antena2L;
	public ModelRenderer Antena1R;
	public ModelRenderer EarSideR1;
	public ModelRenderer AntenaSide;
	public ModelRenderer Nose;
	public ModelRenderer Nose2;
	public ModelRenderer Nose3;
	public ModelRenderer Nose4;
	public ModelRenderer Nose5;
	public ModelRenderer Nose6;

	public ModelIDDoomsGeats() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Antena5R = new ModelRenderer(this, 2, 0);
		this.Antena5R.mirror = true;
		this.Antena5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena5R.addBox(2.2F, -12.75F, -2.5F, 1, 2, 2, 0.0F);
		this.Antena5L = new ModelRenderer(this, 2, 0);
		this.Antena5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena5L.addBox(-3.2F, -12.75F, -2.5F, 1, 2, 2, 0.0F);
		this.id = new ModelRenderer(this, 18, 39);
		this.id.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.id.addBox(-0.5F, 9.0F, -3.0F, 1, 1, 1, 0.0F);
		this.Antena3L = new ModelRenderer(this, 0, 0);
		this.Antena3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3L.addBox(-2.5F, -10.25F, -4.5F, 1, 2, 1, 0.0F);
		this.EarSideL2 = new ModelRenderer(this, 24, 0);
		this.EarSideL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EarSideL2.addBox(-4.2F, -11.5F, -1.5F, 1, 1, 2, 0.0F);
		this.Antena7L = new ModelRenderer(this, 24, 0);
		this.Antena7L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena7L.addBox(-5.0F, -10.5F, -1.5F, 1, 7, 2, 0.0F);
		this.Nose3 = new ModelRenderer(this, 31, 13);
		this.Nose3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Nose3.addBox(-3.5F, -3.5F, -5.5F, 7, 1, 1, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Nose5 = new ModelRenderer(this, 48, 8);
		this.Nose5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Nose5.addBox(-1.5F, -6.75F, -6.5F, 3, 2, 2, 0.0F);
		this.EarSideR2 = new ModelRenderer(this, 24, 0);
		this.EarSideR2.mirror = true;
		this.EarSideR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EarSideR2.addBox(3.2F, -11.5F, -1.5F, 1, 1, 2, 0.0F);
		this.Body2 = new ModelRenderer(this, 16, 16);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 5, 4, 0.5F);
		this.Nose4 = new ModelRenderer(this, 34, 9);
		this.Nose4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Nose4.addBox(-0.5F, -4.75F, -7.0F, 1, 1, 3, 0.0F);
		this.Antena4R = new ModelRenderer(this, 0, 0);
		this.Antena4R.mirror = true;
		this.Antena4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4R.addBox(2.0F, -11.25F, -3.5F, 1, 2, 1, 0.0F);
		this.BlankHead = new ModelRenderer(this, 32, 31);
		this.BlankHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlankHead.addBox(-4.0F, -7.0F, -4.0F, 8, 7, 8, 0.21F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Nose6 = new ModelRenderer(this, 33, 7);
		this.Nose6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Nose6.addBox(-2.5F, -7.5F, -5.5F, 5, 2, 2, 0.0F);
		this.Antena1R = new ModelRenderer(this, 0, 3);
		this.Antena1R.mirror = true;
		this.Antena1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1R.addBox(0.7F, -8.25F, -6.25F, 1, 2, 1, 0.0F);
		this.Antena4L = new ModelRenderer(this, 0, 0);
		this.Antena4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4L.addBox(-3.0F, -11.25F, -3.5F, 1, 2, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.EarSideR1 = new ModelRenderer(this, 24, 0);
		this.EarSideR1.mirror = true;
		this.EarSideR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EarSideR1.addBox(4.0F, -10.5F, -1.5F, 1, 7, 2, 0.0F);
		this.Antena2L = new ModelRenderer(this, 0, 4);
		this.Antena2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2L.addBox(-2.25F, -9.0F, -5.5F, 1, 1, 1, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.AntenaSideL = new ModelRenderer(this, 25, 1);
		this.AntenaSideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaSideL.addBox(-5.5F, -4.5F, -4.75F, 2, 1, 1, 0.0F);
		this.Nose2 = new ModelRenderer(this, 45, 13);
		this.Nose2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Nose2.addBox(-2.5F, -3.75F, -6.5F, 5, 1, 2, 0.0F);
		this.Antena2R = new ModelRenderer(this, 0, 4);
		this.Antena2R.mirror = true;
		this.Antena2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2R.addBox(1.25F, -9.0F, -5.5F, 1, 1, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 1);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 5, 8, 0.51F);
		this.Antena3R = new ModelRenderer(this, 0, 0);
		this.Antena3R.mirror = true;
		this.Antena3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3R.addBox(1.5F, -10.25F, -4.5F, 1, 2, 1, 0.0F);
		this.AntenaSide = new ModelRenderer(this, 25, 1);
		this.AntenaSide.mirror = true;
		this.AntenaSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaSide.addBox(3.5F, -4.5F, -4.75F, 2, 1, 1, 0.0F);
		this.GeatsTail = new ModelRenderer(this, 57, 19);
		this.GeatsTail.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.GeatsTail.addBox(1.0F, 0.0F, 1.5F, 2, 10, 1, 0.0F);
		this.setRotateAngle(GeatsTail, 0.17453292519943295F, 0.03490658503988659F, -0.3490658503988659F);
		this.Nose = new ModelRenderer(this, 36, 14);
		this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Nose.addBox(-0.5F, -3.75F, -7.5F, 1, 1, 1, 0.0F);
		this.Antena1L = new ModelRenderer(this, 0, 4);
		this.Antena1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1L.addBox(-1.7F, -8.25F, -6.25F, 1, 2, 1, 0.0F);
		this.Head.addChild(this.Antena5R);
		this.Head.addChild(this.Antena5L);
		this.Head.addChild(this.Antena3L);
		this.Head.addChild(this.EarSideL2);
		this.Head.addChild(this.Antena7L);
		this.Head.addChild(this.Nose3);
		this.Head.addChild(this.Nose5);
		this.Head.addChild(this.EarSideR2);
		this.Head.addChild(this.Nose4);
		this.Head.addChild(this.Antena4R);
		this.Head.addChild(this.Nose6);
		this.Head.addChild(this.Antena1R);
		this.Head.addChild(this.Antena4L);
		this.Head.addChild(this.EarSideR1);
		this.Head.addChild(this.Antena2L);
		this.Head.addChild(this.AntenaSideL);
		this.Head.addChild(this.Nose2);
		this.Head.addChild(this.Antena2R);
		this.Head.addChild(this.Antena3R);
		this.Head.addChild(this.AntenaSide);
		this.Head.addChild(this.Nose);
		this.Head.addChild(this.Antena1L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorIDDoomsGeats.isInvisible==0 && ArmorIDDoomsGeats.DriverCheck==1)
		{
			this.id.showModel=true;		

			if(ArmorIDDoomsGeats.isHenshin==1)
			{
				this.Head.showModel=true;
				this.RightLeg.showModel=true;
				this.GeatsTail.showModel=true;		

				if(ArmorIDDoomsGeats.UpperBuckleIn==2) 
				{
					this.Body.showModel=false;
					this.RightArm.showModel=false;
					this.LeftArm.showModel=false;
					this.Body2.showModel=false;
					this.BlankHead.showModel=false;
				}else if(ArmorIDDoomsGeats.UpperBuckleIn==1) 
				{
					this.Body.showModel=true;
					this.RightArm.showModel=true;
					this.LeftArm.showModel=true;
					this.Body2.showModel=false;
					this.BlankHead.showModel=false;
				}else {	
					this.Body.showModel=true;
					this.RightArm.showModel=true;
					this.LeftArm.showModel=true;
					this.Body2.showModel=true;
					this.BlankHead.showModel=true;
				}


				if(ArmorIDDoomsGeats.LowerBuckleIn==2) 
				{
					this.LeftLeg.showModel=false;
					this.RightLeg.showModel=false;
				}
				else if(ArmorIDDoomsGeats.LowerBuckleIn==1) 
				{
					this.RightLeg.showModel=true;
					this.LeftLeg.showModel=false;
				}else {	
					this.RightLeg.showModel=true;
					this.LeftLeg.showModel=true;
				}
			}else {
				this.Head.showModel=false;
				this.Body.showModel=false;
				this.RightArm.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftArm.showModel=false;
				this.LeftLeg.showModel=false;
				this.Body2.showModel=false;
				this.BlankHead.showModel=false;
				this.GeatsTail.showModel=false;
			}
		}
		else
		{
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Body2.showModel=false;
			this.BlankHead.showModel=false;
			this.GeatsTail.showModel=false;
			this.id.showModel=false;		
		}


		if (this.isChild) {
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.GeatsTail.render(f5);
			this.BlankHead.render(f5);
			this.id.render(f5);
			this.Body2.render(f5);
			this.Head.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Body.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.GeatsTail.render(f5);
			this.BlankHead.render(f5);
			this.id.render(f5);
			this.Body2.render(f5);
			this.Head.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}

			this.id.render(f5);
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
			setAngle(BlankHead, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(id, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
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