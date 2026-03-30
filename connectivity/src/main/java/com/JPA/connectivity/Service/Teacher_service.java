package com.JPA.connectivity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
