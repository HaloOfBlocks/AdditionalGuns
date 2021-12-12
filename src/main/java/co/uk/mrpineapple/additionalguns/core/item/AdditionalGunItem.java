package co.uk.mrpineapple.additionalguns.core.item;

import co.uk.mrpineapple.additionalguns.core.config.Config;
import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 */
public class AdditionalGunItem extends GunItem {

    private final boolean canColor;

    /**
     * @param properties The item properties
     * @param canColor If the gun can be colored or not
     */
    public AdditionalGunItem(Properties properties, boolean canColor) {
        super(properties);
        this.canColor = canColor;
    }

    @Override
    public boolean canColor(ItemStack stack) {
        return this.canColor;
    }

    /**
     * Makes it possible to disable the enchantment glint on guns client-side.
     */
    @Override
    public boolean isFoil(ItemStack stack) {
        if (stack.isEnchanted()) {
            return Config.Client.enableGunEnchantmentGlint.get();
        }
        else {
            return false;
        }
    }
}
