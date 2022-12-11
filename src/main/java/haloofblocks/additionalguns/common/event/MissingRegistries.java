package haloofblocks.additionalguns.common.event;

import haloofblocks.additionalguns.AdditionalGuns;
import haloofblocks.additionalguns.core.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = AdditionalGuns.ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MissingRegistries {

    @SubscribeEvent
    public static void onMissingMappingsEvent(final MissingMappingsEvent event) {
        for (MissingMappingsEvent.Mapping<Item> mapping : event.getAllMappings(ForgeRegistries.Keys.ITEMS)) {
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_939"))) {
                mapping.remap(ItemRegistry.BULLET_SPECIAL.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_939_sp5"))) {
                mapping.remap(ItemRegistry.BULLET_SPECIAL.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_939_sp6"))) {
                mapping.remap(ItemRegistry.BULLET_LONG.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_9"))) {
                mapping.remap(ItemRegistry.BULLET_SMALL.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_762_51"))) {
                mapping.remap(ItemRegistry.BULLET_HEAVY.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_556"))) {
                mapping.remap(ItemRegistry.BULLET_MEDIUM.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_45"))) {
                mapping.remap(ItemRegistry.BULLET_SHORT.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_jcc"))) {
                mapping.remap(ItemRegistry.BULLET_MEDIUM.get());
            }
            if (mapping.getKey().equals(new ResourceLocation(AdditionalGuns.ID, "ammo_545"))) {
                mapping.remap(ItemRegistry.BULLET_HEAVY.get());
            }
        }
    }
}
