package com.bj98bj.emerald.item;

import com.bj98bj.emerald.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by Björn on 06.07.2014.
 */
public class ItemEmeraldSword extends  ItemEmerald {

    public ItemEmeraldSword() {
        super();
        this.setUnlocalizedName("emeraldSword");
        this.setMaxStackSize(1);
        this.setMaxDamage(100);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setDamage(new ItemStack(ModItems.emeraldsword, 1),5);
    }
}
