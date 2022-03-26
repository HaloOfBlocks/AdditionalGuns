package co.uk.mrpineapple.additionalguns.client.render.gun.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.client.handler.AimingHandler;
import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
import com.mrcrayfish.guns.client.util.RenderUtil;
import com.mrcrayfish.guns.util.OptifineHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraftforge.common.util.Constants;

/**
 * This class has been blatantly stolen from MrCrayfish with some modifications.
 * Reference: {@link com.mrcrayfish.guns.client.render.gun.model.ShortScopeModel}
 */
public class KobraScopeModel implements IOverrideModel {
    private static final ResourceLocation RED_DOT_RETICLE = new ResourceLocation(Reference.MOD_ID, "textures/effect/red_dot_reticle.png");
    private static final ResourceLocation RED_DOT_RETICLE_GLOW = new ResourceLocation(Reference.MOD_ID, "textures/effect/red_dot_reticle_glow.png");
    private static final ResourceLocation VIGNETTE = new ResourceLocation(Reference.MOD_ID, "textures/effect/scope_vignette.png");

    @Override
    public void render(float partialTicks, ItemCameraTransforms.TransformType transformType, ItemStack itemStack, ItemStack parent, LivingEntity livingEntity, MatrixStack poseStack, IRenderTypeBuffer multiBufferSource, int light, int overlay) {
        if (OptifineHelper.isShadersEnabled()) {
            double transition = 1.0 - Math.pow(1.0 - AimingHandler.get().getNormalisedAdsProgress(), 2);
            double zScale = 0.05 + 0.95 * (1.0 - transition);
            poseStack.scale(1.0F, 1.0F, (float) zScale);
        }

        RenderUtil.renderModel(itemStack, parent, poseStack, multiBufferSource, light, overlay);

        if (transformType.isFirstPerson() && livingEntity.equals(Minecraft.getInstance().player)) {
            poseStack.push();
            {
                Matrix4f matrix = poseStack.getLast().getMatrix();
                Matrix3f normal = poseStack.getLast().getNormal();

                float size = 1.4F / 16.0F;
                poseStack.translate(-size / 2, 0.06313, -0.15875);

                IVertexBuilder builder;

                if (!OptifineHelper.isShadersEnabled()) {
                    builder = multiBufferSource.getBuffer(RenderType.getEntityTranslucent(VIGNETTE));
                    builder.pos(matrix, 0, 0, 0).color(1.0F, 1.0F, 1.0F, 1.0F).tex(1.0F, 1.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                    builder.pos(matrix, size, 0, 0).color(1.0F, 1.0F, 1.0F, 1.0F).tex(0.0F, 1.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                    builder.pos(matrix, size, size, 0).color(1.0F, 1.0F, 1.0F, 1.0F).tex(0.0F, 0.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                    builder.pos(matrix, 0, size, 0).color(1.0F, 1.0F, 1.0F, 1.0F).tex(1.0F, 0.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                }

                double invertProgress = (1.0 - AimingHandler.get().getNormalisedAdsProgress());
                poseStack.translate(-0.04 * invertProgress, 0.01 * invertProgress, 0);

                double scale = 6.0;
                poseStack.translate(size / 2, size / 2, 0);
                poseStack.translate(-(size / scale) / 2, -(size / scale) / 2, 0);
                poseStack.translate(0, 0, 0.0001);

                int reticleGlowColor = RenderUtil.getItemStackColor(itemStack, parent, 0);
                CompoundNBT tag = itemStack.getTag();
                if (tag != null && tag.contains("ReticleColor", Constants.NBT.TAG_INT)) {
                    reticleGlowColor = tag.getInt("ReticleColor");
                }

                float red = ((reticleGlowColor >> 16) & 0xFF) / 255F;
                float green = ((reticleGlowColor >> 8) & 0xFF) / 255F;
                float blue = ((reticleGlowColor >> 0) & 0xFF) / 255F;
                float alpha = (float) AimingHandler.get().getNormalisedAdsProgress();

                if (!OptifineHelper.isShadersEnabled()) {
                    builder = multiBufferSource.getBuffer(RenderType.getEntityTranslucent(RED_DOT_RETICLE_GLOW));
                    builder.pos(matrix, 0, (float) (size / scale), 0).color(red, green, blue, alpha).tex(0.0F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                    builder.pos(matrix, 0, 0, 0).color(red, green, blue, alpha).tex(0.0F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                    builder.pos(matrix, (float) (size / scale), 0, 0).color(red, green, blue, alpha).tex(0.9375F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                    builder.pos(matrix, (float) (size / scale), (float) (size / scale), 0).color(red, green, blue, alpha).tex(0.9375F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                }

                alpha = (float) (0.75F * AimingHandler.get().getNormalisedAdsProgress());

                builder = multiBufferSource.getBuffer(RenderType.getEntityTranslucent(RED_DOT_RETICLE));
                builder.pos(matrix, 0, (float) (size / scale), 0).color(1.0F, 1.0F, 1.0F, alpha).tex(0.0F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, 0, 0, 0).color(1.0F, 1.0F, 1.0F, alpha).tex(0.0F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, (float) (size / scale), 0, 0).color(1.0F, 1.0F, 1.0F, alpha).tex(0.9375F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, (float) (size / scale), (float) (size / scale), 0).color(1.0F, 1.0F, 1.0F, alpha).tex(0.9375F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            }
            poseStack.pop();
        }
    }
}
