package kittehmod.bettercraft.block;

import net.minecraft.block.material.Material;

public class BlockNormalSlabDouble extends BlockNormalSlab {
	
	public BlockNormalSlabDouble(Material material) {
		super (material);
	}
	
    @Override
    public final boolean isDouble() {
        return true;
    }
}