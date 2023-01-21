package haloofblocks.additionalguns.client;

import com.mrcrayfish.guns.client.render.gun.model.SimpleModel;
import haloofblocks.additionalguns.core.registry.ItemRegistry;
import com.mrcrayfish.guns.client.render.gun.ModelOverrides;

/**
 * @author Autovw
 */
public class ClientHandler {
    public static void registerModelOverrides() {
        ModelOverrides.register(ItemRegistry.MAMMOTH.get(), new SimpleModel(SpecialModels.MAMMOTH::getModel));
        ModelOverrides.register(ItemRegistry.VECTOR.get(), new SimpleModel(SpecialModels.VECTOR::getModel));
        ModelOverrides.register(ItemRegistry.NINE_A_NINE_ONE.get(), new SimpleModel(SpecialModels.NINE_A_NINE_ONE::getModel));
        ModelOverrides.register(ItemRegistry.ACE_OF_SPADES.get(), new SimpleModel(SpecialModels.ACE_OF_SPADES::getModel));
        ModelOverrides.register(ItemRegistry.G_ELEVEN.get(), new SimpleModel(SpecialModels.G_ELEVEN::getModel));
        ModelOverrides.register(ItemRegistry.VINTOREZ.get(), new SimpleModel(SpecialModels.VINTOREZ::getModel));
        ModelOverrides.register(ItemRegistry.VAL.get(), new SimpleModel(SpecialModels.VAL::getModel));
        ModelOverrides.register(ItemRegistry.AUG.get(), new SimpleModel(SpecialModels.AUG::getModel));
        ModelOverrides.register(ItemRegistry.FN_TWO_THOUSAND.get(), new SimpleModel(SpecialModels.F_TWO_THOUSAND::getModel));
        ModelOverrides.register(ItemRegistry.PP_NINETEEN.get(), new SimpleModel(SpecialModels.PP_NINETEEN::getModel));
        ModelOverrides.register(ItemRegistry.MAT_FORTY_NINE.get(), new SimpleModel(SpecialModels.MAT_FORTY_NINE::getModel));
        ModelOverrides.register(ItemRegistry.SCHWARZLOSE.get(), new SimpleModel(SpecialModels.SCHWARZLOSE::getModel));
        ModelOverrides.register(ItemRegistry.OTS_THREE.get(), new SimpleModel(SpecialModels.OTS_ZERO_THREE::getModel));
        ModelOverrides.register(ItemRegistry.AK_HUNDRED_FIVE.get(), new SimpleModel(SpecialModels.AK_HUNDRED_FIVE::getModel));
        ModelOverrides.register(ItemRegistry.RAVENS_CLAW.get(), new SimpleModel(SpecialModels.RAVENS_CLAW::getModel));
        ModelOverrides.register(ItemRegistry.BANSHEE.get(), new SimpleModel(SpecialModels.BANSHEE::getModel));
        ModelOverrides.register(ItemRegistry.M_FOUR_A_ONE_S.get(), new SimpleModel(SpecialModels.M_FOUR_A_ONE_S::getModel));
        ModelOverrides.register(ItemRegistry.M_FOUR_A_FOUR.get(), new SimpleModel(SpecialModels.M_FOUR_A_FOUR::getModel));
        ModelOverrides.register(ItemRegistry.GLOCK_EIGHT_TEEN.get(), new SimpleModel(SpecialModels.GLOCK_EIGHTEEN::getModel));
        ModelOverrides.register(ItemRegistry.AKM.get(), new SimpleModel(SpecialModels.AKM::getModel));
        ModelOverrides.register(ItemRegistry.AKM_CUSTOM.get(), new SimpleModel(SpecialModels.AKM_CUSTOM::getModel));
        ModelOverrides.register(ItemRegistry.SSG_ZERO_EIGHT.get(), new SimpleModel(SpecialModels.SSG_ZERO_EIGHT::getModel));
        ModelOverrides.register(ItemRegistry.DESERT_EAGLE.get(), new SimpleModel(SpecialModels.DESERT_EAGLE::getModel));
        ModelOverrides.register(ItemRegistry.MAC_TEN.get(), new SimpleModel(SpecialModels.MAC_TEN::getModel));
        ModelOverrides.register(ItemRegistry.AWM.get(), new SimpleModel(SpecialModels.AWM::getModel));
        ModelOverrides.register(ItemRegistry.AK_SEVENTY_FOUR.get(), new SimpleModel(SpecialModels.AK_SEVENTY_FOUR::getModel));
        ModelOverrides.register(ItemRegistry.AK_SEVENTY_FOUR_M.get(), new SimpleModel(SpecialModels.AK_SEVENTY_FOUR_M::getModel));
        ModelOverrides.register(ItemRegistry.AKS_SEVENTY_FOUR_U.get(), new SimpleModel(SpecialModels.AKS_SEVENTY_FOUR_U::getModel));
        ModelOverrides.register(ItemRegistry.M_SIXTEEN_A_TWO.get(), new SimpleModel(SpecialModels.M_SIXTEEN_A_TWO::getModel));
        ModelOverrides.register(ItemRegistry.USP.get(), new SimpleModel(SpecialModels.USP::getModel));
        ModelOverrides.register(ItemRegistry.M_ONE_ZERO_ONE_FOUR.get(), new SimpleModel(SpecialModels.M_ONE_ZERO_ONE_FOUR::getModel));
        ModelOverrides.register(ItemRegistry.MP_SEVEN_A_TWO.get(), new SimpleModel(SpecialModels.MP_SEVEN_A_TWO::getModel));
        ModelOverrides.register(ItemRegistry.AK_ONE_TWO.get(), new SimpleModel(SpecialModels.AK_ONE_TWO::getModel));
        ModelOverrides.register(ItemRegistry.AK_ONE_FIVE.get(), new SimpleModel(SpecialModels.AK_ONE_FIVE::getModel));
        ModelOverrides.register(ItemRegistry.AK_ONE_ZERO_FOUR.get(), new SimpleModel(SpecialModels.AK_ONE_ZERO_FOUR::getModel));
        ModelOverrides.register(ItemRegistry.P_TWO_FIVE_ZERO.get(), new SimpleModel(SpecialModels.P_TWO_FIVE_ZERO::getModel));
        ModelOverrides.register(ItemRegistry.M_ONE_NINE_ONE_ONE.get(), new SimpleModel(SpecialModels.M_NINETEEN_ELEVEN::getModel));
        ModelOverrides.register(ItemRegistry.MAGNUM.get(), new SimpleModel(SpecialModels.MAGNUM::getModel));
        ModelOverrides.register(ItemRegistry.SCAR.get(), new SimpleModel(SpecialModels.SCAR::getModel));
        ModelOverrides.register(ItemRegistry.OVER_UNDER.get(), new SimpleModel(SpecialModels.OVER_UNDER::getModel));
        ModelOverrides.register(ItemRegistry.CUSTOM_MAC.get(), new SimpleModel(SpecialModels.CUSTOM_MAC::getModel));
        ModelOverrides.register(ItemRegistry.USAS_TWELVE.get(), new SimpleModel(SpecialModels.USAS_TWELVE::getModel));
        ModelOverrides.register(ItemRegistry.PYTHON.get(), new SimpleModel(SpecialModels.PYTHON::getModel));
        ModelOverrides.register(ItemRegistry.UNICA.get(), new SimpleModel(SpecialModels.UNICA::getModel));
        ModelOverrides.register(ItemRegistry.MP_SEVEN.get(), new SimpleModel(SpecialModels.MP_SEVEN::getModel));
    }
}
