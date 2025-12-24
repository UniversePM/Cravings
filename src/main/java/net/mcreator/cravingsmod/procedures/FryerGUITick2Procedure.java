package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FryerGUITick2Procedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		double returnthingy = 0;
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") > 0 && !(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") >= 16)) {
			returnthingy = 1;
		} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") >= 16 && !(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") >= 32)) {
			returnthingy = 2;
		} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") >= 32 && !(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") >= 48)) {
			returnthingy = 3;
		} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "oiluses") >= 48) {
			returnthingy = 4;
		}
		return returnthingy;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}