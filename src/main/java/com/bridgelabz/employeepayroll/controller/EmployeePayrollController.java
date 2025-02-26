package com.bridgelabz.employeepayroll.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    private final List<Employee> employeeList = new ArrayList<>();

    // GET: Retrieve all employees
    @GetMapping("/get")
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // GET: Retrieve a specific employee by ID
    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // POST: Add a new employee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        employee.setId(employeeList.size() + 1);
        employeeList.add(employee);
        return employee;
    }

    // PUT: Update an existing employee
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(updatedEmployee.getName());
                emp.setSalary(updatedEmployee.getSalary());
                return emp;
            }
        }
        return null;
    }

    // DELETE: Remove an employee
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
        return "Employee with ID " + id + " deleted!";
    }

    // Employee Model (Inner Class for Now)
    static class Employee {
        private int id;
        private String name;
        private long salary;

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public long getSalary() { return salary; }
        public void setSalary(long salary) { this.salary = salary; }
    }
}