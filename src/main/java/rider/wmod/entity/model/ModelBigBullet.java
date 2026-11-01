package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Model Creator: DELMETAROID - Do not reuse this model.
// Paste this code into your mod.
// Make sure to generate all required imports

public class ModelBigBullet extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelBigBullet() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bb_main.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 1.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}