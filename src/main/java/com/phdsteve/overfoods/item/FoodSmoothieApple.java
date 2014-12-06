package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodSmoothieApple extends ItemFood
{
	public FoodSmoothieApple(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("SmoothieApple");
		this.setTextureName("overfoods:SmoothieApple");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack smoothieAppleStack = new ItemStack(ItemRegistry.SmoothieApple);
	
	public EnumAction getItemUseAction(ItemStack smoothieAppleStack)
	    {
	        return EnumAction.drink;
	    }
}
