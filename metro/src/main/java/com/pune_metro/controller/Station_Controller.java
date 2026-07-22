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

import com.pune_metro.entity.Station;
import com.pune_metro.service.Station_Service;

@RestController
@RequestMapping("/station")
public class Station_Controller {

	@Autowired
	public Station_Service service;
	
	@PostMapping("/add-station")
	public String addStation(@RequestBody Station s)
	{
		return service.addStaion(s);
	}
	
	@GetMapping("/get-station")
	public List<Station> getAll()
	{
		return service.getAll();
	}
	
	@PutMapping("/update-station")
	public String updateStation(@RequestBody Station s)
	{
		return service.updateStation(s);
	}
	
	@DeleteMapping("/delete-station/{id}")
	public String deleteStation(@PathVariable int id)
	{
		return service.deleteStation(id);
	}
}
