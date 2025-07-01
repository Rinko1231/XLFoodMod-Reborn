package onelemonyboi.xlfoodmod.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ItemFood extends Item {

	public ItemFood(Properties p_41383_) {
		super(p_41383_);
	}

	public static FoodProperties foodProperties(int hunger, float saturation) {
		return new FoodProperties.Builder()
				.nutrition(hunger)
				.saturationMod(saturation)
				.build();
	}

	public static Item itemItems() {
		Item.Properties properties = new Item.Properties();
		return new Item(properties);
	}

	public static Item foodItems(int hunger, float saturation) {
		Item.Properties properties = new Item.Properties();
		FoodProperties.Builder builder = new FoodProperties.Builder();

		builder.nutrition(hunger);
		builder.saturationMod(saturation);

		properties.food(builder.build());
		return new Item(properties);
	}

	public static Item foodItems(int hunger, float saturation,  Item item) {
		Item.Properties properties = new Item.Properties();
		FoodProperties.Builder builder = new FoodProperties.Builder();

		builder.nutrition(hunger);
		builder.saturationMod(saturation);
		properties.craftRemainder(item);

		properties.food(builder.build());
		return new Item(properties);
	}
}
