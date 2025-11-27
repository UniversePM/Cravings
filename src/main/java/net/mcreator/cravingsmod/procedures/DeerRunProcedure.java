package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.cravingsmod.entity.DeerEntity;

public class DeerRunProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (entity instanceof DeerEntity _datEntSetL)
				_datEntSetL.getEntityData().set(DeerEntity.DATA_escaping, false);
			return false;
		}
		if (entity instanceof DeerEntity _datEntSetL)
			_datEntSetL.getEntityData().set(DeerEntity.DATA_escaping, true);
		return true;
	}
}