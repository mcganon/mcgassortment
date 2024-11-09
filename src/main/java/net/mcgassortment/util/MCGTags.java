package net.mcg.util;

import net.mcg.MCGAssortment;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MCGTags {
    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MCGAssortment.MOD_ID, name));
    }
    public static class Items {
        public static final TagKey<Item> CANDLE_WAX = createTag("candle_wax");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MCGAssortment.MOD_ID, name));
        }
    }
}
