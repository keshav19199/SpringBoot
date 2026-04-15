package com.School.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.School.Management.DTO.Teacher_Dto;
import com.School.Management.Entity.Teacher;
import com.School.Management.Service.Teacher_service;

@RestController
public class TeacherController {
	
	@Autowired
	public Teacher_service service;
	
	@PostMapping("/add-teacher")
	public String addteacher(@RequestBody Teacher t)
	{
		return service.addTeacher(t);
	}
	
	@GetMapping("/get-teacher")
	public List<Teacher_Dto> getAllTeacher()
	{
		return service.getAllTeacher();
	}
	
//	@GetMapping("/get-teacher-page")
//	 public Page<Teacher> getPage()	
//	{
//		 return service.getTeacher();	
//		 
//	}


}
