package com.skytech.controller;

import com.skytech.response.EmployeeList;
import com.skytech.webservices.RestWebServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RestWebServicesImpl restWebServices;

    @RequestMapping("/read5")
    @ResponseBody
    public String read() {
        System.out.println(restWebServices.getResponseList());
        return restWebServices.getResponseList().toString();
    }

    @RequestMapping("/read2")
    @ResponseBody
    public String readExistingData() {
        System.out.println(restWebServices.readExistingData2());
        return restWebServices.readExistingData2();
    }

    @RequestMapping("/readEmployee")
    public String readListOfEmployee(Model model) {

        List<EmployeeList> employeeLists = restWebServices.getResponseList();
        model.addAttribute("list", employeeLists);
        System.out.println(employeeLists);

        return "list";
    }


}
