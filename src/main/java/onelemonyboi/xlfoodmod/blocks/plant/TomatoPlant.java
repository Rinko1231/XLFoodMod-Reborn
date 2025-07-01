package onelemonyboi.xlfoodmod.blocks.plant;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


public class TomatoPlant extends CropBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    public TomatoPlant()
    {
        super(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks().sound(SoundType.CROP));
    }
    
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos)
    {
    	return state.getBlock() instanceof FarmBlock;
    }

  	protected ItemLike getBaseSeedId()
  	{
   		return ItemList.TOMATO_SEEDS.get();
  	}

  	public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state)
  	{
  		return new ItemStack(this.getBaseSeedId());
	}
  	
}
