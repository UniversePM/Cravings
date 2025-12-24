package net.mcreator.cravingsmod.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.cravingsmod.procedures.DeerWalkAnimProcedure;
import net.mcreator.cravingsmod.procedures.DeerPlaybackConditionProcedure;
import net.mcreator.cravingsmod.procedures.DeerIsEntityModelShakingProcedure;
import net.mcreator.cravingsmod.entity.DeerEntity;
import net.mcreator.cravingsmod.client.model.animations.DeerAnimation;
import net.mcreator.cravingsmod.client.model.ModelDeer;

import com.mojang.blaze3d.vertex.PoseStack;

public class DeerRenderer extends MobRenderer<DeerEntity, LivingEntityRenderState, ModelDeer> {
	private DeerEntity entity = null;

	public DeerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelDeer.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DeerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("cravings_mod:textures/entities/deer.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	protected boolean isShaking(LivingEntityRenderState state) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return DeerIsEntityModelShakingProcedure.execute(world, x, y, z);
	}

	private static final class AnimatedModel extends ModelDeer {
		private DeerEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = DeerAnimation.waking.bake(root);
			this.keyframeAnimation1 = DeerAnimation.laying.bake(root);
			this.keyframeAnimation2 = DeerAnimation.run.bake(root);
			this.keyframeAnimation3 = DeerAnimation.walk.bake(root);
		}

		public void setEntity(DeerEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			if (DeerPlaybackConditionProcedure.execute(entity))
				this.keyframeAnimation2.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			if (DeerWalkAnimProcedure.execute(entity))
				this.keyframeAnimation3.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1.3f, 1.2f);
			super.setupAnim(state);
		}
	}
}