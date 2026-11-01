package rider.wmod.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import rider.wmod.util.Reference;

public class LootTableHandler {
	public static ResourceLocation DARK_KABUTO = LootTableList.register(new ResourceLocation(Reference.MODID,"entities:enemy_darkkabuto"));
	public static ResourceLocation JAMATO = LootTableList.register(new ResourceLocation(Reference.MODID,"wmod:loot_tables/entities/enemy_jamato"));
}
