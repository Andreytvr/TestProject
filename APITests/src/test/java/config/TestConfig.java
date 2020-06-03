package config;

import org.testng.annotations.BeforeClass;

import  io.restassured.RestAssured;

public class TestConfig {
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/";

    }
}
