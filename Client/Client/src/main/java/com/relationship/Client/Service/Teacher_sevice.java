package com.relationship.Client.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationship.Client.Entity.Teacher;
import com.relationship.Client.Repositoy.Teacher_Repository;

@Service
public class Teacher_sevice {

	@Autowired
	public Teacher_Repository repo;
	
	public String addTeacher(Teacher t)
	{
		repo.save(t);
		return t.getName()+" added Successfully";
		
	}
	
	public List<Teacher> getAll()
	{
		return repo.findAll();
	}
}
