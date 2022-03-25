package sschr15.fabricmods.modentrypoints.impl;

import net.fabricmc.api.DedicatedServerModInitializer;
import sschr15.fabricmods.modentrypoints.ServerModInitEntrypoint;

public class ModEntrypointServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        ModEntrypointCaller.callEntrypoint("mod-server", ServerModInitEntrypoint.class);
    }
}
