package lithiumstudio.mf;

import com.mojang.logging.LogUtils;
import lithiumstudio.mf.init.EntityRegistryHandler;
import lithiumstudio.mf.init.ItemRegistryHandler;
import lithiumstudio.mf.init.SoundRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mf")
public class MineFurry
{
    public static final String MODID = "mf";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MineFurry()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistryHandler.REGISTRY.register(bus);

        // Register a new block here
        // BlockRegistryHandler.REGISTRY.register(bus);

        EntityRegistryHandler.ENTITY_TYPES.register(bus);

        SoundRegistryHandler.SOUNDS.register(bus);


    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("Mine Furry mod loaded.");
        LOGGER.info("Warning! This mod is still in alpha progress!");
    }
}
