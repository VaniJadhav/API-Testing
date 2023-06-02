package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtil {

    public Response get(String url){
        Response response=RestAssured.get(url);
        return response;

    }
}
