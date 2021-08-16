package com.java.restapi;

import com.google.gson.Gson;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class FileUpload {

    private static Resource getUserFileResource() {
        File file = null;
        try {
            Path tempFile = Files.createTempFile("test file", ".txt");
            Files.write(tempFile, "actual content in the files".getBytes());
            file = tempFile.toFile();
            return new FileSystemResource(file);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return new FileSystemResource(file);
    }

    @Test
    public void restApiFileUpload() {
        String url = "http://localhost:8080/upload";
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
        bodyMap.add("filename", getUserFileResource());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(bodyMap, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);

        if (response.getStatusCodeValue() == 200) {
            String body = response.getBody();
            Gson gson = new Gson();
            Map<String, Object> stringObjectMap = gson.<Map<String, Object>>fromJson(body, Map.class);
            Object id = stringObjectMap.get("id");
            Assert.assertEquals(id, "");
        }

    }
}
