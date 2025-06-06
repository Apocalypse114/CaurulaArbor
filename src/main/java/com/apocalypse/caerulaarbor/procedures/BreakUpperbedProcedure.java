package com.apocalypse.caerulaarbor.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class BreakUpperbedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.destroyBlock(BlockPos.containing(x + (new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))).getStepX(), y + (new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))).getStepY(), z + (new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))).getStepZ()), false);
    }
}
