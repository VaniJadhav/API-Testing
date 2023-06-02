
package org.example.pojo.dummy.employee;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "data",
    "message"
})

@Data
public class EmployeeList {

    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public List<Empolyee> data;
    @JsonProperty("message")
    public String message;
}
