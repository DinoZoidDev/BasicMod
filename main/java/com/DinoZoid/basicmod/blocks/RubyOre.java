package com.DinoZoid.basicmod.blocks;

import java.util.Random;

import com.DinoZoid.basicmod.init.ModItems;
import com.DinoZoid.basicmod.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase implements IHasModel {

	public RubyOre(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return ModItems.RUBY;
		
	}
	
	@Override
	public int quantityDropped(Random rand) {
		
		return rand.nextInt(4) + 1;
		
	}
	
}
