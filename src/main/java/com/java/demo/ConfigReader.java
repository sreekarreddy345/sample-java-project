package com.java.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static ConfigReader configReader = null;
    private static Properties prop;


    private ConfigReader() {
    }

    public static ConfigReader getConfigReader() {
        if (configReader == null) {
            configReader = new ConfigReader();
        }
        return configReader;

    }

    public Properties getProperties(String path) {
        if (prop == null) {
            prop = new Properties();
        }
        try {
            FileInputStream ip = new FileInputStream(path);
            prop.load(ip);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;

    }
}
