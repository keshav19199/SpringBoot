package com.pune_metro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pune_metro.entity.Route;
import com.pune_metro.service.Route_service;

@RestController
@RequestMapping("/route")
public class Route_Controller {
	
	@Autowired
	public Route_service service;
	
	@PostMapping("/add-route")
	public String addRoute(@RequestBody Route r)
	{
		return service.addRoute(r);
	}
	
	@GetMapping("/get-route")
	public List<Route> getAll()
	{
		return service.getAll();
	}
	
	@PutMapping("/update-route")
	public String updateRoute(@RequestBody Route r)
	{
		return service.updateRoute(r);
	}
	
	@DeleteMapping("/delete-route/{i}")
	public String deleteRoute(@PathVariable int i)
	{
		return service.deleteRoute(i);
	}

}
