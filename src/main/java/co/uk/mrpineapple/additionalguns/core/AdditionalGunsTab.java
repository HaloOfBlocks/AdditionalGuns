package co.uk.mrpineapple.additionalguns.core;

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
        return new ItemStack(ItemRegistry.AMMO_SEVEN_SIX_TWO_FIFTY_ONE.get());
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}
