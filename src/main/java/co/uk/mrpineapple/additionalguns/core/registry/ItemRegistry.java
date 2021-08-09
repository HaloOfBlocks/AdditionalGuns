package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import co.uk.mrpineapple.additionalguns.core.content.UndyeableGunItem;
import com.mrcrayfish.guns.GunMod;
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

    /* Guns */
    public static final RegistryObject<Item> MAMMOTH = ITEMS.register("mammoth", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> VECTOR = ITEMS.register("vector", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> NINE_A_NINE_ONE = ITEMS.register("9a91", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> ACE_OF_SPADES = ITEMS.register("ace_of_spades", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> G_ELEVEN = ITEMS.register("g11", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> VINTOREZ = ITEMS.register("vintorez", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> VAL = ITEMS.register("val", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> AUG = ITEMS.register("aug", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> FN_TWO_THOUSAND = ITEMS.register("fn2000", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> PP_NINETEEN = ITEMS.register("pp_19", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> MAT_FORTY_NINE = ITEMS.register("mat_49", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> SCHWARZLOSE = ITEMS.register("schwarzlose", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> OTS_THREE = ITEMS.register("ots_03", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> AK_HUNDRED_FIVE = ITEMS.register("ak105", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> RAVENS_CLAW = ITEMS.register("ravens_claw", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> BANSHEE = ITEMS.register("banshee", () -> new UndyeableGunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));

    /* Scope Attachments */
    public static final RegistryObject<Item> HOLO_SCOPE = ITEMS.register("holo_scope", () -> new ScopeItem(Scope.create(0.25F, 1.375F, GunModifiers.SLOW_ADS).viewFinderOffset(0.3), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));
    public static final RegistryObject<Item> ZERKALO_SCOPE = ITEMS.register("zerkalo_scope", () -> new ScopeItem(Scope.create(0.025F, 1.275F, GunModifiers.SLOWER_ADS).viewFinderOffset(0.3), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));

    /* Stock Attachments */
    public static final RegistryObject<Item> BASIC_STOCK = ITEMS.register("basic_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));
    public static final RegistryObject<Item> FLIMSY_STOCK = ITEMS.register("flimsy_stock", () -> new StockItem(Stock.create(GunModifiers.SLOWER_ADS), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), true));
    public static final RegistryObject<Item> MAMMOTH_STOCK = ITEMS.register("mammoth_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));
    public static final RegistryObject<Item> VINTOREZ_STOCK = ITEMS.register("vintorez_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));

    /* Barrel Attachments */
    public static final RegistryObject<Item> MUZZLE_BRAKE = ITEMS.register("muzzle_brake", () -> new BarrelItem(Barrel.create(8.0f, GunModifiers.REDUCED_RECOIL), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));

    /* Under Barrel Attachments */
    public static final RegistryObject<Item> ANGLED_GRIP = ITEMS.register("angled_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));

    /* Ammunition */
    public static final RegistryObject<Item> AMMO_NINE = ITEMS.register("ammo_9", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_NINE_HP = ITEMS.register("ammo_9_hp", () -> new AmmoItem(new Item.Properties())); // Removed from creative tab until the next update!
    public static final RegistryObject<Item> AMMO_FORTY_FIVE = ITEMS.register("ammo_45", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_FIVE_FOUR_FIVE = ITEMS.register("ammo_545", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_FIVE_FIVE_SIX = ITEMS.register("ammo_556", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_SEVEN_SIX_TWO_THIRTY_NINE = ITEMS.register("ammo_762_39", () -> new AmmoItem(new Item.Properties())); // Removed from creative tab until the next update!
    public static final RegistryObject<Item> AMMO_SEVEN_SIX_TWO_FIFTY_ONE = ITEMS.register("ammo_762_51", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_SEVEN_SIX_TWO_FIFTY_FOUR = ITEMS.register("ammo_762_54", () -> new AmmoItem(new Item.Properties())); // Removed from creative tab until the next update!
    public static final RegistryObject<Item> AMMO_NINE_THREE_NINE = ITEMS.register("ammo_939", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_NINE_THREE_NINE_SP_FIVE = ITEMS.register("ammo_939_sp5", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_NINE_THREE_NINE_SP_SIX = ITEMS.register("ammo_939_sp6", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
    public static final RegistryObject<Item> AMMO_JCC = ITEMS.register("ammo_jcc", () -> new AmmoItem(new Item.Properties().group(GunMod.GROUP)));
}