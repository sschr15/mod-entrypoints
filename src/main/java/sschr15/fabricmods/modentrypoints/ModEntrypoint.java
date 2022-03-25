package sschr15.fabricmods.modentrypoints;

import net.fabricmc.loader.api.Version;

/**
 * The root interface to be implemented for mod entrypoints.
 * Implement a sub-interface and guide Fabric by adding a line
 * in the {@code fabric.mod.json} file.
 */
public interface ModEntrypoint {
    void onInitialize(String modId, Version version);
}
