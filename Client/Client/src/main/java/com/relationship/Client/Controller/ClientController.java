package com.relationship.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.Client.Entity.User;
import com.relationship.Client.Service.User_service;

@RestController
public class ClientController {

	@Autowired
	public User_service service;
	
	@PostMapping("/add-user")
	public String add(@RequestBody User u)
	{
		return service.addUser(u);
	}
	
	@GetMapping("/get-user")
	public List<User> getAll()
	{
		return service.getAll();
	}
	
	
}
