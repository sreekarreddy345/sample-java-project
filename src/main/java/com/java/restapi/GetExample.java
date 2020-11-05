package com.java.restapi;

import com.google.gson.Gson;
import com.java.utils.Lib;
import com.jayway.jsonpath.JsonPath;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GetExample {
    @Test
    public void testGetMethod() throws IOException, ParseException {

        String url = "http://dummy.restapiexample.com/api/v1/employees";

        String content = getRestExample(url);
        System.out.println("content - " + content);


        Map<String, Object> map = Lib.convertStringToMap(content);

        String s = new Gson().toJson(map);


        List<?> data1 = (List<?>) map.get("data");


        for (int i = 0; i < data1.size(); i++) {
            String query = "$.data[" + i + "].employee_name";
            String value = JsonPath.read(map, query);
            System.out.println(value);
        }
    }

    public static String getRestExample(String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String content = null;
        if (response.getStatusCodeValue() == 200) {
            content = response.getBody();

        }
        return content;
    }

}
