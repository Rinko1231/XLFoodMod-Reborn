package onelemonyboi.xlfoodmod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.world.BiomeModifiers;
import onelemonyboi.xlfoodmod.world.ConfiguredFeatures;
import onelemonyboi.xlfoodmod.world.PlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class FeaturesConfigGen extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeModifiers::bootstrap);

    public FeaturesConfigGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(XLFoodMod.MOD_ID));
    }


    @Override
    public String getName() {
        return "XLFoodMod's Generated Registry Entries";
    }
}