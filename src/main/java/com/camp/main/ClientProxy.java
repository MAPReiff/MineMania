package com.camp.main;

import net.minecraft.client.model.ModelCow;

import com.camp.entity.KillerMoo;
import com.camp.render.RenderCustomBiped;

import cpw.mods.fml.client.registry.RenderingRegistry;
 
public class ClientProxy extends ServerProxy {
 
    public void registerRenderThings() {        
    	RenderingRegistry.registerEntityRenderingHandler(KillerMoo.class, new RenderCustomBiped(new ModelCow(), 0));
    }
 
}