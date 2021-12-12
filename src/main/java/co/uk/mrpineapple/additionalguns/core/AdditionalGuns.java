package co.uk.mrpineapple.additionalguns.core;

import co.uk.mrpineapple.additionalguns.client.ClientHandler;
import co.uk.mrpineapple.additionalguns.core.config.Config;
import co.uk.mrpineapple.additionalguns.core.datagen.ModRecipeGenerator;
import co.uk.mrpineapple.additionalguns.core.registry.ItemRegistry;
import co.uk.mrpineapple.additionalguns.core.registry.SoundRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(AdditionalGuns.ID)
public class AdditionalGuns {
    public static final String ID = "additionalguns";
    public static final CreativeModeTab GROUP = new AdditionalGunsTab(ID);

    public AdditionalGuns() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientConfig);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        ItemRegistry.ITEMS.register(bus);
        SoundRegistry.SOUNDS.register(bus);

        bus.addListener(this::clientSetup);
        bus.addListener(this::gatherData);
    }

    void clientSetup(FMLClientSetupEvent event) {
        ClientHandler.registerModelOverrides();
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new ModRecipeGenerator(generator));
    }
}
