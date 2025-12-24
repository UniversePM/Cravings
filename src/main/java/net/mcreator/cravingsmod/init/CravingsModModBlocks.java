/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.cravingsmod.block.*;
import net.mcreator.cravingsmod.CravingsModMod;

import java.util.function.Function;

public class CravingsModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CravingsModMod.MODID);
	public static final DeferredBlock<Block> CHEESE_WHEEL;
	public static final DeferredBlock<Block> FRYER;
	public static final DeferredBlock<Block> OLIVE_LEAVES;
	public static final DeferredBlock<Block> OLIVE_SAPLING;
	public static final DeferredBlock<Block> LEMON_LEAVES;
	public static final DeferredBlock<Block> LEMON_SAPLING;
	public static final DeferredBlock<Block> GRAPE_CROP;
	public static final DeferredBlock<Block> LETTUCE_CROP;
	public static final DeferredBlock<Block> TOMATO_CROP;
	public static final DeferredBlock<Block> PITAYA_CROP;
	public static final DeferredBlock<Block> RADISH_CROP;
	public static final DeferredBlock<Block> PRICKLY_CROP;
	public static final DeferredBlock<Block> JALAPENO_CROP;
	public static final DeferredBlock<Block> GREEN_PEPPER_CROP;
	public static final DeferredBlock<Block> GREEN_BEAN_CROP;
	static {
		CHEESE_WHEEL = register("cheese_wheel", CheeseWheelBlock::new);
		FRYER = register("fryer", FryerBlock::new);
		OLIVE_LEAVES = register("olive_leaves", OliveLeavesBlock::new);
		OLIVE_SAPLING = register("olive_sapling", OliveSaplingBlock::new);
		LEMON_LEAVES = register("lemon_leaves", LemonLeavesBlock::new);
		LEMON_SAPLING = register("lemon_sapling", LemonSaplingBlock::new);
		GRAPE_CROP = register("grape_crop", GrapeCropBlock::new);
		LETTUCE_CROP = register("lettuce_crop", LettuceCropBlock::new);
		TOMATO_CROP = register("tomato_crop", TomatoCropBlock::new);
		PITAYA_CROP = register("pitaya_crop", PitayaCropBlock::new);
		RADISH_CROP = register("radish_crop", RadishCropBlock::new);
		PRICKLY_CROP = register("prickly_crop", PricklyCropBlock::new);
		JALAPENO_CROP = register("jalapeno_crop", JalapenoCropBlock::new);
		GREEN_PEPPER_CROP = register("green_pepper_crop", GreenPepperCropBlock::new);
		GREEN_BEAN_CROP = register("green_bean_crop", GreenBeanCropBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}