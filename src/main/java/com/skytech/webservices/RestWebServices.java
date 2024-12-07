package com.skytech.webservices;

import com.skytech.response.EmployeeList;

import java.util.List;

public interface RestWebServices {

    public String getResponse();
    public String readExistingData();
    public List<EmployeeList> getResponseList();
}
