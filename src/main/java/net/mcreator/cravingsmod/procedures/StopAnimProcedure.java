package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.cravingsmod.entity.DeerEntity;
import net.mcreator.cravingsmod.CravingsModMod;

public class StopAnimProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().z() == 0) {
				if (entity instanceof DeerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(DeerEntity.DATA_escaping, false);
			}
			if (world.dayTime() >= 13000 && world.dayTime() <= 23460) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			}
			if (entity instanceof DeerEntity _datEntSetL)
				_datEntSetL.getEntityData().set(DeerEntity.DATA_walking, (!(entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().z() == 0)));
			if (entity instanceof DeerEntity _datEntL10 && _datEntL10.getEntityData().get(DeerEntity.DATA_laying)) {
				if (entity instanceof DeerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(DeerEntity.DATA_bruh, true);
			}
			if (entity instanceof DeerEntity _datEntL12 && _datEntL12.getEntityData().get(DeerEntity.DATA_bruh) && (entity instanceof DeerEntity _datEntL13 && _datEntL13.getEntityData().get(DeerEntity.DATA_laying)) == false) {
				if (entity instanceof DeerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(DeerEntity.DATA_waking, true);
				if (entity instanceof DeerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(DeerEntity.DATA_bruh, false);
				assert Boolean.TRUE; //#dbg:StopAnim:firstRegistered
				CravingsModMod.queueServerWork(20, () -> {
					if (entity instanceof DeerEntity _datEntSetL)
						_datEntSetL.getEntityData().set(DeerEntity.DATA_waking, false);
					assert Boolean.TRUE; //#dbg:StopAnim:RegisterDelay
				});
			}
			if (entity instanceof DeerEntity _datEntSetL)
				_datEntSetL.getEntityData().set(DeerEntity.DATA_laying, (world.dayTime() >= 13000 && world.dayTime() <= 23460));
		}
	}
}