package com.pune_metro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pune_metro.entity.Ticket;
import com.pune_metro.service.Ticket_Service;

@RestController
public class Ticket_Controller {
	
	@Autowired
	public Ticket_Service service;
	
	@PostMapping("/add-ticket")
	public String addTicket(Ticket t)
	{
		return service.addTicket(t);
	}
	
	@GetMapping("/get-ticket")
	public List<Ticket> getAll()
	{
		return service.getAll();
	}

}
