package net.mcg;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.mcg.blockentitystuff.blockentities.CrateBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MCGBlockEntities {
    public static final BlockEntityType<CrateBlockEntity> CRATE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MCGAssortment.MOD_ID, "crate_be"),
                    FabricBlockEntityTypeBuilder.create(CrateBlockEntity::new, MCGBlocks.CRATE).build(null));

    public static void registerBlockEntities() {
        MCGAssortment.LOGGER.info("Registering Block Entities for " + MCGAssortment.MOD_ID);
    }
}