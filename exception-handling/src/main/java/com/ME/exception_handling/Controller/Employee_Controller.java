package com.ME.exception_handling.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ME.exception_handling.Entity.Employee;
import com.ME.exception_handling.Service.Employee_service;

@RestController
public class Employee_Controller {

	@Autowired
	public Employee_service service;
	
	@PostMapping("/add-employee")
	public String addEmployee(@RequestBody Employee e)
	{
		return service.addEmployee(e);
	}
	
	@GetMapping("/get-employee")
	public List<Employee> getAll()
	{
		return service.getAll();
	}
	
	
}
