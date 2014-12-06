package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.item.ItemFood;

public class FoodBacon extends ItemFood
{
	public FoodBacon(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("Bacon");
		this.setTextureName("overfoods:Bacon");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
