package onelemonyboi.xlfoodmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import onelemonyboi.xlfoodmod.blocks.cake.*;
import onelemonyboi.xlfoodmod.blocks.plant.*;

import static onelemonyboi.xlfoodmod.XLFoodMod.MOD_ID;

public class BlockList {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
	public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

	public static final RegistryObject<Block> ROCK_SALT = BLOCKS.register("rock_salt", RockSaltBlock::new);
	public static final RegistryObject<Block> VANILLA_FLOWER = BLOCKS.register("vanilla_flower", VanillaFlowerBlock::new);
	public static final RegistryObject<Block> RICE_PLANT = BLOCKS.register("rice_plant", RicePlant::new);
	public static final RegistryObject<Block> PEPPER_PLANT = BLOCKS.register("pepper_plant", PepperPlant::new);
	public static final RegistryObject<Block> CORN_PLANT = BLOCKS.register("corn_plant", CornPlant::new);
	public static final RegistryObject<Block> CUCUMBER_PLANT = BLOCKS.register("cucumber_plant", CucumberPlant::new);
	public static final RegistryObject<Block> LETTUCE_PLANT = BLOCKS.register("lettuce_plant", LettucePlant::new);
	public static final RegistryObject<Block> ONION_PLANT = BLOCKS.register("onion_plant", OnionPlant::new);
	public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant", TomatoPlant::new);
	public static final RegistryObject<Block> STRAWBERRY_PLANT = BLOCKS.register("strawberry_plant", StrawberryPlant::new);
	public static final RegistryObject<Block> LEMON_PLANT = BLOCKS.register("lemon_plant", LemonPlant::new);
	public static final RegistryObject<Block> PINEAPPLE_PLANT = BLOCKS.register("pineapple_plant", PineapplePlant::new);

	public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_block", BlockCakeChocolate::new);
	public static final RegistryObject<Block> CHOCOLATE_COOKIE_CAKE = BLOCKS.register("chocolate_cookie_cake", BlockCakeChocolateCookie::new);// 17, 0.2F);
	public static final RegistryObject<Block> CHEESE_CAKE = BLOCKS.register("cheese_cake", BlockCakeCheese::new);//15, 0.2F);
	public static final RegistryObject<Block> NETHER_CAKE = BLOCKS.register("nether_cake", BlockCakeNether::new);//14, 0.2F);
	public static final RegistryObject<Block> STRAWBERRY_CAKE = BLOCKS.register("strawberry_cake", BlockCakeStrawberry::new);//15, 0.2F);
	public static final RegistryObject<Block> PUMPKIN_CAKE = BLOCKS.register("pumpkin_cake", BlockCakePumpkin::new);//14, 0.2F);
	public static final RegistryObject<Block> PIZZA = BLOCKS.register("pizza", BlockCakePizza::new);//18, 0.4F);

}
