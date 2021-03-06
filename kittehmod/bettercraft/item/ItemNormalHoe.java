package kittehmod.bettercraft.item;

import kittehmod.bettercraft.MoreCraft;
import kittehmod.bettercraft.MoreCraftItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemNormalHoe extends ItemHoe
{
	public ToolMaterial material;
	public Item repairMaterial;
	
	public ItemNormalHoe(Item.ToolMaterial material) 
	{
		super(material);
		this.material = material;
	}
	
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
    	if (this.material == MoreCraft.WITHERBONE_T) {
    		return MoreCraft.LEGENDARY;
    	}
    	if (this.material == MoreCraft.BLAZE_T) {
    		return par1ItemStack.isItemEnchanted() ? EnumRarity.RARE : EnumRarity.UNCOMMON;
    	}
        return par1ItemStack.isItemEnchanted() ? EnumRarity.RARE : EnumRarity.COMMON;
    }
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) 
	{
		return repairMaterial == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par1ItemStack.damageItem(0, par3EntityLivingBase);
    	if (par1ItemStack.getItem().equals(MoreCraftItems.WITHERBONE_HOE)) { 
	        ((EntityLivingBase)par2EntityLivingBase).addPotionEffect(new PotionEffect(MobEffects.WITHER, 200));
	        return true;
    	}
    	if (par1ItemStack.getItem().equals(MoreCraftItems.BLAZE_HOE)) { 
            ((EntityLivingBase)par2EntityLivingBase).setFire(4);
            return true;
    	}
    	return true;
    }

}