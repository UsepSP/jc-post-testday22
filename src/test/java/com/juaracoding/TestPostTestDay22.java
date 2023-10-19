package com.juaracoding;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostTestDay22 {

    String endpoint = "https://api.themoviedb.org/3/movie/now_playing";

    @Test
    public void testNowPlaying() {
        Response response = RestAssured.get(endpoint);
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeaders());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        String token = response.getBody().jsonPath().getString("Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJiZDM5OGFkNzY1NDYwM2JhNzRkM2NkMzk3MzhiZjcwNiIsInN1YiI6IjY1MmZjOTAwMDI0ZWM4MDEwMTU0NThhMCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.cbZJ1FkQkBNTVoXgD4remB4Vk8BKyg3UwYZBFjxdE1E");
        System.out.println(token);

    }
}

