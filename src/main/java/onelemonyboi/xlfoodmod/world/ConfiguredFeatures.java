package onelemonyboi.xlfoodmod.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.BlockList;

public class ConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROCK_SALT_KEY = registerKey("rock_salt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VANILLA_FLOWERY_KEY = registerKey("vanilla_flowery");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new BlockMatchTest(Blocks.STONE);
        RuleTest grassReplacables = new BlockMatchTest(Blocks.GRASS);

        register(context, ROCK_SALT_KEY, Feature.ORE, new OreConfiguration(stoneReplacables,
                BlockList.ROCK_SALT.get().defaultBlockState(), 9));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, XLFoodMod.genRL(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}