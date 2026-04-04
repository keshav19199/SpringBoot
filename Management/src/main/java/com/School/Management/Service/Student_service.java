package com.School.Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.School.Management.Entity.Student;
import com.School.Management.Repository.Student_repository;

@Service
public class Student_service {

	@Autowired
	public Student_repository repo;
	
	public String addStudent(Student s)
	{
		repo.save(s);
		return s.getClass()+" add successful";
	}
	
	public List<Student> getAllStudent()
	{
		return repo.findAll();
	}
}
