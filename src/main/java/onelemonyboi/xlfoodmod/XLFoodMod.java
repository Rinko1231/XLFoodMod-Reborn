package onelemonyboi.xlfoodmod;

import net.minecraft.resources.ResourceLocation;
import onelemonyboi.xlfoodmod.data.Datagen;
import onelemonyboi.xlfoodmod.init.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(XLFoodMod.MOD_ID)
public class XLFoodMod {
	
    public static final String MOD_ID = "xlfoodmod";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public XLFoodMod()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemList.ITEMS.register(bus);
		BlockList.BLOCKS.register(bus);
		BlockList.BLOCK_ITEMS.register(bus);
		TabInit.TABS.register(bus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);


		bus.addListener(EventPriority.LOWEST, Datagen::gatherData);
	}
	
	private void setup(final FMLCommonSetupEvent event)
    {
		//event.enqueueWork(()->{OreInit.registerOres();});
		ComposterItems.register();
    }
	private void doClientStuff(final FMLClientSetupEvent event)
	{
        // do something that can only be done on the client
		ItemBlockRenderTypes.setRenderLayer(BlockList.VANILLA_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.RICE_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.PEPPER_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.CORN_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.CUCUMBER_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.LETTUCE_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.ONION_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.TOMATO_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.STRAWBERRY_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.LEMON_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.PINEAPPLE_PLANT.get(), RenderType.cutout());
	}
	public static ResourceLocation genRL(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
	public static Logger getLogger()
    {
        return LOGGER;
    }
/*
	@Mod.EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = Bus.FORGE)
	public static class XLFMForgeInit
	{
	    @SubscribeEvent(priority = EventPriority.HIGHEST)
	    public static void biomeLoading(BiomeLoadingEvent event)
	    {
	        final List<Supplier<PlacedFeature>> features = event.getGeneration()
	                .getFeatures(Decoration.UNDERGROUND_ORES);
	        
	        final List<Supplier<PlacedFeature>> flowers = event.getGeneration()
	                .getFeatures(Decoration.SURFACE_STRUCTURES);

	        switch (event.getCategory())
	        {
	        	default -> OreInit.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
	        }
	        RandomPatchConfiguration rnd = null;
	        
	        event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
                    FeaturesList.VANILLA_FLOWY.get().configured(rnd).filteredByBlockSurvival(Blocks.GRASS_BLOCK));
	        
	          //final PlacedFeature placedVanFlow = PlacementUtils.register("vanilla_flower",
	        	//	  OreInit.OVERWORLD_IS.get());
	        				  
	        				  //OreInit.commonOrePlacement(6, HeightRangePlacement
	                          //.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(64)))));

	    }
	}

	*/
}