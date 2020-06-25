package com.pk.EmployeeH2.repository;

import org.springframework.data.repository.CrudRepository;

import com.pk.EmployeeH2.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Long> {

}
