package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class DeerIsEntityModelShakingProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBiome(BlockPos.containing(x, y - 1, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_snowy")));
	}
}