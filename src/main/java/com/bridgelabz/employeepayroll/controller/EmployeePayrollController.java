package com.bridgelabz.employeepayroll.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    // GET request - Retrieve a welcome message
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Employee Payroll App!";
    }

    // POST request - Add a new employee (Dummy message for now)
    @PostMapping("/add")
    public String addEmployee() {
        return "New Employee Added Successfully!";
    }

    // PUT request - Update employee details (Dummy message for now)
    @PutMapping("/update")
    public String updateEmployee() {
        return "Employee Details Updated!";
    }

    // DELETE request - Delete employee (Dummy message for now)
    @DeleteMapping("/delete")
    public String deleteEmployee() {
        return "Employee Deleted!";
    }
}