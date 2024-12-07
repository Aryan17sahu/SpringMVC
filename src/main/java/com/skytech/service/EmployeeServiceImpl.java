package com.skytech.service;

import com.skytech.dao.AdminDaoImpl;
import com.skytech.dao.EmployeeDaoImpl;
import com.skytech.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDaoImpl employeeDao;



    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public String insertEmployeeDetails(Employee employee) {

        if (employeeDao.insertEmployeeDetails(employee) > 0) {
            return "Data Inserted Successfully";
        } else {
            return "Something went wrong";
        }
    }

    @Override
    public Employee getEmployee(int employeeId) {

        return employeeDao.getEmployee(employeeId);
    }

    @Override
    public int deleteEmployee(int employeeId) {
        return employeeDao.deleteEmployee(employeeId);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public Employee employeeLogin(String name, String department) {

        return employeeDao.employeeLogin(name, department);
    }



    public EmployeeDaoImpl getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
        this.employeeDao = employeeDao;
    }
}
