package com.stacksimplify.restservices.repositories;

import com.stacksimplify.restservices.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
