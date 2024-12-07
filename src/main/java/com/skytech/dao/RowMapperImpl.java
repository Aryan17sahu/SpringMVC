package com.skytech.dao;

import com.skytech.pojo.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt(1));
        employee.setEmployeeName(rs.getString(2));
        employee.setEmployeeAddress(rs.getString(3));
        employee.setEmployeeSalary(rs.getDouble(4));
        employee.setEmployeeDepartment(rs.getString(5));
        employee.setEmployeePincode(rs.getInt(6));
        return employee;
    }


}
