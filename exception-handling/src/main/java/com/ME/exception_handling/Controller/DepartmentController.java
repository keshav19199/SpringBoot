package com.ME.exception_handling.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ME.exception_handling.Entity.Department;
import com.ME.exception_handling.Service.Department_service;

@RestController
public class DepartmentController {

	@Autowired
	public Department_service service;
	
	@PostMapping("/add-department")
	public String addDept(@RequestBody Department d)
	{
		return service.addDepartment(d);
	}
	
	@GetMapping("/get-department")
	public List<Department> getAll()
	{
		return service.getAll();
	}
}
