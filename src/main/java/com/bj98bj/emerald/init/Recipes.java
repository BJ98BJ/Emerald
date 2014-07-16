package com.bj98bj.emerald.init;

import com.bj98bj.emerald.block.BlockSmallEmerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Björn on 08.07.2014.
 */
public class Recipes {
    public static final ItemStack emeraldStack = new ItemStack(Items.emerald);
    public static final ItemStack smallEmeraldStack = new ItemStack(ModBlocks.smallemerald);
    public static final ItemStack stickStack = new ItemStack(Items.stick);



    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldsword, 1),
                " x ", " x ", " y ",
                'x', emeraldStack, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldchestplate, 1),
                "x x","xxx","xxx",'x', emeraldStack);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.smallemerald),
                "xx","xx",'x',new ItemStack(Items.emerald));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald,4),smallEmeraldStack);

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new ItemStack(Blocks.dirt));
        //GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new ItemStack(ModBlocks.smallemerald));
    }

}
