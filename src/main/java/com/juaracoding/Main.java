package com.juaracoding;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {
        String endpoint = "https://reqres.in/api/users?page=1";

        @Test
        public void testGetListUsers() {

            Response response = RestAssured.get(endpoint);
            System.out.println(response.getStatusCode());
            System.out.println(response.getTime());
            System.out.println(response.getBody().asString());
            System.out.println(response.getHeaders());
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 200);
            // validasi pada response body use json path
        }
}