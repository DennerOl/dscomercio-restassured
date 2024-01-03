package com.devsuperior.dscomercio.controllers;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
public class ProductControllerRA {

	@BeforeEach
	public void SetUp() {
		baseURI = "http://localhost:8080";
	}
}
