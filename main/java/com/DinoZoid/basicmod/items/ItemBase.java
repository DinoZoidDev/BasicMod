package com.DinoZoid.basicmod.items;

import com.DinoZoid.basicmod.Main;
import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRender(this, 0, "inventory");
		
	}

}
