package com.School.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.School.Management.DTO.Student_Dto;
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
	public List<Student_Dto> get()
	{
		return service.getStudents();

	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable(value="id") int id)
	{
		service.deleteStudent(id);
		return "Student delete";
	}
}
