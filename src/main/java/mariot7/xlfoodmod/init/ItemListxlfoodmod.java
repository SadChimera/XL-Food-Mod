package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.items.Beer;
import mariot7.xlfoodmod.items.BucketOfFriedChicken;
import mariot7.xlfoodmod.items.Cappuccino;
import mariot7.xlfoodmod.items.Coffee;
import mariot7.xlfoodmod.items.DeadlyEnergyDrink;
import mariot7.xlfoodmod.items.HealthyEnergyDrink;
import mariot7.xlfoodmod.items.Onion;
import mariot7.xlfoodmod.items.Bowl;
import mariot7.xlfoodmod.items.SpeedyEnergyDrink;
import mariot7.xlfoodmod.items.StealthyEnergyDrink;
import mariot7.xlfoodmod.items.StrongEnergyDrink;
import mariot7.xlfoodmod.items.SuperEnergyDrink;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemListxlfoodmod {
	
	//crops
	public static ItemSeedsxlfoodmod rice_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.rice_plant, Blocks.FARMLAND, "rice_seeds");
	public static ItemFoodxlfoodmod rice = new ItemFoodxlfoodmod("rice", 1, 0.6F, false);
	public static ItemFoodxlfoodmod butter_rice = new ItemFoodxlfoodmod("butter_rice", 4, 0.6F, false);
	public static ItemFoodxlfoodmod fried_rice = new ItemFoodxlfoodmod("fried_rice", 3, 0.6F, false);
	public static ItemSeedsxlfoodmod pepper_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.pepper_plant, Blocks.FARMLAND, "pepper_seeds");
	public static ItemFoodxlfoodmod pepper = new ItemFoodxlfoodmod("pepper", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod corn_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.corn_plant, Blocks.FARMLAND, "corn_seeds");
	public static ItemFoodxlfoodmod raw_corn = new ItemFoodxlfoodmod("raw_corn", 1, 0.6F, false);
	public static ItemFoodxlfoodmod corn = new ItemFoodxlfoodmod("corn", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod cucumber_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.cucumber_plant, Blocks.FARMLAND, "cucumber_seeds");
	public static ItemFoodxlfoodmod cucumber = new ItemFoodxlfoodmod("cucumber", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod lettuce_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.lettuce_plant, Blocks.FARMLAND, "lettuce_seeds");
	public static ItemFoodxlfoodmod lettuce = new ItemFoodxlfoodmod("lettuce", 1, 0.6F, false);
	public static Onion onion = new Onion(1, 0.6F, BlockListxlfoodmod.onion_plant, Blocks.FARMLAND);
	public static ItemSeedsxlfoodmod tomato_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.tomato_plant, Blocks.FARMLAND, "tomato_seeds");
	public static ItemFoodxlfoodmod tomato = new ItemFoodxlfoodmod("tomato", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod strawberry_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.strawberry_plant, Blocks.FARMLAND, "strawberry_seeds");
	public static ItemFoodxlfoodmod strawberry = new ItemFoodxlfoodmod("strawberry", 1, 0.6F, false);
	//other foods
	public static ItemFoodxlfoodmod salt = new ItemFoodxlfoodmod("salt", 0, 0.2F, false);
	public static ItemFoodxlfoodmod dough = new ItemFoodxlfoodmod("dough", 1, 0.6F, false);
	public static ItemFoodxlfoodmod cooked_dough = new ItemFoodxlfoodmod("cooked_dough", 2, 1.2F, false);
	public static ItemFoodxlfoodmod crouton = new ItemFoodxlfoodmod("crouton", 1, 1.2F, false);
	public static ItemFoodxlfoodmod butter = new ItemFoodxlfoodmod("butter", 1, 0.6F, false);
	public static ItemFoodxlfoodmod cheese = new ItemFoodxlfoodmod("cheese", 1, 0.6F, false);
	public static ItemFoodxlfoodmod cheese_puff = new ItemFoodxlfoodmod("cheese_puff", 1, 0.6F, false);
	public static ItemFoodxlfoodmod chips = new ItemFoodxlfoodmod("chips", 1, 0.6F, false);					
	public static ItemFoodxlfoodmod salty_chips = new ItemFoodxlfoodmod("salty_chips", 1, 1.2F, false);
	public static ItemFoodxlfoodmod spicy_chips = new ItemFoodxlfoodmod("spicy_chips", 1, 1.2F, false);
	public static ItemFoodxlfoodmod onion_rings = new ItemFoodxlfoodmod("onion_rings", 2, 1.2F, false);
	public static ItemFoodxlfoodmod cheesy_bread = new ItemFoodxlfoodmod("cheesy_bread", 6, 0.6F, false);
	public static ItemFoodxlfoodmod potato_bread = new ItemFoodxlfoodmod("potato_bread", 6, 0.6F, false);
	public static ItemFoodxlfoodmod corn_bread = new ItemFoodxlfoodmod("corn_bread", 8, 0.6F, false);
	public static ItemFoodxlfoodmod baguette = new ItemFoodxlfoodmod("baguette", 6, 0.6F, false);
	public static ItemFoodxlfoodmod fried_egg = new ItemFoodxlfoodmod("fried_egg", 3, 0.6F, false);
	public static ItemFoodxlfoodmod pancake = new ItemFoodxlfoodmod("pancake", 5, 0.6F, false);
	public static ItemFoodxlfoodmod waffle = new ItemFoodxlfoodmod("waffle", 5, 0.6F, false);
	public static Bowl macaroni_and_cheese = new Bowl("macaroni_and_cheese", 9, 0.6F, false);
	//traditional food
	public static Bowl spaghetti = new Bowl("spaghetti", 9, 0.6F, false);
	public static ItemFoodxlfoodmod enchilada = new ItemFoodxlfoodmod("enchilada", 9, 0.6F, false);
	public static ItemFoodxlfoodmod lasagne = new ItemFoodxlfoodmod("lasagne", 12, 0.6F, false);
	public static ItemFoodxlfoodmod jambon_beurre = new ItemFoodxlfoodmod("jambon_beurre", 15, 0.4F, false);
    //meat
	public static ItemFoodxlfoodmod flesh = new ItemFoodxlfoodmod("flesh", 4, 0.2F, false);
	public static ItemFoodxlfoodmod sausage = new ItemFoodxlfoodmod("sausage", 3, 1.2F, false);
	public static ItemFoodxlfoodmod bacon = new ItemFoodxlfoodmod("bacon", 3, 1.2F, false);
	public static ItemFoodxlfoodmod beef_jerky = new ItemFoodxlfoodmod("beef_jerky", 3, 0.6F, false);
	public static ItemFoodxlfoodmod ground_beef = new ItemFoodxlfoodmod("ground_beef", 4, 1.2F, false);
	public static ItemFoodxlfoodmod raw_chicken_wing = new ItemFoodxlfoodmod("raw_chicken_wing", 1, 0.6F, false);
	public static ItemFoodxlfoodmod cooked_chicken_wing = new ItemFoodxlfoodmod("cooked_chicken_wing", 4, 1.2F, false);
	public static ItemFoodxlfoodmod spicy_chicken_wing = new ItemFoodxlfoodmod("spicy_chicken_wing", 4, 1.4F, false);
	public static BucketOfFriedChicken bucket_of_fried_chicken = new BucketOfFriedChicken("bucket_of_fried_chicken", 6, 0.6F, false);
    //fast food
	public static ItemFoodxlfoodmod top_bun = new ItemFoodxlfoodmod("top_bun", 4, 0.6F, false);
	public static ItemFoodxlfoodmod bottom_bun = new ItemFoodxlfoodmod("bottom_bun", 4, 0.6F, false);
	public static ItemFoodxlfoodmod hamburger = new ItemFoodxlfoodmod("hamburger", 9, 0.6F, false);
	public static ItemFoodxlfoodmod chickenburger = new ItemFoodxlfoodmod("chickenburger", 9, 0.6F, false);
	public static ItemFoodxlfoodmod cheeseburger = new ItemFoodxlfoodmod("cheeseburger", 10, 0.6F, false);
	public static ItemFoodxlfoodmod hot_dog = new ItemFoodxlfoodmod("hot_dog", 8, 0.6F, false);
	public static ItemFoodxlfoodmod sausage_roll = new ItemFoodxlfoodmod("sausage_roll", 7, 0.6F, false);
	public static ItemFoodxlfoodmod slice_of_pizza = new ItemFoodxlfoodmod("slice_of_pizza", 7, 0.6F, false);
	public static ItemFoodxlfoodmod tortilla = new ItemFoodxlfoodmod("tortilla", 4, 0.6F, false);
	public static ItemFoodxlfoodmod taco = new ItemFoodxlfoodmod("taco", 7, 0.6F, false);
	public static ItemFoodxlfoodmod burrito = new ItemFoodxlfoodmod("burrito", 7, 0.6F, false);
	public static ItemFoodxlfoodmod kebab = new ItemFoodxlfoodmod("kebab", 12, 0.4F, false);
	//sandwiches
	public static ItemFoodxlfoodmod chicken_sandwich = new ItemFoodxlfoodmod("chicken_sandwich", 10, 0.6F, false);
	public static ItemFoodxlfoodmod blt_sandwich = new ItemFoodxlfoodmod("blt_sandwich", 12, 0.4F, false);
	public static ItemFoodxlfoodmod breakfast_sandwich = new ItemFoodxlfoodmod("breakfast_sandwich", 8, 0.6F, false);
	public static ItemFoodxlfoodmod grilled_cheese_sandwich = new ItemFoodxlfoodmod("grilled_cheese_sandwich", 11, 0.4F, false);
	public static ItemFoodxlfoodmod icecream_sandwich = new ItemFoodxlfoodmod("icecream_sandwich", 6, 0.6F, false);
    //salad
	public static Itemxlfoodmod bowl = new Itemxlfoodmod("bowl");
	public static Bowl garden_salad = new Bowl("garden_salad", 5, 0.6F, false);
	public static Bowl chicken_salad = new Bowl("chicken_salad", 8, 0.6F, false);
	public static Bowl caesar_salad = new Bowl("caesar_salad", 6, 0.6F, false);
	public static Bowl onion_salad = new Bowl("onion_salad", 4, 0.6F, false);
	public static Bowl taco_salad = new Bowl("taco_salad", 10, 0.6F, false);
	//soups and stews
	public static Bowl cucumber_soup = new Bowl("cucumber_soup", 6, 0.6F, false);
	public static Bowl tomato_soup = new Bowl("tomato_soup", 3, 0.6F, false);
	public static Bowl vegetable_soup = new Bowl("vegetable_soup", 8, 0.6F, false);
	public static Bowl chicken_soup = new Bowl("chicken_soup", 10, 0.6F, false);
	public static Bowl beef_stew = new Bowl("beef_stew", 12, 0.6F, false);
	public static ItemFoodxlfoodmod pumpkin_stew = new ItemFoodxlfoodmod("pumpkin_stew", 6, 0.6F, false);
    //candy etc.
	public static ItemFoodxlfoodmod caramel_apple = new ItemFoodxlfoodmod("caramel_apple", 6, 0.6F, false);
	public static ItemFoodxlfoodmod marshmallow = new ItemFoodxlfoodmod("marshmallow", 1, 0.6F, false);
	public static ItemFoodxlfoodmod roasted_marshmallow = new ItemFoodxlfoodmod("roasted_marshmallow", 2, 0.6F, false);
	public static ItemFoodxlfoodmod oreo_cookie = new ItemFoodxlfoodmod("oreo_cookie", 3, 0.6F, false);
	public static ItemFoodxlfoodmod twinkie = new ItemFoodxlfoodmod("twinkie", 4, 0.6F, false);
	public static ItemFoodxlfoodmod brownie = new ItemFoodxlfoodmod("brownie", 3, 0.6F, false);
	public static ItemFoodxlfoodmod bourbon_biscuit = new ItemFoodxlfoodmod("bourbon_biscuit", 3, 0.6F, false);
	public static ItemFoodxlfoodmod chocolate = new ItemFoodxlfoodmod("chocolate", 1, 0.6F, false);
	public static Itemxlfoodmod chocolate_icecream_ball = new Itemxlfoodmod("chocolate_icecream_ball");
	public static Itemxlfoodmod vanilla_icecream_ball = new Itemxlfoodmod("vanilla_icecream_ball");
	public static Itemxlfoodmod strawberry_icecream_ball = new Itemxlfoodmod("strawberry_icecream_ball");
	public static ItemFoodxlfoodmod icecream_cone = new ItemFoodxlfoodmod("icecream_cone", 3, 1.2F, false);
	public static ItemFoodxlfoodmod chocolate_icecream = new ItemFoodxlfoodmod("chocolate_icecream", 4, 0.6F, false);
	public static ItemFoodxlfoodmod vanilla_icecream = new ItemFoodxlfoodmod("vanilla_icecream", 4, 0.6F, false);
	public static ItemFoodxlfoodmod strawberry_icecream = new ItemFoodxlfoodmod("strawberry_icecream", 4, 0.6F, false);
	public static ItemFoodxlfoodmod crescent_roll = new ItemFoodxlfoodmod("crescent_roll", 6, 0.6F, false);
	public static ItemFoodxlfoodmod donut = new ItemFoodxlfoodmod("donut", 4, 0.6F, false);
	public static ItemFoodxlfoodmod sugar_donut = new ItemFoodxlfoodmod("sugar_donut", 5, 0.6F, false);
	public static ItemFoodxlfoodmod chocolate_donut = new ItemFoodxlfoodmod("chocolate_donut", 5, 0.6F, false);
	public static ItemFoodxlfoodmod vanilla_donut = new ItemFoodxlfoodmod("vanilla_donut", 5, 0.6F, false);
	//cupcakes
	public static Itemxlfoodmod paper_cup = new Itemxlfoodmod("paper_cup");
	public static ItemFoodxlfoodmod vanilla_cupcake = new ItemFoodxlfoodmod("vanilla_cupcake", 2, 0.6F, false);
	public static ItemFoodxlfoodmod chocolate_cupcake = new ItemFoodxlfoodmod("chocolate_cupcake", 3, 0.6F, false);
	public static ItemFoodxlfoodmod oreo_cupcake = new ItemFoodxlfoodmod("oreo_cupcake", 5, 0.6F, false);
	public static ItemFoodxlfoodmod strawberry_cupcake = new ItemFoodxlfoodmod("strawberry_cupcake", 3, 0.6F, false);
    //pies
	public static Itemxlfoodmod pie_shell = new Itemxlfoodmod("pie_shell");
	public static ItemFoodxlfoodmod apple_pie = new ItemFoodxlfoodmod("apple_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod golden_apple_pie = new ItemFoodxlfoodmod("golden_apple_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod cheese_pie = new ItemFoodxlfoodmod("cheese_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod chicken_pot_pie = new ItemFoodxlfoodmod("chicken_pot_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod chocolate_pie = new ItemFoodxlfoodmod("chocolate_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod bacon_pie = new ItemFoodxlfoodmod("bacon_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod fish_pie = new ItemFoodxlfoodmod("fish_pie", 8, 0.6F, false);
	public static ItemFoodxlfoodmod strawberry_pie = new ItemFoodxlfoodmod("strawberry_pie", 8, 0.6F, false);
    //syrup, cream etc.
	public static Itemxlfoodmod tomato_sauce = new Itemxlfoodmod("tomato_sauce");
	public static Itemxlfoodmod hot_sauce = new Itemxlfoodmod("hot_sauce");
	public static Itemxlfoodmod chocolate_syrup = new Itemxlfoodmod("chocolate_syrup");
	public static Itemxlfoodmod vanilla_extract = new Itemxlfoodmod("vanilla_extract");
	public static Itemxlfoodmod vanilla_cream = new Itemxlfoodmod("vanilla_cream");
	//drinks
	public static Itemxlfoodmod empty_can = new Itemxlfoodmod("empty_can");
	public static SpeedyEnergyDrink speedy_energy_drink = new SpeedyEnergyDrink("speedy_energy_drink", 0, 0.0F, false);
	public static HealthyEnergyDrink healthy_energy_drink = new HealthyEnergyDrink("healthy_energy_drink", 0, 0.0F, false);
	public static StealthyEnergyDrink stealthy_energy_drink = new StealthyEnergyDrink("stealthy_energy_drink", 0, 0.0F, false);
	public static StrongEnergyDrink strong_energy_drink = new StrongEnergyDrink("strong_energy_drink", 0, 0.0F, false);
	public static DeadlyEnergyDrink deadly_energy_drink = new DeadlyEnergyDrink("deadly_energy_drink", 0, 0.0F, false);
	public static SuperEnergyDrink super_energy_drink = new SuperEnergyDrink("super_energy_drink", 0, 0.0F, false);
	public static Itemxlfoodmod glass_mug = new Itemxlfoodmod("glass_mug");
	public static Beer beer = new Beer("beer", 1, 0.2F, false);
	public static Itemxlfoodmod coffee_cup = new Itemxlfoodmod("coffee_cup");
	public static Coffee coffee = new Coffee("coffee", 1, 0.2F, false);
	public static Cappuccino cappuccino = new Cappuccino("cappuccino", 2, 0.2F, false);
	
	
	public static void register(IForgeRegistry<Item> registry) {
		
		//crops
		registry.registerAll(rice_seeds);
		OreDictionary.registerOre("seedRice", rice_seeds);
		registry.registerAll(rice);
		OreDictionary.registerOre("cropRice", rice);
		registry.registerAll(butter_rice);
		OreDictionary.registerOre("foodButterrice", butter_rice);
		registry.registerAll(fried_rice);
		OreDictionary.registerOre("foodFriedrice", fried_rice);
		registry.registerAll(pepper_seeds);
		registry.registerAll(pepper);
		registry.registerAll(corn_seeds);
		OreDictionary.registerOre("seedCorn", corn_seeds);
		registry.registerAll(raw_corn);
		registry.registerAll(corn);
		OreDictionary.registerOre("cropCorn", corn);
		registry.registerAll(cucumber_seeds);
		OreDictionary.registerOre("seedCucumber", cucumber_seeds);
		registry.registerAll(cucumber);
		OreDictionary.registerOre("cropCucumber", cucumber);
		registry.registerAll(lettuce_seeds);
		OreDictionary.registerOre("seedLettuce", lettuce_seeds);
		registry.registerAll(lettuce);
		OreDictionary.registerOre("cropLettuce", lettuce);
		registry.registerAll(onion);
		OreDictionary.registerOre("seedOnion", onion);
		OreDictionary.registerOre("cropOnion", onion);
		registry.registerAll(tomato_seeds);
		OreDictionary.registerOre("seedTomato", tomato_seeds);
		registry.registerAll(tomato);
		OreDictionary.registerOre("cropTomato", tomato);
		registry.registerAll(strawberry_seeds);
		OreDictionary.registerOre("seedStrawberry", strawberry_seeds);
		registry.registerAll(strawberry);
		OreDictionary.registerOre("cropStrawberry", strawberry);
		//other foods
		registry.registerAll(salt);
		OreDictionary.registerOre("itemSalt", salt);
		OreDictionary.registerOre("dustSalt", salt);
		registry.registerAll(dough);
		registry.registerAll(cooked_dough);
		OreDictionary.registerOre("foodDough", cooked_dough);
		registry.registerAll(crouton);
		registry.registerAll(butter);
		OreDictionary.registerOre("foodButter", butter);
		registry.registerAll(cheese);
		OreDictionary.registerOre("foodCheese", cheese);
		registry.registerAll(cheese_puff);
		registry.registerAll(chips);
		registry.registerAll(salty_chips);
		registry.registerAll(spicy_chips);
		registry.registerAll(onion_rings);
		registry.registerAll(cheesy_bread);
		registry.registerAll(potato_bread);
		registry.registerAll(corn_bread);
		registry.registerAll(baguette);
		registry.registerAll(fried_egg);
		OreDictionary.registerOre("foodFriedegg", fried_egg);
		registry.registerAll(pancake);
		OreDictionary.registerOre("foodPancakes", pancake);
		registry.registerAll(waffle);
		OreDictionary.registerOre("foodWaffles", waffle);
		registry.registerAll(macaroni_and_cheese);
		//traditional food
		registry.registerAll(spaghetti);
		registry.registerAll(enchilada);
		registry.registerAll(lasagne);
		registry.registerAll(jambon_beurre);
		//meat
		registry.registerAll(flesh);
		registry.registerAll(sausage);
		registry.registerAll(bacon);
		registry.registerAll(beef_jerky);
		OreDictionary.registerOre("foodBeefjerky", beef_jerky);
		registry.registerAll(ground_beef);
		OreDictionary.registerOre("foodGroundbeef", ground_beef);
		registry.registerAll(raw_chicken_wing);
		registry.registerAll(cooked_chicken_wing);
		registry.registerAll(spicy_chicken_wing);
		registry.registerAll(bucket_of_fried_chicken);
		//fast food
		registry.registerAll(top_bun);
		registry.registerAll(bottom_bun);
		registry.registerAll(hamburger);
		registry.registerAll(chickenburger);
		registry.registerAll(cheeseburger);
		registry.registerAll(hot_dog);
		registry.registerAll(sausage_roll);
		registry.registerAll(slice_of_pizza);
		registry.registerAll(tortilla);
		OreDictionary.registerOre("foodTortilla", tortilla);
		registry.registerAll(taco);
		registry.registerAll(burrito);
		registry.registerAll(kebab);
		//sandwiches
		registry.registerAll(chicken_sandwich);
		registry.registerAll(blt_sandwich);
		registry.registerAll(breakfast_sandwich);
		registry.registerAll(grilled_cheese_sandwich);
        registry.registerAll(icecream_sandwich);
		//salad
		registry.registerAll(bowl);
		registry.registerAll(garden_salad);
		registry.registerAll(chicken_salad);
		registry.registerAll(caesar_salad);
		registry.registerAll(onion_salad);
		registry.registerAll(taco_salad);
		//soups and stews
		registry.registerAll(cucumber_soup);
		registry.registerAll(tomato_soup);
		registry.registerAll(vegetable_soup);
		registry.registerAll(chicken_soup);
		registry.registerAll(beef_stew);
		registry.registerAll(pumpkin_stew);
		//candy etc.
		registry.registerAll(caramel_apple);
		registry.registerAll(marshmallow);
		registry.registerAll(roasted_marshmallow);
		registry.registerAll(oreo_cookie);
		registry.registerAll(twinkie);
		registry.registerAll(brownie);
		registry.registerAll(bourbon_biscuit);
		registry.registerAll(chocolate);
		OreDictionary.registerOre("foodChocolatebar", chocolate);
		registry.registerAll(chocolate_icecream_ball);
		registry.registerAll(vanilla_icecream_ball);
		registry.registerAll(strawberry_icecream_ball);
		registry.registerAll(icecream_cone);
		registry.registerAll(chocolate_icecream);
		registry.registerAll(vanilla_icecream);
		registry.registerAll(strawberry_icecream);
		registry.registerAll(crescent_roll);
		registry.registerAll(donut);
		registry.registerAll(sugar_donut);
		registry.registerAll(chocolate_donut);
		registry.registerAll(vanilla_donut);
		//cupcakes
		registry.registerAll(paper_cup);
		registry.registerAll(vanilla_cupcake);
		registry.registerAll(chocolate_cupcake);
		registry.registerAll(oreo_cupcake);
		registry.registerAll(strawberry_cupcake);
		//pies
		registry.registerAll(pie_shell);
		registry.registerAll(apple_pie);
		registry.registerAll(golden_apple_pie);
		registry.registerAll(cheese_pie);
		registry.registerAll(chicken_pot_pie);
		registry.registerAll(chocolate_pie);
		registry.registerAll(bacon_pie);
		registry.registerAll(fish_pie);
		registry.registerAll(strawberry_pie);
		//syrup, cream etc.
		registry.registerAll(tomato_sauce);
		registry.registerAll(hot_sauce);
		registry.registerAll(chocolate_syrup);
		registry.registerAll(vanilla_extract);
		registry.registerAll(vanilla_cream);
		//drinks
		registry.registerAll(empty_can);
		registry.registerAll(speedy_energy_drink);
		registry.registerAll(healthy_energy_drink);
		registry.registerAll(stealthy_energy_drink);
		registry.registerAll(strong_energy_drink);
		registry.registerAll(deadly_energy_drink);
		registry.registerAll(super_energy_drink);
		registry.registerAll(glass_mug);
		registry.registerAll(beer);
		registry.registerAll(coffee_cup);
		registry.registerAll(coffee);
		registry.registerAll(cappuccino);
		
	}
	
	public static void registerModels() {
		
		//crops
		rice_seeds.registerItemModel();
		rice.registerItemModel();
		butter_rice.registerItemModel();
		fried_rice.registerItemModel();
		pepper_seeds.registerItemModel();
		pepper.registerItemModel();
		corn_seeds.registerItemModel();
		raw_corn.registerItemModel();
		corn.registerItemModel();
		cucumber_seeds.registerItemModel();
		cucumber.registerItemModel();
		lettuce_seeds.registerItemModel();
		lettuce.registerItemModel();
		onion.registerItemModel();
		tomato_seeds.registerItemModel();
		tomato.registerItemModel();
		strawberry_seeds.registerItemModel();
		strawberry.registerItemModel();
		//other foods
		salt.registerItemModel();
		dough.registerItemModel();
		cooked_dough.registerItemModel();
		crouton.registerItemModel();
		butter.registerItemModel();
		cheese.registerItemModel();
		cheese_puff.registerItemModel();
		chips.registerItemModel();
		salty_chips.registerItemModel();
		spicy_chips.registerItemModel();
		onion_rings.registerItemModel();
		cheesy_bread.registerItemModel();
		potato_bread.registerItemModel();
		corn_bread.registerItemModel();
		baguette.registerItemModel();
		fried_egg.registerItemModel();
		pancake.registerItemModel();
		waffle.registerItemModel();
		macaroni_and_cheese.registerItemModel();
		//traditional food
		spaghetti.registerItemModel();
		enchilada.registerItemModel();
		lasagne.registerItemModel();
		jambon_beurre.registerItemModel();
		//meat
		flesh.registerItemModel();
		sausage.registerItemModel();
		bacon.registerItemModel();
		beef_jerky.registerItemModel();
		ground_beef.registerItemModel();
		raw_chicken_wing.registerItemModel();
		cooked_chicken_wing.registerItemModel();
		spicy_chicken_wing.registerItemModel();
		bucket_of_fried_chicken.registerItemModel();
		//fast food
		top_bun.registerItemModel();
		bottom_bun.registerItemModel();
		hamburger.registerItemModel();
		chickenburger.registerItemModel();
		cheeseburger.registerItemModel();
		hot_dog.registerItemModel();
		sausage_roll.registerItemModel();
		slice_of_pizza.registerItemModel();
		tortilla.registerItemModel();
		taco.registerItemModel();
		burrito.registerItemModel();
		kebab.registerItemModel();
		//sandwiches
		chicken_sandwich.registerItemModel();
		blt_sandwich.registerItemModel();
		breakfast_sandwich.registerItemModel();
		grilled_cheese_sandwich.registerItemModel();
		icecream_sandwich.registerItemModel();
		//salad
		bowl.registerItemModel();
		garden_salad.registerItemModel();
		chicken_salad.registerItemModel();
		caesar_salad.registerItemModel();
		onion_salad.registerItemModel();
		taco_salad.registerItemModel();
		//soups and stews
		cucumber_soup.registerItemModel();
		tomato_soup.registerItemModel();
		vegetable_soup.registerItemModel();
		chicken_soup.registerItemModel();
		beef_stew.registerItemModel();
		pumpkin_stew.registerItemModel();
		//candy etc.
		caramel_apple.registerItemModel();
		marshmallow.registerItemModel();
		roasted_marshmallow.registerItemModel();
		oreo_cookie.registerItemModel();
		twinkie.registerItemModel();
		brownie.registerItemModel();
		bourbon_biscuit.registerItemModel();
		chocolate.registerItemModel();
		chocolate_icecream_ball.registerItemModel();
		vanilla_icecream_ball.registerItemModel();
		strawberry_icecream_ball.registerItemModel();
		icecream_cone.registerItemModel();
		chocolate_icecream.registerItemModel();
		vanilla_icecream.registerItemModel();
		strawberry_icecream.registerItemModel();
		crescent_roll.registerItemModel();
		donut.registerItemModel();
		sugar_donut.registerItemModel();
		chocolate_donut.registerItemModel();
		vanilla_donut.registerItemModel();
		//cupcake
		paper_cup.registerItemModel();
		vanilla_cupcake.registerItemModel();
		chocolate_cupcake.registerItemModel();
		oreo_cupcake.registerItemModel();
		strawberry_cupcake.registerItemModel();
		//pies
		pie_shell.registerItemModel();
		apple_pie.registerItemModel();
		golden_apple_pie.registerItemModel();
		cheese_pie.registerItemModel();
		chicken_pot_pie.registerItemModel();
		chocolate_pie.registerItemModel();
		bacon_pie.registerItemModel();
		fish_pie.registerItemModel();
		strawberry_pie.registerItemModel();
		//syrup, cream etc.
		tomato_sauce.registerItemModel();
		hot_sauce.registerItemModel();
		chocolate_syrup.registerItemModel();
		vanilla_extract.registerItemModel();
		vanilla_cream.registerItemModel();
		//drinks
		empty_can.registerItemModel();
		speedy_energy_drink.registerItemModel();
		healthy_energy_drink.registerItemModel();
		stealthy_energy_drink.registerItemModel();
		strong_energy_drink.registerItemModel();
		deadly_energy_drink.registerItemModel();
		super_energy_drink.registerItemModel();
		glass_mug.registerItemModel();
		beer.registerItemModel();
		coffee_cup.registerItemModel();
		coffee.registerItemModel();
		cappuccino.registerItemModel();
		
	}
	

}
