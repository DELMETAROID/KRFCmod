package rider.wmod.rendering.models.items.w;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.w.ArmorWCyclone;

/**
 * ModelWCyclone - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelWCyclone extends ModelBiped {
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer Body2;
	public ModelRenderer Head;
	public ModelRenderer RightMemory;
	public ModelRenderer Shoulder_R;
	public ModelRenderer driver;
	public ModelRenderer driverbase;
	public ModelRenderer AntenaBase;
	public ModelRenderer Antena1R;
	public ModelRenderer Antena2R;
	public ModelRenderer Antena3R;
	public ModelRenderer Antena4R;
	public ModelRenderer RightMemorySide;
	public ModelRenderer WindyStabilizer;

	public ModelRenderer Head_Lost;
	public ModelRenderer Body_Lost;
	public ModelRenderer Body2_Lost;
	public ModelRenderer RightLeg_Lost;
	public ModelRenderer RightArm_Lost;
	public ModelRenderer Shoulder_R_Lost;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Shoulder_L;
	public ModelRenderer AntenaBase_Lost;
	public ModelRenderer Antena1L;
	public ModelRenderer Antena2L;
	public ModelRenderer Antena3L;
	public ModelRenderer Antena4L;
	public ModelRenderer driver_Lost;
	public ModelRenderer driverbase_Lost;
	public ModelRenderer WindyStabilizer_Lost;

	public ModelWCyclone() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.AntenaBase = new ModelRenderer(this, 36, 13);
		this.AntenaBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase.addBox(-1.0F, -5.5F, -4.8F, 2, 1, 1, 0.0F);
		this.driver = new ModelRenderer(this, 33, 0);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 9.5F, -3.35F, 2, 2, 1, 0.0F);
		this.driverbase = new ModelRenderer(this, 33, 8);
		this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase.addBox(-2.5F, 9.0F, -2.85F, 5, 2, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 39, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);

		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);

		this.Antena1R = new ModelRenderer(this, 0, 44);
		this.Antena1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1R.addBox(-2.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena2R = new ModelRenderer(this, 0, 44);
		this.Antena2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2R.addBox(-2.9F, -6.75F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena3R = new ModelRenderer(this, 0, 44);
		this.Antena3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3R.addBox(-3.9F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena4R = new ModelRenderer(this, 0, 44);
		this.Antena4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4R.addBox(-4.9F, -8.25F, -4.8F, 1, 1, 1, 0.0F);
		this.RightMemory = new ModelRenderer(this, 46, 0);
		this.RightMemory.setRotationPoint(0.5F, -1.0F, -0.3F);
		this.RightMemory.addBox(-19.0F, 9.5F, -3.0F, 2, 5, 1, 0.0F);
		this.setRotateAngle(RightMemory, 0.0F, 0.0F, -0.7853981633974483F);
		this.RightMemorySide = new ModelRenderer(this, 46, 8);
		this.RightMemorySide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightMemorySide.addBox(-20.0F, 11.5F, -3.0F, 1, 3, 1, 0.0F);
		this.WindyStabilizer = new ModelRenderer(this, 57, 8);
		this.WindyStabilizer.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.WindyStabilizer.addBox(-2.0F, 0.0F, 1.5F, 2, 10, 1, 0.0F);
		this.setRotateAngle(WindyStabilizer, 0.17453301598906276F, 0.03490658503988659F, 0.3490658503988659F);
		this.driver.addChild(this.driverbase);
		this.Body.addChild(this.WindyStabilizer);
		this.RightArm.addChild(this.Shoulder_R);
		this.RightMemory.addChild(this.RightMemorySide);
		this.Body.addChild(this.driver);

		this.Head_Lost = new ModelRenderer(this, 64, 0);
		this.Head_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head_Lost.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.RightArm_Lost = new ModelRenderer(this, 104, 16);
		this.RightArm_Lost.setRotationPoint(-5.5F, 2.5F, 0.0F);
		this.RightArm_Lost.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_R_Lost = new ModelRenderer(this, 64, 33);
		this.Shoulder_R_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R_Lost.addBox(-3.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.RightLeg_Lost = new ModelRenderer(this, 64, 16);
		this.RightLeg_Lost.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg_Lost.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 96, 48);
		this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 83, 33);
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 80, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.AntenaBase_Lost = new ModelRenderer(this, 100, 13);
		this.AntenaBase_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaBase_Lost.addBox(-1.0F, -5.5F, -4.8F, 2, 1, 1, 0.0F);
		this.Antena1L = new ModelRenderer(this, 74, 44);
		this.Antena1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1L.addBox(1.0F, -6.0F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena2L = new ModelRenderer(this, 74, 44);
		this.Antena2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2L.addBox(2.0F, -6.75F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena3L = new ModelRenderer(this, 74, 44);
		this.Antena3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3L.addBox(3.0F, -7.5F, -4.8F, 1, 1, 1, 0.0F);
		this.Antena4L = new ModelRenderer(this, 74, 44);
		this.Antena4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4L.addBox(4.0F, -8.25F, -4.8F, 1, 1, 1, 0.0F);
		this.Body_Lost = new ModelRenderer(this, 80, 16);
		this.Body_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body_Lost.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Body2_Lost = new ModelRenderer(this, 103, 35);
		this.Body2_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2_Lost.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.driver_Lost = new ModelRenderer(this, 97, 0);
		this.driver_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver_Lost.addBox(-1.0F, 9.5F, -3.35F, 2, 2, 1, 0.0F);
		this.driverbase_Lost = new ModelRenderer(this, 97, 8);
		this.driverbase_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase_Lost.addBox(-2.5F, 9.0F, -2.85F, 5, 2, 1, 0.0F);
		this.WindyStabilizer_Lost = new ModelRenderer(this, 57, 8);
		this.WindyStabilizer_Lost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.WindyStabilizer_Lost.addBox(-2.0F, 0.0F, 1.5F, 2, 10, 1, 0.0F);
		this.setRotateAngle(WindyStabilizer_Lost, 0.17453301598906276F, 0.03490658503988659F, 0.3490658503988659F);

		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm_Lost.addChild(this.Shoulder_R_Lost);
		this.Body_Lost.addChild(this.driver_Lost);
		this.driver_Lost.addChild(this.driverbase_Lost);
		this.Body_Lost.addChild(this.WindyStabilizer_Lost);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorWCyclone.isInvisible==0 && ArmorWCyclone.DriverCheck==2 && ArmorWCyclone.BodySideCheck==1)
		{
			this.AntenaBase.showModel=true;
			this.Antena1R.showModel=true;
			this.Antena2R.showModel=true;
			this.Antena3R.showModel=true;
			this.Antena4R.showModel=true;

			this.Head.showModel=true;
			this.Body.showModel=true;
			this.Body2.showModel=true;
			this.RightArm.showModel=true;
			this.RightLeg.showModel=true;
			this.Shoulder_R.showModel=true;

			this.Head_Lost.showModel=false;
			this.Body_Lost.showModel=false;
			this.Body2_Lost.showModel=false;
			this.RightLeg_Lost.showModel=false;
			this.RightArm_Lost.showModel=false;
			this.Shoulder_R_Lost.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_L.showModel=false;
			this.AntenaBase_Lost.showModel=false;
			this.Antena1L.showModel=false;
			this.Antena2L.showModel=false;
			this.Antena3L.showModel=false;
			this.Antena4L.showModel=false;
			this.driver_Lost.showModel=false;
			this.driver.showModel=true;
			this.RightMemory.showModel=true;

		}else if(ArmorWCyclone.isInvisible==0 && ArmorWCyclone.DriverCheck==1)
		{
			this.AntenaBase.showModel=false;
			this.Antena1R.showModel=true;
			this.Antena2R.showModel=true;
			this.Antena3R.showModel=true;
			this.Antena4R.showModel=true;

			this.Head.showModel=false;			
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.driver.showModel=false;

			this.Head_Lost.showModel=true;
			this.Body_Lost.showModel=true;
			this.Body2_Lost.showModel=true;
			this.RightLeg_Lost.showModel=true;
			this.RightArm_Lost.showModel=true;
			this.Shoulder_R_Lost.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_L.showModel=true;
			this.AntenaBase_Lost.showModel=true;
			this.Antena1L.showModel=true;
			this.Antena2L.showModel=true;
			this.Antena3L.showModel=true;
			this.Antena4L.showModel=true;

			this.driver_Lost.showModel=true;
			this.RightMemory.showModel=true;

		}	
		else
		{
			this.AntenaBase.showModel=false;
			this.Antena1R.showModel=false;
			this.Antena2R.showModel=false;
			this.Antena3R.showModel=false;
			this.Antena4R.showModel=false;

			this.Head.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.Shoulder_R.showModel=false;

			this.driver.showModel=false;
			this.RightMemory.showModel=false;

			this.Head_Lost.showModel=false;
			this.Body_Lost.showModel=false;
			this.Body2_Lost.showModel=false;
			this.RightLeg_Lost.showModel=false;
			this.RightArm_Lost.showModel=false;
			this.Shoulder_R_Lost.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_L.showModel=false;
			this.AntenaBase_Lost.showModel=false;
			this.Antena1L.showModel=false;
			this.Antena2L.showModel=false;
			this.Antena3L.showModel=false;
			this.Antena4L.showModel=false;
			this.driver_Lost.showModel=false;
		}

		if (this.isChild) {
			this.Head.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.RightLeg.render(f5);
			this.driver.render(f5);
			this.Body2.render(f5);
			this.AntenaBase.render(f5);
			this.Antena1R.render(f5);
			this.Antena2R.render(f5);
			this.Antena3R.render(f5);
			this.Antena4R.render(f5);

			this.AntenaBase_Lost.render(f5);
			this.Antena1L.render(f5);
			this.Antena2L.render(f5);
			this.Antena3L.render(f5);
			this.Antena4L.render(f5);
			this.Head_Lost.render(f5);
			this.Body_Lost.render(f5);
			this.RightArm_Lost.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg_Lost.render(f5);
			this.LeftLeg.render(f5);
			this.Body2_Lost.render(f5);

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RightMemory.offsetX, this.RightMemory.offsetY, this.RightMemory.offsetZ);
			GlStateManager.translate(this.RightMemory.rotationPointX * f5, this.RightMemory.rotationPointY * f5, this.RightMemory.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RightMemory.offsetX, -this.RightMemory.offsetY, -this.RightMemory.offsetZ);
			GlStateManager.translate(-this.RightMemory.rotationPointX * f5, -this.RightMemory.rotationPointY * f5, -this.RightMemory.rotationPointZ * f5);
			this.RightMemory.render(f5);
			GlStateManager.popMatrix();
		}
		else
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Head.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.RightLeg.render(f5);
			this.Body2.render(f5);

			this.AntenaBase.render(f5);
			this.Antena1R.render(f5);
			this.Antena2R.render(f5);
			this.Antena3R.render(f5);
			this.Antena4R.render(f5);

			this.AntenaBase_Lost.render(f5);			
			this.Antena1L.render(f5);
			this.Antena2L.render(f5);
			this.Antena3L.render(f5);
			this.Antena4L.render(f5);
			this.Head_Lost.render(f5);
			this.Body_Lost.render(f5);
			this.RightArm_Lost.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg_Lost.render(f5);
			this.LeftLeg.render(f5);
			this.Body2_Lost.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();

				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}
			this.driver.render(f5);			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.RightMemory.offsetX, this.RightMemory.offsetY, this.RightMemory.offsetZ);
			GlStateManager.translate(this.RightMemory.rotationPointX * f5, this.RightMemory.rotationPointY * f5, this.RightMemory.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RightMemory.offsetX, -this.RightMemory.offsetY, -this.RightMemory.offsetZ);
			GlStateManager.translate(-this.RightMemory.rotationPointX * f5, -this.RightMemory.rotationPointY * f5, -this.RightMemory.rotationPointZ * f5);
			this.RightMemory.render(f5);
			GlStateManager.popMatrix();

			if (entity.isSneaking())
			{
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
			setAngle(RightArm, this.bipedRightArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(Body2, this.bipedBody);

			setAngle(AntenaBase, this.bipedHead);
			setAngle(Antena1R, this.bipedHead);
			setAngle(Antena2R, this.bipedHead);
			setAngle(Antena3R, this.bipedHead);
			setAngle(Antena4R, this.bipedHead);

			setAngle(Head_Lost, this.bipedHead);
			setAngle(Body_Lost, this.bipedBody);
			setAngle(RightArm_Lost, this.bipedRightArm);
			setAngle(RightLeg_Lost, this.bipedRightLeg);
			setAngle(Body2_Lost, this.bipedBody);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(AntenaBase_Lost, this.bipedHead);
			setAngle(Antena1L, this.bipedHead);
			setAngle(Antena2L, this.bipedHead);
			setAngle(Antena3L, this.bipedHead);
			setAngle(Antena4L, this.bipedHead);
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