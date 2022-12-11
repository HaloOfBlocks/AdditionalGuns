package haloofblocks.additionalguns.client;

import haloofblocks.additionalguns.client.render.gun.model.KobraScopeModel;
import haloofblocks.additionalguns.client.render.gun.model.ZerkaloScopeModel;
import haloofblocks.additionalguns.core.registry.ItemRegistry;
import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
//import com.mrcrayfish.guns.client.render.gun.model.LongScopeModel;
import com.mrcrayfish.guns.client.render.gun.model.ShortScopeModel;

public class ClientHandler {
    public static void registerModelOverrides() {
        ModelOverrides.register(ItemRegistry.HOLO_SCOPE.get(), new ShortScopeModel());
        ModelOverrides.register(ItemRegistry.ZERKALO_SCOPE.get(), new ZerkaloScopeModel());
        ModelOverrides.register(ItemRegistry.KOBRA_SCOPE.get(), new KobraScopeModel());
        //ModelOverrides.register(ItemRegistry.ULTRA_LONG_SCOPE.get(), new LongScopeModel());
    }
}
