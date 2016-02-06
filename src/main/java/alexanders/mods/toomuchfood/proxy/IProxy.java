package alexanders.mods.toomuchfood.proxy;

import alexanders.mods.toomuchfood.item.ItemTMFFood;

public interface IProxy
{
    void registerFood(ItemTMFFood foodItem);
    void registerFoodRender(ItemTMFFood foodItem);
}
