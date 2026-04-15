package com.JPA.connectivity.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.connectivity.DTO.TeacherDTO;
import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Repository.Teacher_Repository;

@Service
public class Teacher_service {
	
	
	@Autowired
	private Teacher_Repository repo;
	
	public String addTeacher(Teacher t)
	{
		repo.save(t);
		return t.getName()+" added successfully..";
	}
	
	public List<Teacher> getAll()
	{
		return repo.findAll();
	
	}
	
	
	public List<Teacher> getbyname(String name)
	{
		return repo.getByName(name);
	}
	
	
	public int updatemailbyid(int id, String email)
	{
		return repo.updatemail(id,email);
	}
	
	
	public List<TeacherDTO> getAll1()
	{
		List<Teacher> list=repo.findAll();
		
		return list.stream()
				.map((teacher)-> TeacherDTO.convert(teacher))
				.collect(Collectors.toList());
		
	}
}
