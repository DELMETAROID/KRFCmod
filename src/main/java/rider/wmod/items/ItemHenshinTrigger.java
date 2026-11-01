package rider.wmod.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.agito.ArmorAgitoFlame;
import rider.wmod.items.armor.agito.ArmorAgitoGround;
import rider.wmod.items.armor.agito.ArmorAgitoStorm;
import rider.wmod.items.armor.agito.ArmorAgitoTrinity;
import rider.wmod.items.armor.blade.ArmorBlabuckle;
import rider.wmod.items.armor.blade.ArmorBlade;
import rider.wmod.items.armor.blade.ArmorGarren;
import rider.wmod.items.armor.blade.ArmorGarrenBuckle;
import rider.wmod.items.armor.build.ArmorBuildDragon;
import rider.wmod.items.armor.build.ArmorBuildDragonSilver;
import rider.wmod.items.armor.build.ArmorBuildHedgehog;
import rider.wmod.items.armor.build.ArmorBuildRabbit;
import rider.wmod.items.armor.build.ArmorBuildRabbitGold;
import rider.wmod.items.armor.build.ArmorBuildTank;
import rider.wmod.items.armor.build.ArmorCrossZ;
import rider.wmod.items.armor.build.ArmorLMDetective;
import rider.wmod.items.armor.build.ArmorLMDoctor;
import rider.wmod.items.armor.build.ArmorLMDrum;
import rider.wmod.items.armor.build.ArmorLMFriendship;
import rider.wmod.items.armor.build.ArmorLMGame;
import rider.wmod.items.armor.build.ArmorLMMedal;
import rider.wmod.items.armor.build.ArmorLMMirror;
import rider.wmod.items.armor.build.ArmorLMOOPARTS;
import rider.wmod.items.armor.build.ArmorLMOgre;
import rider.wmod.items.armor.build.ArmorLMOrange;
import rider.wmod.items.armor.build.ArmorLMParka;
import rider.wmod.items.armor.build.ArmorLMPolice;
import rider.wmod.items.armor.build.ArmorLMRidercard;
import rider.wmod.items.armor.build.ArmorLMRuin;
import rider.wmod.items.armor.build.ArmorLMTrump;
import rider.wmod.items.armor.build.ArmorLMUSB;
import rider.wmod.items.armor.build.ArmorLMWizard;
import rider.wmod.items.armor.build.ArmorLMZector;
import rider.wmod.items.armor.decade.ArmorKRAgito;
import rider.wmod.items.armor.decade.ArmorKRBlade;
import rider.wmod.items.armor.decade.ArmorKRBuild;
import rider.wmod.items.armor.decade.ArmorKRDecade;
import rider.wmod.items.armor.decade.ArmorKRDecadeRage;
import rider.wmod.items.armor.decade.ArmorKRDrive;
import rider.wmod.items.armor.decade.ArmorKRExaid;
import rider.wmod.items.armor.decade.ArmorKRFourze;
import rider.wmod.items.armor.decade.ArmorKRGaim;
import rider.wmod.items.armor.decade.ArmorKRGhost;
import rider.wmod.items.armor.decade.ArmorKRHibiki;
import rider.wmod.items.armor.decade.ArmorKRKabuto;
import rider.wmod.items.armor.decade.ArmorKRKuuga;
import rider.wmod.items.armor.decade.ArmorKROOO;
import rider.wmod.items.armor.decade.ArmorKRRyuki;
import rider.wmod.items.armor.decade.ArmorKRW;
import rider.wmod.items.armor.decade.ArmorKRWizard;
import rider.wmod.items.armor.drive.ArmorDriveDeadheat;
import rider.wmod.items.armor.drive.ArmorDriveNext;
import rider.wmod.items.armor.drive.ArmorDriveProto;
import rider.wmod.items.armor.drive.ArmorDriveSpeed;
import rider.wmod.items.armor.drive.ArmorDriveZero;
import rider.wmod.items.armor.drive.ArmorMachDriver;
import rider.wmod.items.armor.drive.ArmorSignalChaser;
import rider.wmod.items.armor.drive.ArmorSignalMach;
import rider.wmod.items.armor.exaid.ArmorExaidAction;
import rider.wmod.items.armor.exaid.ArmorExaidActionOrigin;
import rider.wmod.items.armor.exaid.ArmorExaidActionProto;
import rider.wmod.items.armor.exaid.ArmorExaidNovel;
import rider.wmod.items.armor.exaid.ArmorExaidZombie;
import rider.wmod.items.armor.exaid.ArmorExaidZombieMAX;
import rider.wmod.items.armor.exaid.ArmorGamerDriver;
import rider.wmod.items.armor.fourze.ArmorFourzeBase;
import rider.wmod.items.armor.gaim.ls.ArmorGaimBanana;
import rider.wmod.items.armor.gaim.ls.ArmorGaimBloodOrange;
import rider.wmod.items.armor.gaim.ls.ArmorGaimBudou;
import rider.wmod.items.armor.gaim.ls.ArmorGaimDongri;
import rider.wmod.items.armor.gaim.ls.ArmorGaimDorian;
import rider.wmod.items.armor.gaim.ls.ArmorGaimHimawariLS;
import rider.wmod.items.armor.gaim.ls.ArmorGaimKurumi;
import rider.wmod.items.armor.gaim.ls.ArmorGaimMatsubokkuri;
import rider.wmod.items.armor.gaim.ls.ArmorGaimMelon;
import rider.wmod.items.armor.gaim.ls.ArmorGaimOrange;
import rider.wmod.items.armor.gaim.ls.ArmorGaimOrangeFresh;
import rider.wmod.items.armor.gaim.ls.ArmorGaimWaterMelon;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBARON;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBRAVO;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBlackBARON;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBujinGAIM;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverGAIM;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverGRIDON;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverKNUCKLE;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverKUROKAGE;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverMASS;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverRYUGEN;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverZANGETSU;
import rider.wmod.items.armor.geats.ArmorIDBrali;
import rider.wmod.items.armor.geats.ArmorIDBuchi;
import rider.wmod.items.armor.geats.ArmorIDBuffa;
import rider.wmod.items.armor.geats.ArmorIDDapaan;
import rider.wmod.items.armor.geats.ArmorIDDoomsGeats;
import rider.wmod.items.armor.geats.ArmorIDGeats;
import rider.wmod.items.armor.geats.ArmorIDGeatsOneness;
import rider.wmod.items.armor.geats.ArmorIDGinpen;
import rider.wmod.items.armor.geats.ArmorIDGroovy;
import rider.wmod.items.armor.geats.ArmorIDGyago;
import rider.wmod.items.armor.geats.ArmorIDHakubi;
import rider.wmod.items.armor.geats.ArmorIDKeilow;
import rider.wmod.items.armor.geats.ArmorIDLetter;
import rider.wmod.items.armor.geats.ArmorIDLopo;
import rider.wmod.items.armor.geats.ArmorIDMary;
import rider.wmod.items.armor.geats.ArmorIDNadgesparrow;
import rider.wmod.items.armor.geats.ArmorIDNago;
import rider.wmod.items.armor.geats.ArmorIDPunkjack;
import rider.wmod.items.armor.geats.ArmorIDSeeker;
import rider.wmod.items.armor.geats.ArmorIDShirowe;
import rider.wmod.items.armor.geats.ArmorIDSkumatter;
import rider.wmod.items.armor.geats.ArmorIDTurbon;
import rider.wmod.items.armor.geats.ArmorIDTycoon;
import rider.wmod.items.armor.geats.ArmorIDXGeats;
import rider.wmod.items.armor.ghost.ArmorGhostDark;
import rider.wmod.items.armor.ghost.ArmorGhostOre;
import rider.wmod.items.armor.ghost.ArmorGhostZero;
import rider.wmod.items.armor.ghost.ArmorSpector;
import rider.wmod.items.armor.ghost.ArmorSpectorZero;
import rider.wmod.items.armor.hibiki.ArmorHibikiHead;
import rider.wmod.items.armor.kabuto.ArmorDarkKabutoRider;
import rider.wmod.items.armor.kabuto.ArmorKabutoRider;
import rider.wmod.items.armor.kuuga.ArmorKuugaDragon;
import rider.wmod.items.armor.kuuga.ArmorKuugaMighty;
import rider.wmod.items.armor.kuuga.ArmorKuugaPegasas;
import rider.wmod.items.armor.kuuga.ArmorKuugaTitan;
import rider.wmod.items.armor.ooo.ArmorOOOBatta;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;
import rider.wmod.items.armor.ooo.ArmorOOOKamakiri;
import rider.wmod.items.armor.ooo.ArmorOOOKuwagata;
import rider.wmod.items.armor.ooo.ArmorOOOTaka;
import rider.wmod.items.armor.ooo.ArmorOOOTora;
import rider.wmod.items.armor.ryuki.ArmorOuja;
import rider.wmod.items.armor.ryuki.ArmorOujaBlank;
import rider.wmod.items.armor.ryuki.ArmorRyuga;
import rider.wmod.items.armor.ryuki.ArmorRyuki;
import rider.wmod.items.armor.ryuki.ArmorRyukiBlank;
import rider.wmod.items.armor.saber.ArmorSaberDragon;
import rider.wmod.items.armor.saber.ArmorSwordriverRekka;
import rider.wmod.items.armor.w.ArmorWCyclone;
import rider.wmod.items.armor.w.ArmorWHeat;
import rider.wmod.items.armor.w.ArmorWJoker;
import rider.wmod.items.armor.w.ArmorWLuna;
import rider.wmod.items.armor.w.ArmorWMetal;
import rider.wmod.items.armor.w.ArmorWTrigger;
import rider.wmod.items.armor.wizard.ArmorWizardBlack;
import rider.wmod.items.armor.wizard.ArmorWizardDark;
import rider.wmod.items.armor.wizard.ArmorWizardFlame;
import rider.wmod.items.armor.wizard.ArmorWizardHurricane;
import rider.wmod.items.armor.wizard.ArmorWizardLand;
import rider.wmod.items.armor.wizard.ArmorWizardWater;
import rider.wmod.items.armor.zio.ArmorHattari;
import rider.wmod.items.armor.zio.ArmorQuiz;
import rider.wmod.items.armor.zio.ArmorShinobi;
import rider.wmod.util.IHasModel;

public class ItemHenshinTrigger extends Item implements IHasModel
{
	public ItemHenshinTrigger(String name,CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.swingArm(handIn);

		ArmorKuugaMighty.ArcleCheck=1;
		ArmorKuugaDragon.ArcleCheck=1;
		ArmorKuugaPegasas.ArcleCheck=1;
		ArmorKuugaTitan.ArcleCheck=1;
		
		ArmorAgitoGround.armorcheck=1;
		ArmorAgitoFlame.armorcheck=1;
		ArmorAgitoStorm.armorcheck=1;
		ArmorAgitoTrinity.armorcheck=1;
		
		ArmorRyuki.DriverCheck=1;
		ArmorRyukiBlank.DriverCheck=1;
		ArmorOuja.DriverCheck=1;
		ArmorOujaBlank.DriverCheck=1;
		ArmorRyuga.DriverCheck=1;

		ArmorBlade.isHenshin=1;
		ArmorBlabuckle.TurnUp=1;
		ArmorGarren.isHenshin=1;
		ArmorGarrenBuckle.TurnUp=1;
		
		ArmorHibikiHead.HibikiCheck=1;

		ArmorKabutoRider.BeltCheck=1;
		ArmorDarkKabutoRider.BeltCheck=1;
		
		ArmorKRKuuga.DriverCheck=1;
		ArmorKRAgito.DriverCheck=1;
		ArmorKRRyuki.DriverCheck=1;
		ArmorKRBlade.DriverCheck=1;
		ArmorKRHibiki.DriverCheck=1;
		ArmorKRKabuto.DriverCheck=1;
		ArmorKRDecade.DriverCheck=1;
		ArmorKRW.DriverCheck=1;
		ArmorKROOO.DriverCheck=1;
		ArmorKRFourze.DriverCheck=1;
		ArmorKRWizard.DriverCheck=1;
		ArmorKRGaim.DriverCheck=1;
		ArmorKRDrive.DriverCheck=1;
		ArmorKRGhost.DriverCheck=1;
		ArmorKRGhost.isHenshin=1;
		ArmorKRExaid.DriverCheck=1;
		ArmorKRBuild.DriverCheck=1;
		ArmorKRDecadeRage.DriverCheck=1;
		
		ArmorWCyclone.DriverCheck=2;
		ArmorWCyclone.BodySideCheck=1;
		ArmorWJoker.DriverCheck=2;
		ArmorWJoker.SoulSideCheck=1;
		ArmorWHeat.DriverCheck=2;
		ArmorWHeat.BodySideCheck=1;
		ArmorWMetal.DriverCheck=2;
		ArmorWMetal.SoulSideCheck=1;
		ArmorWLuna.DriverCheck=2;
		ArmorWLuna.BodySideCheck=1;
		ArmorWTrigger.DriverCheck=2;
		ArmorWTrigger.SoulSideCheck=1;

		ArmorOOODriver2.HeadMedalIn2=1;
		ArmorOOODriver2.BodyMedalIn2=1;
		ArmorOOODriver2.LegMedalIn2=1;
		ArmorOOODriver2.ThreeMedalsIn2=1;
		ArmorOOOTaka.DriverCheck=1;
		ArmorOOOTora.DriverCheck=1;
		ArmorOOOBatta.DriverCheck=1;
		ArmorOOOKuwagata.DriverCheck=1;
		ArmorOOOKamakiri.DriverCheck=1;
		
		ArmorFourzeBase.DriverCheck=1;

		ArmorWizardFlame.DriverCheck=1;
		ArmorWizardWater.DriverCheck=1;
		ArmorWizardHurricane.DriverCheck=1;
		ArmorWizardLand.DriverCheck=1;
		ArmorWizardDark.DriverCheck=1;
		ArmorWizardBlack.DriverCheck=1;

		ArmorSengokuDriverGAIM.isHenshin=1;
		ArmorSengokuDriverBARON.isHenshin=1;
		ArmorSengokuDriverRYUGEN.isHenshin=1;
		ArmorSengokuDriverZANGETSU.isHenshin=1;
		ArmorSengokuDriverKUROKAGE.isHenshin=1;
		ArmorSengokuDriverGRIDON.isHenshin=1;
		ArmorSengokuDriverBRAVO.isHenshin=1;
		ArmorSengokuDriverKNUCKLE.isHenshin=1;
		ArmorSengokuDriverMASS.isHenshin=1;
		ArmorSengokuDriverBujinGAIM.isHenshin=1;
		ArmorSengokuDriverBlackBARON.isHenshin=1;
		
		ArmorGaimHimawariLS.DriverCheck=2;
		ArmorGaimMatsubokkuri.DriverCheck=1;
		ArmorGaimKurumi.DriverCheck=1;
		ArmorGaimDongri.DriverCheck=1;
		ArmorGaimMelon.DriverCheck=1;
		ArmorGaimOrange.DriverCheck=1;
		ArmorGaimBanana.DriverCheck=1;
		ArmorGaimBudou.DriverCheck=1;
		ArmorGaimDorian.DriverCheck=1;
		ArmorGaimBloodOrange.DriverCheck=1;
		ArmorGaimOrangeFresh.DriverCheck=4;
		ArmorGaimWaterMelon.DriverCheck=4;
		
		ArmorDriveProto.DriverCheck=1;
		ArmorDriveSpeed.DriverCheck=1;
		ArmorDriveSpeed.SetShiftcar=0;
		ArmorDriveDeadheat.DriverCheck=1;
		ArmorDriveDeadheat.SetShiftcar=0;
		ArmorDriveNext.DriverCheck=1;
		ArmorDriveNext.SetShiftcar=0;
		ArmorDriveZero.DriverCheck=1;
		ArmorMachDriver.ShiftcarIn=1;
		ArmorSignalMach.DriverCheck=1;
		ArmorSignalMach.SetShiftcar=0;		
		ArmorSignalChaser.DriverCheck=1;
		ArmorSignalChaser.SetShiftcar=0;
		
		ArmorGhostOre.DriverCheck=1;
		ArmorGhostOre.isHenshin=1;
		ArmorSpector.DriverCheck=1;
		ArmorSpector.isHenshin=1;
		ArmorGhostDark.DriverCheck=1;
		ArmorGhostDark.isHenshin=1;		
		ArmorSpectorZero.DriverCheck=1;
		ArmorSpectorZero.isHenshin=1;		
		ArmorGhostZero.DriverCheck=1;
		ArmorGhostZero.isHenshin=1;
		
		ArmorGamerDriver.gashatIn=1;
		ArmorExaidAction.DriverCheck=1;
		ArmorExaidActionProto.DriverCheckAction=1;
		ArmorExaidActionOrigin.DriverCheckAction=1;
		ArmorExaidZombie.DriverCheckBuggle=1;
		ArmorExaidNovel.DriverCheck=1;
		ArmorExaidZombieMAX.DriverCheck=1;			 
		
		ArmorBuildRabbit.DriverCheck=1;
		ArmorBuildRabbit.IsHenshin=1;
		ArmorBuildHedgehog.DriverCheck=1;
		ArmorBuildHedgehog.IsHenshin=1;
		ArmorBuildDragon.DriverCheck=1;
		ArmorBuildDragon.IsHenshin=1;
		ArmorBuildRabbitGold.DriverCheck=1;
		ArmorBuildRabbitGold.IsHenshin=1;
		ArmorBuildTank.DriverCheck=1;
		ArmorBuildTank.IsHenshin=1;
		ArmorBuildDragonSilver.DriverCheck=1;
		ArmorBuildDragonSilver.IsHenshin=1;
		ArmorCrossZ.DriverCheck=1;
		ArmorCrossZ.IsHenshin=1;
		
		ArmorLMRuin.DriverCheck=1;
		ArmorLMRuin.IsHenshin=1;
		ArmorLMOOPARTS.DriverCheck=1;
		ArmorLMOOPARTS.IsHenshin=1;
		ArmorLMMirror.DriverCheck=1;
		ArmorLMMirror.IsHenshin=1;
		ArmorLMTrump.DriverCheck=1;
		ArmorLMTrump.IsHenshin=1;
		ArmorLMOgre.DriverCheck=1;
		ArmorLMOgre.IsHenshin=1;
		ArmorLMDrum.DriverCheck=1;
		ArmorLMDrum.IsHenshin=1;
		ArmorLMZector.DriverCheck=1;
		ArmorLMZector.IsHenshin=1;
		ArmorLMRidercard.DriverCheck=1;
		ArmorLMRidercard.IsHenshin=1;
		ArmorLMDetective.DriverCheck=1;
		ArmorLMDetective.IsHenshin=1;
		ArmorLMUSB.DriverCheck=1;
		ArmorLMUSB.IsHenshin=1;
		ArmorLMMedal.DriverCheck=1;
		ArmorLMMedal.IsHenshin=1;
		ArmorLMFriendship.DriverCheck=1;
		ArmorLMFriendship.IsHenshin=1;
		ArmorLMWizard.DriverCheck=1;
		ArmorLMWizard.IsHenshin=1;
		ArmorLMOrange.DriverCheck=1;
		ArmorLMOrange.IsHenshin=1;
		ArmorLMPolice.DriverCheck=1;
		ArmorLMPolice.IsHenshin=1;
		ArmorLMParka.DriverCheck=1;
		ArmorLMParka.IsHenshin=1;
		ArmorLMDoctor.DriverCheck=1;
		ArmorLMDoctor.IsHenshin=1;
		ArmorLMGame.DriverCheck=1;
		ArmorLMGame.IsHenshin=1;
		
		ArmorShinobi.drivercheck=1;
		ArmorHattari.drivercheck=1;
		ArmorQuiz.drivercheck=1;
		
		ArmorSwordriverRekka.isHenshin=1;
		ArmorSaberDragon.DriverCheck=1;
		ArmorSaberDragon.isBookOpen=1;
		ArmorSaberDragon.isHenshin=1;	

		ArmorIDGeats.isHenshin=1;
		ArmorIDGeats.UpperBuckleIn=2;	
		ArmorIDGeats.LowerBuckleIn=2;		
		ArmorIDTycoon.isHenshin=1;
		ArmorIDBuffa.isHenshin=1;
		ArmorIDNago.isHenshin=1;
		ArmorIDShirowe.isHenshin=1;
		ArmorIDGinpen.isHenshin=1;
		ArmorIDDapaan.isHenshin=1;
		ArmorIDMary.isHenshin=1;
		ArmorIDPunkjack.isHenshin=1;
		ArmorIDLetter.isHenshin=1;
		ArmorIDKeilow.isHenshin=1;
		ArmorIDNadgesparrow.isHenshin=1;
		ArmorIDLopo.isHenshin=1;
		ArmorIDGroovy.isHenshin=1;
		ArmorIDHakubi.isHenshin=1;
		ArmorIDBuchi.isHenshin=1;
		ArmorIDTurbon.isHenshin=1;
		ArmorIDGyago.isHenshin=1;
		ArmorIDBrali.isHenshin=1;
		ArmorIDSeeker.isHenshin=1;
		ArmorIDXGeats.isHenshin=1;
		ArmorIDDoomsGeats.isHenshin=1;
		ArmorIDGeatsOneness.isHenshin=1;
		ArmorIDSkumatter.isHenshin=1;
		
		ArmorIDGeats.DriverCheck=1;
		ArmorIDTycoon.DriverCheck=1;
		ArmorIDBuffa.DriverCheck=1;
		ArmorIDNago.DriverCheck=1;
		ArmorIDShirowe.DriverCheck=1;
		ArmorIDGinpen.DriverCheck=1;
		ArmorIDDapaan.DriverCheck=1;
		ArmorIDMary.DriverCheck=1;
		ArmorIDPunkjack.DriverCheck=1;
		ArmorIDLetter.DriverCheck=1;
		ArmorIDKeilow.DriverCheck=1;
		ArmorIDNadgesparrow.DriverCheck=1;
		ArmorIDLopo.DriverCheck=1;
		ArmorIDGroovy.DriverCheck=1;
		ArmorIDHakubi.DriverCheck=1;
		ArmorIDBuchi.DriverCheck=1;
		ArmorIDTurbon.DriverCheck=1;
		ArmorIDGyago.DriverCheck=1;
		ArmorIDBrali.DriverCheck=1;
		ArmorIDSeeker.DriverCheck=1;
		ArmorIDXGeats.DriverCheck=1;
		ArmorIDDoomsGeats.DriverCheck=1;
		ArmorIDGeatsOneness.DriverCheck=1;
		ArmorIDSkumatter.DriverCheck=1;		

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.henshin"));
	}
}