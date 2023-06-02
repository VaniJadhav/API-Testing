import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.ApiUtil;
import org.example.pojo.dummy.employee.EmployeeList;
import org.example.pojo.dummy.employee.Empolyee;
import org.example.services.dummy.EmployeeService;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FetchEmployeeDetails {
//ApiUtil apiUtil=new ApiUtil();
    EmployeeService employeeService= new EmployeeService();
    @Test
    public void getData() throws JsonProcessingException {
       //Response response= RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
       //response.prettyPrint();
       // Response response=apiUtil.get("http://dummy.restapiexample.com/api/v1/employees");
        Response response=employeeService.getAllEmployee();

        ObjectMapper objectMapper = new ObjectMapper();// Created OM instance
        EmployeeList employeeList = objectMapper.readValue(response.prettyPrint(), EmployeeList.class);// mapping json to pojo

        for (int i = 0; i < employeeList.getData().size(); i++) {
            Empolyee empolyee = employeeList.getData().get(i);
            System.out.println(empolyee.getId() + " emp name is "+ empolyee.getEmployeeName());
        }

        Assert.assertEquals(response.statusCode(),200,"wrong status code");
    }
}
