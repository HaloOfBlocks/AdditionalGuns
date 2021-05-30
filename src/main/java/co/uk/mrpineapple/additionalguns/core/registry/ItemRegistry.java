package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//CLASS FOR REGISTERING GUNS
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalGuns.ID);
}
