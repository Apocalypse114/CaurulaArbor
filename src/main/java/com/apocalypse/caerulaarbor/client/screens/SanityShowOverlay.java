
package com.apocalypse.caerulaarbor.client.screens;

import com.apocalypse.caerulaarbor.init.CaerulaArborModAttributes;
import com.apocalypse.caerulaarbor.procedures.GetSanityIndexProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SanityShowOverlay {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void eventHandler(RenderGuiEvent.Pre event) {
        int w = event.getWindow().getGuiScaledWidth();
        int h = event.getWindow().getGuiScaledHeight();

        Player entity = Minecraft.getInstance().player;
        if ((entity.getAttributes().hasAttribute(CaerulaArborModAttributes.SANITY.get()) ? entity.getAttribute(CaerulaArborModAttributes.SANITY.get()).getBaseValue() : 0) < 1000) {
            event.getGuiGraphics().blit(new ResourceLocation("caerula_arbor:textures/screens/sanity.png"), w / 2 + 92, h - 19, Mth.clamp((int) GetSanityIndexProcedure.execute(entity) * 16, 0, 304), 0, 16, 16, 320, 16);
        }
    }
}
