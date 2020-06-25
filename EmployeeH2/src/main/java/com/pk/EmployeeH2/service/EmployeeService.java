package com.pk.EmployeeH2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.EmployeeH2.Resp.EmployeeResp;
import com.pk.EmployeeH2.entity.Employee;
import com.pk.EmployeeH2.repository.EmpRepository;
@Service
public class EmployeeService {
	@Autowired
	EmpRepository repo;
public Employee create(EmployeeResp req) {
	Employee emp=new Employee();
	emp.setName(req.getName());
	return repo.save(emp);
	
	
}
public List<Employee> fetch() {
	return  (List<Employee>) repo.findAll();

	
}
}
