package onelemonyboi.xlfoodmod.blocks.plant;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class VanillaFlowerBlock extends BushBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public VanillaFlowerBlock()
	{
		super(BlockBehaviour.Properties.copy(Blocks.WHEAT).strength(0.0F).noCollission().sound(SoundType.GRASS));
	}
	
	public Block.OffsetType getOffsetType()
	{
		return Block.OffsetType.XZ;
	}

}
