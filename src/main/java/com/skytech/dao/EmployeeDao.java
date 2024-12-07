package com.skytech.dao;

import com.skytech.pojo.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployee();

    public int insertEmployeeDetails(final Employee employee);

    public Employee getEmployee(final int employeeId);

    public int deleteEmployee(final int employeeId);

    public int updateEmployee(Employee employee);

    public Employee employeeLogin(String name, String department);
}
