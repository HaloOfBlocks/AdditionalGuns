package haloofblocks.additionalguns.client;

import haloofblocks.additionalguns.AdditionalGuns;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author Autovw
 */
@Mod.EventBusSubscriber(modid = AdditionalGuns.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public enum SpecialModels {
    MAMMOTH("gun/mammoth"),
    VECTOR("gun/vector"),
    NINE_A_NINE_ONE("gun/9a91"),
    ACE_OF_SPADES("gun/ace_of_spades"),
    G_ELEVEN("gun/g11"),
    VINTOREZ("gun/vintorez"),
    VAL("gun/val"),
    AUG("gun/aug"),
    F_TWO_THOUSAND("gun/fn2000"),
    PP_NINETEEN("gun/pp_19"),
    MAT_FORTY_NINE("gun/mat_49"),
    SCHWARZLOSE("gun/schwarzlose"),
    OTS_ZERO_THREE("gun/ots_03"),
    AK_HUNDRED_FIVE("gun/ak105"),
    RAVENS_CLAW("gun/ravens_claw"),
    BANSHEE("gun/banshee"),
    M_FOUR_A_ONE_S("gun/m4a1s"),
    M_FOUR_A_FOUR("gun/m4a4"),
    GLOCK_EIGHTEEN("gun/glock18"),
    AKM("gun/akm"),
    AKM_CUSTOM("gun/akm_custom"),
    SSG_ZERO_EIGHT("gun/ssg08"),
    DESERT_EAGLE("gun/desert_eagle"),
    MAC_TEN("gun/mac10"),
    AWM("gun/awm"),
    AK_SEVENTY_FOUR("gun/ak74"),
    AK_SEVENTY_FOUR_M("gun/ak74m"),
    AKS_SEVENTY_FOUR_U("gun/aks74u"),
    M_SIXTEEN_A_TWO("gun/m16a2"),
    USP("gun/usp"),
    M_ONE_ZERO_ONE_FOUR("gun/m1014"),
    MP_SEVEN_A_TWO("gun/mp7a2"),
    AK_ONE_TWO("gun/ak12"),
    AK_ONE_FIVE("gun/ak15"),
    AK_ONE_ZERO_FOUR("gun/ak104"),
    P_TWO_FIVE_ZERO("gun/p250"),
    M_NINETEEN_ELEVEN("gun/m1911"),
    MAGNUM("gun/magnum"),
    SCAR("gun/scar"),
    OVER_UNDER("gun/over_under"),
    CUSTOM_MAC("gun/custom_mac"),
    USAS_TWELVE("gun/usas12"),
    PYTHON("gun/python"),
    UNICA("gun/unica"),
    MP_SEVEN("gun/mp7");

    private final ResourceLocation modelLoc;
    private BakedModel cachedModel;

    SpecialModels(String modelName) {
        this.modelLoc = new ResourceLocation(AdditionalGuns.ID, "special/" + modelName);
    }

    public BakedModel getModel() {
        if (this.cachedModel == null) {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLoc);
        }
        return this.cachedModel;
    }

    @SubscribeEvent
    public static void onRegisterAdditionalModelEvent(final ModelEvent.RegisterAdditional event) {
        for (SpecialModels specialModel : values()) {
            event.register(specialModel.modelLoc);
        }
    }

    @SubscribeEvent
    public static void onBakingCompletedEvent(final ModelEvent.BakingCompleted event) {
        for (SpecialModels specialModel : values()) {
            specialModel.cachedModel = null;
        }
    }
}
