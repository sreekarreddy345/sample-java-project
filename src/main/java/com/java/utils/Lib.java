package com.java.utils;

import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lib {

    public static List<String> getFile(String folderPath) {
        List<String> fileNames = new ArrayList<>();
        File folder = new File(folderPath);
        for (final File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                fileNames.add(fileEntry.getAbsolutePath());
            }
        }
        return fileNames;
    }

    public static Map<String, Object> convertJsonToMap(String jsonString) {
        Gson gson = new Gson();
        return gson.<Map<String, Object>>fromJson(jsonString, Map.class);
    }

    public static Map<String, Object> convertJsonToMap1(Object jsonString) {
        Gson gson = new Gson();
        return gson.<Map<String, Object>>fromJson(String.valueOf(jsonString), Map.class);
    }

    public static List convertJsonToList(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, List.class);
    }
}
