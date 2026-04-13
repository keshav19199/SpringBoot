package com.ME.exception_handling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ME.exception_handling.Entity.Employee;
import com.ME.exception_handling.Repository.Employee_Repository;

@Service
public class Employee_service {
	
	@Autowired
	public Employee_Repository repo;
	
	public String addEmployee(Employee e)
	{
		repo.save(e);
		return e.getName();
	}

	public List<Employee> getAll()
	{
		return repo.findAll();
	}

}
