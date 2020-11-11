package com.java.codingpoblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

public class ValidJson {
    public static void main(String[] args) {

        Queue<String> strings = new PriorityQueue<>();
        System.out.println("isValidJson - " + isValidJson("[\n" +
                "  {\n" +
                "    \"employee\": {\n" +
                "      \"firstName\": \"sreekar\",\n" +
                "      \"website\": \"sreekar.com\",\n" +
                "      \"age\": 25\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"employee\": {\n" +
                "      \"firstName\": \"sreekar\",\n" +
                "      \"website\": \"sreekar.com\",\n" +
                "      \"age\": 25\n" +
                "    }\n" +
                "  }\n" +
                "]"));

    }

    public static boolean isValidJson(String str) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readTree(str);
            return true;
        } catch (IOException e) {

            return false;
        }
    }
}
