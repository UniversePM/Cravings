/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cravingsmod.client.model.ModelDeer;
import net.mcreator.cravingsmod.client.model.ModelBison;

@EventBusSubscriber(Dist.CLIENT)
public class CravingsModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBison.LAYER_LOCATION, ModelBison::createBodyLayer);
		event.registerLayerDefinition(ModelDeer.LAYER_LOCATION, ModelDeer::createBodyLayer);
	}
}