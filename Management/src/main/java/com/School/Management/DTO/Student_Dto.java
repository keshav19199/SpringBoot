package com.School.Management.DTO;

import com.School.Management.Entity.Student;

public class Student_Dto {
	
	int id;
	String name;
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
	
	public static Student_Dto convert(Student s)
	{
		Student_Dto sDto=new Student_Dto();
		sDto.setId(s.getId());
		sDto.setName(s.getName());
		
		return sDto;
	}

}
