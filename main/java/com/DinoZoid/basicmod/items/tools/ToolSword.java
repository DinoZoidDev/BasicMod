package com.DinoZoid.basicmod.items.tools;

import com.DinoZoid.basicmod.Main;
import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material) {
		
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
