package sschr15.fabricmods.modentrypoints.impl;

import net.fabricmc.api.ClientModInitializer;
import sschr15.fabricmods.modentrypoints.ClientModInitEntrypoint;

public class ModEntrypointClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModEntrypointCaller.callEntrypoint("mod-client", ClientModInitEntrypoint.class);
    }
}
