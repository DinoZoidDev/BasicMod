package com.DinoZoid.basicmod.items.tools;

import com.DinoZoid.basicmod.Main;
import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material) {
		
		super(material, 6.0f, 3.2f);
		
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
