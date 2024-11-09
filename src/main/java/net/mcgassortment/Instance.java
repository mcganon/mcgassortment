package net.mcg;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class Instance {
    public static void init() {
        {
            FuelRegistryEvents.BUILD.register((builder, context) -> {builder.add(MCGItems.TALLOW, 120000 / context.baseSmeltTime());
            });
        }
    }
}
