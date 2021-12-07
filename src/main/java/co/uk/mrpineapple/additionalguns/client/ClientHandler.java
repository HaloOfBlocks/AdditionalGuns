package co.uk.mrpineapple.additionalguns.client;

import co.uk.mrpineapple.additionalguns.client.render.gun.model.ZerkaloScopeModel;
import co.uk.mrpineapple.additionalguns.core.registry.ItemRegistry;
import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
//import com.mrcrayfish.guns.client.render.gun.model.LongScopeModel;
import com.mrcrayfish.guns.client.render.gun.model.ShortScopeModel;

public class ClientHandler {
    public static void registerModelOverrides() {
        ModelOverrides.register(ItemRegistry.HOLO_SCOPE.get(), new ShortScopeModel());
        ModelOverrides.register(ItemRegistry.ZERKALO_SCOPE.get(), new ZerkaloScopeModel());
        //ModelOverrides.register(ItemRegistry.EXTRA_LONG_SCOPE.get(), new LongScopeModel());
    }
}
