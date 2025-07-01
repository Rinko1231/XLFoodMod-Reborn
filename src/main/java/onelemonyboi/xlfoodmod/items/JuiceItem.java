package onelemonyboi.xlfoodmod.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;
import org.jetbrains.annotations.NotNull;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import javax.annotation.Nonnull;

public class JuiceItem extends ItemFood {

    public JuiceItem(int hunger, float saturation) {
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
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level worldIn, @NotNull LivingEntity entityLiving)
    {
        if(entityLiving instanceof Player)
        {
        	Player player = (Player) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
}
