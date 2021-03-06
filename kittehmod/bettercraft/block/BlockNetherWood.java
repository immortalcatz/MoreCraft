package kittehmod.bettercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockNetherWood extends Block
{
	public BlockNetherWood()
	{
        super(Material.WOOD);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(SoundType.WOOD);
    }
	
    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

}
