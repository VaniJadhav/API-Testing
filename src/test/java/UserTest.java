import io.restassured.RestAssured;
import io.restassured.internal.mapping.GsonMapper;
import io.restassured.response.Response;
import org.apache.http.Header;
import org.example.services.dummy.Swager.Pojo.CreateUser;
import org.example.services.dummy.Swager.SwaggerService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserTest {
    SwaggerService swaggerService =new SwaggerService();
    String firstName="Vani";
    String lastName="Jadhav";
    String emailId="vani123@gmail.com";
    String password="vani@123";
    String phone="123456";

    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
    @Test
    public void testName() {

        /*Response response = given().header("Content-type", "application/json")
                .body(body).when().post("/pet").then().extract().response();
        int statusCode = response.statusCode();
        response.prettyPrint();
        System.out.println(statusCode);*/

        //Response response=swaggerService.createUser(firstName,lastName,emailId,password,phone);

        Response response=swaggerService.createUser(new CreateUser("Vani Jadhav","vani@123"));

        response.prettyPrint();


    }

}
