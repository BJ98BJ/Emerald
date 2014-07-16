package com.bj98bj.emerald.creativeTab;

import com.bj98bj.emerald.init.ModItems;
import com.bj98bj.emerald.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Björn on 16.07.2014.
 */
public class CreativeTabEmerald {
    public  static final CreativeTabs EMERALD_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.emeraldsword;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Emerald Mod";
        }
    };
}
