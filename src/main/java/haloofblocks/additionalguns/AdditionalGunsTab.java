package haloofblocks.additionalguns;

import haloofblocks.additionalguns.common.item.AdditionalGunItem;
import haloofblocks.additionalguns.core.registry.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author Autovw
 */
public class AdditionalGunsTab {
    AdditionalGunsTab() {
    }

    @SubscribeEvent
    public void onRegisterCreativeModeTab(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(AdditionalGuns.ID), builder -> {
            builder.title(Component.translatable("itemGroup." + AdditionalGuns.ID));
            builder.icon(() -> {
                ItemStack stack = ItemRegistry.ACE_OF_SPADES.get().getDefaultInstance();
                stack.getOrCreateTag().putBoolean("IgnoreAmmo", true);
                return stack;
            });
            builder.displayItems((flags, entries, perms) -> {
                ItemRegistry.ITEMS.getEntries().stream().map(RegistryObject::get).forEach((entry) -> {
                    if (entry instanceof AdditionalGunItem gunItem) {
                        ItemStack stack = gunItem.getDefaultInstance();
                        stack.getOrCreateTag().putInt("AmmoCount", gunItem.getGun().getGeneral().getMaxAmmo());
                        entries.accept(stack);
                    } else {
                        entries.accept(entry);
                    }
                });
            });
        });
    }
}
