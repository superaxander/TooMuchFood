package alexanders.mods.toomuchfood;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
    public boolean harvestCraftCompat;
    public ConfigurationHandler(Configuration configuration)
    {
        configuration.getCategory("Items");
        configuration.getCategory("Blocks");
        configuration.getCategory("Crops/Plants");
        configuration.getCategory("Recipes");
        configuration.getCategory("Compatibility");
        harvestCraftCompat = configuration.get("Compatibility", "harvestCraftCompat", true, "Whether to enable Pam's HarvestCraft compatibility or not").getBoolean();
    }
}
