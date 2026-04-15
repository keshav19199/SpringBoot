package com.JPA.connectivity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.Entity.Animal;
import com.JPA.connectivity.Service.Animal_service;

@RestController
public class AnimalController {

	@Autowired
	private Animal_service service;
	
	
	@PostMapping("/add-Animal")
	public String add(@RequestBody Animal an)
	{
		return service.addAnimal(an);
	}
	
	
	@GetMapping("/get-animal")
	public List<Animal> getAll()
	{
		return service.getAll();
	}
	

	@GetMapping("/get-by-name/{name}")
	public List<Animal> getName(@PathVariable (value="name")  String name)
	{
		return service.getbyname(name);
	}
	
}
