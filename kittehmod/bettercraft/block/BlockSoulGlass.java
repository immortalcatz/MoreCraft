package kittehmod.bettercraft.block;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSoulGlass extends BlockGlass
{
    public BlockSoulGlass(Material par2Material, boolean par3)
    {
        super(par2Material, par3);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(SoundType.GLASS);
    }

}
