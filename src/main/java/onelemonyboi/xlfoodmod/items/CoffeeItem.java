package onelemonyboi.xlfoodmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import javax.annotation.Nonnull;

public class CoffeeItem extends ItemFood {

	public CoffeeItem(int hunger, float saturation) {
        super(new Item.Properties().food(ItemFood.foodProperties(hunger, saturation)));
    }
    @Nonnull
    @Override
    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.DRINK;
    }


    @Nonnull
    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof Player)
        {
        	Player player = (Player) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.COFFEE_CUP.get()));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }

}
