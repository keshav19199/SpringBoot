package com.School.Management.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.School.Management.DTO.Teacher_Dto;
import com.School.Management.Entity.Teacher;
import com.School.Management.Repository.Teacher_Repository;

@Service
public class Teacher_service {
	
	@Autowired
	public Teacher_Repository repo;
	
	public String addTeacher(Teacher t)
	{
		repo.save(t);
		return t.getName()+" add sussessfully";
	}
	
	public List<Teacher_Dto> getAllTeacher()
	{
		return repo.findAll().stream().map(Teacher_Dto::converter).collect(Collectors.toList());
		
	}
	
	
//	public Page<Teacher> getTeacher()
//	{
//		
//		Page<Teacher> page=repo.findAll(PageRequest.of(0, 4));
//		
//		return page;
//	}
	
	
	

}
