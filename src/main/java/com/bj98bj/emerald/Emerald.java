package com.bj98bj.emerald;

import com.bj98bj.emerald.init.ModItems;
import com.bj98bj.emerald.init.Recipes;
import com.bj98bj.emerald.proxy.IProxy;
import com.bj98bj.emerald.reference.Reference;
import com.bj98bj.emerald.configuration.ConfigurationHandler;
import cpw.mods.fml.common.FMLCommonHandler;
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
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static Emerald instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        System.out.println(event.getSuggestedConfigurationFile());
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        Recipes.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //FMLLog.log(Reference.MOD_NAME, Level.INFO, "Emerald mod by BJ98BJ completed initialization!!!");
    }
}
