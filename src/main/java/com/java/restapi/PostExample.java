package com.java.restapi;

import com.java.utils.Lib;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class PostExample {


    @Test
    public void testPost() throws IOException {
        List<String> fileNames = Lib.getFile("./src/main/resources/messages");
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://dummy.restapiexample.com/api/v1/create";
        for (String fileName : fileNames) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.add("Authorization","bearerValue");
//        HttpEntity<String> entity = new HttpEntity<>(fileName,headers);

            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            ResponseEntity<String> response = restTemplate.postForEntity(url, content, String.class);
//            ResponseEntity<String> response1 = restTemplate.postForEntity(url, entity, String.class);
            if (response.getStatusCodeValue() == 200) {
                String body = response.getBody();
                Map<String, Object> stringObjectMap = Lib.convertJsonToMap(body);
                Object data = stringObjectMap.get("data");

                Map<String, Object> stringObjectMap1 = Lib.convertJsonToMap1(data);
                Object id = stringObjectMap1.get("id");
                System.out.println(id);
            }
        }
    }
}
