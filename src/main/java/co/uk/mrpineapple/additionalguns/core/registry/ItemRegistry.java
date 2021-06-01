package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import com.mrcrayfish.guns.GunMod;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.ScopeItem;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//CLASS FOR REGISTERING GUNS
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalGuns.ID);

    /* Scope Attachments */
    public static final RegistryObject<Item> HOLO_SCOPE = ITEMS.register("holo_scope", () -> new ScopeItem(Scope.create(0.25F, 1.625F, GunModifiers.SLOW_ADS).viewFinderOffset(0.3), new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
}