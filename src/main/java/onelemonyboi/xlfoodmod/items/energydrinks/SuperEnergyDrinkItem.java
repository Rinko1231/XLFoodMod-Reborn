package onelemonyboi.xlfoodmod.items.energydrinks;

import java.util.List;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.registries.ForgeRegistries;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.ChatFormatting;
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
import onelemonyboi.xlfoodmod.items.ItemFood;

import javax.annotation.Nonnull;

import static onelemonyboi.xlfoodmod.XLFoodMod.MOD_ID;

public class SuperEnergyDrinkItem extends ItemFood {

	public SuperEnergyDrinkItem(int hunger, float saturation) {
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
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 2, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.JUMP, 3600, 0, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 1, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 1, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 2, false, false));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.EMPTY_CAN.get()));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		String itemId = ForgeRegistries.ITEMS.getKey(this).toString().replace(":", ".");
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip2").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip3").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip4").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip5").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip6").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip7").withStyle(ChatFormatting.BLUE));
		tooltip.add(Component.translatable("item."+ itemId  +  ".tooltip8").withStyle(ChatFormatting.BLUE));
	}

}
