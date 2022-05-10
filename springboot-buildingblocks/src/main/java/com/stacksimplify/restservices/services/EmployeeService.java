package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import com.stacksimplify.restservices.entities.Employee;
import com.stacksimplify.restservices.repositories.EmployeeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//service
@Service
public class EmployeeService {

    //Autowire EmployeeRepository

    @Autowired
    private EmployeeRepository employeeRepository;

    //getAllEmployees Method

    public List<Employee> getAllEmployees() { 

        return employeeRepository.findAll();

    }

    //CreateEmployee Method
    public Employee createEmployee(Employee employee){

        return employeeRepository.save(employee);

    }

    //getEmployeeById
    public Optional<Employee> getEmployeeById(Long id){

        Optional<Employee> employee = employeeRepository.findById(id);
        return employee;
    } 

    //updateEmployeeById
    public Employee updateEmployeeById(Long id,Employee employee){

        employee.setId(id);
        return employeeRepository.save(employee);

    }
}
