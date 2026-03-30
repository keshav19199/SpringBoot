package com.JPA.connectivity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Service.Teacher_service;

@RestController
public class TeacherController {
	
	
	@Autowired
	private Teacher_service service;
	
	@PostMapping("/add-teacher")
	public String add(@RequestBody Teacher teach)
	{
		return service.addTeacher(teach);
	}
	
	@GetMapping("/get-teacher")
	public List<Teacher> getall()
	{
		return service.getAll();
	}

}
