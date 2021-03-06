package com.bj98bj.emerald.item;

import com.bj98bj.emerald.creativeTab.CreativeTabEmerald;
import com.bj98bj.emerald.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.sql.Ref;

/**
 * Created by Björn on 06.07.2014.
 */
public class ItemEmerald extends Item {
    public  ItemEmerald() {

        super();

        this.setCreativeTab(CreativeTabEmerald.EMERALD_TAB);
    }


        @Override
        public  String getUnlocalizedName()
        {
            return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        }

    @Override
    public  String getUnlocalizedName(ItemStack itemstack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }



}
