package rider.wmod.rendering.models.items.w;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.w.ArmorWDriver;

/**
 * ModelWDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelWDriver extends ModelBiped {
	public ModelRenderer MaximumSlot;
	public ModelRenderer driver;
	public ModelRenderer LeftMemory;
	public ModelRenderer RightMemory;
	public ModelRenderer LeftMemorySide;
	public ModelRenderer RightMemorySide;
	public ModelRenderer belt;
	public ModelRenderer RightMemoryC;
	public ModelRenderer RightMemoryH;
	public ModelRenderer RightMemoryL;
	public ModelRenderer LeftMemoryJ;
	public ModelRenderer LeftMemoryM;
	public ModelRenderer LeftMemoryT;
	public ModelRenderer driverbase;

	public ModelWDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.RightMemoryC = new ModelRenderer(this, 46, 13);
		this.RightMemoryC.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightMemoryC.addBox(-3.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.LeftMemoryM = new ModelRenderer(this, 53, 20);
		this.LeftMemoryM.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftMemoryM.addBox(1.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.LeftMemoryJ = new ModelRenderer(this, 53, 13);
		this.LeftMemoryJ.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftMemoryJ.addBox(1.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.driverbase = new ModelRenderer(this, 33, 8);
		this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase.addBox(-2.5F, 9.0F, -2.85F, 5, 2, 1, 0.0F);
		this.RightMemoryL = new ModelRenderer(this, 46, 27);
		this.RightMemoryL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightMemoryL.addBox(-3.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.LeftMemorySide = new ModelRenderer(this, 46, 8);
		this.LeftMemorySide.mirror = true;
		this.LeftMemorySide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftMemorySide.addBox(3.0F, 19.0F, -3.3F, 1, 3, 1, 0.0F);
		this.driver = new ModelRenderer(this, 33, 0);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 9.5F, -3.35F, 2, 2, 1, 0.0F);
		this.RightMemorySide = new ModelRenderer(this, 46, 8);
		this.RightMemorySide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightMemorySide.addBox(-4.0F, 19.0F, -3.3F, 1, 3, 1, 0.0F);
		this.RightMemory = new ModelRenderer(this, 46, 0);
		this.RightMemory.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightMemory.addBox(-3.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.belt = new ModelRenderer(this, 16, 26);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 19.0F, -2.0F, 8, 3, 4, 0.27F);
		this.MaximumSlot = new ModelRenderer(this, 33, 8);
		this.MaximumSlot.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.MaximumSlot.addBox(-9.0F, 9.0F, -0.5F, 1, 2, 1, 0.0F);
		this.LeftMemoryT = new ModelRenderer(this, 53, 27);
		this.LeftMemoryT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftMemoryT.addBox(1.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.LeftMemory = new ModelRenderer(this, 53, 0);
		this.LeftMemory.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftMemory.addBox(1.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.RightMemoryH = new ModelRenderer(this, 46, 20);
		this.RightMemoryH.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightMemoryH.addBox(-3.0F, 17.5F, -3.3F, 2, 5, 1, 0.0F);
		this.driver.addChild(this.driverbase);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		if (entity.isSneaking()||ArmorWDriver.isInvisible==1)
		{
			this.MaximumSlot.showModel=false;
			this.driver.showModel=false;
			this.LeftMemory.showModel=false;
			this.RightMemory.showModel=false;
			this.LeftMemorySide.showModel=false;
			this.RightMemorySide.showModel=false;
			this.belt.showModel=false;
			this.RightMemoryC.showModel=false;
			this.RightMemoryH.showModel=false;
			this.RightMemoryL.showModel=false;
			this.LeftMemoryJ.showModel=false;
			this.LeftMemoryM.showModel=false;
			this.LeftMemoryT.showModel=false;
			this.driverbase.showModel=false;
		}
		else {

			if (ArmorWDriver.BothMemoryCheck==1)
			{
				this.MaximumSlot.showModel=true;
				this.belt.showModel=true;

				this.driver.showModel=false;
				this.LeftMemory.showModel=false;
				this.RightMemory.showModel=false;
				this.LeftMemorySide.showModel=false;
				this.RightMemorySide.showModel=false;
				this.RightMemoryC.showModel=false;
				this.RightMemoryH.showModel=false;
				this.RightMemoryL.showModel=false;
				this.LeftMemoryJ.showModel=false;
				this.LeftMemoryM.showModel=false;
				this.LeftMemoryT.showModel=false;
				this.driverbase.showModel=false;
			}else{

				if(ArmorWDriver.MemoryCheckJ+ArmorWDriver.MemoryCheckM+ArmorWDriver.MemoryCheckT>0)
				{
					this.LeftMemory.showModel=false;
				}
				else
				{
					this.LeftMemory.showModel=true;
				}

				if(ArmorWDriver.MemoryCheckC+ArmorWDriver.MemoryCheckH+ArmorWDriver.MemoryCheckL>0)
				{
					this.RightMemory.showModel=false;
				}
				else
				{
					this.RightMemory.showModel=true;
				}

				if(ArmorWDriver.MemoryCheckC==1&&ArmorWDriver.BothMemoryCheck==0) {this.RightMemoryC.showModel=true;}
				else{this.RightMemoryC.showModel=false;}

				if(ArmorWDriver.MemoryCheckH==1&&ArmorWDriver.BothMemoryCheck==0) {this.RightMemoryH.showModel=true;}
				else{this.RightMemoryH.showModel=false;}

				if(ArmorWDriver.MemoryCheckL==1&&ArmorWDriver.BothMemoryCheck==0) {this.RightMemoryL.showModel=true;}
				else{this.RightMemoryL.showModel=false;}

				if(ArmorWDriver.MemoryCheckJ==1&&ArmorWDriver.BothMemoryCheck==0) {this.LeftMemoryJ.showModel=true;}
				else{this.LeftMemoryJ.showModel=false;}

				if(ArmorWDriver.MemoryCheckM==1&&ArmorWDriver.BothMemoryCheck==0) {this.LeftMemoryM.showModel=true;}
				else{this.LeftMemoryM.showModel=false;}

				if(ArmorWDriver.MemoryCheckT==1&&ArmorWDriver.BothMemoryCheck==0) {this.LeftMemoryT.showModel=true;}
				else{this.LeftMemoryT.showModel=false;}
			}
		}

		GlStateManager.pushMatrix();
		GlStateManager.translate(this.RightMemoryC.offsetX, this.RightMemoryC.offsetY, this.RightMemoryC.offsetZ);
		GlStateManager.translate(this.RightMemoryC.rotationPointX * f5, this.RightMemoryC.rotationPointY * f5, this.RightMemoryC.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.RightMemoryC.offsetX, -this.RightMemoryC.offsetY, -this.RightMemoryC.offsetZ);
		GlStateManager.translate(-this.RightMemoryC.rotationPointX * f5, -this.RightMemoryC.rotationPointY * f5, -this.RightMemoryC.rotationPointZ * f5);
		this.RightMemoryC.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.LeftMemoryM.offsetX, this.LeftMemoryM.offsetY, this.LeftMemoryM.offsetZ);
		GlStateManager.translate(this.LeftMemoryM.rotationPointX * f5, this.LeftMemoryM.rotationPointY * f5, this.LeftMemoryM.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.LeftMemoryM.offsetX, -this.LeftMemoryM.offsetY, -this.LeftMemoryM.offsetZ);
		GlStateManager.translate(-this.LeftMemoryM.rotationPointX * f5, -this.LeftMemoryM.rotationPointY * f5, -this.LeftMemoryM.rotationPointZ * f5);
		this.LeftMemoryM.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.LeftMemoryJ.offsetX, this.LeftMemoryJ.offsetY, this.LeftMemoryJ.offsetZ);
		GlStateManager.translate(this.LeftMemoryJ.rotationPointX * f5, this.LeftMemoryJ.rotationPointY * f5, this.LeftMemoryJ.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.LeftMemoryJ.offsetX, -this.LeftMemoryJ.offsetY, -this.LeftMemoryJ.offsetZ);
		GlStateManager.translate(-this.LeftMemoryJ.rotationPointX * f5, -this.LeftMemoryJ.rotationPointY * f5, -this.LeftMemoryJ.rotationPointZ * f5);
		this.LeftMemoryJ.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.RightMemoryL.offsetX, this.RightMemoryL.offsetY, this.RightMemoryL.offsetZ);
		GlStateManager.translate(this.RightMemoryL.rotationPointX * f5, this.RightMemoryL.rotationPointY * f5, this.RightMemoryL.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.RightMemoryL.offsetX, -this.RightMemoryL.offsetY, -this.RightMemoryL.offsetZ);
		GlStateManager.translate(-this.RightMemoryL.rotationPointX * f5, -this.RightMemoryL.rotationPointY * f5, -this.RightMemoryL.rotationPointZ * f5);
		this.RightMemoryL.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.LeftMemorySide.offsetX, this.LeftMemorySide.offsetY, this.LeftMemorySide.offsetZ);
		GlStateManager.translate(this.LeftMemorySide.rotationPointX * f5, this.LeftMemorySide.rotationPointY * f5, this.LeftMemorySide.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.LeftMemorySide.offsetX, -this.LeftMemorySide.offsetY, -this.LeftMemorySide.offsetZ);
		GlStateManager.translate(-this.LeftMemorySide.rotationPointX * f5, -this.LeftMemorySide.rotationPointY * f5, -this.LeftMemorySide.rotationPointZ * f5);
		this.LeftMemorySide.render(f5);
		GlStateManager.popMatrix();
		this.driver.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.RightMemorySide.offsetX, this.RightMemorySide.offsetY, this.RightMemorySide.offsetZ);
		GlStateManager.translate(this.RightMemorySide.rotationPointX * f5, this.RightMemorySide.rotationPointY * f5, this.RightMemorySide.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.RightMemorySide.offsetX, -this.RightMemorySide.offsetY, -this.RightMemorySide.offsetZ);
		GlStateManager.translate(-this.RightMemorySide.rotationPointX * f5, -this.RightMemorySide.rotationPointY * f5, -this.RightMemorySide.rotationPointZ * f5);
		this.RightMemorySide.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.RightMemory.offsetX, this.RightMemory.offsetY, this.RightMemory.offsetZ);
		GlStateManager.translate(this.RightMemory.rotationPointX * f5, this.RightMemory.rotationPointY * f5, this.RightMemory.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.RightMemory.offsetX, -this.RightMemory.offsetY, -this.RightMemory.offsetZ);
		GlStateManager.translate(-this.RightMemory.rotationPointX * f5, -this.RightMemory.rotationPointY * f5, -this.RightMemory.rotationPointZ * f5);
		this.RightMemory.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.belt.offsetX, this.belt.offsetY, this.belt.offsetZ);
		GlStateManager.translate(this.belt.rotationPointX * f5, this.belt.rotationPointY * f5, this.belt.rotationPointZ * f5);
		GlStateManager.scale(1.0D, 0.5D, 1.0D);
		GlStateManager.translate(-this.belt.offsetX, -this.belt.offsetY, -this.belt.offsetZ);
		GlStateManager.translate(-this.belt.rotationPointX * f5, -this.belt.rotationPointY * f5, -this.belt.rotationPointZ * f5);
		this.belt.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.MaximumSlot.offsetX, this.MaximumSlot.offsetY, this.MaximumSlot.offsetZ);
		GlStateManager.translate(this.MaximumSlot.rotationPointX * f5, this.MaximumSlot.rotationPointY * f5, this.MaximumSlot.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 1.0D, 1.0D);
		GlStateManager.translate(-this.MaximumSlot.offsetX, -this.MaximumSlot.offsetY, -this.MaximumSlot.offsetZ);
		GlStateManager.translate(-this.MaximumSlot.rotationPointX * f5, -this.MaximumSlot.rotationPointY * f5, -this.MaximumSlot.rotationPointZ * f5);
		this.MaximumSlot.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.LeftMemoryT.offsetX, this.LeftMemoryT.offsetY, this.LeftMemoryT.offsetZ);
		GlStateManager.translate(this.LeftMemoryT.rotationPointX * f5, this.LeftMemoryT.rotationPointY * f5, this.LeftMemoryT.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.LeftMemoryT.offsetX, -this.LeftMemoryT.offsetY, -this.LeftMemoryT.offsetZ);
		GlStateManager.translate(-this.LeftMemoryT.rotationPointX * f5, -this.LeftMemoryT.rotationPointY * f5, -this.LeftMemoryT.rotationPointZ * f5);
		this.LeftMemoryT.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.LeftMemory.offsetX, this.LeftMemory.offsetY, this.LeftMemory.offsetZ);
		GlStateManager.translate(this.LeftMemory.rotationPointX * f5, this.LeftMemory.rotationPointY * f5, this.LeftMemory.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.LeftMemory.offsetX, -this.LeftMemory.offsetY, -this.LeftMemory.offsetZ);
		GlStateManager.translate(-this.LeftMemory.rotationPointX * f5, -this.LeftMemory.rotationPointY * f5, -this.LeftMemory.rotationPointZ * f5);
		this.LeftMemory.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.RightMemoryH.offsetX, this.RightMemoryH.offsetY, this.RightMemoryH.offsetZ);
		GlStateManager.translate(this.RightMemoryH.rotationPointX * f5, this.RightMemoryH.rotationPointY * f5, this.RightMemoryH.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 1.0D);
		GlStateManager.translate(-this.RightMemoryH.offsetX, -this.RightMemoryH.offsetY, -this.RightMemoryH.offsetZ);
		GlStateManager.translate(-this.RightMemoryH.rotationPointX * f5, -this.RightMemoryH.rotationPointY * f5, -this.RightMemoryH.rotationPointZ * f5);
		this.RightMemoryH.render(f5);
		GlStateManager.popMatrix();
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
