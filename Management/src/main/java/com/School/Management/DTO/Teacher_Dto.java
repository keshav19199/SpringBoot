package com.School.Management.DTO;

import java.util.List;
import java.util.stream.Collectors;

import com.School.Management.Entity.Teacher;

public class Teacher_Dto {

	int id;
	String name;
	
	private List<Student_Dto> Student;
	
	public List<Student_Dto> getStudent() {
		return Student;
	}
	public void setStudent(List<Student_Dto> student) {
		Student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static Teacher_Dto convert(Teacher t)
	{
		Teacher_Dto Tdto=new Teacher_Dto();
		Tdto.setId(t.getId());
		Tdto.setName(t.getName());
		
		List<com.School.Management.Entity.Student> list=t.getS();
		
		Tdto.setStudent(list.stream().map(Student_Dto::convert).collect(Collectors.toList()));
		
		return Tdto;
	}
	
	
	
}
