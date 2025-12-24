/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cravingsmod.item.inventory.FlourSackInventoryCapability;
import net.mcreator.cravingsmod.item.*;
import net.mcreator.cravingsmod.CravingsModMod;

import java.util.function.Function;

@EventBusSubscriber
public class CravingsModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CravingsModMod.MODID);
	public static final DeferredItem<Item> BUCKET_OF_CURDY_MILK;
	public static final DeferredItem<Item> BUCKET_OF_WHEY;
	public static final DeferredItem<Item> CHEESE_CURDS;
	public static final DeferredItem<Item> CHEESE_WHEEL;
	public static final DeferredItem<Item> CHEESE;
	public static final DeferredItem<Item> FLOUR;
	public static final DeferredItem<Item> RICOTTA;
	public static final DeferredItem<Item> CHEESE_SLICE;
	public static final DeferredItem<Item> FABRIC;
	public static final DeferredItem<Item> FLOUR_SACK;
	public static final DeferredItem<Item> DIPPED_CURDS;
	public static final DeferredItem<Item> FRIED_CURDS;
	public static final DeferredItem<Item> OLIVE;
	public static final DeferredItem<Item> BUCKET_OF_OLIVE_OIL;
	public static final DeferredItem<Item> FRYER;
	public static final DeferredItem<Item> OLIVE_LEAVES;
	public static final DeferredItem<Item> OLIVE_SAPLING;
	public static final DeferredItem<Item> TOOL_HANDLE;
	public static final DeferredItem<Item> KNIFE;
	public static final DeferredItem<Item> DOUGH;
	public static final DeferredItem<Item> LEMON;
	public static final DeferredItem<Item> LEMON_LEAVES;
	public static final DeferredItem<Item> LEMON_SAPLING;
	public static final DeferredItem<Item> GRAPES;
	public static final DeferredItem<Item> WORT_BOTTLE;
	public static final DeferredItem<Item> BEER_BOTTLE;
	public static final DeferredItem<Item> GRAPE_CROP;
	public static final DeferredItem<Item> GRAPE_SEEDS;
	public static final DeferredItem<Item> YEAST;
	public static final DeferredItem<Item> GRAPE_JUICE;
	public static final DeferredItem<Item> WINE_BOTTLE;
	public static final DeferredItem<Item> MUST;
	public static final DeferredItem<Item> MEAD_BOTTLE;
	public static final DeferredItem<Item> POTATO_MASH;
	public static final DeferredItem<Item> FERMENTED_POTATO_MASH;
	public static final DeferredItem<Item> VODKA;
	public static final DeferredItem<Item> CHEESE_SANDWICH;
	public static final DeferredItem<Item> GRILLED_CHEESE;
	public static final DeferredItem<Item> BREAD_SLICE;
	public static final DeferredItem<Item> TOAST;
	public static final DeferredItem<Item> LETTUCE;
	public static final DeferredItem<Item> LETTUCE_CROP;
	public static final DeferredItem<Item> LETTUCE_SEEDS;
	public static final DeferredItem<Item> RAW_BACON;
	public static final DeferredItem<Item> BACON;
	public static final DeferredItem<Item> BLT;
	public static final DeferredItem<Item> TOMATO;
	public static final DeferredItem<Item> TOMATO_CROP;
	public static final DeferredItem<Item> BURGER_BUNS;
	public static final DeferredItem<Item> CUT_BUNS;
	public static final DeferredItem<Item> HAMBURGER;
	public static final DeferredItem<Item> CHEESEBURGER;
	public static final DeferredItem<Item> BACON_CHEESEBURGER;
	public static final DeferredItem<Item> HEAVY_CREAM;
	public static final DeferredItem<Item> ICE_CREAM;
	public static final DeferredItem<Item> PITAYA_CROP;
	public static final DeferredItem<Item> PITAYA;
	public static final DeferredItem<Item> RADISH;
	public static final DeferredItem<Item> RADISH_SEEDS;
	public static final DeferredItem<Item> GREEN_BEANS;
	public static final DeferredItem<Item> SALT;
	public static final DeferredItem<Item> BUTTER;
	public static final DeferredItem<Item> SUNFLOWER_SEEDS;
	public static final DeferredItem<Item> TOASTED_SUNFLOWER_SEEDS;
	public static final DeferredItem<Item> PRICKLY_PEAR;
	public static final DeferredItem<Item> JALAPENO;
	public static final DeferredItem<Item> JALAPENO_SEEDS;
	public static final DeferredItem<Item> GREEN_PEPPER;
	public static final DeferredItem<Item> GREEN_PEPPER_SEEDS;
	public static final DeferredItem<Item> BISON_SPAWN_EGG;
	public static final DeferredItem<Item> DEER_SPAWN_EGG;
	public static final DeferredItem<Item> GREEN_BEAN_SEEDS;
	static {
		BUCKET_OF_CURDY_MILK = register("bucket_of_curdy_milk", BucketOfCurdyMilkItem::new);
		BUCKET_OF_WHEY = register("bucket_of_whey", BucketOfWheyItem::new);
		CHEESE_CURDS = register("cheese_curds", CheeseCurdsItem::new);
		CHEESE_WHEEL = block(CravingsModModBlocks.CHEESE_WHEEL);
		CHEESE = register("cheese", CheeseItem::new);
		FLOUR = register("flour", FlourItem::new);
		RICOTTA = register("ricotta", RicottaItem::new);
		CHEESE_SLICE = register("cheese_slice", CheeseSliceItem::new);
		FABRIC = register("fabric", FabricItem::new);
		FLOUR_SACK = register("flour_sack", FlourSackItem::new);
		DIPPED_CURDS = register("dipped_curds", DippedCurdsItem::new);
		FRIED_CURDS = register("fried_curds", FriedCurdsItem::new);
		OLIVE = register("olive", OliveItem::new);
		BUCKET_OF_OLIVE_OIL = register("bucket_of_olive_oil", BucketOfOliveOilItem::new);
		FRYER = block(CravingsModModBlocks.FRYER);
		OLIVE_LEAVES = block(CravingsModModBlocks.OLIVE_LEAVES);
		OLIVE_SAPLING = block(CravingsModModBlocks.OLIVE_SAPLING);
		TOOL_HANDLE = register("tool_handle", ToolHandleItem::new);
		KNIFE = register("knife", KnifeItem::new);
		DOUGH = register("dough", DoughItem::new);
		LEMON = register("lemon", LemonItem::new);
		LEMON_LEAVES = block(CravingsModModBlocks.LEMON_LEAVES);
		LEMON_SAPLING = block(CravingsModModBlocks.LEMON_SAPLING);
		GRAPES = register("grapes", GrapesItem::new);
		WORT_BOTTLE = register("wort_bottle", WortBottleItem::new);
		BEER_BOTTLE = register("beer_bottle", BeerBottleItem::new);
		GRAPE_CROP = block(CravingsModModBlocks.GRAPE_CROP);
		GRAPE_SEEDS = register("grape_seeds", GrapeSeedsItem::new);
		YEAST = register("yeast", YeastItem::new);
		GRAPE_JUICE = register("grape_juice", GrapeJuiceItem::new);
		WINE_BOTTLE = register("wine_bottle", WineBottleItem::new);
		MUST = register("must", MustItem::new);
		MEAD_BOTTLE = register("mead_bottle", MeadBottleItem::new);
		POTATO_MASH = register("potato_mash", PotatoMashItem::new);
		FERMENTED_POTATO_MASH = register("fermented_potato_mash", FermentedPotatoMashItem::new);
		VODKA = register("vodka", VodkaItem::new);
		CHEESE_SANDWICH = register("cheese_sandwich", CheeseSandwichItem::new);
		GRILLED_CHEESE = register("grilled_cheese", GrilledCheeseItem::new);
		BREAD_SLICE = register("bread_slice", BreadSliceItem::new);
		TOAST = register("toast", ToastItem::new);
		LETTUCE = register("lettuce", LettuceItem::new);
		LETTUCE_CROP = block(CravingsModModBlocks.LETTUCE_CROP);
		LETTUCE_SEEDS = register("lettuce_seeds", LettuceSeedsItem::new);
		RAW_BACON = register("raw_bacon", RawBaconItem::new);
		BACON = register("bacon", BaconItem::new);
		BLT = register("blt", BLTItem::new);
		TOMATO = register("tomato", TomatoItem::new);
		TOMATO_CROP = doubleBlock(CravingsModModBlocks.TOMATO_CROP);
		BURGER_BUNS = register("burger_buns", BurgerBunsItem::new);
		CUT_BUNS = register("cut_buns", CutBunsItem::new);
		HAMBURGER = register("hamburger", HamburgerItem::new);
		CHEESEBURGER = register("cheeseburger", CheeseburgerItem::new);
		BACON_CHEESEBURGER = register("bacon_cheeseburger", BaconCheeseburgerItem::new);
		HEAVY_CREAM = register("heavy_cream", HeavyCreamItem::new);
		ICE_CREAM = register("ice_cream", IceCreamItem::new);
		PITAYA_CROP = doubleBlock(CravingsModModBlocks.PITAYA_CROP);
		PITAYA = register("pitaya", PitayaItem::new);
		RADISH = register("radish", RadishItem::new);
		RADISH_SEEDS = register("radish_seeds", RadishSeedsItem::new);
		GREEN_BEANS = register("green_beans", GreenBeansItem::new);
		SALT = register("salt", SaltItem::new);
		BUTTER = register("butter", ButterItem::new);
		SUNFLOWER_SEEDS = register("sunflower_seeds", SunflowerSeedsItem::new);
		TOASTED_SUNFLOWER_SEEDS = register("toasted_sunflower_seeds", ToastedSunflowerSeedsItem::new);
		PRICKLY_PEAR = register("prickly_pear", PricklyPearItem::new);
		JALAPENO = register("jalapeno", JalapenoItem::new);
		JALAPENO_SEEDS = register("jalapeno_seeds", JalapenoSeedsItem::new);
		GREEN_PEPPER = register("green_pepper", GreenPepperItem::new);
		GREEN_PEPPER_SEEDS = register("green_pepper_seeds", GreenPepperSeedsItem::new);
		BISON_SPAWN_EGG = register("bison_spawn_egg", properties -> new SpawnEggItem(CravingsModModEntities.BISON.get(), properties));
		DEER_SPAWN_EGG = register("deer_spawn_egg", properties -> new SpawnEggItem(CravingsModModEntities.DEER.get(), properties));
		GREEN_BEAN_SEEDS = register("green_bean_seeds", GreenBeanSeedsItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new FlourSackInventoryCapability(stack), FLOUR_SACK.get());
	}
}