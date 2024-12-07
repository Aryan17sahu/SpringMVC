package com.skytech.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.MapEntry;
import com.skytech.pojo.Employee;
import com.skytech.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping(value = "/getForm", method = RequestMethod.GET)
    public String getForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "form";

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("employee") Employee employee, Model model) {

        model.addAttribute("msg", employeeService.insertEmployeeDetails(employee));
        return "redirect:/list";
    }

    @RequestMapping(value = "/saveApi", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveApi(@RequestBody Employee employee) {
        System.out.println(employee);
        employeeService.insertEmployeeDetails(employee);
        return "success";
    }


    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public String getEmployeeForm(Model model) {

        model.addAttribute("employeeId", new Employee());

        return "form_id";
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getEmployee(@ModelAttribute("employeeId") Employee employee, Model model) {
        System.out.println(employee.getEmployeeId());

        Employee employee1 = employeeService.getEmployee(employee.getEmployeeId());
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);

        model.addAttribute("list", employeeList);
        System.out.println(employee1);

        return "list";
    }


    @RequestMapping("/list")
    public String getAllEmployee(Model model) {
        List<Employee> allEmployee = employeeService.getAllEmployee();

        model.addAttribute("list", allEmployee);


        return "list";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public String getAllEmployeeJson() {
        List<Employee> allEmployee = employeeService.getAllEmployee();
        System.out.println(allEmployee);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = null;
        try {
            s = objectMapper.writeValueAsString(allEmployee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return s;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model) {

        model.addAttribute("delete", employeeService.deleteEmployee(id));

        return "redirect:/list";
    }

    @DeleteMapping(value = "/deleteApi/{id}")
    public String deleteApi(@PathVariable("id") int id, Model model) {
        System.out.println(id);
        System.out.println("Delete method is getting called " + id);
        model.addAttribute("delete", employeeService.deleteEmployee(id));

        return "delete";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {

        Employee employee = employeeService.getEmployee(id);
        System.out.println("The id is :" + id);
        System.out.println(employee);
        model.addAttribute("emp", employee);

        return "update";
    }

    @RequestMapping("/saving")
    public String saveUser(@ModelAttribute("emp") Employee employee, Model model) {


        System.out.println(employee);
        System.out.println("Working");


        int i = employeeService.updateEmployee(employee);
        System.out.println(i);
        model.addAttribute("save", "Updated Successfully");

        return "save";
    }

    @RequestMapping("/login")
    public String login(Model model) {
//        model.addAttribute("msg", "Please Enter your Login Details");
        model.addAttribute("employee", new Employee());

        return "login";
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("employee") Employee employee, Model model) {
        Employee employee1 = employeeService.employeeLogin(employee.getEmployeeName(), employee.getEmployeeDepartment());

        if (employee1 != null) {
            model.addAttribute("msg", "Successfully Login");
            return "index";
        } else
            model.addAttribute("error", "Login Failed");
        return "login";


    }

    @RequestMapping("/logout")
    public String logout(Model model) {


        return "login";

    }


}

