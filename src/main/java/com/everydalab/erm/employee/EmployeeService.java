package com.everydalab.erm.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDataAccessService employeeDataAccessService;

    @Autowired
    public EmployeeService(EmployeeDataAccessService employeeDataAccessService) {
        this.employeeDataAccessService = employeeDataAccessService;
    }   // end constructor

    public List<Employee> getAllEmployees() {
        return employeeDataAccessService.selectAllEmployees();
    }
}   // end class
