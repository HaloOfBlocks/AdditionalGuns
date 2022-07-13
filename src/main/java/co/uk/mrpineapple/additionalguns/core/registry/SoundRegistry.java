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
    public static final RegistryObject<SoundEvent> MAMMOTH_FIRE = register("item.mammoth.fire");
    public static final RegistryObject<SoundEvent> DEAGLE_FIRE = register("item.deagle.fire");
    public static final RegistryObject<SoundEvent> AK_ONE_FIRE = register("item.ak1.fire");
    public static final RegistryObject<SoundEvent> AK_TWO_FIRE = register("item.ak2.fire");
    public static final RegistryObject<SoundEvent> AK_THREE_FIRE = register("item.ak3.fire");
    public static final RegistryObject<SoundEvent> AK_SUPPRESSED = register("item.ak.suppressed");
    public static final RegistryObject<SoundEvent> AOS_FIRE = register("item.aos.fire");
    public static final RegistryObject<SoundEvent> AWM_FIRE = register("item.awm.fire");
    public static final RegistryObject<SoundEvent> AR_ONE_FIVE_FIRE = register("item.ar15.fire");
    public static final RegistryObject<SoundEvent> AR_ONE_FIVE_SUPPRESSED = register("item.ar15.suppressed");
    public static final RegistryObject<SoundEvent> INTSUP_FIRE = register("item.intsup.fire");
    public static final RegistryObject<SoundEvent> SMG_FIRE = register("item.smg.fire");
    public static final RegistryObject<SoundEvent> SMG_SUPPRESSED = register("item.smg.suppressed");
    public static final RegistryObject<SoundEvent> MEDIUM_FIRE = register("item.medium.fire");
    public static final RegistryObject<SoundEvent> MP_SEVEN_A_TWO_FIRE = register("item.mp7a2.fire");
    public static final RegistryObject<SoundEvent> OTS_ZERO_THREE_FIRE = register("item.ots03.fire");
    public static final RegistryObject<SoundEvent> P_TWO_FIVE_ONE_FIRE = register("item.p250.fire");
    public static final RegistryObject<SoundEvent> PISTOL_FIRE = register("item.pistol.fire");
    public static final RegistryObject<SoundEvent> PISTOL_SUPPRESSED = register("item.pistol.suppressed");
    public static final RegistryObject<SoundEvent> VECTOR_FIRE = register("item.vector.fire");
    public static final RegistryObject<SoundEvent> VECTOR_SUPPRESSED = register("item.vector.suppressed");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(AdditionalGuns.ID, name)));
    }
}
