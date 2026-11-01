package rider.wmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import rider.wmod.items.meta.ItemColoredStick;
import rider.wmod.items.meta.ItemOniishi;
import rider.wmod.items.tools.geats.ItemMissionBox;
import rider.wmod.items.tools.hibiki.ItemOnsa;
import rider.wmod.items.tools.hibiki.ItemOnsaKurenai;
import rider.wmod.items.weapon.hibiki.ItemOngekibou;

public class MetaItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//hibiki
	public static final Item ONIISHI = new ItemOniishi();
	public static final Item COLORED_STICK = new ItemColoredStick();
	public static final Item HIBIKI_ONKAKU = new ItemOnsa();
	public static final Item HIBIKI_ONKAKU_KURENAI = new ItemOnsaKurenai();
	public static final Item ONGEKIBOU = new ItemOngekibou();
	
	public static final Item MISSION_BOX = new ItemMissionBox();
}