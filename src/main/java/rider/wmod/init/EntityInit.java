package rider.wmod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityBanno;
import rider.wmod.entity.EntityBladePlate;
import rider.wmod.entity.EntityBlueBullet;
import rider.wmod.entity.EntityDarkKabutoZector;
import rider.wmod.entity.EntityEnemyDarkKabuto;
import rider.wmod.entity.EntityEnemyJamatoZombie;
import rider.wmod.entity.EntityEnemyKabuto;
import rider.wmod.entity.EntityGarrenPlate;
import rider.wmod.entity.EntityGatackZector;
import rider.wmod.entity.EntityGhostDark;
import rider.wmod.entity.EntityGhostMusashi;
import rider.wmod.entity.EntityGhostOre;
import rider.wmod.entity.EntityGhostOreDCD;
import rider.wmod.entity.EntityGhostSpector;
import rider.wmod.entity.EntityGhostZeroGhost;
import rider.wmod.entity.EntityGhostZeroSpector;
import rider.wmod.entity.EntityGordDrive;
import rider.wmod.entity.EntityGreenBullet;
import rider.wmod.entity.EntityKabutoZector;
import rider.wmod.entity.EntityOngekiko;
import rider.wmod.entity.EntityPurpleBullet;
import rider.wmod.entity.EntityRaiseChainarray;
import rider.wmod.entity.EntityRedBullet;
import rider.wmod.entity.EntitySkyblueBullet;
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.util.Reference;

public class EntityInit {

//	RenderHandlerにも追加する
	
	public static void registerEntities()
	{
		registerEntity("blade_plate",EntityBladePlate.class,Reference.ENTITY_BLADE_PLATE,50);
		registerEntity("garren_plate",EntityGarrenPlate.class,Reference.ENTITY_GARREN_PLATE,50);
		
		registerEntity("ongekiko",EntityOngekiko.class,Reference.ENTITY_ONGEKIKO,50);
		
		registerEntity("kabuto_zector",EntityKabutoZector.class,Reference.ENTITY_KABUTO_ZECTOR,50);
		registerEntity("darkkabuto_zector",EntityDarkKabutoZector.class,Reference.ENTITY_DARKKABUTO_ZECTOR,50);
		registerEntity("gatack_zector",EntityGatackZector.class,Reference.ENTITY_GATACK_ZECTOR,50);		
	
		registerEntity("banno",EntityBanno.class,Reference.ENTITY_BANNODRIVER,50);

		
		registerEntity("parka_ore_decade",EntityGhostOreDCD.class,Reference.ENTITY_PARKA_ORE_DCD,50);
		registerEntity("parka_ore",EntityGhostOre.class,Reference.ENTITY_PARKA_ORE,50);
		registerEntity("parka_spector",EntityGhostSpector.class,Reference.ENTITY_PARKA_SPECTOR,50);
		registerEntity("parka_darkghost",EntityGhostDark.class,Reference.ENTITY_PARKA_DARKGHOST,50);
		registerEntity("parka_zerospector",EntityGhostZeroSpector.class,Reference.ENTITY_PARKA_ZEROSPECTOR,50);
		registerEntity("parka_zeroghost",EntityGhostZeroGhost.class,Reference.ENTITY_PARKA_ZEROGHOST,50);
		registerEntity("parka_mushashi",EntityGhostMusashi.class,Reference.ENTITY_PARKA_MUSASHI,50);
		
		registerEntity("redbullet",EntityRedBullet.class,Reference.ENTITY_BULLET1,50);
		registerEntity("bluebullet",EntityBlueBullet.class,Reference.ENTITY_BULLET2,50);
		registerEntity("greenbullet",EntityGreenBullet.class,Reference.ENTITY_BULLET3,50);
		registerEntity("yellowbullet",EntityYellowBullet.class,Reference.ENTITY_BULLET4,50);
		registerEntity("purplebullet",EntityPurpleBullet.class,Reference.ENTITY_BULLET5,50);
		registerEntity("raisechainarray",EntityRaiseChainarray.class,Reference.ENTITY_BULLET6,50);
		registerEntity("skybluebullet",EntitySkyblueBullet.class,Reference.ENTITY_BULLET7,50);
		
//		registerEntityWithEgg("despider",EntityEnemyDespider.class,Reference.ENTITY_DESPIDER,50,14423100,13882323);
		registerEntityWithEgg("enemy_kabuto",EntityEnemyKabuto.class,Reference.ENTITY_ENEMY_KABUTO,50,14423100,13882323);
		registerEntityWithEgg("enemy_darkkabuto",EntityEnemyDarkKabuto.class,Reference.ENTITY_ENEMY_DARKKABUTO,50,000000,9109504);
		registerEntityWithEgg("enemy_jamato_zombie",EntityEnemyJamatoZombie.class,Reference.ENTITY_ENEMY_JAMATOZOMBIE,50,2912043,6246323);
		registerEntityWithEgg("enemy_gorddrive",EntityGordDrive.class,Reference.ENTITY_GORDDRIVE,50,0xffd700,000000);
//		registerEntityWithEgg("enemy_jamato_skelton",EntityEnemyDespider.class,Reference.ENTITY_DESPIDER,50,14423100,13882323);
//		registerEntityWithEgg("enemy_jamato_creeper",EntityEnemyDespider.class,Reference.ENTITY_DESPIDER,50,14423100,13882323);
	
	}

	public static void registerEntity(String name,Class<? extends Entity> entity,int id,int range) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID+ ":" + name), entity, name, id, Wmod.instance, range, 1, true);
	}

	public static void registerEntityWithEgg(String name,Class<? extends Entity> entity,int id,int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID+ ":" + name), entity, name, id, Wmod.instance, range, 1, true, color1, color2);
	}
}
