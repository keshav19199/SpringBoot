package com.ticket.Airplane_ticket_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.Airplane_ticket_management.Entity.Airplane;
import com.ticket.Airplane_ticket_management.service.Airplane_service;

@RestController
public class AirplaneController {

	@Autowired
	private Airplane_service service;
	
	@PostMapping("/add-airplane")
	public String add(@RequestBody Airplane a)
	{
		return service.addAirplane(a);
	}
	
	@GetMapping("/get-airplane")
	public List<Airplane> getAll()
	{
		return service.getAll();
	}
	
}
