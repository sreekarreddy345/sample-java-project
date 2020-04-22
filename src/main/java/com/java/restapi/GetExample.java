package com.java.restapi;

import com.google.gson.Gson;
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

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://dummy.restapiexample.com/api/v1/employees";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        if (response.getStatusCodeValue() == 200) {
            String content = response.getBody();
            Gson gson = new Gson();
            Map<String, Object> map = gson.<Map<String, Object>>fromJson(content, Map.class);
            List<?> data1 = (List<?>) map.get("data");
//            System.out.println("size - " + map.size());

            for (int i = 0; i < data1.size(); i++) {
                String query = "$.data[" + i + "].employee_name";
                String value = JsonPath.read(data1, query);
                System.out.println(value);
            }
//
        }
    }
}
