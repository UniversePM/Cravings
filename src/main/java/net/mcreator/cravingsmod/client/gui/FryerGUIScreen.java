package net.mcreator.cravingsmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cravingsmod.world.inventory.FryerGUIMenu;
import net.mcreator.cravingsmod.procedures.FryerGUITickProcedure;
import net.mcreator.cravingsmod.procedures.FryerGUITick2Procedure;
import net.mcreator.cravingsmod.init.CravingsModModScreens;

public class FryerGUIScreen extends AbstractContainerScreen<FryerGUIMenu> implements CravingsModModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public FryerGUIScreen(FryerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("cravings_mod:textures/screens/fryer_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("cravings_mod:textures/screens/fire.png"), this.leftPos + 35, this.topPos + 54, 0, 0, 6, 8, 6, 8);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("cravings_mod:textures/screens/fire.png"), this.leftPos + 63, this.topPos + 54, 0, 0, 6, 8, 6, 8);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("cravings_mod:textures/screens/bubbles.png"), this.leftPos + 35, this.topPos + 31, 0, 0, 6, 8, 6, 8);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("cravings_mod:textures/screens/bubbles.png"), this.leftPos + 63, this.topPos + 31, 0, 0, 6, 8, 6, 8);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("cravings_mod:textures/screens/frybasket.png"), this.leftPos + 80, this.topPos + 38, Mth.clamp((int) FryerGUITickProcedure.execute(world, x, y, z) * 16, 0, 64), 0, 16, 16,
				80, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("cravings_mod:textures/screens/oilbar.png"), this.leftPos + 92, this.topPos + 4, Mth.clamp((int) FryerGUITick2Procedure.execute(world, x, y, z) * 64, 0, 256), 0, 64, 32,
				320, 32);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.cravings_mod.fryer_gui.label_fryer"), 3, 3, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}