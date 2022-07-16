package co.uk.mrpineapple.additionalguns.core;

import co.uk.mrpineapple.additionalguns.core.item.AdditionalGunItem;
import co.uk.mrpineapple.additionalguns.core.registry.ItemRegistry;
import com.mrcrayfish.guns.client.CustomGunManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;

/**
 * Author: Autovw
 */
public class AdditionalGunsTab extends CreativeModeTab {
    public AdditionalGunsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        AdditionalGunItem gunItem = (AdditionalGunItem) ItemRegistry.ACE_OF_SPADES.get();
        ItemStack stack = gunItem.getDefaultInstance();
        stack.getOrCreateTag().putInt("AmmoCount", gunItem.getGun().getGeneral().getMaxAmmo());
        return stack;
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}
