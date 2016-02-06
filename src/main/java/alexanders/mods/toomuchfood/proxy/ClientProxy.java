package alexanders.mods.toomuchfood.proxy;

import alexanders.mods.toomuchfood.Reference;
import alexanders.mods.toomuchfood.item.ItemTMFFood;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerFoodRender(ItemTMFFood foodItem)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(foodItem, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + foodItem.getUnlocalizedName().substring(5), "inventory"));
    }
}
