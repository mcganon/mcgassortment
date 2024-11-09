package net.mcgassortment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mcgassortment.MCGBlocks;
import net.mcgassortment.MCGItems;
import net.mcgassortment.util.MCGTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MCGItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public MCGItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(MCGBlocks.WHITE_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.WHITE_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.ORANGE_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.ORANGE_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.MAGENTA_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.YELLOW_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.YELLOW_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.LIME_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.LIME_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.PINK_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.PINK_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.GRAY_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.GRAY_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.LIGHT_GRAY_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.CYAN_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.CYAN_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.PURPLE_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.PURPLE_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.BLUE_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.BLUE_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.BROWN_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.BROWN_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.GREEN_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.GREEN_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.RED_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.RED_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.BLACK_CONCRETE_STAIRS.asItem())
                .add(MCGBlocks.BLACK_TERRACOTTA_STAIRS.asItem())
                .add(MCGBlocks.BAMBOO_THATCH_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(MCGBlocks.WHITE_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.WHITE_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.ORANGE_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.ORANGE_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.MAGENTA_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.MAGENTA_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.LIGHT_BLUE_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.YELLOW_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.YELLOW_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.LIME_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.LIME_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.PINK_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.PINK_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.GRAY_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.GRAY_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.LIGHT_GRAY_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.CYAN_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.CYAN_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.PURPLE_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.PURPLE_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.BLUE_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.BLUE_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.BROWN_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.BROWN_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.GREEN_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.GREEN_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.RED_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.RED_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.BLACK_CONCRETE_SLAB.asItem())
                .add(MCGBlocks.BLACK_TERRACOTTA_SLAB.asItem())
                .add(MCGBlocks.BAMBOO_THATCH_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(MCGBlocks.WHITE_CONCRETE_WALL.asItem())
                .add(MCGBlocks.WHITE_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.ORANGE_CONCRETE_WALL.asItem())
                .add(MCGBlocks.ORANGE_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.MAGENTA_CONCRETE_WALL.asItem())
                .add(MCGBlocks.MAGENTA_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.LIGHT_BLUE_CONCRETE_WALL.asItem())
                .add(MCGBlocks.LIGHT_BLUE_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.YELLOW_CONCRETE_WALL.asItem())
                .add(MCGBlocks.YELLOW_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.LIME_CONCRETE_WALL.asItem())
                .add(MCGBlocks.LIME_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.PINK_CONCRETE_WALL.asItem())
                .add(MCGBlocks.PINK_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.GRAY_CONCRETE_WALL.asItem())
                .add(MCGBlocks.GRAY_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.LIGHT_GRAY_CONCRETE_WALL.asItem())
                .add(MCGBlocks.LIGHT_GRAY_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.CYAN_CONCRETE_WALL.asItem())
                .add(MCGBlocks.CYAN_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.PURPLE_CONCRETE_WALL.asItem())
                .add(MCGBlocks.PURPLE_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.BLUE_CONCRETE_WALL.asItem())
                .add(MCGBlocks.BLUE_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.BROWN_CONCRETE_WALL.asItem())
                .add(MCGBlocks.BROWN_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.GREEN_CONCRETE_WALL.asItem())
                .add(MCGBlocks.GREEN_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.RED_CONCRETE_WALL.asItem())
                .add(MCGBlocks.RED_TERRACOTTA_WALL.asItem())
                .add(MCGBlocks.BLACK_CONCRETE_WALL.asItem())
                .add(MCGBlocks.BLACK_TERRACOTTA_WALL.asItem());

        getOrCreateTagBuilder(MCGTags.Items.CANDLE_WAX)
                .add(Items.HONEYCOMB)
                .add(MCGItems.TALLOW);
    }
}