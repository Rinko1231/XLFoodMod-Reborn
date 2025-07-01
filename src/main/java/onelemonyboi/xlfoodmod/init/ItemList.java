package onelemonyboi.xlfoodmod.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import onelemonyboi.xlfoodmod.items.*;
import onelemonyboi.xlfoodmod.items.energydrinks.*;

import static onelemonyboi.xlfoodmod.XLFoodMod.MOD_ID;
import static onelemonyboi.xlfoodmod.items.ItemFood.foodItems;

public class ItemList {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

	// Plants and Salt Ore
	public static final RegistryObject<Item> ROCK_SALT = ITEMS.register("rock_salt",
			() -> new BlockItem(BlockList.ROCK_SALT.get(), new Item.Properties()));
	public static final RegistryObject<Item> VANILLA_FLOWER = ITEMS.register("vanilla_flower",
			() -> new BlockItem(BlockList.VANILLA_FLOWER.get(), new Item.Properties()));
	public static final RegistryObject<Item> RICE_PLANT = ITEMS.register("rice_plant",
			() -> new BlockItem(BlockList.RICE_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> PEPPER_PLANT = ITEMS.register("pepper_plant",
			() -> new BlockItem(BlockList.PEPPER_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> CORN_PLANT = ITEMS.register("corn_plant",
			() -> new BlockItem(BlockList.CORN_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> CUCUMBER_PLANT = ITEMS.register("cucumber_plant",
			() -> new BlockItem(BlockList.CUCUMBER_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> LETTUCE_PLANT = ITEMS.register("lettuce_plant",
			() -> new BlockItem(BlockList.LETTUCE_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> ONION_PLANT = ITEMS.register("onion_plant",
			() -> new BlockItem(BlockList.ONION_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOMATO_PLANT = ITEMS.register("tomato_plant",
			() -> new BlockItem(BlockList.TOMATO_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> STRAWBERRY_PLANT = ITEMS.register("strawberry_plant",
			() -> new BlockItem(BlockList.STRAWBERRY_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> LEMON_PLANT = ITEMS.register("lemon_plant",
			() -> new BlockItem(BlockList.LEMON_PLANT.get(), new Item.Properties()));
	public static final RegistryObject<Item> PINEAPPLE_PLANT = ITEMS.register("pineapple_plant",
			() -> new BlockItem(BlockList.PINEAPPLE_PLANT.get(), new Item.Properties()));

	// Cakes + Pizza
	public static final RegistryObject<Item> CHOCOLATE_CAKE = ITEMS.register("chocolate_cake",
			() -> new BlockItem(BlockList.CHOCOLATE_CAKE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHOCOLATE_COOKIE_CAKE = ITEMS.register("chocolate_cookie_cake",
			() -> new BlockItem(BlockList.CHOCOLATE_COOKIE_CAKE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHEESE_CAKE = ITEMS.register("cheese_cake",
			() -> new BlockItem(BlockList.CHEESE_CAKE.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_CAKE = ITEMS.register("nether_cake",
			() -> new BlockItem(BlockList.NETHER_CAKE.get(), new Item.Properties()));
	public static final RegistryObject<Item> STRAWBERRY_CAKE = ITEMS.register("strawberry_cake",
			() -> new BlockItem(BlockList.STRAWBERRY_CAKE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PUMPKIN_CAKE = ITEMS.register("pumpkin_cake",
			() -> new BlockItem(BlockList.PUMPKIN_CAKE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
			() -> new BlockItem(BlockList.PIZZA.get(), new Item.Properties()));


// Inedible Ingredients
	public static final RegistryObject<Item> SEAWEED = ITEMS.register("seaweed", ItemFood::itemItems);
	public static final RegistryObject<Item> BOWL = ITEMS.register("bowl", ItemFood::itemItems);
	public static final RegistryObject<Item> COFFEE_CUP = ITEMS.register("coffee_cup", ItemFood::itemItems);
	public static final RegistryObject<Item> GLASS_MUG = ITEMS.register("glass_mug", ItemFood::itemItems);
	public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM_BALL = ITEMS.register("chocolate_ice_cream_ball", ItemFood::itemItems);
	public static final RegistryObject<Item> VANILLA_ICE_CREAM_BALL = ITEMS.register("vanilla_ice_cream_ball", ItemFood::itemItems);
	public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM_BALL = ITEMS.register("strawberry_ice_cream_ball", ItemFood::itemItems);
	public static final RegistryObject<Item> TOMATO_SAUCE = ITEMS.register("tomato_sauce", ItemFood::itemItems);
	public static final RegistryObject<Item> HOT_SAUCE = ITEMS.register("hot_sauce", ItemFood::itemItems);
	public static final RegistryObject<Item> CHOCOLATE_SYRUP = ITEMS.register("chocolate_syrup", ItemFood::itemItems);
	public static final RegistryObject<Item> VANILLA_EXTRACT = ITEMS.register("vanilla_extract", ItemFood::itemItems);
	public static final RegistryObject<Item> VANILLA_CREAM = ITEMS.register("vanilla_cream", ItemFood::itemItems);
	public static final RegistryObject<Item> EMPTY_CAN = ITEMS.register("empty_can", ItemFood::itemItems);
	public static final RegistryObject<Item> PIE_SHELL = ITEMS.register("pie_shell", ItemFood::itemItems);
	public static final RegistryObject<Item> PAPER_CUP = ITEMS.register("paper_cup", ItemFood::itemItems);


	// Crop Outputs
	// TEMPLATE: public static Item ITEMNAME = new ItemFood("name", 1, 0.6F);
	// TEMPLATE: public static Item ITEMNAME = new ItemSeeds("name", BlockList.PLANTNAME);

	public static final RegistryObject<Item> BUTTER_RICE = ITEMS.register("butter_rice", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> FRIED_RICE = ITEMS.register("fried_rice", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> RAW_CORN = ITEMS.register("raw_corn", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple", () -> foodItems(1, 0.6f));

public static final RegistryObject<Item> RICE = ITEMS.register("rice",()-> new ItemSeedFood(BlockList.RICE_PLANT.get(),1,0.6F));
public static final RegistryObject<Item> ONION = ITEMS.register("onion", ()-> new ItemSeedFood(BlockList.ONION_PLANT.get(),1,0.6F));

	// Seeds
	public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
			() -> new ItemSeeds(BlockList.STRAWBERRY_PLANT.get()));
	public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
			() -> new ItemSeeds(BlockList.TOMATO_PLANT.get()));
	public static final RegistryObject<Item> LEMON_SEEDS = ITEMS.register("lemon_seeds",
			() -> new ItemSeeds(BlockList.LEMON_PLANT.get()));
	public static final RegistryObject<Item> PINEAPPLE_SEEDS = ITEMS.register("pineapple_seeds",
			() -> new ItemSeeds(BlockList.PINEAPPLE_PLANT.get()));
	public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
			() -> new ItemSeeds(BlockList.CORN_PLANT.get()));
	public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds",
			() -> new ItemSeeds(BlockList.PEPPER_PLANT.get()));
	public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds",
			() -> new ItemSeeds(BlockList.LETTUCE_PLANT.get()));
	public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
			() -> new ItemSeeds(BlockList.CUCUMBER_PLANT.get()));


	// Stuff that include dough + Salt

	public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> foodItems(0, 0.2f));
	public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> COOKED_DOUGH = ITEMS.register("cooked_dough", () -> foodItems(2, 1.2f));
	public static final RegistryObject<Item> CROUTON = ITEMS.register("crouton", () -> foodItems(1, 1.2f));
	public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> CHEESE_PUFF = ITEMS.register("cheese_puff", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> CHIPS = ITEMS.register("chips", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> SALTY_CHIPS = ITEMS.register("salty_chips", () -> foodItems(1, 1.2f));
	public static final RegistryObject<Item> SPICY_CHIPS = ITEMS.register("spicy_chips", () -> foodItems(1, 1.2f));
	public static final RegistryObject<Item> ONION_RINGS = ITEMS.register("onion_rings", () -> foodItems(2, 1.2f));
	public static final RegistryObject<Item> CHEESY_BREAD = ITEMS.register("cheesy_bread", () -> foodItems(6, 0.6f));
	public static final RegistryObject<Item> POTATO_BREAD = ITEMS.register("potato_bread", () -> foodItems(6, 0.6f));
	public static final RegistryObject<Item> CORN_BREAD = ITEMS.register("corn_bread", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> foodItems(5, 0.6f));
	public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette", () -> foodItems(5, 0.6f));
	public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake", () -> foodItems(5, 0.6f));
	public static final RegistryObject<Item> WAFFLE = ITEMS.register("waffle", () -> foodItems(5, 0.6f));




	public static final RegistryObject<Item> MACARONI_AND_CHEESE = ITEMS.register("macaroni_and_cheese", ()-> new BowlItem( 9, 0.6F));

	// International Foods
	public static final RegistryObject<Item> SPAGHETTI = ITEMS.register("spaghetti", ()-> new BowlItem( 9, 0.6F));

	public static final RegistryObject<Item> ENCHILADA = ITEMS.register("enchilada", () -> foodItems(9, 0.6f));
	public static final RegistryObject<Item> LASAGNE = ITEMS.register("lasagne", () -> foodItems(12, 0.6f));
	public static final RegistryObject<Item> JAMBON_BEURRE = ITEMS.register("jambon_beurre", () -> foodItems(15, 0.4f));

	// Meats
	public static final RegistryObject<Item> FLESH = ITEMS.register("flesh", () -> foodItems(4, 0.2f));
	public static final RegistryObject<Item> HAM = ITEMS.register("ham", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage", () -> foodItems(3, 1.2f));
	public static final RegistryObject<Item> BACON = ITEMS.register("bacon", () -> foodItems(3, 1.2f));
	public static final RegistryObject<Item> BEEF_JERKY = ITEMS.register("beef_jerky", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> GROUND_BEEF = ITEMS.register("ground_beef", () -> foodItems(4, 1.2f));
	public static final RegistryObject<Item> RAW_CHICKEN_WING = ITEMS.register("raw_chicken_wing", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> COOKED_CHICKEN_WING = ITEMS.register("cooked_chicken_wing", () -> foodItems(4, 1.2f));
	public static final RegistryObject<Item> SPICY_CHICKEN_WING = ITEMS.register("spicy_chicken_wing", () -> foodItems(4, 1.4f));
	public static final RegistryObject<Item> BUCKET_OF_FRIED_CHICKEN = ITEMS.register("bucket_of_fried_chicken", ()-> new BucketOfFriedChickenItem( 6, 0.6F));

	// Burgers & Fast Food
	public static final RegistryObject<Item> TOP_BUN = ITEMS.register("top_bun", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> BOTTOM_BUN = ITEMS.register("bottom_bun", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () -> foodItems(9, 0.6f));
	public static final RegistryObject<Item> CHICKENBURGER = ITEMS.register("chickenburger", () -> foodItems(9, 0.6f));
	public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger", () -> foodItems(10, 0.6f));
	public static final RegistryObject<Item> HOT_DOG = ITEMS.register("hot_dog", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> SAUSAGE_ROLL = ITEMS.register("sausage_roll", () -> foodItems(7, 0.6f));
	public static final RegistryObject<Item> SLICE_OF_PIZZA = ITEMS.register("slice_of_pizza", () -> foodItems(7, 0.6f));
	public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> TACO = ITEMS.register("taco", () -> foodItems(7, 0.6f));
	public static final RegistryObject<Item> BURRITO = ITEMS.register("burrito", () -> foodItems(7, 0.6f));
	public static final RegistryObject<Item> KEBAB = ITEMS.register("kebab", () -> foodItems(12, 0.4f));

	// Sandwiches
	public static final RegistryObject<Item> CHICKEN_SANDWICH = ITEMS.register("chicken_sandwich", () -> foodItems(10, 0.6f));
	public static final RegistryObject<Item> BLT_SANDWICH = ITEMS.register("blt_sandwich", () -> foodItems(12, 0.4f));
	public static final RegistryObject<Item> BREAKFAST_SANDWICH = ITEMS.register("breakfast_sandwich", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> GRILLED_CHEESE_SANDWICH = ITEMS.register("grilled_cheese_sandwich", () -> foodItems(11, 0.4f));
	public static final RegistryObject<Item> ICE_CREAM_SANDWICH = ITEMS.register("ice_cream_sandwich", () -> foodItems(6, 0.6f));


	// Sushi
	public static final RegistryObject<Item> FUTOMAKI = ITEMS.register("futomaki", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> URAMAKI = ITEMS.register("uramaki", () -> foodItems(9, 0.4f));
	public static final RegistryObject<Item> OSHIZUSHI = ITEMS.register("oshizushi", () -> foodItems(12, 0.2f));



// Salads
	public static final RegistryObject<Item> GARDEN_SALAD = ITEMS.register("garden_salad", () -> new BowlItem(5, 0.6F));
	public static final RegistryObject<Item> CHICKEN_SALAD = ITEMS.register("chicken_salad", () -> new BowlItem(8, 0.6F));
	public static final RegistryObject<Item> CAESAR_SALAD = ITEMS.register("caesar_salad", () -> new BowlItem(6, 0.6F));
	public static final RegistryObject<Item> ONION_SALAD = ITEMS.register("onion_salad", () -> new BowlItem(4, 0.6F));
	public static final RegistryObject<Item> TACO_SALAD = ITEMS.register("taco_salad", () -> new BowlItem(10, 0.6F));

	// Soups and Stews
	public static final RegistryObject<Item> CUCUMBER_SOUP = ITEMS.register("cucumber_soup", () -> new BowlItem(6, 0.6F));
	public static final RegistryObject<Item> TOMATO_SOUP = ITEMS.register("tomato_soup", () -> new BowlItem(3, 0.6F));
	public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup", () -> new BowlItem(8, 0.6F));
	public static final RegistryObject<Item> CHICKEN_SOUP = ITEMS.register("chicken_soup", () -> new BowlItem(10, 0.6F));
	public static final RegistryObject<Item> BEEF_STEW = ITEMS.register("beef_stew", () -> new BowlItem(12, 0.6F));


	public static final RegistryObject<Item> PUMPKIN_STEW = ITEMS.register("pumpkin_stew", ()-> foodItems(6,0.6F));

	// Desserts
	public static final RegistryObject<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> foodItems(6, 0.6f));
	public static final RegistryObject<Item> MARSHMALLOW = ITEMS.register("marshmallow", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> ROASTED_MARSHMALLOW = ITEMS.register("roasted_marshmallow", () -> foodItems(2, 0.6f));
	public static final RegistryObject<Item> CHOCOLATE_COOKIE = ITEMS.register("chocolate_cookie", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> VANILLA_COOKIE = ITEMS.register("vanilla_cookie", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> BROWNIE = ITEMS.register("brownie", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> BOURBON_BISCUIT = ITEMS.register("bourbon_biscuit", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> foodItems(1, 0.6f));
	public static final RegistryObject<Item> ICE_CREAM_CONE = ITEMS.register("ice_cream_cone", () -> foodItems(3, 1.2f));
	public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> CRESCENT_ROLL = ITEMS.register("crescent_roll", () -> foodItems(6, 0.6f));
	public static final RegistryObject<Item> DONUT = ITEMS.register("donut", () -> foodItems(4, 0.6f));
	public static final RegistryObject<Item> SUGAR_DONUT = ITEMS.register("sugar_donut", () -> foodItems(5, 0.6f));
	public static final RegistryObject<Item> CHOCOLATE_DONUT = ITEMS.register("chocolate_donut", () -> foodItems(5, 0.6f));
	public static final RegistryObject<Item> VANILLA_DONUT = ITEMS.register("vanilla_donut", () -> foodItems(5, 0.6f));

	// Cupcakes
	public static final RegistryObject<Item> VANILLA_CUPCAKE = ITEMS.register("vanilla_cupcake", () -> foodItems(2, 0.6f));
	public static final RegistryObject<Item> CHOCOLATE_CUPCAKE = ITEMS.register("chocolate_cupcake", () -> foodItems(3, 0.6f));
	public static final RegistryObject<Item> CHOCOLATE_COOKIE_CUPCAKE = ITEMS.register("chocolate_cookie_cupcake", () -> foodItems(5, 0.6f));
	public static final RegistryObject<Item> STRAWBERRY_CUPCAKE = ITEMS.register("strawberry_cupcake", () -> foodItems(3, 0.6f));

	// Pies
	public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> GOLDEN_APPLE_PIE = ITEMS.register("golden_apple_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> CHEESE_PIE = ITEMS.register("cheese_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> CHICKEN_POT_PIE = ITEMS.register("chicken_pot_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> CHOCOLATE_PIE = ITEMS.register("chocolate_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> BACON_PIE = ITEMS.register("bacon_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> FISH_PIE = ITEMS.register("fish_pie", () -> foodItems(8, 0.6f));
	public static final RegistryObject<Item> STRAWBERRY_PIE = ITEMS.register("strawberry_pie", () -> foodItems(8, 0.6f));

	// Drinks
	public static final RegistryObject<Item> SPEEDY_ENERGY_DRINK = ITEMS.register("speedy_energy_drink", () -> new SpeedyEnergyDrinkItem(0, 0.0f));
	public static final RegistryObject<Item> HEALTHY_ENERGY_DRINK = ITEMS.register("healthy_energy_drink", () -> new HealthyEnergyDrinkItem(0, 0.0f));
	public static final RegistryObject<Item> STEALTHY_ENERGY_DRINK = ITEMS.register("stealthy_energy_drink", () -> new StealthyEnergyDrinkItem(0, 0.0f));
	public static final RegistryObject<Item> STRONG_ENERGY_DRINK = ITEMS.register("strong_energy_drink", () -> new StrongEnergyDrinkItem(0, 0.0f));
	public static final RegistryObject<Item> DEADLY_ENERGY_DRINK = ITEMS.register("deadly_energy_drink", () -> new DeadlyEnergyDrinkItem(0, 0.0f));
	public static final RegistryObject<Item> SUPER_ENERGY_DRINK = ITEMS.register("super_energy_drink", () -> new SuperEnergyDrinkItem(10, 10.0f));

	public static final RegistryObject<Item> BEER = ITEMS.register("beer",()-> new BeerItem(4,0.2f));
	public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee", () -> new CoffeeItem(2, 40f));
	public static final RegistryObject<Item> CAPPUCCINO = ITEMS.register("cappuccino", () -> new CappucinoItem(4, 60f));

	public static final RegistryObject<Item> LEMON_JUICE = ITEMS.register("lemon_juice", () -> new JuiceItem(2, 0.2f));
	public static final RegistryObject<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", () -> new JuiceItem(2, 0.2f));
	public static final RegistryObject<Item> PINEAPPLE_JUICE = ITEMS.register("pineapple_juice", () -> new JuiceItem(2, 0.2f));

	public static final RegistryObject<Item> LEMON_SYRUP = ITEMS.register("lemon_syrup", () -> new SyrupItem(2, 0.2f));
	public static final RegistryObject<Item> STRAWBERRY_SYRUP = ITEMS.register("strawberry_syrup", () -> new SyrupItem(2, 0.2f));
	public static final RegistryObject<Item> PINEAPPLE_SYRUP = ITEMS.register("pineapple_syrup", () -> new SyrupItem(2, 0.2f));

	public static final RegistryObject<Item> LEMON_SLUSHIE = ITEMS.register("lemon_slushie", () -> new JuiceItem(3, 0.4f));
	public static final RegistryObject<Item> STRAWBERRY_SLUSHIE = ITEMS.register("strawberry_slushie", () -> new JuiceItem(3, 0.4f));
	public static final RegistryObject<Item> PINEAPPLE_SLUSHIE = ITEMS.register("pineapple_slushie", () -> new JuiceItem(3, 0.4f));

}
