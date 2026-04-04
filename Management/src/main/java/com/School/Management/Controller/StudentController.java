package com.School.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.School.Management.Entity.Student;
import com.School.Management.Service.Student_service;

@RestController
public class StudentController {

	@Autowired
	public Student_service service;
	
	@PostMapping("/add-student")
	public String addAstudent(@RequestBody Student s)
	{
		return service.addStudent(s);
	}
	
	@GetMapping("/get-student")
	public List<Student> getAll()
	{
		return service.getAllStudent();
	}
	
}
