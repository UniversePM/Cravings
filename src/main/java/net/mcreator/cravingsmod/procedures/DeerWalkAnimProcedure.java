package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cravingsmod.entity.DeerEntity;

public class DeerWalkAnimProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof DeerEntity _datEntL0 && _datEntL0.getEntityData().get(DeerEntity.DATA_walking);
	}
}