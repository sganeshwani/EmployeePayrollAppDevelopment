package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService {

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        return new Employee(employeeDTO);
    }
}
