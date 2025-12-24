/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.cravingsmod.block.entity.*;
import net.mcreator.cravingsmod.CravingsModMod;

@EventBusSubscriber
public class CravingsModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CravingsModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FryerBlockEntity>> FRYER = register("fryer", CravingsModModBlocks.FRYER, FryerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrapeCropBlockEntity>> GRAPE_CROP = register("grape_crop", CravingsModModBlocks.GRAPE_CROP, GrapeCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LettuceCropBlockEntity>> LETTUCE_CROP = register("lettuce_crop", CravingsModModBlocks.LETTUCE_CROP, LettuceCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TomatoCropBlockEntity>> TOMATO_CROP = register("tomato_crop", CravingsModModBlocks.TOMATO_CROP, TomatoCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PitayaCropBlockEntity>> PITAYA_CROP = register("pitaya_crop", CravingsModModBlocks.PITAYA_CROP, PitayaCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RadishCropBlockEntity>> RADISH_CROP = register("radish_crop", CravingsModModBlocks.RADISH_CROP, RadishCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<JalapenoCropBlockEntity>> JALAPENO_CROP = register("jalapeno_crop", CravingsModModBlocks.JALAPENO_CROP, JalapenoCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GreenPepperCropBlockEntity>> GREEN_PEPPER_CROP = register("green_pepper_crop", CravingsModModBlocks.GREEN_PEPPER_CROP, GreenPepperCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GreenBeanCropBlockEntity>> GREEN_BEAN_CROP = register("green_bean_crop", CravingsModModBlocks.GREEN_BEAN_CROP, GreenBeanCropBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FRYER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAPE_CROP.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LETTUCE_CROP.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RADISH_CROP.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, JALAPENO_CROP.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GREEN_PEPPER_CROP.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GREEN_BEAN_CROP.get(), SidedInvWrapper::new);
	}
}