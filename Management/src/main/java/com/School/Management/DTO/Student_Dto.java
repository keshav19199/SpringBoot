package com.School.Management.DTO;

import com.School.Management.Entity.Student;

public class Student_Dto {
	
	
	String name;
	String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public static Student_Dto convert(Student stud)
	{
		Student_Dto dto=new Student_Dto();
		dto.setName(stud.getName());
		dto.setAge(stud.getAge());
		
		return dto;
		
	}
	
	
	
}
