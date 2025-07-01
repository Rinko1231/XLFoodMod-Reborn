package onelemonyboi.xlfoodmod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import onelemonyboi.xlfoodmod.XLFoodMod;

import static onelemonyboi.xlfoodmod.XLFoodMod.MOD_ID;

public class TabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> PINEAPPLE_TAB = TABS.register(MOD_ID, () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("item_group." + MOD_ID))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ItemList.VANILLA_FLOWER.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                ItemList.ITEMS.getEntries().forEach(it -> output.accept(it.get()));
                BlockList.BLOCK_ITEMS.getEntries().forEach(it -> output.accept(it.get()));
            })
            .build()
    );
}