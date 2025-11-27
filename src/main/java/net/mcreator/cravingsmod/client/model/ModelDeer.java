package net.mcreator.cravingsmod.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDeer extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("cravings_mod", "model_deer"), "main");
	public final ModelPart body;
	public final ModelPart rleg;
	public final ModelPart lleg;
	public final ModelPart larm;
	public final ModelPart rarm;
	public final ModelPart head;

	public ModelDeer(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.rleg = root.getChild("rleg");
		this.lleg = root.getChild("lleg");
		this.larm = root.getChild("larm");
		this.rarm = root.getChild("rarm");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -2.5282F, -7.8654F, 7.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5282F, -0.1346F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 42).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0282F, -8.3654F, -0.48F, 0.0F, 0.0F));
		PartDefinition rleg = partdefinition.addOrReplaceChild("rleg",
				CubeListBuilder.create().texOffs(20, 28).addBox(-1.375F, -1.75F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(-1.125F, 3.25F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.375F, 16.75F, 5.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition lleg = partdefinition.addOrReplaceChild("lleg",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.625F, -1.75F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 36).addBox(-0.875F, 3.25F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.375F, 16.75F, 5.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition larm = partdefinition.addOrReplaceChild("larm", CubeListBuilder.create().texOffs(12, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, 18.0F, -6.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition rarm = partdefinition.addOrReplaceChild("rarm", CubeListBuilder.create().texOffs(32, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, 18.0F, -6.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0173F, 13.3601F, -7.467F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 36).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.224F, -5.9688F, -0.717F, -3.1416F, 0.3054F, -2.4871F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.276F, -5.9688F, -0.717F, 3.1416F, -0.3054F, 2.4871F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0173F, -4.3601F, -0.967F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 21).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0173F, -2.7818F, -2.7241F, 1.2654F, 0.0F, 3.1416F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0173F, -0.9204F, 0.125F, -1.9199F, 0.0F, 3.1416F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 38).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8958F, -6.4201F, -1.467F, 3.1416F, 0.0F, 2.2253F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 38).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2608F, -10.0832F, -1.067F, -3.0137F, -0.05F, -2.9769F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 38).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7608F, -10.9332F, -1.467F, -3.1416F, 0.0F, -3.098F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 41).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8741F, -6.4201F, -1.467F, 0.0F, 0.0F, 0.9163F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 41).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2392F, -10.0832F, -1.067F, -0.1279F, -0.05F, -0.1647F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 26).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7392F, -10.9332F, -1.467F, 0.0F, 0.0F, -0.0436F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}