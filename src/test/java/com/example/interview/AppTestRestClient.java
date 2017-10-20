package com.example.interview;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AppTestRestClient {

	//@Test
	public void validateJSONStatusCode() {
		given()
		.when()
		.accept(ContentType.JSON)
		.get("http://itunes.apple.com/search?term=jack+johnson")
		.then()
		.statusCode(200);
		
	}

	@Test
	public void validateJSONTrackID() {
		given()
		.when()
		.accept(ContentType.XML)
		.get("http://itunes.apple.com/search?term=jack+johnson")
		.then()
		.log().all();
		//.body(hasXPath("/results/trackId"), containsString("879273574"));
		
	}
	
	//@Test
	public void validateJSONReturnValue() {
		given()
		.when()
		.accept(ContentType.JSON)
		.get("http://itunes.apple.com/search?term=jack+johnson")
		.then()
		.body("results.trackName", hasItems("Staple It Together"));
		
	}
}
