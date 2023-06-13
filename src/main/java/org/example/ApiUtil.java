package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.services.dummy.Swager.Pojo.CreateUser;

import static io.restassured.RestAssured.given;

public class ApiUtil {

    public Response get(String url){
        Response response=RestAssured.get(url);
        return response;

    }

    public Response post(String url,String body){
        Response response= given().contentType(ContentType.JSON).accept(ContentType.JSON).body(body)
                .post(url);
        response.prettyPrint();
                return response;

    }
    public Response post(String url, Object body){
        Response response= given().contentType(ContentType.JSON).accept(ContentType.JSON).body(body)
                .post(url);
        response.prettyPrint();
        return response;

    }




}
