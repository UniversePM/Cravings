/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cravingsmod.client.gui.SackGUIScreen;
import net.mcreator.cravingsmod.client.gui.FryerGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class CravingsModModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CravingsModModMenus.SACK_GUI.get(), SackGUIScreen::new);
		event.register(CravingsModModMenus.FRYER_GUI.get(), FryerGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}