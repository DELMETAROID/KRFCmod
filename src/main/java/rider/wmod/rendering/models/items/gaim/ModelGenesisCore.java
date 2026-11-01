package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.gaim.sengoku.ArmorGenesisCore;

/**
 * ModelGenesisCore - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGenesisCore extends ModelBiped {
	public ModelRenderer buckleGenesisCore;

	public ModelGenesisCore() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.buckleGenesisCore = new ModelRenderer(this, 34, 37);
		this.buckleGenesisCore.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.buckleGenesisCore.addBox(1.45F, 8.5F, -3.0F, 1, 2, 1, 0.3F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		if(ArmorGenesisCore.DriverCheck==1)
		{
			this.buckleGenesisCore.showModel=true;
		}else {
			this.buckleGenesisCore.showModel=false;
		}
		
		if (this.isChild) {
			this.buckleGenesisCore.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}
			this.buckleGenesisCore.render(f5);
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
}
