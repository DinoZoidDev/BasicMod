package com.DinoZoid.basicmod.init;

import java.util.ArrayList;
import java.util.List;

import com.DinoZoid.basicmod.items.ItemBase;
import com.DinoZoid.basicmod.items.armor.ArmorBase;
import com.DinoZoid.basicmod.items.food.FoodEffectBase;
import com.DinoZoid.basicmod.items.tools.ToolAxe;
import com.DinoZoid.basicmod.items.tools.ToolHoe;
import com.DinoZoid.basicmod.items.tools.ToolPickaxe;
import com.DinoZoid.basicmod.items.tools.ToolSpade;
import com.DinoZoid.basicmod.items.tools.ToolSword;
import com.DinoZoid.basicmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0f, 3.0f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
			new int[] { 2, 5, 7, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	// Armor
	
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	// Food
	
	public static final Item RUBY_APPLE = new FoodEffectBase("ruby_apple", 8, 4.8f, false, new PotionEffect(MobEffects.REGENERATION, (8 * 20), 0, false, true), false);
}
