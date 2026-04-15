package com.JPA.connectivity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.DTO.TeacherDTO;
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
	public List<TeacherDTO> getall()
	{
		return service.getAll1();
	}
	
	
	@GetMapping("/get-by-nameteacher/{name}")
	public List<Teacher> getName(@PathVariable (value="name")  String name)
	{
		return service.getbyname(name);
	}

	
	@PutMapping("/updatemail/{id}/{email}")
	public int update(@PathVariable(value="id") int id, @PathVariable(value="email") String email)
	{
		return service.updatemailbyid(id, email);
	}
}
