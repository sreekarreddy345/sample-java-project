package com.java.restapi.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Get_RestAssured_Example {

    @Test
    public void test() {

//        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
//        RequestSpecification request = given();
//        Response response = request.get();
//        System.out.println(response.getBody().asString());
//
//        ValidatableResponse validatableResponse = given().when().get("http://dummy.restapiexample.com/api/v1/employees").then().statusCode(200);

        /*ResponseBody response =
                RestAssured.given()
                        .when()
                        .header("content-type", "Application/JSON")
                        .header("Authorization", "Bearer " + "token")
                        .post("http://dummy.restapiexample.com/api/v1/employees").getBody();
*/
        Response response = RestAssured.given()
                .header("content-type", "Application/JSON")
                .body("{\n" +
                        "  \"name\": \"test\",\n" +
                        "  \"salary\": \"123\",\n" +
                        "  \"age\": \"23\"\n" +
                        "}")
                .post("http://dummy.restapiexample.com/api/v1/create")
                .then()
                .extract()
                .response();

        System.out.println(response.getStatusCode());
        // post - no body , response code 200

        System.out.println(response);

    }
}
