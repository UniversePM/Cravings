package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DoubleCropMealProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			if (Math.random() <= 0.7 || (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) + 1 <= 6) {
				{
					int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) + 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				{
					int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip8 ? blockstate.getValue(_getip8) : -1) + 1;
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip11 ? blockstate.getValue(_getip11) : -1) + 2 <= 6) {
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1) + 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip16 ? blockstate.getValue(_getip16) : -1) + 2;
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip19 ? blockstate.getValue(_getip19) : -1) + 1 <= 6) {
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1) + 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip24 ? blockstate.getValue(_getip24) : -1) + 1;
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == blockstate.getBlock()) {
			if (Math.random() <= 0.7 || (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip30 ? blockstate.getValue(_getip30) : -1) + 1 <= 6) {
				{
					int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip32 ? blockstate.getValue(_getip32) : -1) + 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				{
					int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) + 1;
					BlockPos _pos = BlockPos.containing(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip38 ? blockstate.getValue(_getip38) : -1) + 2 <= 6) {
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip40 ? blockstate.getValue(_getip40) : -1) + 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip43 ? blockstate.getValue(_getip43) : -1) + 2;
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip46 ? blockstate.getValue(_getip46) : -1) + 1 <= 6) {
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip48 ? blockstate.getValue(_getip48) : -1) + 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip51 ? blockstate.getValue(_getip51) : -1) + 1;
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			}
		}
	}
}