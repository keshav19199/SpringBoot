package com.relationship.Client.DTO;

import com.relationship.Client.Entity.Teacher;

public class TeacherDTO {

	int id;
	String name;
	String degree;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	
	public static TeacherDTO convert(Teacher t)
	{
		TeacherDTO dto=new TeacherDTO();
		dto.setId(t.getId());
		dto.setName(t.getName());
		dto.setDegree(t.getDegree());
		
		return dto;
	}
}
