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
    public static final RegistryObject<SoundEvent> AOS_FIRE = register("item.aos.fire");
    public static final RegistryObject<SoundEvent> AWM_FIRE = register("item.awm.fire");
    public static final RegistryObject<SoundEvent> AR_ONE_FIVE_FIRE = register("item.ar15.fire");
    public static final RegistryObject<SoundEvent> INTSUP_FIRE = register("item.intsup.fire");
    public static final RegistryObject<SoundEvent> MP_SEVEN_A_TWO_FIRE = register("item.mp7a2.fire");
    public static final RegistryObject<SoundEvent> OTS_ZERO_THREE_FIRE = register("item.ots03.fire");
    public static final RegistryObject<SoundEvent> P_TWO_FIVE_ONE_FIRE = register("item.p250.fire");
    public static final RegistryObject<SoundEvent> PISTOL_FIRE = register("item.pistol.fire");
    public static final RegistryObject<SoundEvent> PISTOL_SUPPRESSED = register("item.pistol.suppressed");
    public static final RegistryObject<SoundEvent> VECTOR_FIRE = register("item.vector.fire");
    public static final RegistryObject<SoundEvent> VECTOR_SUPPRESSED = register("item.vector.suppressed");
    public static final RegistryObject<SoundEvent> HEAVY_FIRE = register("item.heavy.fire");
    public static final RegistryObject<SoundEvent> SSG_ZERO_EIGHT_FIRE = register("item.ssg08.fire");
    public static final RegistryObject<SoundEvent> AUG_FIRE = register("item.aug.fire");
    public static final RegistryObject<SoundEvent> BANSHEE_FIRE = register("item.banshee.fire");
    public static final RegistryObject<SoundEvent> FN_TWO_THOUSAND_FIRE = register("item.fn2000.fire");
    public static final RegistryObject<SoundEvent> M_ONE_ZERO_ONE_FOUR_FIRE = register("item.m1014.fire");
    public static final RegistryObject<SoundEvent> M_ONE_NINE_ONE_ONE_FIRE = register("item.1911.fire");
    public static final RegistryObject<SoundEvent> M_ONE_NINE_ONE_ONE_SUPPRESSED = register("item.1911.suppressed");
    public static final RegistryObject<SoundEvent> M_ONE_NINE_ONE_ONE_ENCHANTED = register("item.1911.enchanted");
    public static final RegistryObject<SoundEvent> MAC_TEN_FIRE = register("item.mac10.fire");
    public static final RegistryObject<SoundEvent> MAGNUM_FIRE = register("item.magnum.fire");
    public static final RegistryObject<SoundEvent> PP_ONE_NINE_FIRE = register("item.pp19.fire");
    public static final RegistryObject<SoundEvent> RAVENSCLAW_FIRE = register("item.ravensclaw.fire");
    public static final RegistryObject<SoundEvent> RIFLE_SUPPRESSED = register("item.rifle.suppressed");
    public static final RegistryObject<SoundEvent> LIGHT_SUPPRESSION = register("item.light.suppressed");
    public static final RegistryObject<SoundEvent> MEDIUM_SUPPRESSION = register("item.medium.suppressed");
    public static final RegistryObject<SoundEvent> HEAVY_SUPPRESSION = register("item.heavy.suppressed");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(AdditionalGuns.ID, name)));
    }
}
