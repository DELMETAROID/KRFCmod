package rider.wmod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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
import rider.wmod.entity.EntityPurpleBullet;
import rider.wmod.entity.EntityRaiseChainarray;
import rider.wmod.entity.EntityRedBullet;
import rider.wmod.entity.EntitySkyblueBullet;
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.entity.render.RenderBanno;
import rider.wmod.entity.render.RenderBladePlate;
import rider.wmod.entity.render.RenderBlueBullet;
import rider.wmod.entity.render.RenderDarkKabutoZector;
import rider.wmod.entity.render.RenderEnemyDarkKabuto;
import rider.wmod.entity.render.RenderEnemyJamatoZombie;
import rider.wmod.entity.render.RenderEnemyKabuto;
import rider.wmod.entity.render.RenderGarrenPlate;
import rider.wmod.entity.render.RenderGatackZector;
import rider.wmod.entity.render.RenderGhostDark;
import rider.wmod.entity.render.RenderGhostMusashi;
import rider.wmod.entity.render.RenderGhostOre;
import rider.wmod.entity.render.RenderGhostOreDCD;
import rider.wmod.entity.render.RenderGhostSpector;
import rider.wmod.entity.render.RenderGhostZeroGhost;
import rider.wmod.entity.render.RenderGhostZeroSpector;
import rider.wmod.entity.render.RenderGordDrive;
import rider.wmod.entity.render.RenderGreenBullet;
import rider.wmod.entity.render.RenderKabutoZector;
import rider.wmod.entity.render.RenderPurpleBullet;
import rider.wmod.entity.render.RenderRaiseChainarray;
import rider.wmod.entity.render.RenderRedBullet;
import rider.wmod.entity.render.RenderSkyblueBullet;
import rider.wmod.entity.render.RenderYellowBullet;

public class RenderHandler {
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKabutoZector.class, new IRenderFactory<EntityKabutoZector>()
		{
			@Override
			public Render<? super EntityKabutoZector>createRenderFor(RenderManager manager)
			{
				return new RenderKabutoZector(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityBladePlate.class, new IRenderFactory<EntityBladePlate>()
		{
			@Override
			public Render<? super EntityBladePlate>createRenderFor(RenderManager manager)
			{
				return new RenderBladePlate(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityGarrenPlate.class, new IRenderFactory<EntityGarrenPlate>()
		{
			@Override
			public Render<? super EntityGarrenPlate>createRenderFor(RenderManager manager)
			{
				return new RenderGarrenPlate(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityRedBullet.class, new IRenderFactory<EntityRedBullet>()
		{
			@Override
			public Render<? super EntityRedBullet>createRenderFor(RenderManager manager)
			{
				return new RenderRedBullet(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityBlueBullet.class, new IRenderFactory<EntityBlueBullet>()
		{
			@Override
			public Render<? super EntityBlueBullet>createRenderFor(RenderManager manager)
			{
				return new RenderBlueBullet(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityGreenBullet.class, new IRenderFactory<EntityGreenBullet>()
		{
			@Override
			public Render<? super EntityGreenBullet>createRenderFor(RenderManager manager)
			{
				return new RenderGreenBullet(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityYellowBullet.class, new IRenderFactory<EntityYellowBullet>()
		{
			@Override
			public Render<? super EntityYellowBullet>createRenderFor(RenderManager manager)
			{
				return new RenderYellowBullet(manager);
			}
		});


		RenderingRegistry.registerEntityRenderingHandler(EntityPurpleBullet.class, new IRenderFactory<EntityPurpleBullet>()
		{
			@Override
			public Render<? super EntityPurpleBullet>createRenderFor(RenderManager manager)
			{
				return new RenderPurpleBullet(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySkyblueBullet.class, new IRenderFactory<EntitySkyblueBullet>()
		{
			@Override
			public Render<? super EntitySkyblueBullet> createRenderFor(RenderManager manager)
			{
				return new RenderSkyblueBullet(manager);			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkKabutoZector.class, new IRenderFactory<EntityDarkKabutoZector>()
		{
			@Override
			public Render<? super EntityDarkKabutoZector>createRenderFor(RenderManager manager)
			{
				return new RenderDarkKabutoZector(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEnemyDarkKabuto.class, new IRenderFactory<EntityEnemyDarkKabuto>()
		{
			@Override
			public Render<? super EntityEnemyDarkKabuto>createRenderFor(RenderManager manager)
			{
				return new RenderEnemyDarkKabuto(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEnemyKabuto.class, new IRenderFactory<EntityEnemyKabuto>()
		{
			@Override
			public Render<? super EntityEnemyKabuto>createRenderFor(RenderManager manager)
			{
				return new RenderEnemyKabuto(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRaiseChainarray.class, new IRenderFactory<EntityRaiseChainarray>()
		{
			@Override
			public Render<? super EntityRaiseChainarray>createRenderFor(RenderManager manager)
			{
				return new RenderRaiseChainarray(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEnemyJamatoZombie.class, new IRenderFactory<EntityEnemyJamatoZombie>()
		{
			@Override
			public Render<? super EntityEnemyJamatoZombie>createRenderFor(RenderManager manager)
			{
				return new RenderEnemyJamatoZombie(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostOre.class, new IRenderFactory<EntityGhostOre>()
		{
			@Override
			public Render<? super EntityGhostOre>createRenderFor(RenderManager manager)
			{
				return new RenderGhostOre(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostSpector.class, new IRenderFactory<EntityGhostSpector>()
		{
			@Override
			public Render<? super EntityGhostSpector>createRenderFor(RenderManager manager)
			{
				return new RenderGhostSpector(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostDark.class, new IRenderFactory<EntityGhostDark>()
		{
			@Override
			public Render<? super EntityGhostDark>createRenderFor(RenderManager manager)
			{
				return new RenderGhostDark(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostZeroGhost.class, new IRenderFactory<EntityGhostZeroGhost>()
		{
			@Override
			public Render<? super EntityGhostZeroGhost>createRenderFor(RenderManager manager)
			{
				return new RenderGhostZeroGhost(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostZeroSpector.class, new IRenderFactory<EntityGhostZeroSpector>()
		{
			@Override
			public Render<? super EntityGhostZeroSpector>createRenderFor(RenderManager manager)
			{
				return new RenderGhostZeroSpector(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostMusashi.class, new IRenderFactory<EntityGhostMusashi>()
		{
			@Override
			public Render<? super EntityGhostMusashi> createRenderFor(RenderManager manager)
			{
				return new RenderGhostMusashi(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostOreDCD.class, new IRenderFactory<EntityGhostOreDCD>()
		{
			@Override
			public Render<? super EntityGhostOreDCD>createRenderFor(RenderManager manager)
			{
				return new RenderGhostOreDCD(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGatackZector.class, new IRenderFactory<EntityGatackZector>()
		{
			@Override
			public Render<? super EntityGatackZector>createRenderFor(RenderManager manager)
			{
				return new RenderGatackZector(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGordDrive.class, new IRenderFactory<EntityGordDrive>()
		{
			@Override
			public Render<? super EntityGordDrive>createRenderFor(RenderManager manager)
			{
				return new RenderGordDrive(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBanno.class, new IRenderFactory<EntityBanno>()
		{
			@Override
			public Render<? super EntityBanno>createRenderFor(RenderManager manager)
			{
				return new RenderBanno(manager);
			}
		});
	}
}
