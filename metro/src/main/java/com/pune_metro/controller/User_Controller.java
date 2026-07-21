package com.pune_metro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pune_metro.entity.User;
import com.pune_metro.service.User_Service;

@RestController
public class User_Controller {
	
	@Autowired
	public User_Service service;
	
	@PostMapping("/add-user")
	public String add(@RequestBody User u)
	{
		return service.addUser(u);
	}
	
	
	@GetMapping("get-user")
	public List<User> getAll()
	{
		return service.getAll();
	}

}
