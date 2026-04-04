package com.School.Management.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return repo.findAll().stream().map(Teacher_Dto::convert).collect(Collectors.toList());
	}

}
