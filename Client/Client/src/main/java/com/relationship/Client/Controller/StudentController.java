package com.relationship.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.Client.Entity.Student;
import com.relationship.Client.Repositoy.Student_Repository;

@RestController
public class StudentController {

	@Autowired
	public Student_Repository repo;
	
	@PostMapping("/added-student")
	public String add(@RequestBody Student s)
	{
		repo.save(s);
		return s.getName()+" added successfully";
	}
	
	
	@GetMapping("/geted-all")
	public List<Student> get()
	{
		return repo.findAll();
	}
	
}
