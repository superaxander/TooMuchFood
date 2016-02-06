package alexanders.mods.toomuchfood;

import alexanders.mods.toomuchfood.item.FoodRegistry;
import alexanders.mods.toomuchfood.item.ItemTMFFood;
import alexanders.mods.toomuchfood.proxy.IProxy;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModDisabledEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = "0.0.1", acceptedMinecraftVersions = "1.8.9")
public class TooMuchFood
{
    @Mod.Instance(Reference.MOD_ID)
    public static TooMuchFood instance;

    @SidedProxy(modId = Reference.MOD_ID, clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    public static Logger logger;
    public static Configuration configuration;

    public static ConfigurationHandler configurationHandler;
    public static boolean harvestCraftCompat = false;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        Configuration configs = new Configuration(event.getSuggestedConfigurationFile());
        try {
            configs.load();
        } catch (RuntimeException e) {
            logger.warn(e);
        }

        configurationHandler = new ConfigurationHandler(configs);

        //Check if Pam's HarvestCraft is installed
        if(Loader.isModLoaded("harvestcraft") && configurationHandler.harvestCraftCompat)
            harvestCraftCompat = true;
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        FoodRegistry.register();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}
