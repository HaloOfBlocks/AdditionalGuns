package co.uk.mrpineapple.additionalguns.core.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Author: Autovw
 */
public class Config {

    public static final ForgeConfigSpec clientConfig;
    public static final Config.Client CLIENT;

    public static final ForgeConfigSpec commonConfig;
    public static final Config.Common COMMON;

    static {
        final Pair<Client, ForgeConfigSpec> clientConfigPair = new ForgeConfigSpec.Builder().configure(Client::new);
        clientConfig = clientConfigPair.getRight();
        CLIENT = clientConfigPair.getLeft();

        final Pair<Common, ForgeConfigSpec> commonConfigPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonConfig = commonConfigPair.getRight();
        COMMON = commonConfigPair.getLeft();
    }

    public static class Client {
        public static ForgeConfigSpec.BooleanValue enableGunEnchantmentGlint;
        public static ForgeConfigSpec.BooleanValue enableBulletCasingTooltip;

        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("client");
            {
                enableGunEnchantmentGlint = builder
                        .comment("If true, renders enchanted guns from Additional Guns with the enchantment glint. True by default.")
                        .translation("config.additionalguns.client.enable_gun_enchantment_glint")
                        .define("enableGunEnchantmentGlint", true);
                enableBulletCasingTooltip = builder
                        .comment("If true, displays helpful tooltip on bullet casings explaining their use-case. True by default.")
                        .translation("config.additionalguns.client.enable_bullet_casing_tooltip")
                        .define("enableBulletCasingTooltip", true);
            }
            builder.pop();
        }

    }

    public static class Common {
        public static Experimental experimental;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("common");
            {
                experimental = new Experimental(builder);
            }
            builder.pop();
        }

        public static class Experimental {
            public static ForgeConfigSpec.BooleanValue forceDyeAbilityGuns;

            public Experimental(ForgeConfigSpec.Builder builder) {
                builder.push("experimental");
                {
                    forceDyeAbilityGuns = builder
                            .comment("If true, forces the ability to dye guns even if this behavior is turned of for the gun by default. This option might be useful to modpack and/or resource pack devs. False by default.")
                            .translation("config.additionalguns.common.experimental.force_dye_ability_guns")
                            .define("forceDyeAbilityGuns", false);
                }
                builder.pop();
            }
        }
    }
}
