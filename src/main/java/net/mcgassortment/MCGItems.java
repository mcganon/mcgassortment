package net.mcg;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MCGItems {
    public static final Item TALLOW =registerItem("tallow", settings -> new Item(settings.maxCount(64)));


    public static void registerModItems() {
        MCGAssortment.LOGGER.info("Registering items for " + MCGAssortment.MOD_ID);
    }
    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(MCGAssortment.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name))));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MCGAssortment.MOD_ID, name));
    }
}
