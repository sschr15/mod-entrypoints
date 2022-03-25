package sschr15.fabricmods.modentrypoints.impl;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import sschr15.fabricmods.modentrypoints.PreInitModEntrypoint;

public class ModEntrypointPreInit implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        ModEntrypointCaller.callEntrypoint("mod-pre", PreInitModEntrypoint.class);
    }
}
