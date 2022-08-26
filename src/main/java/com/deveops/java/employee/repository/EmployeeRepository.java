package com.deveops.java.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.deveops.java.employee.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
