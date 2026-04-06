package com.School.Management.Service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.School.Management.DTO.Student_Dto;
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
	
	public List<Student_Dto> getStudents()
	{
	   return repo.findAll().stream().map(Student_Dto::convert).collect(Collectors.toList());
		
	}
	
	
	public void deleteStudent(int s_id)
	{
		repo.deleteById(s_id);
	}
}
