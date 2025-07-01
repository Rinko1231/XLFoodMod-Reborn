package onelemonyboi.xlfoodmod.items;

import net.minecraft.world.item.Item;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;

public class BowlItem extends ItemFood {

	public BowlItem(int hunger, float saturation)
    {
        super(new Item.Properties().food(ItemFood.foodProperties(hunger, saturation)));
    }
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof Player)
        {
        	Player player = (Player) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.BOWL.get()));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }

}
