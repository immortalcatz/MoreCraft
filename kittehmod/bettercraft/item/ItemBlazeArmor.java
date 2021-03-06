package kittehmod.bettercraft.item;

import kittehmod.bettercraft.MoreCraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlazeArmor extends ItemNormalArmor
{
	public String armorNamePrefix;
	public ArmorMaterial material;
	public Item repairMaterial;

	public ItemBlazeArmor(ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
	    super(materialIn, renderIndexIn, equipmentSlotIn);
	}
	
    public ArmorMaterial getArmorMaterial(ItemStack par1ItemStack)
    {
    	return MoreCraft.BLAZE_A;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		//TODO: Update this
		/*if (player.getArmor player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(MoreCraftItems.blaze_boots) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(MoreCraftItems.blaze_leggings) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(MoreCraftItems.blaze_chestplate) && player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(MoreCraftItems.blaze_helmet)) {
			 player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 40));
		}*/
	}
    
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.UNCOMMON;
    }
    
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) 
	{
		return repairMaterial == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
    
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {

		if (slot == 2)//(stack.toString().contains("legs") || stack.toString().contains("leggings") || stack.toString().contains("pants")) 
		{
			return "bettercraft:textures/models/armor/" + armorNamePrefix + "_layer_2.png";
		}
		else
		{
			return "bettercraft:textures/models/armor/" + armorNamePrefix + "_layer_1.png";
		}
	}
}