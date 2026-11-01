package rider.wmod.rendering.models.items.zeztz;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.zeztz.ArmorZeztzDriver;

/**
 * ModelZeztzDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelZeztzDriver extends ModelBiped {
	public ModelRenderer DriverBelt;
	public ModelRenderer Driver;

	public ModelRenderer BlackHead;
	public ModelRenderer BlackHeadC;
	public ModelRenderer BlackHeadL;
	public ModelRenderer BlackHeadR;
	public ModelRenderer BlackHead2L;
	public ModelRenderer BlackHead2R;
	public ModelRenderer BlackHead3L;
	public ModelRenderer BlackHead3R;
	public ModelRenderer BlackHead4R;
	public ModelRenderer BlackHead4L;
	public ModelRenderer BlackHead5L;
	public ModelRenderer BlackHead5R;
	public ModelRenderer BlackBody;
	public ModelRenderer BlackLeftArm;
	public ModelRenderer BlackRightArm;
	public ModelRenderer BlackLeftLeg;
	public ModelRenderer BlackRightLeg;
	public ModelRenderer BlackHead2;

	public ModelRenderer BlackEye1L;
	public ModelRenderer BlackEye2L;
	public ModelRenderer BlackEye3L;
	public ModelRenderer BlackEye4L;
	public ModelRenderer BlackEye5L;
	public ModelRenderer BlackEye6L;
	public ModelRenderer BlackEye1R;
	public ModelRenderer BlackEye2R;
	public ModelRenderer BlackEye3R;
	public ModelRenderer BlackEye4R;
	public ModelRenderer BlackEye5R;
	public ModelRenderer BlackEye6R;

	public ModelRenderer CapsemImpact;
	public ModelRenderer CapsemTransform;
	public ModelRenderer CapsemWing;
	public ModelRenderer CapsemStream;
	public ModelRenderer CapsemMachinary;
	public ModelRenderer CapsemProjection;
	public ModelRenderer CapsemRecovery;
	public ModelRenderer CapsemBarrior;
	public ModelRenderer CapsemWonder;
	public ModelRenderer CapsemGravity;
	public ModelRenderer CapsemPlazma;
	public ModelRenderer CapsemBooster;
	public ModelRenderer CapsemDarkness;

	public ModelRenderer DriverBelt1R;
	public ModelRenderer DriverBelt2R;
	public ModelRenderer Driver1R;
	public ModelRenderer Driver2R;
	public ModelRenderer DriverC;
	public ModelRenderer Driver3R;
	public ModelRenderer Driver4R;
	public ModelRenderer DriverBelt3R;
	public ModelRenderer DriverBelt4R;
	public ModelRenderer DriverBelt1RE;
	public ModelRenderer DriverBelt2RE;
	public ModelRenderer Driver1RE;
	public ModelRenderer Driver2RE;
	public ModelRenderer DriverCRE;
	public ModelRenderer Driver3RE;
	public ModelRenderer Driver4RE;
	public ModelRenderer DriverBelt3RE;
	public ModelRenderer DriverBelt4RE;

	public ModelRenderer DriverBelt1B;
	public ModelRenderer DriverBelt2B;
	public ModelRenderer Driver1B;
	public ModelRenderer Driver2B;
	public ModelRenderer Driver3B;
	public ModelRenderer Driver4B;
	public ModelRenderer DriverBelt3B;
	public ModelRenderer DriverBelt4B;
	public ModelRenderer DriverBelt1BE;
	public ModelRenderer DriverBelt2BE;
	public ModelRenderer Driver1BE;
	public ModelRenderer Driver2BE;
	public ModelRenderer DriverCBE;
	public ModelRenderer Driver3BE;
	public ModelRenderer Driver4BE;
	public ModelRenderer DriverBelt3BE;
	public ModelRenderer DriverBelt4BE;

	public ModelRenderer DriverBelt1G;
	public ModelRenderer DriverBelt2G;
	public ModelRenderer Driver1G;
	public ModelRenderer Driver2G;
	public ModelRenderer Driver3G;
	public ModelRenderer Driver4G;
	public ModelRenderer DriverBelt3G;
	public ModelRenderer DriverBelt4G;
	public ModelRenderer DriverBelt1GE;
	public ModelRenderer DriverBelt2GE;
	public ModelRenderer Driver1GE;
	public ModelRenderer Driver2GE;
	public ModelRenderer DriverCGE;
	public ModelRenderer Driver3GE;
	public ModelRenderer Driver4GE;
	public ModelRenderer DriverBelt3GE;
	public ModelRenderer DriverBelt4GE;

	public ModelRenderer DriverBelt1P;
	public ModelRenderer DriverBelt2P;
	public ModelRenderer Driver1P;
	public ModelRenderer Driver2P;
	public ModelRenderer Driver3P;
	public ModelRenderer Driver4P;
	public ModelRenderer DriverBelt3P;
	public ModelRenderer DriverBelt4P;
	public ModelRenderer DriverBelt1PE;
	public ModelRenderer DriverBelt2PE;
	public ModelRenderer Driver1PE;
	public ModelRenderer Driver2PE;
	public ModelRenderer DriverCPE;
	public ModelRenderer Driver3PE;
	public ModelRenderer Driver4PE;
	public ModelRenderer DriverBelt3PE;
	public ModelRenderer DriverBelt4PE;

	public ModelRenderer DriverBelt1Y;
	public ModelRenderer DriverBelt2Y;
	public ModelRenderer Driver1Y;
	public ModelRenderer Driver2Y;
	public ModelRenderer DriverCY;
	public ModelRenderer Driver3Y;
	public ModelRenderer Driver4Y;
	public ModelRenderer DriverBelt3Y;
	public ModelRenderer DriverBelt4Y;
	public ModelRenderer DriverBelt1W;
	public ModelRenderer DriverBelt2W;
	public ModelRenderer Driver1W;
	public ModelRenderer Driver2W;
	public ModelRenderer Driver3W;
	public ModelRenderer Driver4W;
	public ModelRenderer DriverBelt3W;
	public ModelRenderer DriverBelt4W;

	public ModelZeztzDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Driver = new ModelRenderer(this, 48, 4);
		this.Driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver.addBox(2.0F, -0.75F, -3.0F, 2, 5, 1, 0.0F);
		this.DriverBelt = new ModelRenderer(this, 0, 51);
		this.DriverBelt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt.addBox(2.5F, -2.75F, -2.0F, 1, 9, 4, 0.36F);
		this.setRotateAngle(DriverBelt, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt.addChild(this.Driver);

		this.CapsemImpact = new ModelRenderer(this, 0, 16);
		this.CapsemImpact.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemImpact.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemImpact, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemTransform = new ModelRenderer(this, 0, 18);
		this.CapsemTransform.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemTransform.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemTransform, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemWing = new ModelRenderer(this, 12, 16);
		this.CapsemWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemWing.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemWing, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemStream = new ModelRenderer(this, 16, 16);
		this.CapsemStream.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemStream.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemStream, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemMachinary = new ModelRenderer(this, 12, 18);
		this.CapsemMachinary.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemMachinary.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemMachinary, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemProjection = new ModelRenderer(this, 16, 18);
		this.CapsemProjection.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemProjection.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemProjection, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemRecovery = new ModelRenderer(this, 36, 16);
		this.CapsemRecovery.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemRecovery.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemRecovery, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemBarrior = new ModelRenderer(this, 40, 16);
		this.CapsemBarrior.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemBarrior.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemBarrior, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemWonder = new ModelRenderer(this, 36, 18);
		this.CapsemWonder.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemWonder.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemWonder, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemGravity = new ModelRenderer(this, 40, 18);
		this.CapsemGravity.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemGravity.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemGravity, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemPlazma = new ModelRenderer(this, 52, 16);
		this.CapsemPlazma.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemPlazma.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemPlazma, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemBooster = new ModelRenderer(this, 52, 18);
		this.CapsemBooster.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemBooster.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemBooster, 0.0F, 0.0F, 1.0471975511965976F);
		this.CapsemDarkness = new ModelRenderer(this, 16, 48);
		this.CapsemDarkness.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CapsemDarkness.addBox(2.5F, 1.25F, -3.25F, 1, 1, 1, 0.0F);
		this.setRotateAngle(CapsemDarkness, 0.0F, 0.0F, 1.0471975511965976F);
		//R
		this.DriverBelt1R = new ModelRenderer(this, 24, 0);
		this.DriverBelt1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1R.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1R, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2R = new ModelRenderer(this, 28, 0);
		this.DriverBelt2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2R.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2R, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1R = new ModelRenderer(this, 53, 4);
		this.Driver1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1R.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1R, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2R = new ModelRenderer(this, 53, 5);
		this.Driver2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2R.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2R, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverC = new ModelRenderer(this, 53, 6);
		this.DriverC.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverC.addBox(2.0F, 1.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(DriverC, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3R = new ModelRenderer(this, 53, 7);
		this.Driver3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3R.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3R, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4R = new ModelRenderer(this, 53, 8);
		this.Driver4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4R.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4R, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3R = new ModelRenderer(this, 28, 0);
		this.DriverBelt3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3R.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3R, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4R = new ModelRenderer(this, 32, 0);
		this.DriverBelt4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4R.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4R, 0.0F, 0.0F, 1.0471975511965976F);

		this.DriverBelt1RE = new ModelRenderer(this, 24, 2);
		this.DriverBelt1RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1RE.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2RE = new ModelRenderer(this, 28, 2);
		this.DriverBelt2RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2RE.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1RE = new ModelRenderer(this, 58, 4);
		this.Driver1RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1RE.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2RE = new ModelRenderer(this, 58, 5);
		this.Driver2RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2RE.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverCRE = new ModelRenderer(this, 58, 6);
		this.DriverCRE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverCRE.addBox(2.0F, 1.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(DriverCRE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3RE = new ModelRenderer(this, 58, 7);
		this.Driver3RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3RE.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4RE = new ModelRenderer(this, 58, 8);
		this.Driver4RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4RE.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3RE = new ModelRenderer(this, 28, 2);
		this.DriverBelt3RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3RE.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3RE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4RE = new ModelRenderer(this, 32, 2);
		this.DriverBelt4RE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4RE.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4RE, 0.0F, 0.0F, 1.0471975511965976F);
		//B
		this.DriverBelt1B = new ModelRenderer(this, 24, 4);
		this.DriverBelt1B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1B.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1B, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2B = new ModelRenderer(this, 28, 4);
		this.DriverBelt2B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2B.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2B, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1B = new ModelRenderer(this, 32, 10);
		this.Driver1B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1B.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1B, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2B = new ModelRenderer(this, 32, 11);
		this.Driver2B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2B.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2B, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3B = new ModelRenderer(this, 32, 13);
		this.Driver3B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3B.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3B, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4B = new ModelRenderer(this, 32, 14);
		this.Driver4B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4B.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4B, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3B = new ModelRenderer(this, 28, 4);
		this.DriverBelt3B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3B.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3B, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4B = new ModelRenderer(this, 32, 4);
		this.DriverBelt4B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4B.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4B, 0.0F, 0.0F, 1.0471975511965976F);

		this.DriverBelt1BE = new ModelRenderer(this, 24, 6);
		this.DriverBelt1BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1BE.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2BE = new ModelRenderer(this, 28, 6);
		this.DriverBelt2BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2BE.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1BE = new ModelRenderer(this, 37, 10);
		this.Driver1BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1BE.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2BE = new ModelRenderer(this, 37, 11);
		this.Driver2BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2BE.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverCBE = new ModelRenderer(this, 37, 12);
		this.DriverCBE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverCBE.addBox(2.0F, 1.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(DriverCBE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3BE = new ModelRenderer(this, 37, 13);
		this.Driver3BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3BE.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4BE = new ModelRenderer(this, 37, 14);
		this.Driver4BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4BE.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3BE = new ModelRenderer(this, 28, 6);
		this.DriverBelt3BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3BE.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3BE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4BE = new ModelRenderer(this, 32, 6);
		this.DriverBelt4BE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4BE.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4BE, 0.0F, 0.0F, 1.0471975511965976F);
		//G
		this.DriverBelt1G = new ModelRenderer(this, 36, 0);
		this.DriverBelt1G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1G.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1G, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2G = new ModelRenderer(this, 40, 0);
		this.DriverBelt2G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2G.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2G, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1G = new ModelRenderer(this, 42, 10);
		this.Driver1G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1G.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1G, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2G = new ModelRenderer(this, 42, 11);
		this.Driver2G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2G.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2G, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3G = new ModelRenderer(this, 42, 13);
		this.Driver3G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3G.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3G, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4G = new ModelRenderer(this, 42, 14);
		this.Driver4G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4G.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4G, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3G = new ModelRenderer(this, 40, 0);
		this.DriverBelt3G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3G.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3G, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4G = new ModelRenderer(this, 44, 0);
		this.DriverBelt4G.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4G.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4G, 0.0F, 0.0F, 1.0471975511965976F);

		this.DriverBelt1GE = new ModelRenderer(this, 36, 2);
		this.DriverBelt1GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1GE.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2GE = new ModelRenderer(this, 40, 2);
		this.DriverBelt2GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2GE.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1GE = new ModelRenderer(this, 47, 4);
		this.Driver1GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1GE.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2GE = new ModelRenderer(this, 47, 5);
		this.Driver2GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2GE.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverCGE = new ModelRenderer(this, 47, 6);
		this.DriverCGE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverCGE.addBox(2.0F, 1.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(DriverCGE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3GE = new ModelRenderer(this, 47, 7);
		this.Driver3GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3GE.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4GE = new ModelRenderer(this, 47, 8);
		this.Driver4GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4GE.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3GE = new ModelRenderer(this, 40, 2);
		this.DriverBelt3GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3GE.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3GE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4GE = new ModelRenderer(this, 44, 2);
		this.DriverBelt4GE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4GE.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4GE, 0.0F, 0.0F, 1.0471975511965976F);
		//P
		this.DriverBelt1P = new ModelRenderer(this, 36, 4);
		this.DriverBelt1P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1P.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1P, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2P = new ModelRenderer(this, 40, 4);
		this.DriverBelt2P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2P.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2P, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1P = new ModelRenderer(this, 52, 10);
		this.Driver1P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1P.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1P, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2P = new ModelRenderer(this, 52, 11);
		this.Driver2P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2P.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2P, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3P = new ModelRenderer(this, 52, 13);
		this.Driver3P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3P.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3P, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4P = new ModelRenderer(this, 52, 14);
		this.Driver4P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4P.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4P, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3P = new ModelRenderer(this, 40, 4);
		this.DriverBelt3P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3P.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3P, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4P = new ModelRenderer(this, 44, 4);
		this.DriverBelt4P.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4P.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4P, 0.0F, 0.0F, 1.0471975511965976F);

		this.DriverBelt1PE = new ModelRenderer(this, 36, 6);
		this.DriverBelt1PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1PE.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2PE = new ModelRenderer(this, 40, 6);
		this.DriverBelt2PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2PE.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1PE = new ModelRenderer(this, 57, 10);
		this.Driver1PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1PE.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2PE = new ModelRenderer(this, 57, 11);
		this.Driver2PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2PE.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverCPE = new ModelRenderer(this, 57, 12);
		this.DriverCPE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverCPE.addBox(2.0F, 1.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(DriverCPE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3PE = new ModelRenderer(this, 57, 13);
		this.Driver3PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3PE.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4PE = new ModelRenderer(this, 57, 14);
		this.Driver4PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4PE.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3PE = new ModelRenderer(this, 40, 6);
		this.DriverBelt3PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3PE.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3PE, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4PE = new ModelRenderer(this, 44, 6);
		this.DriverBelt4PE.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4PE.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4PE, 0.0F, 0.0F, 1.0471975511965976F);
		//Y
		this.DriverBelt1Y = new ModelRenderer(this, 48, 0);
		this.DriverBelt1Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1Y.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2Y = new ModelRenderer(this, 52, 0);
		this.DriverBelt2Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2Y.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1Y = new ModelRenderer(this, 57, 16);
		this.Driver1Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1Y.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2Y = new ModelRenderer(this, 57, 17);
		this.Driver2Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2Y.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverCY = new ModelRenderer(this, 57, 18);
		this.DriverCY.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverCY.addBox(2.0F, 1.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(DriverCY, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3Y = new ModelRenderer(this, 57, 19);
		this.Driver3Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3Y.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4Y = new ModelRenderer(this, 57, 20);
		this.Driver4Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4Y.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3Y = new ModelRenderer(this, 52, 0);
		this.DriverBelt3Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3Y.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3Y, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4Y = new ModelRenderer(this, 56, 0);
		this.DriverBelt4Y.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4Y.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4Y, 0.0F, 0.0F, 1.0471975511965976F);
		//W
		this.DriverBelt1W = new ModelRenderer(this, 48, 2);
		this.DriverBelt1W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt1W.addBox(2.5F, -2.75F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt1W, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt2W = new ModelRenderer(this, 52, 2);
		this.DriverBelt2W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt2W.addBox(2.5F, -1.05F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt2W, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver1W = new ModelRenderer(this, 57, 22);
		this.Driver1W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver1W.addBox(2.0F, -0.75F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver1W, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver2W = new ModelRenderer(this, 57, 23);
		this.Driver2W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver2W.addBox(2.0F, 0.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver2W, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver3W = new ModelRenderer(this, 57, 25);
		this.Driver3W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver3W.addBox(2.0F, 2.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver3W, 0.0F, 0.0F, 1.0471975511965976F);
		this.Driver4W = new ModelRenderer(this, 57, 26);
		this.Driver4W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Driver4W.addBox(2.0F, 3.25F, -3.0F, 2, 1, 1, 0.01F);
		this.setRotateAngle(Driver4W, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt3W = new ModelRenderer(this, 52, 2);
		this.DriverBelt3W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt3W.addBox(2.5F, 3.45F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt3W, 0.0F, 0.0F, 1.0471975511965976F);
		this.DriverBelt4W = new ModelRenderer(this, 56, 2);
		this.DriverBelt4W.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBelt4W.addBox(2.5F, 5.25F, -2.0F, 1, 1, 1, 0.4F);
		this.setRotateAngle(DriverBelt4W, 0.0F, 0.0F, 1.0471975511965976F);

		this.BlackHead = new ModelRenderer(this, 0, 32);
		this.BlackHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.BlackHeadC = new ModelRenderer(this, 0, 0);
		this.BlackHeadC.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHeadC.addBox(-0.5F, -4.5F, -5.0F, 1, 1, 1, 0.0F);
		this.BlackHeadL = new ModelRenderer(this, 0, 0);
		this.BlackHeadL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHeadL.addBox(-1.5F, -5.0F, -5.0F, 1, 1, 1, 0.0F);
		this.BlackHead2L = new ModelRenderer(this, 0, 0);
		this.BlackHead2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead2L.addBox(-2.0F, -6.5F, -5.0F, 1, 2, 1, 0.0F);
		this.BlackHead3L = new ModelRenderer(this, 0, 0);
		this.BlackHead3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead3L.addBox(-2.5F, -9.5F, -5.0F, 1, 3, 1, 0.0F);
		this.BlackHead4L = new ModelRenderer(this, 0, 0);
		this.BlackHead4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead4L.addBox(-2.5F, -10.5F, -4.0F, 1, 2, 1, 0.0F);
		this.BlackHead5L = new ModelRenderer(this, 0, 0);
		this.BlackHead5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead5L.addBox(-2.5F, -12.0F, -3.0F, 1, 2, 1, 0.0F);
		this.BlackHeadR = new ModelRenderer(this, 0, 0);
		this.BlackHeadR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHeadR.addBox(0.5F, -5.0F, -5.0F, 1, 1, 1, 0.0F);
		this.BlackHead2R = new ModelRenderer(this, 0, 0);
		this.BlackHead2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead2R.addBox(1.0F, -6.5F, -5.0F, 1, 2, 1, 0.0F);
		this.BlackHead3R = new ModelRenderer(this, 0, 0);
		this.BlackHead3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead3R.addBox(1.5F, -9.5F, -5.0F, 1, 3, 1, 0.0F);
		this.BlackHead4R = new ModelRenderer(this, 0, 0);
		this.BlackHead4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead4R.addBox(1.5F, -10.5F, -4.0F, 1, 2, 1, 0.0F);
		this.BlackHead5R = new ModelRenderer(this, 0, 0);
		this.BlackHead5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead5R.addBox(1.5F, -12.0F, -3.0F, 1, 2, 1, 0.0F);
		this.BlackHead2 = new ModelRenderer(this, 32, 32);
		this.BlackHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackHead2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);

		this.BlackBody = new ModelRenderer(this, 32, 32);
		this.BlackBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.BlackLeftArm = new ModelRenderer(this, 32, 32);
		this.BlackLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.BlackLeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.BlackRightArm = new ModelRenderer(this, 32, 32);
		this.BlackRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.BlackRightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.BlackLeftLeg = new ModelRenderer(this, 32, 32);
		this.BlackLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.BlackLeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.BlackRightLeg = new ModelRenderer(this, 32, 32);
		this.BlackRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.BlackRightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);       
		this.BlackHead.addChild(this.BlackHead4L);
		this.BlackHead.addChild(this.BlackHead5R);
		this.BlackHead.addChild(this.BlackHead2L);
		this.BlackHead.addChild(this.BlackHead3L);
		this.BlackHead.addChild(this.BlackHead3R);
		this.BlackHead.addChild(this.BlackHead4R);
		this.BlackHead.addChild(this.BlackHeadL);
		this.BlackHead.addChild(this.BlackHeadC);
		this.BlackHead.addChild(this.BlackHeadR);
		this.BlackHead.addChild(this.BlackHead5L);
		this.BlackHead.addChild(this.BlackHead2R);

		this.BlackEye1L = new ModelRenderer(this, 32, 42);
		this.BlackEye1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye1L.addBox(-4.0F, -1.8F, -4.7F, 3, 1, 1, 0.0F);
		this.BlackEye1R = new ModelRenderer(this, 32, 42);
		this.BlackEye1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye1R.addBox(1.0F, -1.8F, -4.7F, 3, 1, 1, 0.0F);
		this.BlackEye2L = new ModelRenderer(this, 32, 42);
		this.BlackEye2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye2L.addBox(-4.4F, -2.9F, -4.7F, 4, 1, 1, 0.16F);
		this.BlackEye2R = new ModelRenderer(this, 32, 42);
		this.BlackEye2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye2R.addBox(0.4F, -2.9F, -4.7F, 4, 1, 1, 0.16F);
		this.BlackEye3L = new ModelRenderer(this, 32, 42);
		this.BlackEye3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye3L.addBox(-4.4F, -4.2F, -4.7F, 4, 1, 2, 0.16F);
		this.BlackEye3R = new ModelRenderer(this, 32, 42);
		this.BlackEye3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye3R.addBox(0.4F, -4.2F, -4.7F, 4, 1, 2, 0.16F);
		this.BlackEye4L = new ModelRenderer(this, 32, 42);
		this.BlackEye4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye4L.addBox(-4.4F, -5.5F, -4.7F, 3, 1, 2, 0.16F);
		this.BlackEye4R = new ModelRenderer(this, 32, 42);
		this.BlackEye4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye4R.addBox(1.4F, -5.5F, -4.7F, 3, 1, 2, 0.16F);
		this.BlackEye5L = new ModelRenderer(this, 32, 42);
		this.BlackEye5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye5L.addBox(-4.3F, -6.9F, -4.7F, 2, 1, 3, 0.26F);
		this.BlackEye5R = new ModelRenderer(this, 32, 42);
		this.BlackEye5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye5R.addBox(2.3F, -6.9F, -4.7F, 2, 1, 3, 0.26F);
		this.BlackEye6L = new ModelRenderer(this, 32, 32);
		this.BlackEye6L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye6L.addBox(-4.3F, -8.3F, -4.6F, 1, 1, 7, 0.26F);
		this.BlackEye6R = new ModelRenderer(this, 32, 32);
		this.BlackEye6R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlackEye6R.addBox(3.3F, -8.3F, -4.6F, 1, 1, 7, 0.26F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorZeztzDriver.ZeztzElement==10)
		{
			this.DriverBelt1R.showModel=true;
			this.DriverBelt2R.showModel=true;
			this.Driver1R.showModel=true;
			this.Driver2R.showModel=true;
			this.DriverC.showModel=true;
			this.Driver3R.showModel=true;
			this.Driver4R.showModel=true;
			this.DriverBelt3R.showModel=true;
			this.DriverBelt4R.showModel=true;	
			this.CapsemImpact.showModel=true;
			this.CapsemTransform.showModel=false;
			this.CapsemWing.showModel=false;
			this.CapsemStream.showModel=false;
			this.CapsemMachinary.showModel=false;
			this.CapsemProjection.showModel=false;
			this.CapsemRecovery.showModel=false;
			this.CapsemBarrior.showModel=false;
			this.CapsemWonder.showModel=false;
			this.CapsemGravity.showModel=false;
			this.CapsemPlazma.showModel=false;
			this.CapsemBooster.showModel=false;
			this.CapsemDarkness.showModel=false;
			this.Driver1RE.showModel=false;
			this.Driver2RE.showModel=false;
			this.DriverCRE.showModel=false;
			this.Driver3RE.showModel=false;
			this.Driver4RE.showModel=false;
			this.BlackHead.showModel=false;
			this.BlackBody.showModel=false;
			this.BlackLeftArm.showModel=false;
			this.BlackRightArm.showModel=false;
			this.BlackLeftLeg.showModel=false;
			this.BlackRightLeg.showModel=false;
			this.BlackEye1L.showModel=false;
			this.BlackEye2L.showModel=false;
			this.BlackEye3L.showModel=false;
			this.BlackEye4L.showModel=false;
			this.BlackEye5L.showModel=false;
			this.BlackEye6L.showModel=false;
			this.BlackEye1R.showModel=false;
			this.BlackEye2R.showModel=false;
			this.BlackEye3R.showModel=false;
			this.BlackEye4R.showModel=false;
			this.BlackEye5R.showModel=false;
			this.BlackEye6R.showModel=false;

		}
		else	if(ArmorZeztzDriver.ZeztzElement==1) 
		{
			this.CapsemImpact.showModel=true;
			this.CapsemTransform.showModel=false;
			this.CapsemWing.showModel=false;
			this.CapsemStream.showModel=false;
			this.CapsemMachinary.showModel=false;
			this.CapsemProjection.showModel=false;
			this.CapsemRecovery.showModel=false;
			this.CapsemBarrior.showModel=false;
			this.CapsemWonder.showModel=false;
			this.CapsemGravity.showModel=false;
			this.CapsemPlazma.showModel=false;
			this.CapsemBooster.showModel=false;
			this.CapsemDarkness.showModel=false;

			this.DriverBelt1B.showModel=false;
			this.DriverBelt2B.showModel=false;
			this.Driver1B.showModel=false;
			this.Driver2B.showModel=false;
			this.Driver3B.showModel=false;
			this.Driver4B.showModel=false;
			this.DriverBelt3B.showModel=false;
			this.DriverBelt4B.showModel=false;
			this.DriverBelt1BE.showModel=false;
			this.DriverBelt2BE.showModel=false;
			this.Driver1BE.showModel=false;
			this.Driver2BE.showModel=false;
			this.DriverCBE.showModel=false;
			this.Driver3BE.showModel=false;
			this.Driver4BE.showModel=false;
			this.DriverBelt3BE.showModel=false;
			this.DriverBelt4BE.showModel=false;

			this.DriverBelt1G.showModel=false;
			this.DriverBelt2G.showModel=false;
			this.Driver1G.showModel=false;
			this.Driver2G.showModel=false;
			this.Driver3G.showModel=false;
			this.Driver4G.showModel=false;
			this.DriverBelt3G.showModel=false;
			this.DriverBelt4G.showModel=false;
			this.DriverBelt1GE.showModel=false;
			this.DriverBelt2GE.showModel=false;
			this.Driver1GE.showModel=false;
			this.Driver2GE.showModel=false;
			this.DriverCGE.showModel=false;
			this.Driver3GE.showModel=false;
			this.Driver4GE.showModel=false;
			this.DriverBelt3GE.showModel=false;
			this.DriverBelt4GE.showModel=false;

			this.DriverBelt1P.showModel=false;
			this.DriverBelt2P.showModel=false;
			this.Driver1P.showModel=false;
			this.Driver2P.showModel=false;
			this.Driver3P.showModel=false;
			this.Driver4P.showModel=false;
			this.DriverBelt3P.showModel=false;
			this.DriverBelt4P.showModel=false;
			this.DriverBelt1PE.showModel=false;
			this.DriverBelt2PE.showModel=false;
			this.Driver1PE.showModel=false;
			this.Driver2PE.showModel=false;
			this.DriverCPE.showModel=false;
			this.Driver3PE.showModel=false;
			this.Driver4PE.showModel=false;
			this.DriverBelt3PE.showModel=false;
			this.DriverBelt4PE.showModel=false;

			this.DriverBelt1Y.showModel=false;
			this.DriverBelt2Y.showModel=false;
			this.Driver1Y.showModel=false;
			this.Driver2Y.showModel=false;
			this.DriverCY.showModel=false;
			this.Driver3Y.showModel=false;
			this.Driver4Y.showModel=false;
			this.DriverBelt3Y.showModel=false;
			this.DriverBelt4Y.showModel=false;
			this.DriverBelt1W.showModel=false;
			this.DriverBelt2W.showModel=false;
			this.Driver1W.showModel=false;
			this.Driver2W.showModel=false;
			this.Driver3W.showModel=false;
			this.Driver4W.showModel=false;
			this.DriverBelt3W.showModel=false;
			this.DriverBelt4W.showModel=false;

			if(ArmorZeztzDriver.HenshinMode==0) 
			{
				this.DriverBelt1R.showModel=false;
				this.DriverBelt2R.showModel=false;	
				this.DriverBelt3R.showModel=false;
				this.DriverBelt4R.showModel=false;
				this.DriverBelt1RE.showModel=false;
				this.DriverBelt2RE.showModel=false;
				this.DriverBelt3RE.showModel=false;
				this.DriverBelt4RE.showModel=false;
				this.Driver1RE.showModel=false;
				this.Driver2RE.showModel=false;
				this.DriverCRE.showModel=false;
				this.Driver3RE.showModel=false;
				this.Driver4RE.showModel=false;
				this.BlackHead.showModel=false;
				this.BlackHead2.showModel=false;
				this.BlackBody.showModel=false;
				this.BlackLeftArm.showModel=false;
				this.BlackRightArm.showModel=false;
				this.BlackLeftLeg.showModel=false;
				this.BlackRightLeg.showModel=false;
				this.BlackEye6L.showModel=false;
				this.BlackEye6R.showModel=false;
				this.BlackEye5L.showModel=false;
				this.BlackEye5R.showModel=false;
				this.BlackEye4L.showModel=false;
				this.BlackEye4R.showModel=false;
				this.BlackEye3L.showModel=false;
				this.BlackEye3R.showModel=false;
				this.BlackEye2L.showModel=false;
				this.BlackEye2R.showModel=false;
				this.BlackEye1L.showModel=false;
				this.BlackEye1R.showModel=false;
			}
			else if(ArmorZeztzDriver.HenshinMode==1) 
			{
				this.DriverBelt1R.showModel=false;
				this.DriverBelt2R.showModel=false;	
				this.DriverBelt3R.showModel=false;
				this.DriverBelt4R.showModel=false;
				this.DriverBelt1RE.showModel=false;
				this.DriverBelt2RE.showModel=false;
				this.DriverBelt3RE.showModel=false;
				this.DriverBelt4RE.showModel=false;
				this.Driver1RE.showModel=false;
				this.Driver2RE.showModel=false;
				this.DriverCRE.showModel=false;
				this.Driver3RE.showModel=false;
				this.Driver4RE.showModel=false;
				this.BlackHead.showModel=false;
				this.BlackHead2.showModel=false;
				this.BlackBody.showModel=false;
				this.BlackLeftArm.showModel=false;
				this.BlackRightArm.showModel=false;
				this.BlackLeftLeg.showModel=false;
				this.BlackRightLeg.showModel=false;
				this.BlackEye6L.showModel=false;
				this.BlackEye6R.showModel=false;
				this.BlackEye5L.showModel=false;
				this.BlackEye5R.showModel=false;
				this.BlackEye4L.showModel=false;
				this.BlackEye4R.showModel=false;
				this.BlackEye3L.showModel=false;
				this.BlackEye3R.showModel=false;
				this.BlackEye2L.showModel=false;
				this.BlackEye2R.showModel=false;
				this.BlackEye1L.showModel=false;
				this.BlackEye1R.showModel=false;

				if(ArmorZeztzDriver.AnimationCount<=5) {
					this.Driver1R.showModel=true;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=10){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=true;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=15){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=true;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=20){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=true;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=25){
					this.Driver1R.showModel=true;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=30){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=true;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=35) {
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=true;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=40){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=true;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=45){
					this.Driver1R.showModel=true;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=50){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=true;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=55){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=true;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=60){
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=true;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=65){
					this.Driver1R.showModel=true;
					this.Driver2R.showModel=true;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=true;
					this.Driver4R.showModel=true;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount<=70) {
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=true;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}else{
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
				}
			}
			else if(ArmorZeztzDriver.HenshinMode==2) 
			{
				this.BlackHead.showModel=false;
				this.BlackHead2.showModel=true;
				this.BlackBody.showModel=true;
				this.BlackLeftArm.showModel=true;
				this.BlackRightArm.showModel=true;
				this.BlackLeftLeg.showModel=true;
				this.BlackRightLeg.showModel=true;
				this.BlackEye6L.showModel=false;
				this.BlackEye6R.showModel=false;
				this.BlackEye5L.showModel=false;
				this.BlackEye5R.showModel=false;
				this.BlackEye4L.showModel=false;
				this.BlackEye4R.showModel=false;
				this.BlackEye3L.showModel=false;
				this.BlackEye3R.showModel=false;
				this.BlackEye2L.showModel=false;
				this.BlackEye2R.showModel=false;
				this.BlackEye1L.showModel=false;
				this.BlackEye1R.showModel=false;

				if(ArmorZeztzDriver.AnimationCount2<=3) {
					this.DriverBelt1RE.showModel=true;
					this.DriverBelt2R.showModel=true;	
					this.Driver1R.showModel=true;
					this.Driver2R.showModel=true;
					this.DriverCRE.showModel=true;
					this.Driver3R.showModel=true;
					this.Driver4R.showModel=true;
					this.DriverBelt3R.showModel=true;
					this.DriverBelt4RE.showModel=true;

					this.DriverBelt1R.showModel=false;
					this.DriverBelt2RE.showModel=false;
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
					this.DriverBelt3RE.showModel=false;

					this.DriverBelt4R.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount2<=6){
					this.DriverBelt1R.showModel=true;
					this.DriverBelt2R.showModel=true;	
					this.Driver1R.showModel=true;
					this.Driver2RE.showModel=true;
					this.DriverCRE.showModel=true;
					this.Driver3RE.showModel=true;
					this.Driver4R.showModel=true;
					this.DriverBelt3R.showModel=true;
					this.DriverBelt4R.showModel=true;

					this.DriverBelt1RE.showModel=false;
					this.DriverBelt2RE.showModel=false;	
					this.Driver1RE.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverC.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4RE.showModel=false;
					this.DriverBelt3RE.showModel=false;
					this.DriverBelt4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount2<=9){
					this.DriverBelt1R.showModel=true;
					this.DriverBelt2R.showModel=true;	
					this.Driver1RE.showModel=true;
					this.Driver2RE.showModel=true;
					this.DriverC.showModel=true;
					this.Driver3RE.showModel=true;
					this.Driver4RE.showModel=true;
					this.DriverBelt3R.showModel=true;
					this.DriverBelt4R.showModel=true;

					this.DriverBelt1RE.showModel=false;
					this.DriverBelt2RE.showModel=false;	
					this.Driver1R.showModel=false;
					this.Driver2R.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3R.showModel=false;
					this.Driver4R.showModel=false;
					this.DriverBelt3RE.showModel=false;
					this.DriverBelt4RE.showModel=false;

				}else if(ArmorZeztzDriver.AnimationCount2<=12){
					this.DriverBelt1R.showModel=true;
					this.DriverBelt2RE.showModel=true;	
					this.Driver1RE.showModel=true;
					this.Driver2R.showModel=true;
					this.DriverC.showModel=true;
					this.Driver3R.showModel=true;
					this.Driver4RE.showModel=true;
					this.DriverBelt3RE.showModel=true;
					this.DriverBelt4R.showModel=true;

					this.DriverBelt1RE.showModel=false;
					this.DriverBelt2R.showModel=false;	
					this.Driver1R.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4R.showModel=false;
					this.DriverBelt3R.showModel=false;
					this.DriverBelt4RE.showModel=false;
				}else if(ArmorZeztzDriver.AnimationCount2<=15){
					this.DriverBelt1RE.showModel=true;
					this.DriverBelt2RE.showModel=true;	
					this.Driver1R.showModel=true;
					this.Driver2R.showModel=true;
					this.DriverC.showModel=true;
					this.Driver3R.showModel=true;
					this.Driver4R.showModel=true;
					this.DriverBelt3RE.showModel=true;
					this.DriverBelt4RE.showModel=true;

					this.DriverBelt1R.showModel=false;
					this.DriverBelt2R.showModel=false;	
					this.Driver1RE.showModel=false;
					this.Driver2RE.showModel=false;
					this.DriverCRE.showModel=false;
					this.Driver3RE.showModel=false;
					this.Driver4RE.showModel=false;
					this.DriverBelt3R.showModel=false;
					this.DriverBelt4R.showModel=false;
				}			
			}
			else if(ArmorZeztzDriver.HenshinMode==3)
			{
				if(ArmorZeztzDriver.EyeCount<8)
				{
					this.BlackEye6L.showModel=true;
					this.BlackEye6R.showModel=true;
					this.BlackEye5L.showModel=true;
					this.BlackEye5R.showModel=true;
					this.BlackEye4L.showModel=true;
					this.BlackEye4R.showModel=true;
					this.BlackEye3L.showModel=true;
					this.BlackEye3R.showModel=true;
					this.BlackEye2L.showModel=true;
					this.BlackEye2R.showModel=true;
					this.BlackEye1L.showModel=true;
					this.BlackEye1R.showModel=true;
				}
				else	if(ArmorZeztzDriver.EyeCount<16) 
				{
					this.BlackEye6L.showModel=true;
					this.BlackEye6R.showModel=true;
					this.BlackEye5L.showModel=true;
					this.BlackEye5R.showModel=true;
					this.BlackEye4L.showModel=true;
					this.BlackEye4R.showModel=true;
					this.BlackEye3L.showModel=true;
					this.BlackEye3R.showModel=true;
					this.BlackEye2L.showModel=true;
					this.BlackEye2R.showModel=true;
					this.BlackEye1L.showModel=false;
					this.BlackEye1R.showModel=false;
				}
				else	if(ArmorZeztzDriver.EyeCount<24) 
				{
					this.BlackEye6L.showModel=true;
					this.BlackEye6R.showModel=true;
					this.BlackEye5L.showModel=true;
					this.BlackEye5R.showModel=true;
					this.BlackEye4L.showModel=true;
					this.BlackEye4R.showModel=true;
					this.BlackEye3L.showModel=true;
					this.BlackEye3R.showModel=true;
					this.BlackEye2L.showModel=false;
					this.BlackEye2R.showModel=false;
					this.BlackEye1L.showModel=false;
					this.BlackEye1R.showModel=false;
				}
				else	if(ArmorZeztzDriver.EyeCount<32) 
				{
					this.BlackEye6L.showModel=true;
					this.BlackEye6R.showModel=true;
					this.BlackEye5L.showModel=true;
					this.BlackEye5R.showModel=true;
					this.BlackEye4L.showModel=true;
					this.BlackEye4R.showModel=true;
					this.BlackEye3L.showModel=false;
					this.BlackEye3R.showModel=false;
					this.BlackEye2L.showModel=false;
					this.BlackEye2R.showModel=false;
					this.BlackEye1L.showModel=false;
					this.BlackEye1R.showModel=false;
				}
				else	if(ArmorZeztzDriver.EyeCount<40) 
				{
					this.BlackEye6L.showModel=true;
					this.BlackEye6R.showModel=true;
					this.BlackEye5L.showModel=true;
					this.BlackEye5R.showModel=true;
					this.BlackEye4L.showModel=false;
					this.BlackEye4R.showModel=false;
					this.BlackEye3L.showModel=false;
					this.BlackEye3R.showModel=false;
					this.BlackEye2L.showModel=false;
					this.BlackEye2R.showModel=false;
					this.BlackEye1L.showModel=false;
					this.BlackEye1R.showModel=false;
				}
				else	if(ArmorZeztzDriver.EyeCount<48) 
				{
					this.BlackEye6L.showModel=true;
					this.BlackEye6R.showModel=true;
					this.BlackEye5L.showModel=false;
					this.BlackEye5R.showModel=false;
					this.BlackEye4L.showModel=false;
					this.BlackEye4R.showModel=false;
					this.BlackEye3L.showModel=false;
					this.BlackEye3R.showModel=false;
					this.BlackEye2L.showModel=false;
					this.BlackEye2R.showModel=false;
					this.BlackEye1L.showModel=false;
					this.BlackEye1R.showModel=false;
				}
				else
				{
					this.BlackEye6L.showModel=false;
					this.BlackEye6R.showModel=false;
					this.BlackEye5L.showModel=false;
					this.BlackEye5R.showModel=false;
					this.BlackEye4L.showModel=false;
					this.BlackEye4R.showModel=false;
					this.BlackEye3L.showModel=false;
					this.BlackEye3R.showModel=false;
					this.BlackEye2L.showModel=false;
					this.BlackEye2R.showModel=false;
					this.BlackEye1L.showModel=false;
					this.BlackEye1R.showModel=false;
				}

				this.BlackHead.showModel=false;
				this.BlackHead2.showModel=false;
				this.BlackBody.showModel=false;
				this.BlackLeftArm.showModel=false;
				this.BlackRightArm.showModel=false;
				this.BlackLeftLeg.showModel=false;
				this.BlackRightLeg.showModel=false;

				this.DriverBelt1R.showModel=true;
				this.DriverBelt2R.showModel=true;	
				this.Driver1R.showModel=true;
				this.Driver2R.showModel=true;
				this.DriverC.showModel=true;
				this.Driver3R.showModel=true;
				this.Driver4R.showModel=true;
				this.DriverBelt3R.showModel=true;
				this.DriverBelt4R.showModel=true;

				this.DriverBelt1RE.showModel=false;
				this.DriverBelt2RE.showModel=false;	
				this.Driver1RE.showModel=false;
				this.Driver2RE.showModel=false;
				this.DriverCRE.showModel=false;
				this.Driver3RE.showModel=false;
				this.Driver4RE.showModel=false;
				this.DriverBelt3RE.showModel=false;
				this.DriverBelt4RE.showModel=false;
			}else{
				this.BlackHead.showModel=false;
				this.BlackHead2.showModel=false;
				this.BlackBody.showModel=false;
				this.BlackLeftArm.showModel=false;
				this.BlackRightArm.showModel=false;
				this.BlackLeftLeg.showModel=false;
				this.BlackRightLeg.showModel=false;
				this.DriverBelt1R.showModel=false;
				this.DriverBelt2R.showModel=false;	
				this.Driver1R.showModel=false;
				this.Driver2R.showModel=false;
				this.DriverC.showModel=false;
				this.Driver3R.showModel=false;
				this.Driver4R.showModel=false;
				this.DriverBelt3R.showModel=false;
				this.DriverBelt4R.showModel=false;
				this.DriverBelt1RE.showModel=false;
				this.DriverBelt2RE.showModel=false;	
				this.Driver1RE.showModel=false;
				this.Driver2RE.showModel=false;
				this.DriverCRE.showModel=false;
				this.Driver3RE.showModel=false;
				this.Driver4RE.showModel=false;
				this.DriverBelt3RE.showModel=false;
				this.DriverBelt4RE.showModel=false;
				this.BlackEye6L.showModel=false;
				this.BlackEye6R.showModel=false;
				this.BlackEye5L.showModel=false;
				this.BlackEye5R.showModel=false;
				this.BlackEye4L.showModel=false;
				this.BlackEye4R.showModel=false;
				this.BlackEye3L.showModel=false;
				this.BlackEye3R.showModel=false;
				this.BlackEye2L.showModel=false;
				this.BlackEye2R.showModel=false;
				this.BlackEye1L.showModel=false;
				this.BlackEye1R.showModel=false;
			}
		}else {
			this.BlackHead.showModel=false;
			this.BlackHead2.showModel=false;
			this.BlackBody.showModel=false;
			this.BlackLeftArm.showModel=false;
			this.BlackRightArm.showModel=false;
			this.BlackLeftLeg.showModel=false;
			this.BlackRightLeg.showModel=false;
			this.DriverBelt1R.showModel=false;
			this.DriverBelt2R.showModel=false;	
			this.Driver1R.showModel=false;
			this.Driver2R.showModel=false;
			this.DriverC.showModel=false;
			this.Driver3R.showModel=false;
			this.Driver4R.showModel=false;
			this.DriverBelt3R.showModel=false;
			this.DriverBelt4R.showModel=false;
			this.DriverBelt1RE.showModel=false;
			this.DriverBelt2RE.showModel=false;	
			this.Driver1RE.showModel=false;
			this.Driver2RE.showModel=false;
			this.DriverCRE.showModel=false;
			this.Driver3RE.showModel=false;
			this.Driver4RE.showModel=false;
			this.DriverBelt3RE.showModel=false;
			this.DriverBelt4RE.showModel=false;
			this.CapsemImpact.showModel=false;
			this.CapsemTransform.showModel=false;
			this.CapsemWing.showModel=false;
			this.CapsemStream.showModel=false;
			this.CapsemMachinary.showModel=false;
			this.CapsemProjection.showModel=false;
			this.CapsemRecovery.showModel=false;
			this.CapsemBarrior.showModel=false;
			this.CapsemWonder.showModel=false;
			this.CapsemGravity.showModel=false;
			this.CapsemPlazma.showModel=false;
			this.CapsemBooster.showModel=false;
			this.CapsemDarkness.showModel=false;
			this.BlackEye6L.showModel=false;
			this.BlackEye6R.showModel=false;
			this.BlackEye5L.showModel=false;
			this.BlackEye5R.showModel=false;
			this.BlackEye4L.showModel=false;
			this.BlackEye4R.showModel=false;
			this.BlackEye3L.showModel=false;
			this.BlackEye3R.showModel=false;
			this.BlackEye2L.showModel=false;
			this.BlackEye2R.showModel=false;
			this.BlackEye1L.showModel=false;
			this.BlackEye1R.showModel=false;
		}

		if (this.isChild) {
			this.DriverBelt.render(f5);

			this.DriverBelt1R.render(f5);
			this.DriverBelt2R.render(f5);
			this.Driver1R.render(f5);
			this.Driver2R.render(f5);
			this.DriverC.render(f5);
			this.Driver3R.render(f5);
			this.Driver4R.render(f5);
			this.DriverBelt3R.render(f5);
			this.DriverBelt4R.render(f5);

			this.Driver1RE.render(f5);
			this.Driver2RE.render(f5);
			this.Driver3RE.render(f5);
			this.Driver4RE.render(f5);
			this.DriverCRE.render(f5);
			this.DriverBelt1RE.render(f5);
			this.DriverBelt2RE.render(f5);
			this.DriverBelt3RE.render(f5);
			this.DriverBelt4RE.render(f5);

			this.CapsemImpact.render(f5);
			this.CapsemTransform.render(f5);
			this.CapsemWing.render(f5);
			this.CapsemStream.render(f5);
			this.CapsemMachinary.render(f5);
			this.CapsemProjection.render(f5);
			this.CapsemRecovery.render(f5);
			this.CapsemBarrior.render(f5);
			this.CapsemWonder.render(f5);
			this.CapsemGravity.render(f5);
			this.CapsemPlazma.render(f5);
			this.CapsemBooster.render(f5);
			this.CapsemDarkness.render(f5);

			this.BlackHead.render(f5);
			this.BlackHead2.render(f5);
			this.BlackBody.render(f5);
			this.BlackLeftArm.render(f5);
			this.BlackRightArm.render(f5);
			this.BlackLeftLeg.render(f5);
			this.BlackRightLeg.render(f5);


			this.BlackEye1L.render(f5);
			this.BlackEye1R.render(f5);
			this.BlackEye2L.render(f5);
			this.BlackEye2R.render(f5);
			this.BlackEye3L.render(f5);
			this.BlackEye3R.render(f5);
			this.BlackEye4L.render(f5);
			this.BlackEye4R.render(f5);
			this.BlackEye5L.render(f5);
			this.BlackEye5R.render(f5);
			this.BlackEye6L.render(f5);
			this.BlackEye6R.render(f5);

		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.15F);
			}
			this.DriverBelt.render(f5);
			this.DriverBelt1R.render(f5);
			this.DriverBelt2R.render(f5);
			this.DriverBelt3R.render(f5);
			this.DriverBelt4R.render(f5);			
			this.Driver1R.render(f5);
			this.Driver2R.render(f5);
			this.DriverC.render(f5);
			this.Driver3R.render(f5);
			this.Driver4R.render(f5);

			this.Driver1RE.render(f5);
			this.Driver2RE.render(f5);
			this.Driver3RE.render(f5);
			this.Driver4RE.render(f5);
			this.DriverCRE.render(f5);
			this.DriverBelt1RE.render(f5);
			this.DriverBelt2RE.render(f5);
			this.DriverBelt3RE.render(f5);
			this.DriverBelt4RE.render(f5);        


			this.CapsemImpact.render(f5);
			this.CapsemTransform.render(f5);
			this.CapsemWing.render(f5);
			this.CapsemStream.render(f5);
			this.CapsemMachinary.render(f5);
			this.CapsemProjection.render(f5);
			this.CapsemRecovery.render(f5);
			this.CapsemBarrior.render(f5);
			this.CapsemWonder.render(f5);
			this.CapsemGravity.render(f5);
			this.CapsemPlazma.render(f5);
			this.CapsemBooster.render(f5);
			this.CapsemDarkness.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.BlackHead.render(f5);
			this.BlackHead2.render(f5);
			this.BlackBody.render(f5);
			this.BlackLeftArm.render(f5);
			this.BlackRightArm.render(f5);
			this.BlackLeftLeg.render(f5);
			this.BlackRightLeg.render(f5);

			this.BlackEye1L.render(f5);
			this.BlackEye1R.render(f5);
			this.BlackEye2L.render(f5);
			this.BlackEye2R.render(f5);
			this.BlackEye3L.render(f5);
			this.BlackEye3R.render(f5);
			this.BlackEye4L.render(f5);
			this.BlackEye4R.render(f5);
			this.BlackEye5L.render(f5);
			this.BlackEye5R.render(f5);
			this.BlackEye6L.render(f5);
			this.BlackEye6R.render(f5);

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
			setAngle(BlackHead, this.bipedHead);
			setAngle(BlackHead2, this.bipedHead);
			setAngle(BlackBody, this.bipedBody);
			setAngle(BlackRightArm, this.bipedRightArm);
			setAngle(BlackLeftArm, this.bipedLeftArm);
			setAngle(BlackRightLeg, this.bipedRightLeg);
			setAngle(BlackLeftLeg, this.bipedLeftLeg);

			setAngle(BlackEye1L, this.bipedHead);
			setAngle(BlackEye2L, this.bipedHead);
			setAngle(BlackEye3L, this.bipedHead);
			setAngle(BlackEye4L, this.bipedHead);
			setAngle(BlackEye5L, this.bipedHead);
			setAngle(BlackEye6L, this.bipedHead);
			setAngle(BlackEye1R, this.bipedHead);
			setAngle(BlackEye2R, this.bipedHead);
			setAngle(BlackEye3R, this.bipedHead);
			setAngle(BlackEye4R, this.bipedHead);
			setAngle(BlackEye5R, this.bipedHead);
			setAngle(BlackEye6R, this.bipedHead);
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
