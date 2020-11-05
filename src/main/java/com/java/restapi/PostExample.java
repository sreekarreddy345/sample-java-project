package com.java.restapi;

import com.java.utils.Lib;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class PostExample {


    public static String postExample(String url, String fileName) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + "token");
        HttpEntity<String> entity = new HttpEntity<>(fileName, headers);

        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        ResponseEntity<String> response = restTemplate.postForEntity(url, content, String.class);

        String body;
        if (response.getStatusCodeValue() == 200) {
            body = response.getBody();

        } else {
            throw new RuntimeException("status code invalid");
        }
        return body;
    }

    @Test
    public void testPost() throws IOException {
        List<String> fileNames = Lib.getFile("./src/main/resources/messages");


        String url = "http://dummy.restapiexample.com/api/v1/create";
        for (String fileName : fileNames) {

            String body = postExample(url, fileName);
            System.out.println(body);
            Map<String, Object> stringObjectMap = Lib.convertStringToMap(body);
            Object data = stringObjectMap.get("data");

            Map<String, Object> stringObjectMap1 = Lib.convertJsonToMap1(data);
            Object id = stringObjectMap1.get("id");
            System.out.println(id);


            String geturl = "http://dummy.restapiexample.com/api/v1/employees/" + id.toString();
            String restExample = GetExample.getRestExample(geturl);

            Map<String, Object> stringObjectMap2 = Lib.convertStringToMap(restExample);
            Object abc = stringObjectMap2.get("abc");

            Assert.assertEquals(abc, "abc");


        }
    }
}
