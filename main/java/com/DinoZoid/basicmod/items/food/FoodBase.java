package com.DinoZoid.basicmod.items.food;

import com.DinoZoid.basicmod.Main;
import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		
		super(amount, saturation, isAnimalFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BasicMod);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRender(this, 0, "inventory");
		
	}
	
}
