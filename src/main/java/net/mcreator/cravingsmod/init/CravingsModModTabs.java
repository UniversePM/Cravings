/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cravingsmod.CravingsModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CravingsModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CravingsModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRAVINGS = REGISTRY.register("cravings",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cravings_mod.cravings")).icon(() -> new ItemStack(CravingsModModItems.CHEESE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CravingsModModItems.BUCKET_OF_CURDY_MILK.get());
				tabData.accept(CravingsModModItems.BUCKET_OF_WHEY.get());
				tabData.accept(CravingsModModItems.CHEESE_CURDS.get());
				tabData.accept(CravingsModModBlocks.CHEESE_WHEEL.get().asItem());
				tabData.accept(CravingsModModItems.CHEESE.get());
				tabData.accept(CravingsModModItems.FLOUR.get());
				tabData.accept(CravingsModModItems.RICOTTA.get());
				tabData.accept(CravingsModModItems.CHEESE_SLICE.get());
				tabData.accept(CravingsModModItems.FABRIC.get());
				tabData.accept(CravingsModModItems.FLOUR_SACK.get());
				tabData.accept(CravingsModModItems.DIPPED_CURDS.get());
				tabData.accept(CravingsModModItems.FRIED_CURDS.get());
				tabData.accept(CravingsModModItems.OLIVE.get());
				tabData.accept(CravingsModModItems.BUCKET_OF_OLIVE_OIL.get());
				tabData.accept(CravingsModModBlocks.FRYER.get().asItem());
				tabData.accept(CravingsModModBlocks.OLIVE_LEAVES.get().asItem());
				tabData.accept(CravingsModModBlocks.OLIVE_SAPLING.get().asItem());
				tabData.accept(CravingsModModItems.TOOL_HANDLE.get());
				tabData.accept(CravingsModModItems.KNIFE.get());
				tabData.accept(CravingsModModItems.DOUGH.get());
				tabData.accept(CravingsModModItems.LEMON.get());
				tabData.accept(CravingsModModBlocks.LEMON_LEAVES.get().asItem());
				tabData.accept(CravingsModModBlocks.LEMON_SAPLING.get().asItem());
				tabData.accept(CravingsModModItems.GRAPES.get());
				tabData.accept(CravingsModModItems.WORT_BOTTLE.get());
				tabData.accept(CravingsModModItems.BEER_BOTTLE.get());
				tabData.accept(CravingsModModItems.GRAPE_SEEDS.get());
				tabData.accept(CravingsModModItems.YEAST.get());
				tabData.accept(CravingsModModItems.GRAPE_JUICE.get());
				tabData.accept(CravingsModModItems.WINE_BOTTLE.get());
				tabData.accept(CravingsModModItems.MUST.get());
				tabData.accept(CravingsModModItems.MEAD_BOTTLE.get());
				tabData.accept(CravingsModModItems.POTATO_MASH.get());
				tabData.accept(CravingsModModItems.FERMENTED_POTATO_MASH.get());
				tabData.accept(CravingsModModItems.VODKA.get());
				tabData.accept(CravingsModModItems.CHEESE_SANDWICH.get());
				tabData.accept(CravingsModModItems.GRILLED_CHEESE.get());
				tabData.accept(CravingsModModItems.BREAD_SLICE.get());
				tabData.accept(CravingsModModItems.TOAST.get());
				tabData.accept(CravingsModModItems.LETTUCE.get());
				tabData.accept(CravingsModModItems.LETTUCE_SEEDS.get());
				tabData.accept(CravingsModModItems.RAW_BACON.get());
				tabData.accept(CravingsModModItems.BACON.get());
				tabData.accept(CravingsModModItems.BLT.get());
				tabData.accept(CravingsModModItems.TOMATO.get());
				tabData.accept(CravingsModModItems.BURGER_BUNS.get());
				tabData.accept(CravingsModModItems.CUT_BUNS.get());
				tabData.accept(CravingsModModItems.HAMBURGER.get());
				tabData.accept(CravingsModModItems.CHEESEBURGER.get());
				tabData.accept(CravingsModModItems.BACON_CHEESEBURGER.get());
				tabData.accept(CravingsModModItems.HEAVY_CREAM.get());
				tabData.accept(CravingsModModItems.ICE_CREAM.get());
				tabData.accept(CravingsModModItems.PITAYA.get());
				tabData.accept(CravingsModModItems.RADISH.get());
				tabData.accept(CravingsModModItems.RADISH_SEEDS.get());
				tabData.accept(CravingsModModItems.GREEN_BEANS.get());
				tabData.accept(CravingsModModItems.SALT.get());
				tabData.accept(CravingsModModItems.BUTTER.get());
				tabData.accept(CravingsModModItems.SUNFLOWER_SEEDS.get());
				tabData.accept(CravingsModModItems.TOASTED_SUNFLOWER_SEEDS.get());
				tabData.accept(CravingsModModItems.PRICKLY_PEAR.get());
				tabData.accept(CravingsModModItems.JALAPENO.get());
				tabData.accept(CravingsModModItems.JALAPENO_SEEDS.get());
				tabData.accept(CravingsModModItems.GREEN_PEPPER.get());
				tabData.accept(CravingsModModItems.GREEN_PEPPER_SEEDS.get());
				tabData.accept(CravingsModModItems.DEER_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CravingsModModItems.BUCKET_OF_CURDY_MILK.get());
			tabData.accept(CravingsModModItems.BUCKET_OF_WHEY.get());
			tabData.accept(CravingsModModItems.FLOUR.get());
			tabData.accept(CravingsModModItems.FABRIC.get());
			tabData.accept(CravingsModModItems.BUCKET_OF_OLIVE_OIL.get());
			tabData.accept(CravingsModModItems.TOOL_HANDLE.get());
			tabData.accept(CravingsModModItems.DOUGH.get());
			tabData.accept(CravingsModModItems.GRAPES.get());
			tabData.accept(CravingsModModItems.WORT_BOTTLE.get());
			tabData.accept(CravingsModModItems.YEAST.get());
			tabData.accept(CravingsModModItems.MUST.get());
			tabData.accept(CravingsModModItems.POTATO_MASH.get());
			tabData.accept(CravingsModModItems.FERMENTED_POTATO_MASH.get());
			tabData.accept(CravingsModModItems.LETTUCE.get());
			tabData.accept(CravingsModModItems.BACON.get());
			tabData.accept(CravingsModModItems.TOMATO.get());
			tabData.accept(CravingsModModItems.BURGER_BUNS.get());
			tabData.accept(CravingsModModItems.CUT_BUNS.get());
			tabData.accept(CravingsModModItems.HEAVY_CREAM.get());
			tabData.accept(CravingsModModItems.SALT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CravingsModModItems.CHEESE_CURDS.get());
			tabData.accept(CravingsModModBlocks.CHEESE_WHEEL.get().asItem());
			tabData.accept(CravingsModModItems.CHEESE.get());
			tabData.accept(CravingsModModItems.RICOTTA.get());
			tabData.accept(CravingsModModItems.CHEESE_SLICE.get());
			tabData.accept(CravingsModModItems.DIPPED_CURDS.get());
			tabData.accept(CravingsModModItems.FRIED_CURDS.get());
			tabData.accept(CravingsModModItems.OLIVE.get());
			tabData.accept(CravingsModModItems.LEMON.get());
			tabData.accept(CravingsModModItems.GRAPES.get());
			tabData.accept(CravingsModModItems.BEER_BOTTLE.get());
			tabData.accept(CravingsModModItems.GRAPE_JUICE.get());
			tabData.accept(CravingsModModItems.WINE_BOTTLE.get());
			tabData.accept(CravingsModModItems.MEAD_BOTTLE.get());
			tabData.accept(CravingsModModItems.VODKA.get());
			tabData.accept(CravingsModModItems.CHEESE_SANDWICH.get());
			tabData.accept(CravingsModModItems.GRILLED_CHEESE.get());
			tabData.accept(CravingsModModItems.BREAD_SLICE.get());
			tabData.accept(CravingsModModItems.TOAST.get());
			tabData.accept(CravingsModModItems.LETTUCE.get());
			tabData.accept(CravingsModModItems.RAW_BACON.get());
			tabData.accept(CravingsModModItems.BACON.get());
			tabData.accept(CravingsModModItems.BLT.get());
			tabData.accept(CravingsModModItems.TOMATO.get());
			tabData.accept(CravingsModModItems.BURGER_BUNS.get());
			tabData.accept(CravingsModModItems.CUT_BUNS.get());
			tabData.accept(CravingsModModItems.HAMBURGER.get());
			tabData.accept(CravingsModModItems.CHEESEBURGER.get());
			tabData.accept(CravingsModModItems.BACON_CHEESEBURGER.get());
			tabData.accept(CravingsModModItems.ICE_CREAM.get());
			tabData.accept(CravingsModModItems.PITAYA.get());
			tabData.accept(CravingsModModItems.RADISH.get());
			tabData.accept(CravingsModModItems.GREEN_BEANS.get());
			tabData.accept(CravingsModModItems.BUTTER.get());
			tabData.accept(CravingsModModItems.SUNFLOWER_SEEDS.get());
			tabData.accept(CravingsModModItems.TOASTED_SUNFLOWER_SEEDS.get());
			tabData.accept(CravingsModModItems.PRICKLY_PEAR.get());
			tabData.accept(CravingsModModItems.JALAPENO.get());
			tabData.accept(CravingsModModItems.GREEN_PEPPER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CravingsModModItems.FLOUR_SACK.get());
			tabData.accept(CravingsModModItems.BUCKET_OF_OLIVE_OIL.get());
			tabData.accept(CravingsModModBlocks.FRYER.get().asItem());
			tabData.accept(CravingsModModItems.TOOL_HANDLE.get());
			tabData.accept(CravingsModModItems.KNIFE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(CravingsModModBlocks.FRYER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CravingsModModBlocks.OLIVE_LEAVES.get().asItem());
			tabData.accept(CravingsModModBlocks.OLIVE_SAPLING.get().asItem());
			tabData.accept(CravingsModModBlocks.LEMON_LEAVES.get().asItem());
			tabData.accept(CravingsModModBlocks.LEMON_SAPLING.get().asItem());
			tabData.accept(CravingsModModItems.RADISH_SEEDS.get());
			tabData.accept(CravingsModModItems.JALAPENO_SEEDS.get());
			tabData.accept(CravingsModModItems.GREEN_PEPPER_SEEDS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CravingsModModItems.BISON_SPAWN_EGG.get());
			tabData.accept(CravingsModModItems.DEER_SPAWN_EGG.get());
		}
	}
}