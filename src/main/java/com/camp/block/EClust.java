package com.camp.block;
import com.camp.lib.StringLibrary;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EClust extends Block {

	protected EClust(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	
		this.setBlockName("Emerald Clustar");
	    this.setCreativeTab(CreativeTabs.tabBlock);
	    this.setHardness(10);
	    this.setResistance((float) 5.0);
	    this.setLightLevel(20);
	    this.setBlockTextureName(StringLibrary.MODID + ":EC");
	}

}
