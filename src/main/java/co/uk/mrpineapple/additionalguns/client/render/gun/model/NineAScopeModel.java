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

public class NineAScopeModel implements IOverrideModel {
    private static final ResourceLocation RED_DOT_RETICLE = new ResourceLocation(Reference.MOD_ID, "textures/effect/red_dot_reticle.png");
    private static final ResourceLocation RED_DOT_RETICLE_GLOW = new ResourceLocation(Reference.MOD_ID, "textures/effect/red_dot_reticle_glow.png");
    private static final ResourceLocation VIGNETTE = new ResourceLocation(Reference.MOD_ID, "textures/effect/scope_vignette.png");

    public NineAScopeModel() {}

    public void render(float partialTicks, ItemCameraTransforms.TransformType transformType, ItemStack stack, ItemStack parent, LivingEntity entity, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light, int overlay) {
        if (OptifineHelper.isShadersEnabled()) {
            double transition = 1.0D - Math.pow(1.0D - AimingHandler.get().getNormalisedAdsProgress(), 2.0D);
            double zScale = 0.05D + 0.95D * (1.0D - transition);
            matrixStack.scale(1.0F, 1.0F, (float)zScale);
        }

        RenderUtil.renderModel(stack, parent, matrixStack, renderTypeBuffer, light, overlay);
        if (transformType.isFirstPerson() && entity.equals(Minecraft.getInstance().player)) {
            matrixStack.push();
            Matrix4f matrix = matrixStack.getLast().getMatrix();
            Matrix3f normal = matrixStack.getLast().getNormal();
            float size = 0.0875F;
            matrixStack.translate((double)(-size / 2.0F), 0.053125D, -0.01875D);
            IVertexBuilder builder;
            if (!OptifineHelper.isShadersEnabled()) {
                builder = renderTypeBuffer.getBuffer(RenderType.getEntityTranslucent(VIGNETTE));
                builder.pos(matrix, 0.0F, -0.02F, 0.0F).color(1.0F, 1.0F, 1.0F, 1.0F).tex(1.0F, 1.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, size, -0.02F, 0.0F).color(1.0F, 1.0F, 1.0F, 1.0F).tex(0.0F, 1.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, size, size -0.025F, 0.0F).color(1.0F, 1.0F, 1.0F, 1.0F).tex(0.0F, 0.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, 0.0F, size -0.025F, 0.0F).color(1.0F, 1.0F, 1.0F, 1.0F).tex(1.0F, 0.0F).overlay(overlay).lightmap(light).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            }

            double invertProgress = 1.0D - AimingHandler.get().getNormalisedAdsProgress();
            matrixStack.translate(-0.04D * invertProgress, 0.01D * invertProgress, 0.0D);
            double scale = 6.0D;
            matrixStack.translate((double)(size / 2.0F), (double)(size / 2.0F), 0.0D);
            matrixStack.translate(-((double)size / scale) / 2.0D, -((double)size / scale) / 2.0D, 0.0D);
            matrixStack.translate(0.0D, -0.02D, 1.0E-4D);
            int reticleGlowColor = RenderUtil.getItemStackColor(stack, parent, 0);
            CompoundNBT tag = stack.getTag();
            if (tag != null && tag.contains("ReticleColor", 3)) {
                reticleGlowColor = tag.getInt("ReticleColor");
            }

            float red = (float)(reticleGlowColor >> 16 & 255) / 255.0F;
            float green = (float)(reticleGlowColor >> 8 & 255) / 255.0F;
            float blue = (float)(reticleGlowColor >> 0 & 255) / 255.0F;
            float alpha = (float)AimingHandler.get().getNormalisedAdsProgress();
            if (!OptifineHelper.isShadersEnabled()) {
                builder = renderTypeBuffer.getBuffer(RenderType.getEntityTranslucent(RED_DOT_RETICLE_GLOW));
                builder.pos(matrix, 0.0F, (float)((double)size / scale), 0.0F).color(red, green, blue, alpha).tex(0.0F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, 0.0F, 0.0F, 0.0F).color(red, green, blue, alpha).tex(0.0F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, (float)((double)size / scale), 0.0F, 0.0F).color(red, green, blue, alpha).tex(0.9375F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
                builder.pos(matrix, (float)((double)size / scale), (float)((double)size / scale), 0.0F).color(red, green, blue, alpha).tex(0.9375F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            }

            alpha = (float)(0.75D * AimingHandler.get().getNormalisedAdsProgress());
            builder = renderTypeBuffer.getBuffer(RenderType.getEntityTranslucent(RED_DOT_RETICLE));
            builder.pos(matrix, 0.0F, (float)((double)size / scale), 0.0F).color(1.0F, 1.0F, 1.0F, alpha).tex(0.0F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            builder.pos(matrix, 0.0F, 0.0F, 0.0F).color(1.0F, 1.0F, 1.0F, alpha).tex(0.0F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            builder.pos(matrix, (float)((double)size / scale), 0.0F, 0.0F).color(1.0F, 1.0F, 1.0F, alpha).tex(0.9375F, 0.0F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            builder.pos(matrix, (float)((double)size / scale), (float)((double)size / scale), 0.0F).color(1.0F, 1.0F, 1.0F, alpha).tex(0.9375F, 0.9375F).overlay(overlay).lightmap(15728880).normal(normal, 0.0F, 1.0F, 0.0F).endVertex();
            matrixStack.pop();
        }
    }
}

