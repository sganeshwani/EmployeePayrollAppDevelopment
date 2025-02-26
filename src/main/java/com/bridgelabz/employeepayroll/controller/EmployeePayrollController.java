package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    private final List<Employee> employeeList = new ArrayList<>();
    private int empIdCounter = 1;  // To generate unique IDs

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

    // POST: Add a new employee (Uses DTO)
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = new Employee(empIdCounter++, employeeDTO.name, employeeDTO.salary);
        employeeList.add(employee);
        return employee;
    }
}