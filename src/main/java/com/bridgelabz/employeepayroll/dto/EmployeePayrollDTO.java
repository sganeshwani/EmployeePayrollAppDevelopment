package com.bridgelabz.employeepayroll.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeePayrollDTO {
    // Getters & Setters
    private String name;
    private long salary;

    // Constructor
    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}
