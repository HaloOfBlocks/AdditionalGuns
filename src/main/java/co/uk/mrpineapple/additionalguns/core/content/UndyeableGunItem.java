package co.uk.mrpineapple.additionalguns.core.content;

import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.item.ItemStack;

/**
 * @see co.uk.mrpineapple.additionalguns.core.item.AdditionalGunItem
 */
@Deprecated
public class UndyeableGunItem extends GunItem {
    public UndyeableGunItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canColor(ItemStack stack) {
        return false;
    }
}