package com.SilverBranch.Fishaxe.Items;

import com.SilverBranch.Fishaxe.Fishaxe;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.SilverBranch.Fishaxe.Items.ModItems.fish;

public class ItemFishaxe extends ItemPickaxe
{
    public ItemFishaxe(ToolMaterial mat)
    {
        super(fish);
        setRegistryName("fishaxe");
        setUnlocalizedName(Fishaxe.MODID + ".fishaxe");
        setCreativeTab(CreativeTabs.TOOLS);
        setMaxStackSize(1);
    }
    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
