package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GreenBeanCropNChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		DoubleCropNeighborChangeProcedure.execute(world, x, y, z, blockstate);
		if ((blockstate.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep1 ? blockstate.getValue(_getep1).toString() : "").equals("lower")) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) == 0) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip6 ? blockstate.getValue(_getip6) : -1) == 1) {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip9 ? blockstate.getValue(_getip9) : -1) == 2) {
				{
					int _value = 3;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip12 ? blockstate.getValue(_getip12) : -1) == 3) {
				{
					int _value = 4;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip15 ? blockstate.getValue(_getip15) : -1) == 4) {
				{
					int _value = 5;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip18 ? blockstate.getValue(_getip18) : -1) == 5) {
				{
					int _value = 6;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1) == 6) {
				{
					int _value = 7;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
		if ((blockstate.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _getep24 ? blockstate.getValue(_getep24).toString() : "").equals("upper")) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip26 ? blockstate.getValue(_getip26) : -1) == 0) {
				{
					int _value = 8;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip29 ? blockstate.getValue(_getip29) : -1) == 1) {
				{
					int _value = 8;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip32 ? blockstate.getValue(_getip32) : -1) == 2) {
				{
					int _value = 8;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) == 3) {
				{
					int _value = 9;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip38 ? blockstate.getValue(_getip38) : -1) == 4) {
				{
					int _value = 10;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip41 ? blockstate.getValue(_getip41) : -1) == 5) {
				{
					int _value = 11;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip44 ? blockstate.getValue(_getip44) : -1) == 6) {
				{
					int _value = 12;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}