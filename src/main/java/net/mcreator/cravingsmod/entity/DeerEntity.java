package net.mcreator.cravingsmod.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.EventHooks;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.cravingsmod.procedures.StopAnimProcedure;
import net.mcreator.cravingsmod.procedures.DeerWakeProcedure;
import net.mcreator.cravingsmod.procedures.DeerRunProcedure;
import net.mcreator.cravingsmod.procedures.DeerLayProcedure;
import net.mcreator.cravingsmod.procedures.DeerAIProcedure;
import net.mcreator.cravingsmod.init.CravingsModModEntities;

public class DeerEntity extends TamableAnimal {
	public static final EntityDataAccessor<Boolean> DATA_escaping = SynchedEntityData.defineId(DeerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_walking = SynchedEntityData.defineId(DeerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_laying = SynchedEntityData.defineId(DeerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_waking = SynchedEntityData.defineId(DeerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_bruh = SynchedEntityData.defineId(DeerEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();

	public DeerEntity(EntityType<DeerEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_escaping, false);
		builder.define(DATA_walking, false);
		builder.define(DATA_laying, false);
		builder.define(DATA_waking, false);
		builder.define(DATA_bruh, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new FollowMobGoal(this, 1, (float) 10, (float) 5) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new TemptGoal(this, 0.6, Ingredient.of(Items.APPLE), true) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerRunProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new PanicGoal(this, 1.4) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, (float) 7, 1.3, 1.6) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerRunProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new BreedGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(8, new FloatGoal(this));
		this.goalSelector.addGoal(9, new EatBlockGoal(this) {
			@Override
			public boolean canUse() {
				double x = DeerEntity.this.getX();
				double y = DeerEntity.this.getY();
				double z = DeerEntity.this.getZ();
				Entity entity = DeerEntity.this;
				Level world = DeerEntity.this.level();
				return super.canUse() && DeerAIProcedure.execute(entity);
			}
		});
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.putBoolean("Dataescaping", this.entityData.get(DATA_escaping));
		valueOutput.putBoolean("Datawalking", this.entityData.get(DATA_walking));
		valueOutput.putBoolean("Datalaying", this.entityData.get(DATA_laying));
		valueOutput.putBoolean("Datawaking", this.entityData.get(DATA_waking));
		valueOutput.putBoolean("Databruh", this.entityData.get(DATA_bruh));
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.entityData.set(DATA_escaping, valueInput.getBooleanOr("Dataescaping", false));
		this.entityData.set(DATA_walking, valueInput.getBooleanOr("Datawalking", false));
		this.entityData.set(DATA_laying, valueInput.getBooleanOr("Datalaying", false));
		this.entityData.set(DATA_waking, valueInput.getBooleanOr("Datawaking", false));
		this.entityData.set(DATA_bruh, valueInput.getBooleanOr("Databruh", false));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.SUCCESS;
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level().isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.SUCCESS : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						FoodProperties foodproperties = itemstack.get(DataComponents.FOOD);
						float nutrition = foodproperties != null ? (float) foodproperties.nutrition() : 1;
						this.heal(nutrition);
						retval = InteractionResult.SUCCESS;
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.SUCCESS;
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !EventHooks.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level().broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level().broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.SUCCESS;
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(DeerWakeProcedure.execute(this), this.tickCount);
			this.animationState1.animateWhen(DeerLayProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		StopAnimProcedure.execute(this.level(), this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		DeerEntity retval = CravingsModModEntities.DEER.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Items.APPLE).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(CravingsModModEntities.DEER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.13);
		builder = builder.add(Attributes.MAX_HEALTH, 15);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.TEMPT_RANGE, 10);
		return builder;
	}
}