package org.example.services.dummy.Swager;

import io.restassured.response.Response;
import org.example.ApiUtil;
import org.example.services.dummy.Swager.Pojo.CreateUser;

public class SwaggerService {
    ApiUtil apiUtil=new ApiUtil();
    String url="https://petstore.swagger.io/";

    public Response createUser(String firstName, String lastName, String emailId, String password, String phone){
        CreateUser createUser = new CreateUser();
        createUser.setFirstName(firstName);
        createUser.setLastName(lastName);
        createUser.setPassword(password);
        createUser.setPhone(phone);
        createUser.setEmail(emailId);
        Response response= createUser(createUser);
        return response;
    }

    public Response createUser(CreateUser user){
        String path="v2/user";
        Response response=apiUtil.post(url+path,user);
        return response;
    }
}
