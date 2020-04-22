package com.java.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

@SuppressWarnings("unchecked")
public class WritingToJSON {
    public static void main(String[] args) {

//        Map<String,String> map = new HashMap<>();
//        map.put("sreekar","vaddi");
        JSONObject employeeDetails = new JSONObject();

        employeeDetails.put("firstName", "sreekar");
        employeeDetails.put("age", 25);
        employeeDetails.put("website", "sreekar.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails1 = new JSONObject();

        employeeDetails1.put("firstName", "sreekar");
        employeeDetails1.put("age", 25);
        employeeDetails1.put("website", "sreekar.com");
        JSONObject employeeObject1 = new JSONObject();
        employeeObject1.put("employee", employeeDetails1);

        JSONArray jsonArrayList = new JSONArray();
        jsonArrayList.add(employeeObject);
        jsonArrayList.add(employeeObject1);

        try {
            FileWriter fileWriter = new FileWriter("./src/main/resources/json/file.json");
            fileWriter.write(jsonArrayList.toJSONString());
            fileWriter.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
