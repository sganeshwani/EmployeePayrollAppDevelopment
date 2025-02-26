package com.bridgelabz.employeepayroll.services;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayroll;
import com.bridgelabz.employeepayroll.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    public EmployeePayroll addEmployee(EmployeePayrollDTO employeeDTO) {
        EmployeePayroll employee = new EmployeePayroll(employeeDTO);
        return repository.save(employee);  // Saves to MySQL
    }
}