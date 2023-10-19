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
        JSONObject request = new JSONObject();
        given()
                // .header("Authorization", "Bearer token")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJiZDM5OGFkNzY1NDYwM2JhNzRkM2NkMzk3MzhiZjcwNiIsInN1YiI6IjY1MmZjOTAwMDI0ZWM4MDEwMTU0NThhMCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.cbZJ1FkQkBNTVoXgD4remB4Vk8BKyg3UwYZBFjxdE1E")
                .body(request.toJSONString())
                .when()
                .post("https://api.themoviedb.org/3/movie/now_playing")
                .then()
                .statusCode(200)
                .log().all();
    }
}

