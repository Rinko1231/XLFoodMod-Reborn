package onelemonyboi.xlfoodmod.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class XLFoodModConfig  {
    public static ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.BooleanValue enableLemonSeed;
    public static ForgeConfigSpec.BooleanValue enableTomatoSeed;
    public static ForgeConfigSpec.BooleanValue enableStrawberrySeed;
    public static ForgeConfigSpec.BooleanValue enableCucumberSeed;
    public static ForgeConfigSpec.BooleanValue enableCornSeed;
    public static ForgeConfigSpec.BooleanValue enableLettuceSeed;
    public static ForgeConfigSpec.BooleanValue enableOnion;
    public static ForgeConfigSpec.BooleanValue enablePepperSeed;
    public static ForgeConfigSpec.BooleanValue enablePineappleSeed;
    public static ForgeConfigSpec.BooleanValue enableRice;
    public static ForgeConfigSpec.BooleanValue enableVanillaFlower;
/*
    public static ForgeConfigSpec.IntValue rockSaltVeinCount;
    public static ForgeConfigSpec.IntValue rockSaltVeinSize;
    public static ForgeConfigSpec.IntValue rockSaltMaxAboveBottom;
    public static ForgeConfigSpec.IntValue rockSaltMinAboveBottom;
*/
    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("seed drops");

        enableLemonSeed = builder.comment("Enable lemon seed drop").define("lemonSeed", true);
        enableTomatoSeed = builder.comment("Enable tomato seed drop").define("tomatoSeed", true);
        enableStrawberrySeed = builder.comment("Enable strawberry seed drop").define("strawberrySeed", true);
        enableCucumberSeed = builder.comment("Enable cucumber seed drop").define("cucumberSeed", true);
        enableCornSeed = builder.comment("Enable corn seed drop").define("cornSeed", true);
        enableLettuceSeed = builder.comment("Enable lettuce seed drop").define("lettuceSeed", true);
        enableOnion = builder.comment("Enable onion drop").define("onion", true);
        enablePepperSeed = builder.comment("Enable pepper seed drop").define("pepperSeed", true);
        enablePineappleSeed = builder.comment("Enable pineapple seed drop").define("pineappleSeed", true);
        enableRice = builder.comment("Enable rice drop").define("rice", true);
        enableVanillaFlower = builder.comment("Enable vanilla flower drop").define("vanillaFlower", true);

        builder.pop();
        /*
        builder.push("rock salt");
        rockSaltVeinCount = builder
                .comment("Rock Salt Vein Count")
                        .defineInRange("rockSaltVeinCount",6,0,114514);
        rockSaltVeinSize = builder
                .comment("Rock Salt Vein Size")
                .defineInRange("rockSaltVeinSize",9,0,114514);
        rockSaltMaxAboveBottom = builder
                .comment("Rock Salt Max Inclusive Above Bottom")
                .defineInRange("rockSaltMaxAboveBottom",124,0,384);
        rockSaltMinAboveBottom = builder
                .comment("Rock Salt Min Inclusive Above Bottom")
                .defineInRange("rockSaltMinAboveBottom",64,0,384);

        builder.pop();*/

        SPEC = builder.build();
    }
    public static void setup()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SPEC, "XLFoodModConfig.toml");
    }
}