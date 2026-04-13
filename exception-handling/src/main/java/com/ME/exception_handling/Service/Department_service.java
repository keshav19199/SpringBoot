package com.ME.exception_handling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ME.exception_handling.Entity.Department;
import com.ME.exception_handling.Repository.Department_Repository;

@Service
public class Department_service {

		@Autowired
		public Department_Repository repo;
		
		public String addDepartment(Department d)
		{
			repo.save(d);
			return d.getName();
		}
		
		public List<Department> getAll()
		{
			return repo.findAll();
		}
		
		
}
