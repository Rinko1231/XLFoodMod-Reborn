package onelemonyboi.xlfoodmod.items;

import java.util.List;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nonnull;

import static onelemonyboi.xlfoodmod.items.ItemFood.foodItems;

public class BeerItem extends ItemFood
{

    public BeerItem(int hunger, float saturation) {
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
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 1, false, true));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.GLASS_MUG.get()));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
	
    @OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		//tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip").withStyle(ChatFormatting.RED));
	}
}