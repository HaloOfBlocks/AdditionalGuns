package co.uk.mrpineapple.additionalguns.core;

import co.uk.mrpineapple.additionalguns.client.ClientHandler;
import co.uk.mrpineapple.additionalguns.core.registry.ItemRegistry;
import co.uk.mrpineapple.additionalguns.core.registry.SoundRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdditionalGuns.ID)
public class AdditionalGuns {
    public static final String ID = "additionalguns";

    public AdditionalGuns() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
        ItemRegistry.ITEMS.register(bus);
        SoundRegistry.SOUNDS.register(bus);

        bus.addListener(this::clientSetup);
    }

    void clientSetup(FMLClientSetupEvent event) {
        ClientHandler.registerModelOverrides();
    }
}