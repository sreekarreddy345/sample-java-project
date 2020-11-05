package com.java.codingpoblems;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ConvertMapToJson {

    @Test
    public void test() {
        Map<String, Object> map = new HashMap<>(6);
        map.put("name", "sreekar");
        map.put("city", "Chicago");
        map.put("age", "26");

        JSONObject jsonObject = new JSONObject();
        jsonObject.putAll(map);
        System.out.println(jsonObject);


        Gson gson = new Gson();
        String s = gson.toJson(map);
        System.out.println(s);
    }
}
