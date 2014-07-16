package com.bj98bj.emerald.init;

import com.bj98bj.emerald.block.BlockEmerald;
import com.bj98bj.emerald.block.BlockSmallEmerald;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Björn on 09.07.2014.
 */
public class ModBlocks {
    public static final BlockEmerald smallemerald = new BlockSmallEmerald();

    public static void init()
    {
        GameRegistry.registerBlock(smallemerald, "smallEmerald");
    }
}
