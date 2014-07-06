package com.bj98bj.emerald.init;

import com.bj98bj.emerald.item.ItemEmerald;
import com.bj98bj.emerald.item.ItemEmeraldSword;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Björn on 06.07.2014.
 */
public class ModItems {
    public static final ItemEmerald emeraldsword = new ItemEmeraldSword();

    public static void init()
    {
        GameRegistry.registerItem(emeraldsword, "emeraldSword");
    }
}
