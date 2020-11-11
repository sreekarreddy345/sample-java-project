package com.java.codingpoblems;

import com.google.gson.Gson;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class RestAssuredExample1 {

    // over loading example
    public static String getStatus(String response) {
        return null;
    }

    // over loading example
    public static String getStatus(String response, int i) {
        return null;
    }

    @Test(enabled = false)
    public void getMethod() {

        IntStream.range(1, 1000);
        String s = RestAssured
                .given()
                .when()
                .header("Authorization", "Bearer hjvsfhjbfjkfbfbskfhsfbjskb")   // to send unique authorization details
                .get("http://dummy.restapiexample.com/api/v1/employees")
                .getBody()
                .asString();

        Gson gson = new Gson();
        Map<String, Object> stringObjectMap = gson.<Map<String, Object>>fromJson(s, Map.class);

        String text = "$.data[2].employee_name";

        String read = JsonPath.read(stringObjectMap, text);
        System.out.println(read);

        List<?> list = (List<?>) stringObjectMap.get("data");
        for (int i = 0; i < list.size(); i++) {
            String s1 = "$.data[" + i + "].employee_name";
            String read1 = JsonPath.read(stringObjectMap, s1);
            if (read1.equals("Cedric Kelly")) {
                String s2 = "$.data[" + i + "].employee_salary";
                double read2 = JsonPath.read(stringObjectMap, s2);
                System.out.println(read2);
                Assert.assertEquals(433060.0, read2);


            }
        }
    }

    @Test
    public void post() {
        String message = "\t{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
        int b = RestAssured.given()
                //   .contentType("applicaton/json")
                //  .header("Authorization", "Bearer GT56G")
                .body(message)
                .post("http://dummy.restapiexample.com/create").getStatusCode();
        if (b == 200) {
            System.out.println("Success");
        } else {
            System.out.println(b);
            Assert.fail("Different status code");
        }
    }

    @Test
    public void getMethod1() {

        String s = RestAssured.given().when()
                .post("http://dummy.restapiexample.com/api/v1/employees")
                .getBody().asString();

        Gson gson = new Gson();
        Map<String, Object> stringObjectMap = gson.<Map<String, Object>>fromJson(s, Map.class);
        System.out.println(stringObjectMap.get("data"));

        String text1 = "$.data[2].employee_name";
        String read = JsonPath.read(stringObjectMap, text1);
        if (read.equals("Ashton Cox")) {
            System.out.println("value found");
        } else {
            System.out.println("Value not found");
            Assert.fail("Failed");
        }

    }

    @Test
    public void getTest() {
        String b = RestAssured.given().when().get("http://dummy.restapiexample.com/api/v1/employees")
                .getBody().asString();

        Gson gson = new Gson();
        Map<String, Object> stringObjectMap = gson.<Map<String, Object>>fromJson(b, Map.class);
        String query = "$..*";
        Object read = JsonPath.read(stringObjectMap, query);

        String query1 = "$.data[0].employee_name";
        String read1 = JsonPath.read(stringObjectMap, query1);
        System.out.println(read1);

        // System.out.println("Hi"+read);
        if (read1.equals("Tiger Nixon")) {
          /*  String query2= "S.data[*].employee_age";
            double read2 = JsonPath.read(stringObjectMap, query2);*/
            System.out.println("Value Found");
        } else {
            System.out.println("Not Found");
        }
    }

    @Test
    public void test1() {
        String s = RestAssured.given().when()
                .get("http://dummy.restapiexample.com/api/v1/employees")
                .getBody().asString();

        Gson gson = new Gson();
        Map<String, Object> stringObjectMap = gson.<Map<String, Object>>fromJson(s, Map.class);
        List<?> list = (List<?>) stringObjectMap.get("data");
        for (int i = 0; i < list.size(); i++) {
            String Query = "$.data[" + i + "].employee_age";
            double read = JsonPath.read(stringObjectMap, Query);
            if (read > 30) {
                String Query1 = "$.data[" + i + "].employee_name";
                String read1 = JsonPath.read(stringObjectMap, Query1);
                System.out.println(read1);
            }
        }

    }


}
