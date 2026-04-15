package com.JPA.connectivity.DTO;

import com.JPA.connectivity.Entity.Teacher;

public class TeacherDTO {

	
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
	
	public static TeacherDTO convert(Teacher t)
	{
		TeacherDTO dto=new TeacherDTO();
		
		dto.setId(t.getId());
		dto.setName(t.getName());
		
		return dto;
	}
}
