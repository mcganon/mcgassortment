package net.mcgassortment;

import net.mcgassortment.blockentitystuff.blocks.CrateBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.*;

public class MCGBlocks {
    public static final Block WHITE_CONCRETE_STAIRS = registerStairsBlock("white_concrete_stairs", WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(WHITE_CONCRETE));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerStairsBlock("white_terracotta_stairs", WHITE_TERRACOTTA);
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(WHITE_TERRACOTTA));
    
    public static final Block ORANGE_CONCRETE_STAIRS = registerStairsBlock("orange_concrete_stairs", ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(ORANGE_CONCRETE));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerStairsBlock("orange_terracotta_stairs", ORANGE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(ORANGE_TERRACOTTA));
    
    public static final Block MAGENTA_CONCRETE_STAIRS = registerStairsBlock("magenta_concrete_stairs", MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(MAGENTA_CONCRETE));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerStairsBlock("magenta_terracotta_stairs", MAGENTA_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(MAGENTA_TERRACOTTA));
    
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerStairsBlock("light_blue_concrete_stairs", LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerStairsBlock("light_blue_terracotta_stairs", LIGHT_BLUE_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_BLUE_TERRACOTTA));
    
    public static final Block YELLOW_CONCRETE_STAIRS = registerStairsBlock("yellow_concrete_stairs", YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(YELLOW_CONCRETE));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerStairsBlock("yellow_terracotta_stairs", YELLOW_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(YELLOW_TERRACOTTA));
    
    public static final Block LIME_CONCRETE_STAIRS = registerStairsBlock("lime_concrete_stairs", LIME_CONCRETE);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIME_CONCRETE));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(LIME_CONCRETE));
    public static final Block LIME_TERRACOTTA_STAIRS = registerStairsBlock("lime_terracotta_stairs", LIME_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(LIME_TERRACOTTA));
    
    public static final Block PINK_CONCRETE_STAIRS = registerStairsBlock("pink_concrete_stairs", PINK_CONCRETE);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(PINK_CONCRETE));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(PINK_CONCRETE));
    public static final Block PINK_TERRACOTTA_STAIRS = registerStairsBlock("pink_terracotta_stairs", PINK_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(PINK_TERRACOTTA));
    
    public static final Block GRAY_CONCRETE_STAIRS = registerStairsBlock("gray_concrete_stairs", GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(GRAY_CONCRETE));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerStairsBlock("gray_terracotta_stairs", GRAY_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(GRAY_TERRACOTTA));
    
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerStairsBlock("light_gray_concrete_stairs", LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerStairsBlock("light_gray_terracotta_stairs", LIGHT_GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_GRAY_TERRACOTTA));
    
    public static final Block CYAN_CONCRETE_STAIRS = registerStairsBlock("cyan_concrete_stairs", CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(CYAN_CONCRETE));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerStairsBlock("cyan_terracotta_stairs", CYAN_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(CYAN_TERRACOTTA));
    
    public static final Block PURPLE_CONCRETE_STAIRS = registerStairsBlock("purple_concrete_stairs", PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(PURPLE_CONCRETE));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerStairsBlock("purple_terracotta_stairs", PURPLE_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(PURPLE_TERRACOTTA));
    
    public static final Block BLUE_CONCRETE_STAIRS = registerStairsBlock("blue_concrete_stairs", BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(BLUE_CONCRETE));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerStairsBlock("blue_terracotta_stairs", BLUE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(BLUE_TERRACOTTA));
    
    public static final Block BROWN_CONCRETE_STAIRS = registerStairsBlock("brown_concrete_stairs", BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(BROWN_CONCRETE));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerStairsBlock("brown_terracotta_stairs", BROWN_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(BROWN_TERRACOTTA));
    
    public static final Block GREEN_CONCRETE_STAIRS = registerStairsBlock("green_concrete_stairs", GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(GREEN_CONCRETE));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerStairsBlock("green_terracotta_stairs", GREEN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(GREEN_TERRACOTTA));
    
    public static final Block RED_CONCRETE_STAIRS = registerStairsBlock("red_concrete_stairs", RED_CONCRETE);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(RED_CONCRETE));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(RED_CONCRETE));
    public static final Block RED_TERRACOTTA_STAIRS = registerStairsBlock("red_terracotta_stairs", RED_TERRACOTTA);
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(RED_TERRACOTTA));
    
    public static final Block BLACK_CONCRETE_STAIRS = registerStairsBlock("black_concrete_stairs", BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(BLACK_CONCRETE));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerStairsBlock("black_terracotta_stairs", BLACK_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(BLACK_TERRACOTTA));

    public static final Block BORDERLESS_GLASS = registerBlock("borderless_glass", Block::new, AbstractBlock.Settings.copy(Blocks.GLASS));
    public static final Block BORDERLESS_GLASS_PANE = registerBlock("borderless_glass_pane", PaneBlock::new, AbstractBlock.Settings.copy(Blocks.GLASS_PANE));
    public static final Block BORDERLESS_WHITE_STAINED_GLASS = registerStainedGlassBlock("borderless_white_stained_glass", DyeColor.WHITE, WHITE_STAINED_GLASS);
    public static final Block BORDERLESS_WHITE_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_white_stained_glass_pane", DyeColor.WHITE, WHITE_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_ORANGE_STAINED_GLASS = registerStainedGlassBlock("borderless_orange_stained_glass", DyeColor.ORANGE, ORANGE_STAINED_GLASS);
    public static final Block BORDERLESS_ORANGE_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_orange_stained_glass_pane", DyeColor.ORANGE, ORANGE_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_MAGENTA_STAINED_GLASS = registerStainedGlassBlock("borderless_magenta_stained_glass", DyeColor.MAGENTA, MAGENTA_STAINED_GLASS);
    public static final Block BORDERLESS_MAGENTA_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_magenta_stained_glass_pane", DyeColor.MAGENTA, MAGENTA_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_LIGHT_BLUE_STAINED_GLASS = registerStainedGlassBlock("borderless_light_blue_stained_glass", DyeColor.LIGHT_BLUE, LIGHT_BLUE_STAINED_GLASS);
    public static final Block BORDERLESS_LIGHT_BLUE_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_light_blue_stained_glass_pane", DyeColor.LIGHT_BLUE, LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_YELLOW_STAINED_GLASS = registerStainedGlassBlock("borderless_yellow_stained_glass", DyeColor.YELLOW, YELLOW_STAINED_GLASS);
    public static final Block BORDERLESS_YELLOW_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_yellow_stained_glass_pane", DyeColor.YELLOW, YELLOW_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_LIME_STAINED_GLASS = registerStainedGlassBlock("borderless_lime_stained_glass", DyeColor.LIME, LIME_STAINED_GLASS);
    public static final Block BORDERLESS_LIME_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_lime_stained_glass_pane", DyeColor.LIME, LIME_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_PINK_STAINED_GLASS = registerStainedGlassBlock("borderless_pink_stained_glass", DyeColor.PINK, PINK_STAINED_GLASS);
    public static final Block BORDERLESS_PINK_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_pink_stained_glass_pane", DyeColor.PINK, PINK_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_GRAY_STAINED_GLASS = registerStainedGlassBlock("borderless_gray_stained_glass", DyeColor.GRAY, GRAY_STAINED_GLASS);
    public static final Block BORDERLESS_GRAY_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_gray_stained_glass_pane", DyeColor.GRAY, GRAY_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_LIGHT_GRAY_STAINED_GLASS = registerStainedGlassBlock("borderless_light_gray_stained_glass", DyeColor.LIGHT_GRAY, LIGHT_GRAY_STAINED_GLASS);
    public static final Block BORDERLESS_LIGHT_GRAY_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_light_gray_stained_glass_pane", DyeColor.LIGHT_GRAY, LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_CYAN_STAINED_GLASS = registerStainedGlassBlock("borderless_cyan_stained_glass", DyeColor.CYAN, CYAN_STAINED_GLASS);
    public static final Block BORDERLESS_CYAN_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_cyan_stained_glass_pane", DyeColor.CYAN, CYAN_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_PURPLE_STAINED_GLASS = registerStainedGlassBlock("borderless_purple_stained_glass", DyeColor.PURPLE, PURPLE_STAINED_GLASS);
    public static final Block BORDERLESS_PURPLE_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_purple_stained_glass_pane", DyeColor.PURPLE, PURPLE_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_BLUE_STAINED_GLASS = registerStainedGlassBlock("borderless_blue_stained_glass", DyeColor.BLUE, BLUE_STAINED_GLASS);
    public static final Block BORDERLESS_BLUE_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_blue_stained_glass_pane", DyeColor.BLUE, BLUE_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_BROWN_STAINED_GLASS = registerStainedGlassBlock("borderless_brown_stained_glass", DyeColor.BROWN, BROWN_STAINED_GLASS);
    public static final Block BORDERLESS_BROWN_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_brown_stained_glass_pane", DyeColor.BROWN, BROWN_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_GREEN_STAINED_GLASS = registerStainedGlassBlock("borderless_green_stained_glass", DyeColor.GREEN, GREEN_STAINED_GLASS);
    public static final Block BORDERLESS_GREEN_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_green_stained_glass_pane", DyeColor.GREEN, GREEN_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_RED_STAINED_GLASS = registerStainedGlassBlock("borderless_red_stained_glass", DyeColor.RED, RED_STAINED_GLASS);
    public static final Block BORDERLESS_RED_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_red_stained_glass_pane", DyeColor.RED, RED_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_BLACK_STAINED_GLASS = registerStainedGlassBlock("borderless_black_stained_glass", DyeColor.BLACK, BLACK_STAINED_GLASS);
    public static final Block BORDERLESS_BLACK_STAINED_GLASS_PANE = registerStainedGlassPaneBlock("borderless_black_stained_glass_pane", DyeColor.BLACK, BLACK_STAINED_GLASS_PANE);
    public static final Block BORDERLESS_TINTED_GLASS = registerBlock("borderless_tinted_glass", TintedGlassBlock::new, AbstractBlock.Settings.copy(TINTED_GLASS));

    public static final Block RAW_BEEF_BLOCK = registerBlock("raw_beef_block",
            Block::new, AbstractBlock.Settings.copy(NETHER_WART_BLOCK).sounds(BlockSoundGroup.HONEY));
    public static final Block RAW_PORK_BLOCK = registerBlock("raw_pork_block",
            Block::new, AbstractBlock.Settings.copy(NETHER_WART_BLOCK).sounds(BlockSoundGroup.HONEY));
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            Block::new, AbstractBlock.Settings.copy(NETHER_WART_BLOCK).sounds(BlockSoundGroup.HONEY));

    public static final Block BAMBOO_THATCH = registerBlock("bamboo_thatch", PillarBlock::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH_STAIRS = registerStairsBlock("bamboo_thatch_stairs", BAMBOO_THATCH);
    public static final Block BAMBOO_THATCH_SLAB = registerBlock("bamboo_thatch_slab", DirectionalSlab::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH_RUG = registerBlock("bamboo_thatch_rug", DirectionalCarpet::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));

    public static final Block CRATE = registerBlock("crate",
            CrateBlock::new, AbstractBlock.Settings.copy(OAK_PLANKS));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return registerBlock(name, true, factory, settings);
    }
    private static Block registerBlock(String name, boolean createItem, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block); }
        return block;
    }
    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MCGAssortment.MOD_ID, name));
    }
    private static Block registerStairsBlock(String name, Block base) {
        return registerBlock(name, settings -> new StairsBlock(base.getDefaultState(), settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerStainedGlassBlock(String name, DyeColor colour, Block base) {
        return registerBlock(name, settings -> new StainedGlassBlock(colour, settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerStainedGlassPaneBlock(String name, DyeColor colour, Block base) {
        return registerBlock(name, settings -> new StainedGlassPaneBlock(colour, settings), AbstractBlock.Settings.copy(base));
    }
    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(MCGAssortment.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Registry.register(Registries.ITEM, key, new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(key)));
    }
    public static void registerModBlocks() {
        MCGAssortment.LOGGER.info("Registering blocks for " + MCGAssortment.MOD_ID);
    }
}
