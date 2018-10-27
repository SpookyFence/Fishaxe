package com.SilverBranch.Fishaxe.Items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    public static final Item.ToolMaterial fish = EnumHelper.addToolMaterial("fishaxe stuff", 100, 0,100,0, 50);

    @GameRegistry.ObjectHolder("fishaxe:fishaxe")
    public static ItemFishaxe fishaxe;

    @SideOnly(Side.CLIENT)
    public void initModels(){
        ItemFishaxe.initModel();
    }
}
