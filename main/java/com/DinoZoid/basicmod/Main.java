package com.DinoZoid.basicmod;

import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.init.ModRecipes;
import com.DinoZoid.basicmod.proxy.CommonProxy;
import com.DinoZoid.basicmod.util.Reference;
import com.DinoZoid.basicmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs BasicMod = new CreativeTabs("tab_bm") {
		
		  @Override
		  public ItemStack getTabIconItem() {
		   return new ItemStack(ModItems.RUBY);
		  }
		  
		  @Override
		  public boolean hasSearchBar() {
			  
			  return true;
			  
		  }
		  
		 };
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		
		
	}
	
}
