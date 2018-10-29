package com.SilverBranch.Fishaxe.Items;

import com.SilverBranch.Fishaxe.Fishaxe;
import com.SilverBranch.Fishaxe.init.ModItems;
import com.SilverBranch.Fishaxe.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Fishaxe.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
