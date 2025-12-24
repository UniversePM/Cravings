package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;

public class CropBoneMealConditionProcedure {
	public static boolean execute(BlockState blockstate) {
		boolean var = false;
		if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) != 6) {
			var = true;
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) == 6) {
			var = false;
		}
		return var;
	}
}