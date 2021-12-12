package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    // Deferred Register for sound registration.
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AdditionalGuns.ID);

    /* Sounds */
    public static final RegistryObject<SoundEvent> MAMMOTH_FIRE = register("item." + AdditionalGuns.ID + ".mammoth_fire");
    public static final RegistryObject<SoundEvent> MAMMOTH_SUPPRESSED = register("item." + AdditionalGuns.ID + ".mammoth_suppressed");
    public static final RegistryObject<SoundEvent> VAL_FIRE = register("item." + AdditionalGuns.ID + ".val_fire");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(AdditionalGuns.ID, name)));
    }
}