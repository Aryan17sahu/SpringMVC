package com.skytech.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skytech.pojo.Employee;
import com.skytech.response.EmployeeJson;
import com.skytech.response.ProductJson;
import com.skytech.webservices.RestWebServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    EmployeeJson employeeJson;

    @Autowired
    RestWebServicesImpl  restWebServices;


    @RequestMapping("/readApi")
    @ResponseBody
    public String readApi(){

        return  restWebServices.getResponse();
    }

    @RequestMapping("/customApi")
    @ResponseBody
    public String readCustomApi(){

        return restWebServices.readExistingData();
    }
    @RequestMapping("/readData")
    public String readData(Model model){
        Employee employee = restWebServices.getEmployee();
        employeeJson.setEmployeeId(employee.getEmployeeId());
        employeeJson.setEmployeeName(employee.getEmployeeName());
        employeeJson.setEmployeeAddress(employee.getEmployeeAddress());
        employeeJson.setEmployeeDepartment(employee.getEmployeeDepartment());
        employeeJson.setEmployeeSalary(employee.getEmployeeSalary());
        employeeJson.setEmployeePincode(employee.getEmployeePincode());

        model.addAttribute("data",employeeJson);

        return "readData";
    }

    @RequestMapping("/ok")
    public String read(Model model){
        String response = restWebServices.getResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        List<EmployeeJson> employeeJsons=new ArrayList<>();
        EmployeeJson employeeJson=null;


        try {
             employeeJson = objectMapper.readValue(response, EmployeeJson.class);
            System.out.println(employeeJson);
        } catch (IOException e) {
            e.printStackTrace();

        }
        employeeJsons.add(employeeJson);
        model.addAttribute("list",employeeJsons);

        return "list";
    }

}
