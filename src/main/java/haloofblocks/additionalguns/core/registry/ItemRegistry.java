package haloofblocks.additionalguns.core.registry;

import haloofblocks.additionalguns.AdditionalGuns;
import haloofblocks.additionalguns.common.item.AdditionalGunItem;
import haloofblocks.additionalguns.common.item.BulletCasingItem;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//CLASS FOR REGISTERING GUNS
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalGuns.ID);
    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(AdditionalGuns.GROUP);

    /* Guns */
    public static final RegistryObject<Item> MAMMOTH = registerGun("mammoth", false);
    public static final RegistryObject<Item> VECTOR = registerGun("vector", true);
    public static final RegistryObject<Item> NINE_A_NINE_ONE = registerGun("9a91", true);
    public static final RegistryObject<Item> ACE_OF_SPADES = registerGun("ace_of_spades", false);
    public static final RegistryObject<Item> G_ELEVEN = registerGun("g11", true);
    public static final RegistryObject<Item> VINTOREZ = registerGun("vintorez", false);
    public static final RegistryObject<Item> VAL = registerGun("val", false);
    public static final RegistryObject<Item> AUG = registerGun("aug", true);
    public static final RegistryObject<Item> FN_TWO_THOUSAND = registerGun("fn2000", false);
    public static final RegistryObject<Item> PP_NINETEEN = registerGun("pp_19", false);
    public static final RegistryObject<Item> MAT_FORTY_NINE = registerGun("mat_49", true);
    public static final RegistryObject<Item> SCHWARZLOSE = registerGun("schwarzlose", true);
    public static final RegistryObject<Item> OTS_THREE = registerGun("ots_03", false);
    public static final RegistryObject<Item> AK_HUNDRED_FIVE = registerGun("ak105", false);
    public static final RegistryObject<Item> RAVENS_CLAW = registerGun("ravens_claw", false);
    public static final RegistryObject<Item> BANSHEE = registerGun("banshee", false);
    public static final RegistryObject<Item> M_FOUR_A_ONE_S = registerGun("m4a1s", true);
    public static final RegistryObject<Item> M_FOUR_A_FOUR = registerGun("m4a4", true);
    public static final RegistryObject<Item> GLOCK_EIGHT_TEEN = registerGun("glock18", true);
    public static final RegistryObject<Item> AKM = registerGun("akm", true);
    public static final RegistryObject<Item> AKM_CUSTOM = registerGun("akm_custom", true);
    public static final RegistryObject<Item> SSG_ZERO_EIGHT = registerGun("ssg08", true);
    public static final RegistryObject<Item> DESERT_EAGLE = registerGun("desert_eagle", true);
    public static final RegistryObject<Item> MAC_TEN = registerGun("mac10", true);
    public static final RegistryObject<Item> AWM = registerGun("awm", true);
    public static final RegistryObject<Item> AK_SEVENTY_FOUR = registerGun("ak74", true);
    public static final RegistryObject<Item> AK_SEVENTY_FOUR_M = registerGun("ak74m", true);
    public static final RegistryObject<Item> AKS_SEVENTY_FOUR_U = registerGun("aks74u", true);
    public static final RegistryObject<Item> M_SIXTEEN_A_TWO = registerGun("m16a2", true);
    public static final RegistryObject<Item> USP = registerGun("usp", true);
    public static final RegistryObject<Item> M_ONE_ZERO_ONE_FOUR = registerGun("m1014", true);
    public static final RegistryObject<Item> MP_SEVEN_A_TWO = registerGun("mp7a2", true);
    public static final RegistryObject<Item> AK_ONE_TWO = registerGun("ak12", true);
    public static final RegistryObject<Item> AK_ONE_FIVE = registerGun("ak15", true);
    public static final RegistryObject<Item> AK_ONE_ZERO_FOUR = registerGun("ak104", true);
    public static final RegistryObject<Item> P_TWO_FIVE_ZERO = registerGun("p250", true);
    public static final RegistryObject<Item> M_ONE_NINE_ONE_ONE = registerGun("m1911", true);
    public static final RegistryObject<Item> MAGNUM = registerGun("magnum", true);
    public static final RegistryObject<Item> SCAR = registerGun("scar", true);
    public static final RegistryObject<Item> OVER_UNDER = registerGun("over_under", false);
    public static final RegistryObject<Item> CUSTOM_MAC = registerGun("custom_mac", false);
    public static final RegistryObject<Item> USAS_TWELVE = registerGun("usas12", true);
    public static final RegistryObject<Item> PYTHON = registerGun("python", false);
    public static final RegistryObject<Item> UNICA = registerGun("unica", false);
    public static final RegistryObject<Item> MP_SEVEN = registerGun("mp7", true);


    /* Scope Attachments */
    public static final RegistryObject<Item> HOLO_SCOPE = ITEMS.register("holo_scope", () -> new ScopeItem(Scope.builder().additionalZoom(0.25F).reticleOffset(1.6F).viewFinderOffset(0.4).modifiers(GunModifiers.SLOW_ADS).build(), genericProperties, false));
    public static final RegistryObject<Item> ZERKALO_SCOPE = ITEMS.register("zerkalo_scope", () -> new ScopeItem(Scope.create(0.025F, 1.25F, GunModifiers.SLOWER_ADS).viewFinderOffset(0.3), genericProperties, false));
    public static final RegistryObject<Item> KOBRA_SCOPE = ITEMS.register("kobra", () -> new ScopeItem(Scope.create(0.15F, 1.75F, GunModifiers.SLOW_ADS).viewFinderOffset(0.4), genericProperties));
    // Removed until fixed!
    //public static final RegistryObject<Item> ULTRA_LONG_SCOPE = ITEMS.register("extra_long_scope", () -> new ScopeItem(Scope.create(0.45F, 1.25D, GunModifiers.SLOWER_ADS).viewFinderOffset(0.5), genericProperties));

    /* Stock Attachments */
    public static final RegistryObject<Item> BASIC_STOCK = ITEMS.register("basic_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), genericProperties, false));
    public static final RegistryObject<Item> VINTOREZ_STOCK = ITEMS.register("vintorez_stock", () -> new StockItem(Stock.create(GunModifiers.BETTER_CONTROL), genericProperties, false));

    /* Barrel Attachments */
    public static final RegistryObject<Item> MUZZLE_BRAKE = ITEMS.register("muzzle_brake", () -> new BarrelItem(Barrel.create(9.5f, GunModifiers.REDUCED_RECOIL), genericProperties, false));
    public static final RegistryObject<Item> TACTICAL_SILENCER = ITEMS.register("tactical_silencer", () -> new BarrelItem(Barrel.create(16.0f, GunModifiers.SILENCED), genericProperties));
    public static final RegistryObject<Item> SNIPER_MUZZLE_BRAKE = ITEMS.register("sniper_muzzle_brake", () -> new BarrelItem(Barrel.create(6.0f, GunModifiers.BETTER_CONTROL), genericProperties));
    public static final RegistryObject<Item> TACTICAL_MUZZLE_BRAKE = ITEMS.register("tactical_muzzle_brake", () -> new BarrelItem(Barrel.create(7.5f, GunModifiers.REDUCED_RECOIL), genericProperties, false));

    /* Under Barrel Attachments */
    public static final RegistryObject<Item> ANGLED_GRIP = ITEMS.register("angled_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), genericProperties));

    /* Ammunition */
    public static final RegistryObject<Item> BULLET_HEAVY = registerAmmo("bullet_heavy");
    public static final RegistryObject<Item> BULLET_LONG = registerAmmo("bullet_long");
    public static final RegistryObject<Item> BULLET_MEDIUM = registerAmmo("bullet_medium");
    public static final RegistryObject<Item> BULLET_SHORT = registerAmmo("bullet_short");
    public static final RegistryObject<Item> BULLET_SMALL = registerAmmo("bullet_small");
    public static final RegistryObject<Item> BULLET_SPECIAL = registerAmmo("bullet_special");

    /* Bullet casings */
    public static final RegistryObject<Item> CASING_HEAVY = registerCasing("casing_heavy");
    public static final RegistryObject<Item> CASING_LONG = registerCasing("casing_long");
    public static final RegistryObject<Item> CASING_MEDIUM = registerCasing("casing_medium");
    public static final RegistryObject<Item> CASING_SHORT = registerCasing("casing_short");
    public static final RegistryObject<Item> CASING_SMALL = registerCasing("casing_small");
    public static final RegistryObject<Item> CASING_SPECIAL = registerCasing("casing_special");

    /**
     * Helper method used to register guns in Additional Guns.
     *
     * @param name Registry name of the gun
     * @param canColor If the gun can be colored or not
     * @return The registered gun
     */
    private static RegistryObject<Item> registerGun(String name, boolean canColor) {
        return ITEMS.register(name, () -> new AdditionalGunItem(genericProperties, canColor));
    }

    /**
     * Helper method used to register new ammunition.
     *
     * @param name Registry name of the ammunition
     * @return The ammunition
     */
    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(AdditionalGuns.GROUP)));
    }

    private static RegistryObject<Item> registerCasing(String name) {
        return ITEMS.register(name, () -> new BulletCasingItem(new Item.Properties().tab(AdditionalGuns.GROUP)));
    }
}
