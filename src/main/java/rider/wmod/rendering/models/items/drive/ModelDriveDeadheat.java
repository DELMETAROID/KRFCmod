package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.drive.ArmorDriveDeadheat;

/**
 * ModelDriveDeadheat - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDriveDeadheat extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Body2;
	public ModelRenderer tire1;
	public ModelRenderer ShiftDeadheat;
	public ModelRenderer Body3;
	public ModelRenderer Body4;
	public ModelRenderer Body5;
	public ModelRenderer HeadDrive;
	public ModelRenderer HeadMachBack;
	public ModelRenderer HeadDrivem;
	public ModelRenderer HeadMach;
	public ModelRenderer Shoulder_R;
	public ModelRenderer HandCoverR;
	public ModelRenderer Head2R;
	public ModelRenderer Head3R;
	public ModelRenderer Head4R;
	public ModelRenderer HeadBar2;
	public ModelRenderer HeadBar3L;
	public ModelRenderer HeadBar3R;
	public ModelRenderer Head2L;
	public ModelRenderer Head3L;
	public ModelRenderer Head4L;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Shoulder_L3;
	public ModelRenderer tire2;
	public ModelRenderer tire3;
	public ModelRenderer Head5L;
	public ModelRenderer Head6L;
	public ModelRenderer Head7L;
	public ModelRenderer Head8L;
	public ModelRenderer Head9L;
	public ModelRenderer Head10L;
	public ModelRenderer Head11L;
	public ModelRenderer Head12L;
	public ModelRenderer Head13L;
	public ModelRenderer Head5R;
	public ModelRenderer Head6R;
	public ModelRenderer Head7R;
	public ModelRenderer Head8R;
	public ModelRenderer Head9R;
	public ModelRenderer Head10R;
	public ModelRenderer Head11R;
	public ModelRenderer Head12R;
	public ModelRenderer Head13R;
	public ModelRenderer HeadBar;
	public ModelRenderer Head5LMach;
	public ModelRenderer Head6LMach;
	public ModelRenderer Head7LMach;
	public ModelRenderer Head8LMach;
	public ModelRenderer Head9LMach;
	public ModelRenderer Head10LMach;
	public ModelRenderer Head11LMach;
	public ModelRenderer Head12LMach;
	public ModelRenderer Head13LMach;
	public ModelRenderer Head5RMach;
	public ModelRenderer Head6RMach;
	public ModelRenderer Head7RMach;
	public ModelRenderer Head8RMach;
	public ModelRenderer Head9RMach;
	public ModelRenderer Head10RMach;
	public ModelRenderer Head11RMach;
	public ModelRenderer Head12RMach;
	public ModelRenderer Head13RMach;
	public ModelRenderer HeadBarMach;
	public ModelRenderer AntenaMachR;
	public ModelRenderer AntenaMachR2;
	public ModelRenderer AntenaMachL;
	public ModelRenderer AntenaMachL2;
	public ModelRenderer LeftArmShift;
	public ModelRenderer DriverBaseMach;

	public ModelRenderer LeftLeg2;
	public ModelRenderer RightLeg2;
	public ModelRenderer LeftArm2;
	public ModelRenderer RightArm2;

	public ModelRenderer LeftArm3;

	public ModelDriveDeadheat() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.HeadBar3L = new ModelRenderer(this, 29, 0);
		this.HeadBar3L.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.HeadBar3L.addBox(-4.5F, 1.5F, -5.0F, 2, 1, 1, 0.0F);
		this.Head4L = new ModelRenderer(this, 0, 0);
		this.Head4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4L.addBox(-5.0F, -4.0F, -2.0F, 1, 1, 2, 0.0F);
		this.Head7L = new ModelRenderer(this, 0, 0);
		this.Head7L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head7L.addBox(-5.0F, -6.0F, 1.0F, 1, 1, 1, 0.0F);
		this.tire1 = new ModelRenderer(this, 38, 0);
		this.tire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire1.addBox(2.0F, -3.75F, -2.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tire1, 0.0F, 0.0F, 0.8726646259971648F);
		this.HandCoverR = new ModelRenderer(this, 1, 42);
		this.HandCoverR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandCoverR.addBox(-3.5F, 2.5F, 0.0F, 1, 3, 2, 0.0F);
		this.Head3L = new ModelRenderer(this, 0, 0);
		this.Head3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3L.addBox(-5.0F, -3.0F, -3.0F, 1, 1, 2, 0.0F);
		this.Head2R = new ModelRenderer(this, 0, 0);
		this.Head2R.mirror = true;
		this.Head2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2R.addBox(4.0F, -2.0F, -4.9F, 1, 1, 3, 0.0F);
		this.Head11L = new ModelRenderer(this, 0, 0);
		this.Head11L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head11L.addBox(-4.5F, -11.0F, 2.0F, 1, 1, 3, 0.0F);
		this.tire3 = new ModelRenderer(this, 38, 0);
		this.tire3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire3.addBox(2.0F, 6.25F, -2.0F, 2, 2, 4, 0.0F);
		this.Head13R = new ModelRenderer(this, 0, 0);
		this.Head13R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head13R.addBox(3.5F, -10.0F, 1.5F, 1, 1, 1, 0.0F);
		this.AntenaMachR2 = new ModelRenderer(this, 50, 0);
		this.AntenaMachR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachR2.addBox(1.0F, -9.25F, -6.0F, 1, 2, 1, 0.0F);
		this.Head2L = new ModelRenderer(this, 0, 0);
		this.Head2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2L.addBox(-5.0F, -2.0F, -4.9F, 1, 1, 3, 0.0F);
		this.AntenaMachL2 = new ModelRenderer(this, 50, 0);
		this.AntenaMachL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachL2.addBox(-2.0F, -9.25F, -6.0F, 1, 2, 1, 0.0F);
		this.Head13L = new ModelRenderer(this, 0, 0);
		this.Head13L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head13L.addBox(-4.5F, -10.0F, 1.5F, 1, 1, 1, 0.0F);
		this.Head5R = new ModelRenderer(this, 0, 0);
		this.Head5R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5R.addBox(4.0F, -8.0F, -1.0F, 1, 4, 2, 0.0F);
		this.Head8R = new ModelRenderer(this, 0, 0);
		this.Head8R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head8R.addBox(4.0F, -7.5F, 2.0F, 1, 2, 1, 0.0F);
		this.Head12L = new ModelRenderer(this, 0, 0);
		this.Head12L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head12L.addBox(-5.0F, -9.0F, 0.0F, 1, 1, 2, 0.0F);
		this.Head8L = new ModelRenderer(this, 0, 0);
		this.Head8L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head8L.addBox(-5.0F, -7.5F, 2.0F, 1, 2, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.HeadMach = new ModelRenderer(this, 32, 6);
		this.HeadMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadMach.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 2, 0.56F);
		this.tire2 = new ModelRenderer(this, 50, 0);
		this.tire2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire2.addBox(2.0F, -1.75F, -2.5F, 2, 8, 5, 0.0F);
		this.Head6L = new ModelRenderer(this, 0, 0);
		this.Head6L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head6L.addBox(-5.0F, -7.0F, -2.0F, 1, 2, 1, 0.0F);
		this.Head6R = new ModelRenderer(this, 0, 0);
		this.Head6R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head6R.addBox(4.0F, -7.0F, -2.0F, 1, 2, 1, 0.0F);
		this.Head12R = new ModelRenderer(this, 0, 0);
		this.Head12R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head12R.addBox(4.0F, -9.0F, 0.0F, 1, 1, 2, 0.0F);
		this.HeadBar = new ModelRenderer(this, 24, 0);
		this.HeadBar.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.HeadBar.addBox(-3.5F, -7.75F, 3.0F, 7, 1, 1, 0.0F);
		this.Head9R = new ModelRenderer(this, 0, 0);
		this.Head9R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head9R.addBox(4.0F, -8.5F, 2.5F, 1, 1, 1, 0.0F);
		this.AntenaMachL = new ModelRenderer(this, 50, 0);
		this.AntenaMachL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachL.addBox(-1.5F, -7.25F, -5.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(AntenaMachL, 0.0F, 0.0F, 0.003490658503988659F);
		this.HeadBar2 = new ModelRenderer(this, 24, 3);
		this.HeadBar2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadBar2.addBox(-2.5F, -1.25F, -5.5F, 5, 2, 1, 0.0F);
		this.ShiftDeadheat = new ModelRenderer(this, 40, 17);
		this.ShiftDeadheat.mirror = true;
		this.ShiftDeadheat.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ShiftDeadheat.addBox(3.25F, 3.25F, -6.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(ShiftDeadheat, 0.7853981633974483F, 0.0F, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);

		this.Head4R = new ModelRenderer(this, 0, 0);
		this.Head4R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head4R.addBox(4.0F, -4.0F, -2.0F, 1, 1, 2, 0.0F);
		this.Head7R = new ModelRenderer(this, 0, 0);
		this.Head7R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head7R.addBox(4.0F, -6.0F, 1.0F, 1, 1, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 32);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 50);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(4.0F, -2.2F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.08726646259971647F);
		this.Head11R = new ModelRenderer(this, 0, 0);
		this.Head11R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head11R.addBox(3.5F, -11.0F, 2.0F, 1, 1, 3, 0.0F);
		this.Head3R = new ModelRenderer(this, 0, 0);
		this.Head3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head3R.addBox(4.0F, -3.0F, -3.0F, 1, 1, 2, 0.0F);
		this.Head9L = new ModelRenderer(this, 0, 0);
		this.Head9L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head9L.addBox(-5.0F, -8.5F, 2.5F, 1, 1, 1, 0.0F);
		this.Shoulder_L = new ModelRenderer(this, 0, 32);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.2F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.08726646259971647F);
		this.Shoulder_L3 = new ModelRenderer(this, 0, 50);
		this.Shoulder_L3.mirror = true;
		this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L3.addBox(4.0F, -2.2F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Shoulder_L3, 0.0F, 0.0F, -0.08726646259971647F);
		this.Head10R = new ModelRenderer(this, 0, 0);
		this.Head10R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head10R.addBox(3.5F, -10.0F, 3.0F, 1, 2, 1, 0.0F);
		this.Shoulder_R = new ModelRenderer(this, 0, 41);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.2F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.08726646259971647F);
		this.Head5L = new ModelRenderer(this, 0, 0);
		this.Head5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5L.addBox(-5.0F, -8.0F, -1.0F, 1, 4, 2, 0.0F);
		this.HeadBar3R = new ModelRenderer(this, 29, 0);
		this.HeadBar3R.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.HeadBar3R.addBox(2.5F, 1.5F, -5.0F, 2, 1, 1, 0.0F);
		this.HeadDrive = new ModelRenderer(this, 0, 0);
		this.HeadDrive.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadDrive.addBox(0.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F);

		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Body2 = new ModelRenderer(this, 40, 35);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 3, 4, 0.5F);
		this.AntenaMachR = new ModelRenderer(this, 50, 0);
		this.AntenaMachR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.AntenaMachR.addBox(0.5F, -7.25F, -5.5F, 1, 1, 1, 0.0F);
		this.Head10L = new ModelRenderer(this, 0, 0);
		this.Head10L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head10L.addBox(-4.5F, -10.0F, 3.0F, 1, 2, 1, 0.0F);
		this.LeftArmShift = new ModelRenderer(this, 32, 48);
		this.LeftArmShift.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmShift.addBox(-1.0F, -1.75F, -2.0F, 1, 1, 1, 0.26F);

		this.Body3 = new ModelRenderer(this, 45, 42);
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3.addBox(-8.0F, -0.9F, -3.75F, 4, 1, 1, 0.2F);
		this.Body4 = new ModelRenderer(this, 44, 44);
		this.Body4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body4.addBox(-8.5F, 0.5F, -3.75F, 5, 3, 1, 0.2F);
		this.Body5 = new ModelRenderer(this, 50, 42);
		this.Body5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body5.addBox(-8.0F, 3.9F, -3.75F, 4, 1, 1, 0.2F);

		this.HeadMachBack = new ModelRenderer(this, 20, 32);
		this.HeadMachBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadMachBack.addBox(-4.0F, -8.0F, 2.0F, 8, 8, 2, 0.56F);

		this.HeadDrivem = new ModelRenderer(this, 0, 0);
		this.HeadDrivem.setRotationPoint(0.0F, -9.5F, -2.5F);
		this.HeadDrivem.addBox(0.0F, -8.0F, 0.0F, 1, 1, 1, 0.0F);		
		this.Head5LMach = new ModelRenderer(this, 0, 0);
		this.Head5LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5LMach.addBox(-5.0F, -5.5F, -3.5F, 1, 4, 2, 0.0F);
		this.Head6LMach = new ModelRenderer(this, 0, 0);
		this.Head6LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head6LMach.addBox(-5.0F, -4.5F, -1.5F, 1, 2, 1, 0.0F);
		this.Head7LMach = new ModelRenderer(this, 0, 0);
		this.Head7LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head7LMach.addBox(-5.0F, -4.5F, -4.5F, 1, 1, 1, 0.0F);
		this.Head8LMach = new ModelRenderer(this, 0, 0);
		this.Head8LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head8LMach.addBox(-5.0F, -4.0F, -5.5F, 1, 2, 1, 0.0F);
		this.Head9LMach = new ModelRenderer(this, 0, 0);
		this.Head9LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head9LMach.addBox(-5.0F, -2.0F, -6.0F, 1, 1, 1, 0.0F);
		this.Head10LMach = new ModelRenderer(this, 0, 0);
		this.Head10LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head10LMach.addBox(-4.5F, -1.5F, -7.0F, 1, 2, 1, 0.0F);
		this.Head11LMach = new ModelRenderer(this, 0, 0);
		this.Head11LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head11LMach.addBox(-4.5F, 0.5F, -7.5F, 1, 1, 3, 0.0F);       
		this.Head12LMach = new ModelRenderer(this, 0, 0);
		this.Head12LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head12LMach.addBox(-5.0F, -1.5F, -4.5F, 1, 1, 2, 0.0F);        
		this.Head13LMach = new ModelRenderer(this, 0, 0);
		this.Head13LMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head13LMach.addBox(-4.5F, -0.5F, -5.0F, 1, 1, 1, 0.0F);

		this.Head5RMach = new ModelRenderer(this, 0, 0);
		this.Head5RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head5RMach.addBox(4.0F, -5.5F, -3.5F, 1, 4, 2, 0.0F);
		this.Head6RMach = new ModelRenderer(this, 0, 0);
		this.Head6RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head6RMach.addBox(4.0F, -4.5F, -1.5F, 1, 2, 1, 0.0F);
		this.Head7RMach = new ModelRenderer(this, 0, 0);
		this.Head7RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head7RMach.addBox(4.0F, -4.5F, -4.5F, 1, 1, 1, 0.0F);
		this.Head8RMach = new ModelRenderer(this, 0, 0);
		this.Head8RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head8RMach.addBox(4.0F, -4.0F, -5.5F, 1, 2, 1, 0.0F);   
		this.Head9RMach = new ModelRenderer(this, 0, 0);
		this.Head9RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head9RMach.addBox(4.0F, -2.0F, -6.0F, 1, 1, 1, 0.0F);
		this.Head10RMach = new ModelRenderer(this, 0, 0);
		this.Head10RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head10RMach.addBox(3.5F, -1.5F, -7.0F, 1, 2, 1, 0.0F);        
		this.Head11RMach = new ModelRenderer(this, 0, 0);
		this.Head11RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head11RMach.addBox(3.5F, 0.5F, -7.5F, 1, 1, 3, 0.0F);
		this.Head12RMach = new ModelRenderer(this, 0, 0);
		this.Head12RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head12RMach.addBox(4.0F, -1.5F, -4.5F, 1, 1, 2, 0.0F);
		this.Head13RMach = new ModelRenderer(this, 0, 0);
		this.Head13RMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head13RMach.addBox(3.5F, -0.5F, -5.0F, 1, 1, 1, 0.0F);

		this.HeadBarMach = new ModelRenderer(this, 24, 0);
		this.HeadBarMach.setRotationPoint(0.0F, -0.0F, 0.0F);
		this.HeadBarMach.addBox(-3.5F, 0.25F, -6.5F, 7, 1, 1, 0.0F);

		this.DriverBaseMach = new ModelRenderer(this, 22, 43);
		this.DriverBaseMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBaseMach.addBox(-3.5F, 8.5F, -3.35F, 6, 2, 1, 0.0F);

		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 6, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 6, 4, 0.26F);
		this.LeftArm2 = new ModelRenderer(this, 32, 54);
		this.LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm2.addBox(-1.0F, 4.25F, -2.0F, 4, 6, 4, 0.26F);
		this.LeftArm2.mirror = true;
		this.RightArm2 = new ModelRenderer(this, 40, 22);
		this.RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm2.addBox(-3.0F, 4.25F, -2.0F, 4, 6, 4, 0.26F);
		this.RightArm2.mirror = true;
		this.LeftLeg2 = new ModelRenderer(this, 0, 58);
		this.LeftLeg2.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg2.addBox(-1.8F, 10.0F, -2.0F, 4, 2, 4, 0.26F);
		this.RightLeg2 = new ModelRenderer(this, 0, 58);
		this.RightLeg2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg2.addBox(-2.2F, 10.0F, -2.0F, 4, 2, 4, 0.26F);

		this.LeftArm3 = new ModelRenderer(this, 48, 54);
		this.LeftArm3.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm3.addBox(-1.0F, 4.25F, -2.0F, 4, 6, 4, 0.26F);
		this.LeftArm3.mirror = true;

		this.HeadDrivem.addChild(this.Head8RMach);
		this.HeadDrivem.addChild(this.Head9RMach);
		this.HeadDrivem.addChild(this.Head6LMach);
		this.Head.addChild(this.HeadBar3L);
		this.HeadDrivem.addChild(this.Head7LMach);
		this.Head.addChild(this.Head4L);
		this.HeadDrivem.addChild(this.Head12LMach);
		this.HeadDrive.addChild(this.Head7L);
		this.RightArm.addChild(this.HandCoverR);
		this.Head.addChild(this.Head3L);
		this.Head.addChild(this.Head2R);
		this.HeadDrive.addChild(this.Head11L);
		this.tire1.addChild(this.tire3);
		this.HeadDrive.addChild(this.Head13R);
		this.HeadDrivem.addChild(this.Head5RMach);
		this.HeadMach.addChild(this.AntenaMachR2);
		this.Head.addChild(this.Head2L);
		this.HeadDrivem.addChild(this.Head13LMach);
		this.HeadMach.addChild(this.AntenaMachL2);
		this.HeadDrive.addChild(this.Head13L);
		this.HeadDrivem.addChild(this.Head11RMach);
		this.HeadDrive.addChild(this.Head5R);
		this.HeadDrive.addChild(this.Head8R);
		this.HeadDrive.addChild(this.Head12L);
		this.HeadDrivem.addChild(this.HeadBarMach);
		this.HeadDrivem.addChild(this.Head13RMach);
		this.HeadDrive.addChild(this.Head8L);
		this.HeadDrivem.addChild(this.Head11LMach);
		this.tire1.addChild(this.tire2);
		this.HeadDrive.addChild(this.Head6L);
		this.HeadDrive.addChild(this.Head6R);
		this.HeadDrive.addChild(this.Head12R);
		this.HeadDrive.addChild(this.HeadBar);
		this.HeadDrivem.addChild(this.Head10LMach);
		this.HeadDrive.addChild(this.Head9R);
		this.HeadMach.addChild(this.AntenaMachL);
		this.Head.addChild(this.HeadBar2);
		this.HeadDrivem.addChild(this.Head10RMach);
		this.HeadDrivem.addChild(this.Head7RMach);
		this.Head.addChild(this.Head4R);
		this.HeadDrive.addChild(this.Head7R);
		this.LeftArm.addChild(this.Shoulder_L);
		this.LeftArm.addChild(this.Shoulder_L3);
		this.HeadDrive.addChild(this.Head11R);
		this.Head.addChild(this.Head3R);
		this.HeadDrive.addChild(this.Head9L);
		this.HeadDrivem.addChild(this.Head8LMach);
		this.HeadDrive.addChild(this.Head10R);
		this.RightArm.addChild(this.Shoulder_R);
		this.HeadDrive.addChild(this.Head5L);
		this.HeadDrivem.addChild(this.Head6RMach);
		this.Head.addChild(this.HeadBar3R);
		this.HeadDrivem.addChild(this.Head9LMach);
		this.HeadDrivem.addChild(this.Head5LMach);
		this.HeadDrivem.addChild(this.Head12RMach);
		this.HeadMach.addChild(this.AntenaMachR);
		this.HeadDrive.addChild(this.Head10L);
		this.LeftArmShift.addChild(this.ShiftDeadheat);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorDriveDeadheat.DriverCheck>=1) 
		{
			this.Body2.showModel=true;
			this.Body3.showModel=true;
			this.Body4.showModel=true;
			this.Body5.showModel=true;
			this.LeftLeg2.showModel=true;
			this.LeftArm.showModel=true;
			this.RightLeg2.showModel=true;
			this.RightArm.showModel=true;
			this.Head.showModel=true;

			if(ArmorDriveDeadheat.DriverCheck==2)//mach 
			{
				this.HeadDrive.showModel=false;				
				this.HeadMachBack.showModel=false;
				this.HeadMach.showModel=true;
				this.HeadDrivem.showModel=true;
				this.LeftArmShift.showModel=false;
				this.LeftArm3.showModel=false;

				if(ArmorDriveDeadheat.SetShiftcar==0) 
				{
					this.tire1.showModel=true;
					this.DriverBaseMach.showModel=true;
					this.Body.showModel=true;
					this.LeftArm2.showModel=true;
					this.RightArm2.showModel=true;
					this.RightLeg.showModel=true;
					this.LeftLeg.showModel=true;
				}
				else if(ArmorDriveDeadheat.SetShiftcar==2) //chaser
				{
					this.tire1.showModel=true;
					this.DriverBaseMach.showModel=false;
					this.Body.showModel=false;
					this.LeftArm2.showModel=false;
					this.RightArm2.showModel=false;
					this.RightLeg.showModel=false;
					this.LeftLeg.showModel=false;
				}
				else//tire
				{
					this.tire1.showModel=false;
					this.DriverBaseMach.showModel=false;
					this.Body.showModel=true;
					this.LeftArm2.showModel=true;
					this.RightArm2.showModel=true;
					this.RightLeg.showModel=true;
					this.LeftLeg.showModel=true;
				}

			}
			else //drive
			{
				this.HeadDrive.showModel=true;				
				this.HeadMachBack.showModel=true;
				this.HeadMach.showModel=false;
				this.HeadDrivem.showModel=false;
				this.DriverBaseMach.showModel=false;
				this.LeftArm3.showModel=true;

				this.Body.showModel=true;
				this.LeftArm2.showModel=true;
				this.RightArm2.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;

				if(ArmorDriveDeadheat.SetShiftcar==1) 
				{
					this.LeftArmShift.showModel=false;
					this.tire1.showModel=false;
				}
				else 
				{
					this.LeftArmShift.showModel=true;
					this.tire1.showModel=true;								
				}
			}		
		}
		else
		{
			this.RightArm.showModel=false;
			this.Body.showModel=false;
			this.Body2.showModel=false;
			this.Body3.showModel=false;
			this.Body4.showModel=false;
			this.Body5.showModel=false;
			this.LeftLeg.showModel=false;
			this.Head.showModel=false;
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.LeftArm.showModel=false;
			this.RightLeg.showModel=false;
			this.HeadDrive.showModel=false;				
			this.HeadMachBack.showModel=false;
			this.HeadMach.showModel=false;
			this.HeadDrivem.showModel=false;
			this.DriverBaseMach.showModel=false;
			this.LeftLeg2.showModel=false;
			this.LeftArm2.showModel=false;
			this.RightLeg2.showModel=false;
			this.RightArm2.showModel=false;
			this.LeftArm3.showModel=false;
		}

		if (this.isChild) {	
			this.DriverBaseMach.render(f5);
			this.LeftArmShift.render(f5);
			this.RightLeg.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			this.HeadDrivem.render(f5);
			this.Head.render(f5);
			this.HeadMachBack.render(f5);
			this.HeadMach.render(f5);
			this.Body4.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.Body2.render(f5);
			this.Body3.render(f5);
			this.HeadDrive.render(f5);
			this.Body5.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm2.render(f5);
			this.RightArm2.render(f5);
			this.LeftLeg2.render(f5);
			this.RightLeg2.render(f5);
			this.LeftArm3.render(f5);
		}
		else 
		{
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.DriverBaseMach.render(f5);
			this.LeftArmShift.render(f5);
			this.RightLeg.render(f5);
			this.HeadDrivem.render(f5);
			this.Head.render(f5);
			this.HeadMachBack.render(f5);
			this.HeadMach.render(f5);
			this.Body4.render(f5);
			this.RightArm.render(f5);
			this.LeftLeg.render(f5);
			this.Body2.render(f5);
			this.Body3.render(f5);
			this.HeadDrive.render(f5);
			this.Body5.render(f5);
			this.Body.render(f5);
			this.LeftArm.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm2.render(f5);
			this.RightArm2.render(f5);
			this.LeftLeg2.render(f5);
			this.RightLeg2.render(f5);
			this.LeftArm3.render(f5);

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.1F);
			}

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();

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
			setAngle(HeadDrive, this.bipedHead);
			setAngle(HeadMachBack, this.bipedHead);
			setAngle(HeadMach, this.bipedHead);
			setAngle(HeadDrivem, this.bipedHead);

			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(Body3, this.bipedBody);
			setAngle(Body4, this.bipedBody);
			setAngle(Body5, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(LeftArmShift, this.bipedLeftArm);
			setAngle(DriverBaseMach, this.bipedBody);
			setAngle(RightArm2, this.bipedRightArm);
			setAngle(LeftArm2, this.bipedLeftArm);
			setAngle(RightLeg2, this.bipedRightLeg);
			setAngle(LeftLeg2, this.bipedLeftLeg);
			setAngle(LeftArm3, this.bipedLeftArm);
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
