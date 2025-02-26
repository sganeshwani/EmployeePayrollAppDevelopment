package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private int employeeIdCounter = 1;

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Add new employee
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee(employeeIdCounter++, employeeDTO);
        employeeList.add(newEmployee);
        return newEmployee;
    }

    // Update existing employee
    public Employee updateEmployee(int id, EmployeeDTO employeeDTO) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(employeeDTO.getName());
                emp.setSalary(employeeDTO.getSalary());
                return emp;
            }
        }
        return null;
    }

    // Delete employee by ID
    public boolean deleteEmployee(int id) {
        return employeeList.removeIf(emp -> emp.getId() == id);
    }
}
