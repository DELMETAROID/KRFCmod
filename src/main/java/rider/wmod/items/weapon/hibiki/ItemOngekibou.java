package rider.wmod.items.weapon.hibiki;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.IHasModel;

public class ItemOngekibou extends Item implements IHasModel
{
	int n =257;
	int count =0;
	double s=0.1;
	int r=5;

	public ItemOngekibou() {
		setUnlocalizedName("ongekibou");
		setRegistryName("ongekibou");
		setCreativeTab(Wmod.TabKamenRiderHIBIKI);
		setMaxStackSize(1);
		this.setHasSubtypes(true);
		MetaItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		for(int i = 0; i < n; i++){
			Wmod.proxy.registerModelwithMeta(this,i,"ongekibou_");
		}
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Vec3d aim =playerIn.getLookVec();
		EntitySmallFireball fire = new EntitySmallFireball(worldIn,playerIn,1,1,1);
		fire.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		s=0.1;
		if(playerIn.getHeldItemMainhand().getItem()==MetaItemInit.ONGEKIBOU
				&& playerIn.getHeldItemOffhand().getItem()==MetaItemInit.ONGEKIBOU)
		{r=3;}else{r=5;}

		fire.accelerationX=aim.x*s;
		fire.accelerationY=aim.y*s;
		fire.accelerationZ=aim.z*s;
		playerIn.getCooldownTracker().setCooldown(this, r);
		if(!worldIn.isRemote)
		{
			worldIn.spawnEntity(fire);
			if(playerIn.getHeldItemMainhand().getItem()==MetaItemInit.ONGEKIBOU
					&& playerIn.getHeldItemOffhand().getItem()==MetaItemInit.ONGEKIBOU)
			{
				if(handIn==EnumHand.MAIN_HAND)
				{
					if(count==0) {	count=1;}
					else if(count==1) {	count=0;}
				}
			}
			else 
			{count=0;}
			//			System.out.print(count);
		}

		if(handIn==EnumHand.MAIN_HAND &&
				playerIn.getHeldItemMainhand().getItem()==MetaItemInit.ONGEKIBOU
				&& playerIn.getHeldItemOffhand().getItem()==MetaItemInit.ONGEKIBOU)
		{
			if(count==0) {
				playerIn.swingArm(EnumHand.MAIN_HAND);
			}
			else if(count==1) {
				playerIn.swingArm(EnumHand.OFF_HAND);
			}
		}else {playerIn.swingArm(handIn);}

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

	//翻訳名を変更する。後ろに.nameが着くためその前まで。
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getMetadata();
		return "item.ongekibou." + i;
	}

	public String getRegistryName(ItemStack stack) {
		int i = stack.getMetadata();
		return "ongekibou_" + i;
	}

	//クリエイティブタブに複数のアイテムを登録する。
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < n; ++i) {
				if(i==1||i==2|i==6||i==12||i==62||i==106||i==178||i==256)
					items.add(new ItemStack(this, 1, i));
			}
		}
	}
}
