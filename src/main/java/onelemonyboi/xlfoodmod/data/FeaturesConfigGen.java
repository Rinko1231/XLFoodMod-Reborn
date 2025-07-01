package onelemonyboi.xlfoodmod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.world.ConfiguredFeatures;
import onelemonyboi.xlfoodmod.world.PlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static onelemonyboi.xlfoodmod.XLFoodMod.MOD_ID;

public class FeaturesConfigGen extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeatures::bootstrap)
            //.add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeModifierFlower::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeModifiersRock::bootstrap);

    public FeaturesConfigGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MOD_ID));
    }
/*
    public static class BiomeModifierFlower {
        public static final ResourceKey<BiomeModifier> VANILLA_FLOWERY_SPAWN = ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, prefix("vanilla_flowery"));

        public static void bootstrap(BootstapContext<BiomeModifier> context) {
            HolderSet<Biome> OVERWORLD_TAG = context.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD);
            HolderSet.Named<Biome> BERRY_BIOMES = context.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_FOREST);
            Holder.Reference<PlacedFeature> BERRY_SET = context.lookup(Registries.PLACED_FEATURE).get(WorldgenRegistry.PLACED_VANILLA_FLOWERY).get();

            context.register(BiomeModifierFlower.VANILLA_FLOWERY_SPAWN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(BERRY_BIOMES, HolderSet.direct(BERRY_SET), GenerationStep.Decoration.VEGETAL_DECORATION));
        }

        @NotNull
        private static ResourceLocation prefix(String path) {
            return new ResourceLocation(MOD_ID, path);
        }
    }*/

    public class BiomeModifiersRock {
        public static final ResourceKey<BiomeModifier> ADD_ROCK_SALT = registerKey("add_rock_salt");


        public static void bootstrap(BootstapContext<BiomeModifier> context) {
            var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
            var biomes = context.lookup(Registries.BIOME);

            context.register(ADD_ROCK_SALT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ROCK_SALT_PLACED)),
                    GenerationStep.Decoration.UNDERGROUND_ORES));
        }

        private static ResourceKey<BiomeModifier> registerKey(String name) {
            return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, XLFoodMod.genRL(name));
        }
    }




    @Override
    public String getName() {
        return "XLFoodMod's Generated Registry Entries";
    }
}