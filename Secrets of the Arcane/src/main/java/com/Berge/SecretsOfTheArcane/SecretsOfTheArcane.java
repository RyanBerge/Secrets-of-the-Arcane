package com.Berge.SecretsOfTheArcane;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SecretsOfTheArcane.MODID, version = SecretsOfTheArcane.VERSION)
public class SecretsOfTheArcane
{
    public static final String MODID = "secretsofthearcane";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}