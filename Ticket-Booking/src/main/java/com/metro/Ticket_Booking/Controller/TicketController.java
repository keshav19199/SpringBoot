package com.metro.Ticket_Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metro.Ticket_Booking.Entity.Ticket;
import com.metro.Ticket_Booking.Entity.User;
import com.metro.Ticket_Booking.Service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping("book-ticket")
	public Ticket bookTicket(@RequestBody Ticket ticket)
	{
		return service.bookTicket(ticket);
	}
	
	@GetMapping("/getAll-ticket")
	public List<Ticket> getAllTicket()
	{
		return service.getAllTicket();
	}
	
	@GetMapping("/get-userId-Ticket")
	public List<Ticket> getUserTicket(@PathVariable long userId)
	{
		return service.getTicketByUser(userId);
	}

}
