package com.SilverBranch.Fishaxe;

import com.SilverBranch.Fishaxe.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {
    private static final String CATEGORY_GENERAL = "general";

    public static boolean fishaxeRf = true;

    public static void readConfig(){
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        }catch (Exception e1){
            Fishaxe.logger.log(Level.ERROR, "Config failed to load", e1);
        }finally{
            if (cfg.hasChanged()){
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg){
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General Config");
        fishaxeRf = cfg.getBoolean("SilverIsBestAdmin", CATEGORY_GENERAL, fishaxeRf, "Set to false if you want to get banned");
    }
}