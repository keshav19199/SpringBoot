package com.JPA.connectivity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.Entity.Student;
import com.JPA.connectivity.Repository.Student_Repository;

@RestController
public class StudentController {
	
	@Autowired
	public Student_Repository repo;
	
	
	@PostMapping("/add-student")
	public String add(@RequestBody Student stud)
	{
		repo.save(stud);
		return stud.getName()+" save successful";
	}

}
