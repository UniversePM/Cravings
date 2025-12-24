package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DoubleCropNeighborChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND)
				&& (blockstate.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep3 ? blockstate.getValue(_getep3).toString() : "").equals("lower")) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (!(((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep6 ? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getep6).toString() : "")
				.equals("upper")) && (blockstate.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep8 ? blockstate.getValue(_getep8).toString() : "").equals("lower")) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (!(((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep11
				? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getep11).toString()
				: "").equals("lower")) && (blockstate.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep13 ? blockstate.getValue(_getep13).toString() : "").equals("upper")) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}