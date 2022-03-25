package sschr15.fabricmods.modentrypoints.impl;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import sschr15.fabricmods.modentrypoints.ModEntrypoint;

import java.util.Collection;

public class ModEntrypointCaller {
    private static final Collection<ModContainer> MODS = FabricLoader.getInstance().getAllMods();

    public static void callEntrypoint(String entrypointPrefix, Class<? extends ModEntrypoint> entrypointClass) {
        for (ModContainer mod : MODS) {
            String modId = mod.getMetadata().getId();
            String entrypointName = entrypointPrefix + ':' + modId;

            Version version = mod.getMetadata().getVersion();

            FabricLoader.getInstance().getEntrypoints(entrypointName, entrypointClass)
                    .forEach(entrypoint -> entrypoint.onInitialize(modId, version));
        }
    }
}
