package net.mcg.blockentitystuff.blocks;

import com.mojang.serialization.MapCodec;
import net.mcg.blockentitystuff.blockentities.CrateBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CrateBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final IntProperty PRODUCE;
    private static final VoxelShape SHAPE1 =
            Block.createCuboidShape(2, 0, 2, 14, 1, 14);
    private static final VoxelShape SHAPE2 =
            Block.createCuboidShape(2, 0, 2, 14, 8, 14);
    private static final VoxelShape SHAPE3 =
            Block.createCuboidShape(1, 0, 1, 2, 10, 15);
    private static final VoxelShape SHAPE4 =
            Block.createCuboidShape(14, 0, 1, 15, 10, 15);
    private static final VoxelShape SHAPE5 =
            Block.createCuboidShape(2, 0, 1, 14, 10, 2);
    private static final VoxelShape SHAPE6 =
            Block.createCuboidShape(2, 0, 14, 14, 10, 15);
    private static final VoxelShape EMPTY_SHAPE = VoxelShapes.union(SHAPE1, SHAPE3, SHAPE4,SHAPE5,SHAPE6);
    private static final VoxelShape FULL_SHAPE = VoxelShapes.union(SHAPE2, SHAPE3, SHAPE4,SHAPE5,SHAPE6);
    protected static final VoxelShape[] PRODUCE_SHAPE = new VoxelShape[]{
            EMPTY_SHAPE,
            FULL_SHAPE,
            FULL_SHAPE,
            FULL_SHAPE,
    };
    public static final MapCodec<CrateBlock> CODEC = CrateBlock.createCodec(CrateBlock::new);

    public CrateBlock(Settings settings) {
        super(settings);
        this.setDefaultState(((BlockState)this.stateManager.getDefaultState()).with(PRODUCE, 0));
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return PRODUCE_SHAPE[state.get(PRODUCE)];
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrateBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(blockEntity instanceof CrateBlockEntity) {
                ItemScatterer.spawn(world, pos, ((CrateBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(world.getBlockEntity(pos) instanceof CrateBlockEntity CrateBlockEntity) {
            if(CrateBlockEntity.isEmpty() && stack.isOf(Items.APPLE) && !player.isSneaking()) {
                CrateBlockEntity.setStack(0, stack);
                world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                stack.decrement(1);
                CrateBlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
                world.setBlockState(pos, (BlockState)state.with(PRODUCE, 1));
            }
            else {
                if(CrateBlockEntity.isEmpty() && stack.isOf(Items.POTATO) && !player.isSneaking()) {
                    CrateBlockEntity.setStack(0, stack);
                    world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                    stack.decrement(1);
                    CrateBlockEntity.markDirty();
                    world.updateListeners(pos, state, state, 0);
                    world.setBlockState(pos, (BlockState)state.with(PRODUCE, 2));
                }
                else {
                    if(CrateBlockEntity.isEmpty() && stack.isOf(Items.CARROT) && !player.isSneaking()) {
                        CrateBlockEntity.setStack(0, stack);
                        world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                        stack.decrement(1);
                        CrateBlockEntity.markDirty();
                        world.updateListeners(pos, state, state, 0);
                        world.setBlockState(pos, (BlockState)state.with(PRODUCE, 3));
                    }
                    else {
                        if(stack.isEmpty() && !player.isSneaking()) {
                            ItemStack stackInCrate = CrateBlockEntity.getStack(0);
                            player.setStackInHand(Hand.MAIN_HAND, stackInCrate);
                            world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                            CrateBlockEntity.clear();
                            world.setBlockState(pos, (BlockState)state.with(PRODUCE, 0));
                            CrateBlockEntity.markDirty();
                            world.updateListeners(pos, state, state, 0);
                        }
                    }
                }
            }
        }
        return ActionResult.SUCCESS;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(PRODUCE);
    }

    static {
        PRODUCE = IntProperty.of("produce", 0, 3);
        }

    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}