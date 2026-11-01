package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.exaid.ArmorGamerDriver;

/**
 * ModelGamerDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGamerDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer driver;
	public ModelRenderer shapeL;
	public ModelRenderer KimewazaSlot;
	public ModelRenderer KimewazaSlot2;
	public ModelRenderer centor;
	public ModelRenderer beltL;
	public ModelRenderer beltR;
	public ModelRenderer LeverClosed;
	public ModelRenderer lever2;
	public ModelRenderer lever1;
	public ModelRenderer lever3;

	public ModelRenderer slot1;
	public ModelRenderer slot2;

	public ModelRenderer mutekiGashat;
	public ModelRenderer drivermuteki;
	public ModelRenderer slotmuteki;
	
	public ModelRenderer fumetsuGashat;
	public ModelRenderer driverfumetsu;
	public ModelRenderer slotfumetsu;


	public ModelGamerDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Belt = new ModelRenderer(this, 16, 25);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.LeverClosed = new ModelRenderer(this, 7, 53);
		this.LeverClosed.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeverClosed.addBox(-1.3F, 8.0F, 4.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(LeverClosed, 0.0F, 3.141592653589793F, 0.0F);
		this.lever2 = new ModelRenderer(this, 11, 57);
		this.lever2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever2.addBox(-3.2F, 8.0F, 4.0F, 1, 3, 1, 0.0F);
		this.centor = new ModelRenderer(this, 1, 60);
		this.centor.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.centor.addBox(1.05F, 7.9F, -4.2F, 2, 1, 2, 0.0F);
		this.lever3 = new ModelRenderer(this, 10, 59);
		this.lever3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever3.addBox(-2.3F, 10.45F, 4.0F, 1, 1, 1, 0.0F);
		this.KimewazaSlot = new ModelRenderer(this, 40, 17);
		this.KimewazaSlot.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.KimewazaSlot.addBox(4.25F, 8.5F, -1.0F, 1, 3, 2, 0.0F);
		this.beltR = new ModelRenderer(this, 0, 58);
		this.beltR.mirror = true;
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-2.0F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.driver = new ModelRenderer(this, 0, 47);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 8.0F, -4.0F, 2, 3, 2, 0.0F);
		this.beltL = new ModelRenderer(this, 0, 58);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(3.0F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.lever1 = new ModelRenderer(this, 10, 57);
		this.lever1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lever1.addBox(-2.3F, 7.75F, 4.0F, 1, 1, 1, 0.0F);
		this.shapeL = new ModelRenderer(this, 2, 58);
		this.shapeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shapeL.addBox(2.7F, 8.8F, -3.8F, 1, 1, 1, 0.0F);
		this.KimewazaSlot2 = new ModelRenderer(this, 40, 14);
		this.KimewazaSlot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.KimewazaSlot2.addBox(3.5F, 7.5F, -1.0F, 1, 1, 2, 0.0F);
		this.slot1 = new ModelRenderer(this, 2, 47);
		this.slot1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.slot1.addBox(1.0F, 8.0F, -4.0F, 1, 3, 2, 0.0F);
		this.slot2 = new ModelRenderer(this, 3, 47);
		this.slot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.slot2.addBox(2.0F, 8.0F, -4.0F, 1, 3, 2, 0.0F);

		this.mutekiGashat = new ModelRenderer(this, 9, 43);
		this.mutekiGashat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mutekiGashat.addBox(2.0F, 6.1F, -4.0F, 2, 2, 2, -0.2F);
		this.drivermuteki = new ModelRenderer(this, 0, 42);
		this.drivermuteki.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.drivermuteki.addBox(-1.0F, 8.0F, -4.0F, 2, 3, 2, 0.0F);
		this.slotmuteki = new ModelRenderer(this, 3, 42);
		this.slotmuteki.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.slotmuteki.addBox(2.0F, 8.0F, -4.0F, 1, 3, 2, 0.0F);       

		this.fumetsuGashat = new ModelRenderer(this, 9, 38);
		this.fumetsuGashat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.fumetsuGashat.addBox(2.0F, 6.1F, -4.0F, 2, 2, 2, -0.2F);
		this.driverfumetsu = new ModelRenderer(this, 0, 37);
		this.driverfumetsu.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverfumetsu.addBox(-1.0F, 8.0F, -4.0F, 2, 3, 2, 0.0F);
		this.slotfumetsu = new ModelRenderer(this, 3, 37);
		this.slotfumetsu.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.slotfumetsu.addBox(2.0F, 8.0F, -4.0F, 1, 3, 2, 0.0F);    
		
		this.Belt.addChild(beltL);
		this.Belt.addChild(beltR);
		this.Belt.addChild(centor);
		this.Belt.addChild(LeverClosed);
		this.LeverClosed.addChild(this.lever2);
		this.LeverClosed.addChild(this.lever3);
		this.LeverClosed.addChild(this.lever1);
		this.KimewazaSlot.addChild(this.KimewazaSlot2);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGamerDriver.isInvisible==1)
		{
			this.Belt.showModel=false;
			this.KimewazaSlot.showModel=false;
			this.driver.showModel=false;
			this.slot1.showModel=false;
			this.slot2.showModel=false;
			this.shapeL.showModel=false;
			this.mutekiGashat.showModel=false;
			this.slotmuteki.showModel=false;
			this.drivermuteki.showModel=false;
			this.mutekiGashat.showModel=false;
			this.slotmuteki.showModel=false;
			this.drivermuteki.showModel=false;
		}
		else
		{
			if(ArmorGamerDriver.level1checkDriver==1) 
			{
				this.driver.showModel=false;
				this.slot1.showModel=false;
				this.slot2.showModel=false;
				this.shapeL.showModel=false;
				this.centor.showModel=false;
				this.beltL.showModel=false;
				this.beltR.showModel=false;
				this.LeverClosed.showModel=false;
				this.lever2.showModel=false;
				this.lever1.showModel=false;
				this.lever3.showModel=false;
				this.mutekiGashat.showModel=false;
				this.slotmuteki.showModel=false;
				this.drivermuteki.showModel=false;
				this.mutekiGashat.showModel=false;
				this.slotmuteki.showModel=false;
				this.drivermuteki.showModel=false;
				this.fumetsuGashat.showModel=false;
				this.slotfumetsu.showModel=false;
				this.driverfumetsu.showModel=false;
			}			
			else
			{
				this.Belt.showModel=true;
				this.KimewazaSlot.showModel=true;
				this.shapeL.showModel=true;
				
				if(ArmorGamerDriver.MutekiFlag==1) 
				{
					this.slot2.showModel=false;
					this.driver.showModel=false;					
					this.mutekiGashat.showModel=true;
					this.slotmuteki.showModel=true;
					this.drivermuteki.showModel=true;
				}else {
					this.mutekiGashat.showModel=false;
					this.slotmuteki.showModel=false;
					this.drivermuteki.showModel=false;
				}
				if(ArmorGamerDriver.FumetsuFlag==1) 
				{
					this.slot2.showModel=false;
					this.driver.showModel=false;				
					this.fumetsuGashat.showModel=true;
					this.slotfumetsu.showModel=true;
					this.driverfumetsu.showModel=true;
				}else {
					this.fumetsuGashat.showModel=false;
					this.slotfumetsu.showModel=false;
					this.driverfumetsu.showModel=false;
				}

				if(ArmorGamerDriver.checkRidePlayer==1)
				{
					this.slot1.showModel=false;

					if(ArmorGamerDriver.gashatIn2==1) 
					{
						this.driver.showModel=false;
						this.LeverClosed.showModel=false;
						this.slot2.showModel=false;
					}else {
						this.driver.showModel=true;
						this.LeverClosed.showModel=true;
						this.slot2.showModel=true;
					}

				}
				else if(ArmorGamerDriver.gashatIn==1)
				{
					this.slot1.showModel=false;	
					this.LeverClosed.showModel=false;
					this.lever2.showModel=false;
					this.lever1.showModel=false;
					this.lever3.showModel=false;		

					if(ArmorGamerDriver.gashatIn2==1) 
					{
						this.driver.showModel=false;
						this.slot2.showModel=false;

					}
					else if(ArmorGamerDriver.DoublegashatIn==1)
					{
						this.driver.showModel=false;
					}else {
						this.driver.showModel=true;
					}
				}
				else
				{
					this.driver.showModel=true;
					this.shapeL.showModel=true;
					this.centor.showModel=true;
					this.beltL.showModel=true;
					this.beltR.showModel=true;

					this.LeverClosed.showModel=true;
					this.lever2.showModel=true;
					this.lever1.showModel=true;
					this.lever3.showModel=true;
					this.mutekiGashat.showModel=false;
					this.slotmuteki.showModel=false;
					this.drivermuteki.showModel=false;
					this.fumetsuGashat.showModel=false;
					this.slotfumetsu.showModel=false;
					this.driverfumetsu.showModel=false;
				}
			}
		}

		if (this.isChild) {
			this.Belt.render(f5);
			this.KimewazaSlot.render(f5);
			this.driver.render(f5);
			this.shapeL.render(f5);
			this.slot1.render(f5);
			this.slot2.render(f5);
			this.mutekiGashat.render(f5);
			this.slotmuteki.render(f5);
			this.drivermuteki.render(f5);
			this.fumetsuGashat.render(f5);
			this.slotfumetsu.render(f5);
			this.driverfumetsu.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Belt.render(f5);
			this.KimewazaSlot.render(f5);
			this.driver.render(f5);
			this.shapeL.render(f5);
			this.slot1.render(f5);
			this.slot2.render(f5);
			this.mutekiGashat.render(f5);
			this.slotmuteki.render(f5);
			this.drivermuteki.render(f5);
			this.fumetsuGashat.render(f5);
			this.slotfumetsu.render(f5);
			this.driverfumetsu.render(f5);
			
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

		setAngle(Belt, this.bipedBody);
		setAngle(driver, this.bipedBody);
		setAngle(slot1, this.bipedBody);
		setAngle(slot2, this.bipedBody);
		setAngle(KimewazaSlot, this.bipedBody);
		setAngle(shapeL, this.bipedBody);
		setAngle(mutekiGashat, this.bipedBody);
		setAngle(slotmuteki, this.bipedBody);
		setAngle(drivermuteki, this.bipedBody);
		setAngle(fumetsuGashat, this.bipedBody);
		setAngle(slotfumetsu, this.bipedBody);
		setAngle(driverfumetsu, this.bipedBody);

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
