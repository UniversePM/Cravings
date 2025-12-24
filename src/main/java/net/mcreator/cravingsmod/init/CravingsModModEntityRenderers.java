/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cravingsmod.client.renderer.DeerRenderer;
import net.mcreator.cravingsmod.client.renderer.BisonRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class CravingsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CravingsModModEntities.BISON.get(), BisonRenderer::new);
		event.registerEntityRenderer(CravingsModModEntities.DEER.get(), DeerRenderer::new);
	}
}