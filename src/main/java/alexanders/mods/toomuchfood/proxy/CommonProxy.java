package alexanders.mods.toomuchfood.proxy;

import alexanders.mods.toomuchfood.item.ItemTMFFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements IProxy
{
    @Override
    public void registerFood(ItemTMFFood foodItem)
    {
        GameRegistry.registerItem(foodItem, foodItem.getUnlocalizedName().substring(5));
    }

    @Override
    public void registerFoodRender(ItemTMFFood foodItem)
    {}
}
