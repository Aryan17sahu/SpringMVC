package com.skytech.response;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "employeeId",
        "employeeName",
        "employeeAddress",
        "employeeSalary",
        "employeeDepartment",
        "employeePincode"
})
@Generated("jsonschema2pojo")
public class EmployeeList {

    @JsonProperty("employeeId")
    private Integer employeeId;
    @JsonProperty("employeeName")
    private String employeeName;
    @JsonProperty("employeeAddress")
    private String employeeAddress;
    @JsonProperty("employeeSalary")
    private Double employeeSalary;
    @JsonProperty("employeeDepartment")
    private String employeeDepartment;
    @JsonProperty("employeePincode")
    private Integer employeePincode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("employeeId")
    public Integer getEmployeeId() {
        return employeeId;
    }

    @JsonProperty("employeeId")
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @JsonProperty("employeeName")
    public String getEmployeeName() {
        return employeeName;
    }

    @JsonProperty("employeeName")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @JsonProperty("employeeAddress")
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    @JsonProperty("employeeAddress")
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @JsonProperty("employeeSalary")
    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    @JsonProperty("employeeSalary")
    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @JsonProperty("employeeDepartment")
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    @JsonProperty("employeeDepartment")
    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @JsonProperty("employeePincode")
    public Integer getEmployeePincode() {
        return employeePincode;
    }

    @JsonProperty("employeePincode")
    public void setEmployeePincode(Integer employeePincode) {
        this.employeePincode = employeePincode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}



