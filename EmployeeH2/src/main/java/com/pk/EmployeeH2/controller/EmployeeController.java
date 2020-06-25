package com.pk.EmployeeH2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.EmployeeH2.Resp.EmployeeResp;
import com.pk.EmployeeH2.entity.Employee;
import com.pk.EmployeeH2.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@PostMapping("/add")
	public Employee create(@RequestBody EmployeeResp req) {
		return empService.create(req);
	
		
	}
	@GetMapping("/all")
	public List<Employee> fetch() {
		
		return empService.fetch();
		
	}
}
