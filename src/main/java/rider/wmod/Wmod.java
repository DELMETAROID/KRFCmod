package rider.wmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import rider.wmod.proxy.CommonProxy;
import rider.wmod.tabs.TabKamenRiderAgito;
import rider.wmod.tabs.TabKamenRiderBlade;
import rider.wmod.tabs.TabKamenRiderBuild;
import rider.wmod.tabs.TabKamenRiderDecade;
import rider.wmod.tabs.TabKamenRiderDrive;
import rider.wmod.tabs.TabKamenRiderExaid;
import rider.wmod.tabs.TabKamenRiderFaiz;
import rider.wmod.tabs.TabKamenRiderFourze;
import rider.wmod.tabs.TabKamenRiderGaim;
import rider.wmod.tabs.TabKamenRiderGeats;
import rider.wmod.tabs.TabKamenRiderGhost;
import rider.wmod.tabs.TabKamenRiderGotchard;
import rider.wmod.tabs.TabKamenRiderHibiki;
import rider.wmod.tabs.TabKamenRiderKabuto;
import rider.wmod.tabs.TabKamenRiderKuuga;
import rider.wmod.tabs.TabKamenRiderOOO;
import rider.wmod.tabs.TabKamenRiderRevice;
import rider.wmod.tabs.TabKamenRiderRyuki;
import rider.wmod.tabs.TabKamenRiderSaber;
import rider.wmod.tabs.TabKamenRiderW;
import rider.wmod.tabs.TabKamenRiderWizard;
import rider.wmod.tabs.TabKamenRiderZIO;
import rider.wmod.tabs.TabKamenRiderZeroOne;
import rider.wmod.util.Reference;
import rider.wmod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Wmod
{

	public static final CreativeTabs TabKamenRiderKUUGA = new TabKamenRiderKuuga("KamenRiderKuuga");
	public static final CreativeTabs TabKamenRiderAGITO = new TabKamenRiderAgito("KamenRiderAgito");
	public static final CreativeTabs TabKamenRiderRYUKI = new TabKamenRiderRyuki("KamenRiderRyuki");
	public static final CreativeTabs TabKamenRiderFAIZ = new TabKamenRiderFaiz("KamenRiderFaiz");
	public static final CreativeTabs TabKamenRiderBLADE = new TabKamenRiderBlade("KamenRiderBlade");
	public static final CreativeTabs TabKamenRiderHIBIKI = new TabKamenRiderHibiki("KamenRiderHibiki");
	public static final CreativeTabs TabKamenRiderKABUTO = new TabKamenRiderKabuto("KamenRiderKabuto");
	//	public static final CreativeTabs TabKamenRiderDENO = new TabKamenRiderDenO("KamenRiderDen-O");
	//	public static final CreativeTabs TabKamenRiderKIVA = new TabKamenRiderKiva("KamenRiderKiva");
	public static final CreativeTabs TabKamenRiderDECADE = new TabKamenRiderDecade("KamenRiderDecade");
	public static final CreativeTabs TabKamenRiderW = new TabKamenRiderW("KamenRiderW");
	public static final CreativeTabs TabKamenRiderOOO = new TabKamenRiderOOO("KamenRiderOOO");
	public static final CreativeTabs TabKamenRiderFOURZE = new TabKamenRiderFourze("KamenRiderFourze");
	public static final CreativeTabs TabKamenRiderWIZARD = new TabKamenRiderWizard("KamenRiderWizard");
	public static final CreativeTabs TabKamenRiderGAIM = new TabKamenRiderGaim("KamenRiderGaim");
	public static final CreativeTabs TabKamenRiderDRIVE = new TabKamenRiderDrive("KamenRiderDrive");
	public static final CreativeTabs TabKamenRiderGHOST = new TabKamenRiderGhost("KamenRiderGhost");
	public static final CreativeTabs TabKamenRiderEXAID = new TabKamenRiderExaid("KamenRiderEx-aid");
	public static final CreativeTabs TabKamenRiderBUILD = new TabKamenRiderBuild("KamenRiderBuild");
	public static final CreativeTabs TabKamenRiderZIO = new TabKamenRiderZIO("KamenRiderZiO");
	public static final CreativeTabs TabKamenRiderZEROONE = new TabKamenRiderZeroOne("KamenRiderZeroOne");
	public static final CreativeTabs TabKamenRiderSABER = new TabKamenRiderSaber("KamenRiderSaber");
	public static final CreativeTabs TabKamenRiderREVICE = new TabKamenRiderRevice("KamenRiderRevice");
	public static final CreativeTabs TabKamenRiderGEATS = new TabKamenRiderGeats("KamenRiderGeats");
	public static final CreativeTabs TabKamenRiderGOTCHARD = new TabKamenRiderGotchard("KamenRiderGotchard");
	
	@Instance
	public static Wmod instance;

	@SidedProxy(clientSide=Reference.CLIENT,serverSide=Reference.COMMON)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		RegistryHandler.preInitRegistries();

	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		//		MinecraftForge.EVENT_BUS.register(new ListenerClass());

	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}