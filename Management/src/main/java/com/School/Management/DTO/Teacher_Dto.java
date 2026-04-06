package com.School.Management.DTO;

import java.util.List;
import java.util.stream.Collectors;

import com.School.Management.Entity.Student;
import com.School.Management.Entity.Teacher;

public class Teacher_Dto {
	
	String name;
	String degree;
	private List<Student_Dto> student;

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

	public List<Student_Dto> getStudent() {
		return student;
	}

	public void setStudent(List<Student_Dto> student) {
		this.student = student;
	}
	
	public static Teacher_Dto converter(Teacher teach)
	{
		Teacher_Dto tdto=new Teacher_Dto();
		tdto.setName(teach.getName());
		tdto.setDegree(teach.getDegree());
		List<Student> list=teach.getStudent();
		List<Student_Dto> sdto2=teach.getStudent().stream()
				.map(Student_Dto::convert).collect(Collectors.toList());
		
		tdto.setStudent(sdto2);
		//tdto.setStudent(list.stream().map(Student_Dto::convert).collect(Collectors.toList()));
		
		return tdto;
		
		
	}
	
	
	

	
}
