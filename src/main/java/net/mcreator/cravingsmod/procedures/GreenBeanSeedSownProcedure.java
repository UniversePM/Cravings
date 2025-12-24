package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.cravingsmod.init.CravingsModModBlocks;

public class GreenBeanSeedSownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CravingsModModBlocks.GREEN_BEAN_CROP.get())
				&& !((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == CravingsModModBlocks.GREEN_BEAN_CROP.get())) {
			world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with((blockStateWithEnum(CravingsModModBlocks.GREEN_BEAN_CROP.get().defaultBlockState(), "half", "lower")), "blockstate", 0)), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with((blockStateWithEnum(CravingsModModBlocks.GREEN_BEAN_CROP.get().defaultBlockState(), "half", "upper")), "blockstate", 8)), 3);
			itemstack.setCount(itemstack.getCount() - 1);
		}
	}

	private static BlockState blockStateWithEnum(BlockState blockState, String property, String newValue) {
		Property<?> prop = blockState.getBlock().getStateDefinition().getProperty(property);
		return prop instanceof EnumProperty ep && ep.getValue(newValue).isPresent() ? blockState.setValue(ep, (Enum) ep.getValue(newValue).get()) : blockState;
	}
}