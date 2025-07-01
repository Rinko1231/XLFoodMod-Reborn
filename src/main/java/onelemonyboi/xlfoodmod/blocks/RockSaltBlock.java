package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class RockSaltBlock extends Block
{
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public RockSaltBlock()
	{
		super(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F).sound(SoundType.STONE));

	}
/*
	@Override
	public int getExpDrop(BlockState state, LevelReader world, BlockPos pos, int fortune, int silktouch)
	{
		int i = 0;
		i = Mth.nextInt(RANDOM, 0, 2);
		return i;
	}*/
}