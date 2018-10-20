package com.SilverBranch.Fishaxe;

import com.SilverBranch.Fishaxe.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Fishaxe.MODID, name = Fishaxe.NAME, version = Fishaxe.VERSION)
public class Fishaxe
{
    public static final String MODID = "fishaxe";
    public static final String NAME = "Fishaxe";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.SilverBranch.Fishaxe.proxy.ClientProxy", serverSide = "com.SilverBranch.Fishaxe.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Fishaxe instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}
