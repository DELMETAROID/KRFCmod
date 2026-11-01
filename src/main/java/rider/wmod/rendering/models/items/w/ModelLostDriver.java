package rider.wmod.rendering.models.items.w;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.w.ArmorLostDriver;

/**
 * ModelLostDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelLostDriver extends ModelBiped {
	public ModelRenderer MaximumSlot;
	public ModelRenderer driver;
	public ModelRenderer RightMemory;
	public ModelRenderer RightMemorySide;
	public ModelRenderer belt;
	public ModelRenderer driverbase;

	public ModelLostDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
        this.driverbase = new ModelRenderer(this, 33, 8);
        this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.driverbase.addBox(-2.5F, 9.0F, -2.85F, 5, 2, 1, 0.0F);
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
        this.driver.addChild(this.driverbase);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		if (entity.isSneaking()||ArmorLostDriver.isInvisible==1)
		{
			this.MaximumSlot.showModel=false;
			this.driver.showModel=false;
			this.RightMemory.showModel=false;
			this.RightMemorySide.showModel=false;
			this.belt.showModel=false;
			this.driverbase.showModel=false;
		}
		else if (ArmorLostDriver.MemoryCheck==1)
		{
			this.MaximumSlot.showModel=true;
			this.driver.showModel=false;
			this.RightMemory.showModel=false;
			this.RightMemorySide.showModel=false;
			this.belt.showModel=true;
			this.driverbase.showModel=true;
		}else{
			this.MaximumSlot.showModel=true;
			this.driver.showModel=true;
			this.RightMemory.showModel=true;
			this.RightMemorySide.showModel=true;
			this.belt.showModel=true;
			this.driverbase.showModel=true;
		}


		if(this.isChild)
		{
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
			GlStateManager.translate(this.RightMemory.offsetX, this.RightMemory.offsetY, this.RightMemory.offsetZ);
			GlStateManager.translate(this.RightMemory.rotationPointX * f5, this.RightMemory.rotationPointY * f5, this.RightMemory.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RightMemory.offsetX, -this.RightMemory.offsetY, -this.RightMemory.offsetZ);
			GlStateManager.translate(-this.RightMemory.rotationPointX * f5, -this.RightMemory.rotationPointY * f5, -this.RightMemory.rotationPointZ * f5);
			this.RightMemory.render(f5);
			GlStateManager.popMatrix();

		}else {

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
			GlStateManager.translate(this.RightMemory.offsetX, this.RightMemory.offsetY, this.RightMemory.offsetZ);
			GlStateManager.translate(this.RightMemory.rotationPointX * f5, this.RightMemory.rotationPointY * f5, this.RightMemory.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 0.5D, 1.0D);
			GlStateManager.translate(-this.RightMemory.offsetX, -this.RightMemory.offsetY, -this.RightMemory.offsetZ);
			GlStateManager.translate(-this.RightMemory.rotationPointX * f5, -this.RightMemory.rotationPointY * f5, -this.RightMemory.rotationPointZ * f5);
			this.RightMemory.render(f5);
			GlStateManager.popMatrix();
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
}
