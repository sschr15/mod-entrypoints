package sschr15.fabricmods.modentrypoints.impl;

import net.fabricmc.api.ModInitializer;
import sschr15.fabricmods.modentrypoints.ModInitEntrypoint;

public class ModEntrypointInitializer implements ModInitializer {
    @Override
    public void onInitialize() {
        ModEntrypointCaller.callEntrypoint("mod", ModInitEntrypoint.class);
    }
}
