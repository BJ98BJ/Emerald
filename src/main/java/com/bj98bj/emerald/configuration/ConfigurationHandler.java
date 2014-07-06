package com.bj98bj.emerald.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Björn on 06.07.2014.
 */
public class ConfigurationHandler {
    public static void init(File configFile)
    {

        Configuration configuration = new Configuration(configFile);
        boolean configValue = true;

        try {

            configuration.load();

            configValue = configuration.get("Emerald Mod General config", "configValue", true, "Ein wert zum testen").getBoolean(true);

        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
        System.out.println("Configuration Test" + configValue);
    }
}
