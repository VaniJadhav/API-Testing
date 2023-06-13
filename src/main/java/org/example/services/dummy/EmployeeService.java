package org.example.services.dummy;

import io.restassured.response.Response;
import org.example.ApiUtil;
import org.testng.Assert;

public class EmployeeService {
    String url="http://dummy.restapiexample.com";
    ApiUtil apiUtil=new ApiUtil();

    public Response getAllEmployee(){
        String path="/api/v1/employees";
        Response response=apiUtil.get(url+path);
        Assert.assertEquals(response.statusCode(),200,"Request failed");
        return response;


    }

}
