package com.skytech.dao;

import com.skytech.pojo.Employee;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getAllEmployee() {
        String query = "SELECT * FROM employee";


        List<Employee> employeeList = getJdbcTemplate().query(query, new RowMapper<Employee>() {
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
        });
        return employeeList;
    }

    @Override
    public int insertEmployeeDetails(Employee employee) {
        String query = "INSERT INTO employee VALUES(?,?,?,?,?,?) ";
        return jdbcTemplate.update(query, employee.getEmployeeId(), employee.getEmployeeName(), employee.getEmployeeAddress(), employee.getEmployeeSalary(), employee.getEmployeeDepartment(), employee.getEmployeePincode());
    }

    @Override
    public Employee getEmployee(int employeeId) {
        String query = "SELECT * FROM employee WHERE employeeId=?";
        return jdbcTemplate.queryForObject(query, new RowMapper<Employee>() {
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
        }, employeeId);

    }

    @Override
    public int deleteEmployee(int employeeId) {

        String query = "DELETE FROM employee WHERE employeeId=?";

        return getJdbcTemplate().update(query, employeeId);
    }

    @Override
    public int updateEmployee(Employee employee) {

        String query = "UPDATE employee SET employeeName=?, employeeAddress=? , employeeSalary=? , employeeDepartment=? ,employeePincode=? WHERE employeeId=?";


        return getJdbcTemplate().update(query, employee.getEmployeeName(), employee.getEmployeeAddress(), employee.getEmployeeSalary(),employee.getEmployeeDepartment(), employee.getEmployeePincode(), employee.getEmployeeId());
    }

    @Override
    public Employee employeeLogin(String name, String department) {
        String query = "SELECT * FROM employee where employeeName=? AND employeeDepartment=?";
        Employee employee=null;

        try {
             employee = getJdbcTemplate().queryForObject(query, new RowMapperImpl(), name, department);

        }
        catch (EmptyResultDataAccessException emptyResultDataAccessException){
            System.out.println("Invalid");
        }
        return employee;
    }




    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
