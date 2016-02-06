package alexanders.mods.toomuchfood.item;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemTMFFood extends ItemFood
{

    // Probability between 1.0f en 0.0f
    public ItemTMFFood(String localizedName, int hunger, float saturation, boolean isWolfFood, PotionEffect potionEffect, float probability, boolean alwaysEdible)
    {
        super(hunger, saturation, isWolfFood);
        this.setUnlocalizedName(localizedName);
        this.setAlwaysEdible();
        this.setPotionEffect(potionEffect.getPotionID(), potionEffect.getAmplifier(), potionEffect.getDuration(), probability);
    }
}
