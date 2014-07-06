package com.bj98bj.emerald;

import com.bj98bj.emerald.proxy.IProxy;
import com.bj98bj.emerald.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Björn on 06.07.2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION,canBeDeactivated = true)

public class Emerald
{
    @SidedProxy(clientSide = "com.bj98bj.emerald.proxy.ClientProxy", serverSide = "com.bj98bj.emerald.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static Emerald instance;

    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
