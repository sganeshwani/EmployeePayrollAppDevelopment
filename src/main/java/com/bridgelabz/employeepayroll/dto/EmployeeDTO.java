package com.bridgelabz.employeepayroll.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name should start with an uppercase letter and have at least 3 characters")
    private String name;

    private long salary;

    // Corrected constructor
    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = (long) salary;
    }
}