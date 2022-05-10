package com.stacksimplify.restservices.controllers;

import com.stacksimplify.restservices.entities.Employee;
import com.stacksimplify.restservices.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//Controller
@RestController
public class EmployeeController {

    //Autowire EmployeeService
    @Autowired
    private EmployeeService employeeService;
    
    //getAllEmployee Method
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }

    //create employee method
    //@RequestBody Annotation
    //@PostMapping Annotaion
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){

        return employeeService.createEmployee(employee);
    }

}
