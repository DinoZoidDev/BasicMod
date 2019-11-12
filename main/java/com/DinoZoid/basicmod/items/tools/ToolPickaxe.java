package com.DinoZoid.basicmod.items.tools;

import com.DinoZoid.basicmod.Main;
import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
		
		super(material);
		
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
