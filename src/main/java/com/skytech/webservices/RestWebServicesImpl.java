package com.skytech.webservices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skytech.pojo.Employee;
import com.skytech.response.EmployeeJson;
import com.skytech.response.EmployeeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class RestWebServicesImpl implements RestWebServices {

    @Autowired
    RestTemplate restTemplate;

    ObjectMapper objectMapper = new ObjectMapper();
    Employee employee = new Employee();
    EmployeeJson employeeJson;

    @Override
    public String getResponse() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/Spring_MVC_Saurav_war_exploded/customApi", String.class);
        return responseEntity.getBody();
    }





    @Override
    public String readExistingData() {

        Employee employee = getEmployee();

        String convertedResponse = null;


        try {
            convertedResponse = objectMapper.writeValueAsString(employee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return convertedResponse;
    }

    @Override
    public List<EmployeeList> getResponseList() {
        ResponseEntity<EmployeeList[]> forEntity = restTemplate.getForEntity("http://localhost:8080/Spring_MVC_Saurav_war_exploded/read2", EmployeeList[].class);
        return List.of(forEntity.getBody());
    }


    public Employee getEmployee() {

        employee.setEmployeeId(101);
        employee.setEmployeeName("Suyash");
        employee.setEmployeeSalary(15000);
        employee.setEmployeeAddress("Bihar");
        employee.setEmployeeDepartment("Software");
        employee.setEmployeePincode(805130);


        return employee;
    }

    public String readExistingData2() {


        ObjectMapper objectMapper1=new ObjectMapper();

        List<Employee> employeeList = getEmployee1();

        String convertedResponse2 = null;


        try {
            convertedResponse2 = objectMapper1.writeValueAsString(employeeList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return convertedResponse2;
    }


    public List<Employee> getEmployee1() {

        List<Employee> employeeList = new ArrayList<>();

        employee.setEmployeeId(101);
        employee.setEmployeeName("Suyash");
        employee.setEmployeeSalary(15000);
        employee.setEmployeeAddress("Bihar");
        employee.setEmployeeDepartment("Software");
        employee.setEmployeePincode(805130);

        Employee employee1 = new Employee();
        employee1.setEmployeeId(102);
        employee1.setEmployeeName("Rohit");
        employee1.setEmployeeSalary(15000);
        employee1.setEmployeeAddress("Patna");
        employee1.setEmployeeDepartment("Software");
        employee1.setEmployeePincode(805130);

        employeeList.add(employee1);
        employeeList.add(employee);


        return employeeList;
    }


}
