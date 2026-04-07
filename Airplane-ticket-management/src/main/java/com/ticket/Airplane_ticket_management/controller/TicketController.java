package com.ticket.Airplane_ticket_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.Airplane_ticket_management.Entity.Ticket;
import com.ticket.Airplane_ticket_management.service.Ticket_service;

@RestController
public class TicketController {
	
	@Autowired
	private Ticket_service service;
	
	@PostMapping("/add-ticket")
	public String add(@RequestBody Ticket t)
	{
		return service.addTicket(t);
	}
	
	
	@GetMapping("/get-ticket")
	public List<Ticket> getAll()
	{
		return service.getAll();
	}
	

}
