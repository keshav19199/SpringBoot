package com.relationship.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.Client.Entity.Teacher;
import com.relationship.Client.Service.Teacher_sevice;

@RestController
public class TeacherController {
	
	@Autowired
	public Teacher_sevice service;
	
	@PostMapping("/added-teacher")
	public String add(@RequestBody Teacher t)
	{
		return service.addTeacher(t);
	}
	
	@GetMapping("/geted-teacher")
	public List<Teacher> getall()
	{
		return service.getAll();
	}

}
