package com.SilverBranch.Fishaxe.init;


import com.SilverBranch.Fishaxe.Items.ToolPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;


import java.util.ArrayList;
import java.util.List;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item.ToolMaterial MATERIAL_FISH = EnumHelper.addToolMaterial("fish", 100, 0, 100, 100, 100);

    public static final ItemPickaxe FISHAXE_PICKAXE = new ToolPickaxe("itemfishaxe", MATERIAL_FISH);
}
