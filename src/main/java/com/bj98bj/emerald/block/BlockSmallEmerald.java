package com.bj98bj.emerald.block;

import com.bj98bj.emerald.creativeTab.CreativeTabEmerald;
import com.bj98bj.emerald.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Björn on 09.07.2014.
 */
public class BlockSmallEmerald extends BlockEmerald
{
    public BlockSmallEmerald()
    {
        super();
        this.setBlockName("smallEmerald");
        this.setCreativeTab(CreativeTabEmerald.EMERALD_TAB);
        this.setHardness(7f);
        this.setResistance(50);
        this.setLightOpacity(25);
    }
}
