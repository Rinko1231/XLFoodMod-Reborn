package onelemonyboi.xlfoodmod.data;


import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;
import onelemonyboi.xlfoodmod.config.XLFoodModConfig;
import onelemonyboi.xlfoodmod.init.ItemList;


import javax.annotation.Nonnull;

import java.util.ArrayList;
import java.util.List;

import static onelemonyboi.xlfoodmod.XLFoodMod.MOD_ID;

public class GrassDropModifier extends LootModifier
{
    private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> REGISTER = DeferredRegister.create(
            Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MOD_ID
    );
    private static final RegistryObject<Codec<GrassDropModifier>> GRASS_DROPS = REGISTER.register(
            "seed_drops", () -> RecordCodecBuilder.create(inst -> codecStart(inst).apply(inst, GrassDropModifier::new))
    );


    protected GrassDropModifier(LootItemCondition[] conditionsIn)
    {
        super(conditionsIn);
    }

    public static void init(IEventBus bus)
    {
        REGISTER.register(bus);
    }

    private static final RandomSource random = RandomSource.create();
    @Nonnull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context)
    {
        List<Item> possibleSeeds = new ArrayList<>();
//笑死，熟悉的味道
        if (XLFoodModConfig.enableLemonSeed.get()) possibleSeeds.add(ItemList.LEMON_SEEDS.get());
        if (XLFoodModConfig.enableTomatoSeed.get()) possibleSeeds.add(ItemList.TOMATO_SEEDS.get());
        if (XLFoodModConfig.enableStrawberrySeed.get()) possibleSeeds.add(ItemList.STRAWBERRY_SEEDS.get());
        if (XLFoodModConfig.enableCucumberSeed.get()) possibleSeeds.add(ItemList.CUCUMBER_SEEDS.get());
        if (XLFoodModConfig.enableCornSeed.get()) possibleSeeds.add(ItemList.CORN_SEEDS.get());
        if (XLFoodModConfig.enableLettuceSeed.get()) possibleSeeds.add(ItemList.LETTUCE_SEEDS.get());
        if (XLFoodModConfig.enableOnion.get()) possibleSeeds.add(ItemList.ONION.get());
        if (XLFoodModConfig.enablePepperSeed.get()) possibleSeeds.add(ItemList.PEPPER_SEEDS.get());
        if (XLFoodModConfig.enablePineappleSeed.get()) possibleSeeds.add(ItemList.PINEAPPLE_SEEDS.get());
        if (XLFoodModConfig.enableRice.get()) possibleSeeds.add(ItemList.RICE.get());
        if (XLFoodModConfig.enableVanillaFlower.get()) possibleSeeds.add(ItemList.VANILLA_FLOWER.get());

        if (!possibleSeeds.isEmpty()) {
            Item randomSeed = possibleSeeds.get(random.nextInt(possibleSeeds.size()));
            generatedLoot.add(new ItemStack(randomSeed));
        }

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec()
    {
        return GRASS_DROPS.get();
    }
}