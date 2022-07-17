package co.uk.mrpineapple.additionalguns.core.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class BulletCasingItem extends Item {
    public BulletCasingItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltips, ITooltipFlag flag) {
        super.appendHoverText(stack, world, tooltips, flag);

        if (!Screen.hasShiftDown()) {
            tooltips.add(new TranslationTextComponent("tooltip.additionalguns.hold_shift_key", new StringTextComponent("[SHIFT]").withStyle(TextFormatting.YELLOW)));
        } else {
            tooltips.add(new TranslationTextComponent("tooltip.additionalguns.bullet_casing_info").withStyle(TextFormatting.RED));
        }
    }
}
