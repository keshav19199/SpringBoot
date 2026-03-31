package com.JPA.connectivity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.connectivity.Entity.Animal;
import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Repository.Aniaml_Repository;

@Service
public class Animal_service {

	@Autowired
	private Aniaml_Repository repo;
	
	public String addAnimal(Animal a)
	{
		repo.save(a);
		return a.getName()+" added successfully";
		
	}
	
	
	public List<Animal> getAll()
	{
		return repo.findAll();
	}
	
	
	public List<Animal> getbyname(String name)
	{
		return repo.getByName(name);
		
	}
	
}
