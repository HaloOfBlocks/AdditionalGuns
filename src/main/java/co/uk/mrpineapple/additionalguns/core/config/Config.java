package co.uk.mrpineapple.additionalguns.core.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Author: Autovw
 */
public class Config {

    public static final ForgeConfigSpec clientConfig;
    public static final Config.Client CLIENT;

    static {
        final Pair<Client, ForgeConfigSpec> clientConfigPair = new ForgeConfigSpec.Builder().configure(Client::new);
        clientConfig = clientConfigPair.getRight();
        CLIENT = clientConfigPair.getLeft();
    }

    public static class Client {
        public static ForgeConfigSpec.BooleanValue enableGunEnchantmentGlint;

        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("client");
            {
                enableGunEnchantmentGlint = builder
                        .comment("If true, renders enchanted guns from Additional Guns with the enchantment glint. True by default.")
                        .translation("config.additionalguns.client.enable_gun_enchantment_glint")
                        .define("enableGunEnchantmentGlint", true);
            }
            builder.pop();
        }
    }
}
