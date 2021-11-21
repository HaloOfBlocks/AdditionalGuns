package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import co.uk.mrpineapple.additionalguns.core.item.AdditionalGunItem;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//CLASS FOR REGISTERING GUNS
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalGuns.ID);
    public static final Item.Properties genericProperties = new Item.Properties().maxStackSize(1).group(AdditionalGuns.GROUP);

    /* Guns */
    public static final RegistryObject<Item> MAMMOTH = registerGun("mammoth", false);
    public static final RegistryObject<Item> VECTOR = registerGun("vector", false);
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

    /* Scope Attachments */
    public static final RegistryObject<Item> HOLO_SCOPE = ITEMS.register("holo_scope", () -> new ScopeItem(Scope.create(0.25F, 1.375F, GunModifiers.SLOW_ADS).viewFinderOffset(0.3), genericProperties, false));
    public static final RegistryObject<Item> ZERKALO_SCOPE = ITEMS.register("zerkalo_scope", () -> new ScopeItem(Scope.create(0.025F, 1.275F, GunModifiers.SLOWER_ADS).viewFinderOffset(0.3), genericProperties, false));

    /* Stock Attachments */
    public static final RegistryObject<Item> BASIC_STOCK = ITEMS.register("basic_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), genericProperties, false));
    public static final RegistryObject<Item> VINTOREZ_STOCK = ITEMS.register("vintorez_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), genericProperties, false));
    // Removed until fixed!
    //public static final RegistryObject<Item> FLIMSY_STOCK = ITEMS.register("flimsy_stock", () -> new StockItem(Stock.create(GunModifiers.SLOWER_ADS), genericProperties, true));
    //public static final RegistryObject<Item> MAMMOTH_STOCK = ITEMS.register("mammoth_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), genericProperties, false));

    /* Barrel Attachments */
    public static final RegistryObject<Item> MUZZLE_BRAKE = ITEMS.register("muzzle_brake", () -> new BarrelItem(Barrel.create(9.5f, GunModifiers.REDUCED_RECOIL), genericProperties, false));

    /* Under Barrel Attachments */
    public static final RegistryObject<Item> ANGLED_GRIP = ITEMS.register("angled_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), genericProperties));

    /* Ammunition */
    public static final RegistryObject<Item> AMMO_NINE = registerAmmo("ammo_9");
    public static final RegistryObject<Item> AMMO_FORTY_FIVE = registerAmmo("ammo_45");
    public static final RegistryObject<Item> AMMO_FIVE_FOUR_FIVE = registerAmmo("ammo_545");
    public static final RegistryObject<Item> AMMO_FIVE_FIVE_SIX = registerAmmo("ammo_556");
    public static final RegistryObject<Item> AMMO_SEVEN_SIX_TWO_FIFTY_ONE = registerAmmo("ammo_762_51");
    public static final RegistryObject<Item> AMMO_NINE_THREE_NINE = registerAmmo("ammo_939");
    public static final RegistryObject<Item> AMMO_NINE_THREE_NINE_SP_FIVE = registerAmmo("ammo_939_sp5");
    public static final RegistryObject<Item> AMMO_NINE_THREE_NINE_SP_SIX = registerAmmo("ammo_939_sp6");
    public static final RegistryObject<Item> AMMO_JCC = registerAmmo("ammo_jcc");

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
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().group(AdditionalGuns.GROUP)));
    }
}
