package alexanders.mods.toomuchfood.item;

import alexanders.mods.toomuchfood.TooMuchFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class FoodRegistry
{
    public static ItemTMFFood test_food = new ItemTMFFood("test_food", 2, 2f, false, new PotionEffect(Potion.nightVision.getId(), 1, 20), 1f, false);

    public static void register()
    {
        TooMuchFood.proxy.registerFood(test_food);
        TooMuchFood.proxy.registerFoodRender(test_food);
    }
}
