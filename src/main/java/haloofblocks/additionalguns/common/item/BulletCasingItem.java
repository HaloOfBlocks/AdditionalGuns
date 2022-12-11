package haloofblocks.additionalguns.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Author: Autovw
 */
public class BulletCasingItem extends Item {
    public BulletCasingItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltips, TooltipFlag flag) {
        super.appendHoverText(stack, world, tooltips, flag);

        if (!Screen.hasShiftDown()) {
            tooltips.add(new TranslatableComponent("tooltip.additionalguns.hold_shift_key", new TextComponent("[SHIFT]").withStyle(ChatFormatting.YELLOW)));
        } else {
            tooltips.add(new TranslatableComponent("tooltip.additionalguns.bullet_casing_info").withStyle(ChatFormatting.RED));
        }
    }
}
