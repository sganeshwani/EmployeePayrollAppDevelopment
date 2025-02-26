package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import lombok.Data;

@Data
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.getName();
        this.salary = employeeDTO.getSalary();
    }
}