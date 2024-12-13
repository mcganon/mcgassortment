package net.mcgassortment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcgassortment.MCGAssortment;
import net.mcgassortment.MCGBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class MCGRecipeGenerator extends FabricRecipeProvider {
    public MCGRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLUE_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLUE_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BROWN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BROWN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, MCGBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA, 1);

                offerConcreteStairsRecipe(MCGBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
                offerConcreteStairsRecipe(MCGBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
                offerConcreteSlabRecipe(MCGBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
                offerConcreteWallRecipe(MCGBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
                offerTerracottaStairsRecipe(MCGBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);
                offerTerracottaSlabRecipe(MCGBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);
                offerTerracottaWallRecipe(MCGBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BORDERLESS_GLASS)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.GLASS)
                        .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', MCGBlocks.BORDERLESS_GLASS)
                        .criterion(hasItem(MCGBlocks.BORDERLESS_GLASS), conditionsFromItem(MCGBlocks.BORDERLESS_GLASS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BORDERLESS_GLASS_PANE)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.GLASS_PANE)
                        .criterion(hasItem(Items.GLASS_PANE), conditionsFromItem(Items.GLASS_PANE))
                        .offerTo(exporter, String.valueOf(Identifier.of(MCGAssortment.MOD_ID, "borderless_glass_pane_1")));
                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BORDERLESS_GLASS_PANE)
                        .pattern("###")
                        .pattern("###")
                        .input('#', MCGBlocks.BORDERLESS_GLASS)
                        .criterion(hasItem(MCGBlocks.BORDERLESS_GLASS), conditionsFromItem(MCGBlocks.BORDERLESS_GLASS))
                        .offerTo(exporter, String.valueOf(Identifier.of(MCGAssortment.MOD_ID, "borderless_glass_pane_2")));
                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS_PANE)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', MCGBlocks.BORDERLESS_GLASS_PANE)
                        .criterion(hasItem(MCGBlocks.BORDERLESS_GLASS_PANE), conditionsFromItem(MCGBlocks.BORDERLESS_GLASS_PANE))
                        .offerTo(exporter);

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS, Blocks.WHITE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_white_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS, Items.WHITE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_white_stained_glass_2"));
                offerGlassRecipe(Blocks.WHITE_STAINED_GLASS, MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "white_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS_PANE, Blocks.WHITE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_white_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_white_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS_PANE, Items.WHITE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_white_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.WHITE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_WHITE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "white_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_orange_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS, Items.ORANGE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_orange_stained_glass_2"));
                offerGlassRecipe(Blocks.ORANGE_STAINED_GLASS, MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "orange_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS_PANE, Blocks.ORANGE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_orange_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_orange_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS_PANE, Items.ORANGE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_orange_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.ORANGE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_ORANGE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "orange_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_magenta_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS, Items.MAGENTA_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_magenta_stained_glass_2"));
                offerGlassRecipe(Blocks.MAGENTA_STAINED_GLASS, MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "magenta_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS_PANE, Blocks.MAGENTA_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_magenta_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_magenta_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS_PANE, Items.MAGENTA_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_magenta_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.MAGENTA_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_MAGENTA_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "magenta_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_blue_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS, Items.LIGHT_BLUE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_blue_stained_glass_2"));
                offerGlassRecipe(Blocks.LIGHT_BLUE_STAINED_GLASS, MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "light_blue_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS_PANE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_blue_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_blue_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS_PANE, Items.LIGHT_BLUE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_blue_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_LIGHT_BLUE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "light_blue_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_yellow_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS, Items.YELLOW_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_yellow_stained_glass_2"));
                offerGlassRecipe(Blocks.YELLOW_STAINED_GLASS, MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "yellow_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS_PANE, Blocks.YELLOW_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_yellow_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_yellow_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS_PANE, Items.YELLOW_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_yellow_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.YELLOW_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_YELLOW_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "yellow_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_LIME_STAINED_GLASS, Blocks.LIME_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_lime_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_LIME_STAINED_GLASS, Items.LIME_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_lime_stained_glass_2"));
                offerGlassRecipe(Blocks.LIME_STAINED_GLASS, MCGBlocks.BORDERLESS_LIME_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "lime_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_LIME_STAINED_GLASS_PANE, Blocks.LIME_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_lime_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_LIME_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_LIME_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_lime_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_LIME_STAINED_GLASS_PANE, Items.LIME_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_lime_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.LIME_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_LIME_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "lime_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_PINK_STAINED_GLASS, Blocks.PINK_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_pink_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_PINK_STAINED_GLASS, Items.PINK_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_pink_stained_glass_2"));
                offerGlassRecipe(Blocks.PINK_STAINED_GLASS, MCGBlocks.BORDERLESS_PINK_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "pink_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_PINK_STAINED_GLASS_PANE, Blocks.PINK_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_pink_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_PINK_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_PINK_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_pink_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_PINK_STAINED_GLASS_PANE, Items.PINK_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_pink_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.PINK_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_PINK_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "pink_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_gray_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS, Items.GRAY_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_gray_stained_glass_2"));
                offerGlassRecipe(Blocks.GRAY_STAINED_GLASS, MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "gray_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS_PANE, Blocks.GRAY_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_gray_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_gray_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS_PANE, Items.GRAY_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_gray_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.GRAY_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_GRAY_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "gray_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_gray_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS, Items.LIGHT_GRAY_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_gray_stained_glass_2"));
                offerGlassRecipe(Blocks.LIGHT_GRAY_STAINED_GLASS, MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "light_gray_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS_PANE, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_gray_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_gray_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS_PANE, Items.LIGHT_GRAY_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_light_gray_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_LIGHT_GRAY_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "light_gray_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_cyan_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS, Items.CYAN_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_cyan_stained_glass_2"));
                offerGlassRecipe(Blocks.CYAN_STAINED_GLASS, MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "cyan_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS_PANE, Blocks.CYAN_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_cyan_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_cyan_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS_PANE, Items.CYAN_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_cyan_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.CYAN_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_CYAN_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "cyan_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_purple_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS, Items.PURPLE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_purple_stained_glass_2"));
                offerGlassRecipe(Blocks.PURPLE_STAINED_GLASS, MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "purple_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS_PANE, Blocks.PURPLE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_purple_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_purple_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS_PANE, Items.PURPLE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_purple_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.PURPLE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_PURPLE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "purple_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_blue_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS, Items.BLUE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_blue_stained_glass_2"));
                offerGlassRecipe(Blocks.BLUE_STAINED_GLASS, MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "blue_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS_PANE, Blocks.BLUE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_blue_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_blue_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS_PANE, Items.BLUE_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_blue_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.BLUE_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_BLUE_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "blue_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_brown_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS, Items.BROWN_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_brown_stained_glass_2"));
                offerGlassRecipe(Blocks.BROWN_STAINED_GLASS, MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "brown_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS_PANE, Blocks.BROWN_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_brown_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_brown_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS_PANE, Items.BROWN_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_brown_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.BROWN_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_BROWN_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "brown_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_green_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS, Items.GREEN_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_green_stained_glass_2"));
                offerGlassRecipe(Blocks.GREEN_STAINED_GLASS, MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "green_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS_PANE, Blocks.GREEN_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_green_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_green_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS_PANE, Items.GREEN_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_green_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.GREEN_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_GREEN_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "green_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_RED_STAINED_GLASS, Blocks.RED_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_red_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_RED_STAINED_GLASS, Items.RED_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_red_stained_glass_2"));
                offerGlassRecipe(Blocks.RED_STAINED_GLASS, MCGBlocks.BORDERLESS_RED_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "red_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_RED_STAINED_GLASS_PANE, Blocks.RED_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_red_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_RED_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_RED_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_red_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_RED_STAINED_GLASS_PANE, Items.RED_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_red_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.RED_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_RED_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "red_stained_glass_pane"));

                offerBorderlessGlassRecipe(MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_black_stained_glass_1"));
                offerBorderlessGlassDyeingRecipe(MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS, Items.BLACK_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_black_stained_glass_2"));
                offerGlassRecipe(Blocks.BLACK_STAINED_GLASS, MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "black_stained_glass"));
                offerBorderlessGlassPaneRecipe(MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS_PANE, Blocks.BLACK_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "borderless_black_stained_glass_pane_1"));
                offerBorderlessGlassPaneRecipeFromGlass(MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS, Identifier.of(MCGAssortment.MOD_ID, "borderless_black_stained_glass_pane_2"));
                offerBorderlessGlassPaneDyeingRecipe(MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS_PANE, Items.BLACK_DYE, Identifier.of(MCGAssortment.MOD_ID, "borderless_black_stained_glass_pane_3"));
                offerGlassPaneRecipe(Blocks.BLACK_STAINED_GLASS_PANE, MCGBlocks.BORDERLESS_BLACK_STAINED_GLASS_PANE, Identifier.of(MCGAssortment.MOD_ID, "black_stained_glass_pane"));

                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BORDERLESS_TINTED_GLASS)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.TINTED_GLASS)
                        .criterion(hasItem(Items.TINTED_GLASS), conditionsFromItem(Items.TINTED_GLASS))
                        .offerTo(exporter, String.valueOf(Identifier.of(MCGAssortment.MOD_ID, "borderless_tinted_glass_1")));
                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', MCGBlocks.BORDERLESS_TINTED_GLASS)
                        .criterion(hasItem(MCGBlocks.BORDERLESS_TINTED_GLASS), conditionsFromItem(MCGBlocks.BORDERLESS_TINTED_GLASS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BORDERLESS_TINTED_GLASS)
                        .pattern(" # ")
                        .pattern("#X#")
                        .pattern(" # ")
                        .input('#', MCGBlocks.BORDERLESS_GLASS)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter, String.valueOf(Identifier.of(MCGAssortment.MOD_ID, "borderless_tinted_glass_2")));

                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.BEEF, RecipeCategory.MISC, MCGBlocks.RAW_BEEF_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.PORKCHOP, RecipeCategory.MISC, MCGBlocks.RAW_PORK_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.ROTTEN_FLESH, RecipeCategory.MISC, MCGBlocks.ROTTEN_FLESH_BLOCK);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BAMBOO_THATCH, 9)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.STRIPPED_BAMBOO_BLOCK)
                        .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                        .offerTo(exporter);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BAMBOO_THATCH_STAIRS, MCGBlocks.BAMBOO_THATCH);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BAMBOO_THATCH_SLAB, MCGBlocks.BAMBOO_THATCH);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MCGBlocks.BAMBOO_THATCH_RUG, 3)
                        .pattern("##")
                        .input('#', MCGBlocks.BAMBOO_THATCH)
                        .criterion(hasItem(MCGBlocks.BAMBOO_THATCH), conditionsFromItem(MCGBlocks.BAMBOO_THATCH))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, MCGBlocks.CRATE, 1)
                        .pattern("# #")
                        .pattern("SSS")
                        .input('#', Items.STICK)
                        .input('S', ItemTags.PLANKS)
                        .criterion("has_planks_tag", conditionsFromTag(ItemTags.PLANKS))
                        .offerTo(exporter);
            }

            private void offerStairsRecipe(RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
                createShaped(Category, output, 4)
                        .input('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerConcreteStairsRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("concrete_stairs")
                        .input('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerConcreteSlabRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("concrete_slabs")
                        .input('#', input)
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerConcreteWallRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("concrete_walls")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerTerracottaStairsRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("terracotta_stairs")
                        .input('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerTerracottaSlabRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("terracotta_slabs")
                        .input('#', input)
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerTerracottaWallRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("terracotta_walls")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerBorderlessGlassRecipe(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 9)
                        .group("borderless_stained_glass")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }

            private void offerBorderlessGlassDyeingRecipe(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                        .group("borderless_stained_glass")
                        .input('#', MCGBlocks.BORDERLESS_GLASS)
                        .input('X', input)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }

            private void offerGlassRecipe(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 9)
                        .group("stained_glass")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }

            private void offerBorderlessGlassPaneRecipe(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 9)
                        .group("borderless_glass_panes")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }

            private void offerBorderlessGlassPaneRecipeFromGlass(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 16)
                        .group("borderless_glass_panes")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }

            private void offerBorderlessGlassPaneDyeingRecipe(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                        .group("borderless_glass_panes")
                        .input('#', MCGBlocks.BORDERLESS_GLASS_PANE)
                        .input('X', input)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }

            private void offerGlassPaneRecipe(ItemConvertible output, ItemConvertible input, Identifier identifier) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 9)
                        .group("stained_glass_panes")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, String.valueOf(identifier));
            }
        };
    }

    @Override
    public String getName() {
        return "/mcg/ Assortment Recipes";
    }
}