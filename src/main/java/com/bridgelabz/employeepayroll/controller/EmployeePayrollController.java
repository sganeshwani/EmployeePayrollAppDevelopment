package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayroll;
import com.bridgelabz.employeepayroll.services.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    // GET request - Retrieve a welcome message
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Employee Payroll App!";
    }

    // POST request - Add a new employee
    @PostMapping("/add")
    public ResponseEntity<EmployeePayroll> addEmployee(@RequestBody EmployeePayrollDTO employeeDTO) {
        EmployeePayroll savedEmployee = service.addEmployee(employeeDTO);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}