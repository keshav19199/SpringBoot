package com.metro.Ticket_Booking.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.Ticket_Booking.Entity.Ticket;
import com.metro.Ticket_Booking.Repository.TicketRepo;
import com.metro.Ticket_Booking.Service.TicketService;

@Service
public class TicketServiceImp implements TicketService{
	
	@Autowired
	private TicketRepo repo;

	@Override
	public Ticket bookTicket(Ticket ticket) {
		return repo.save(ticket);
	}

	@Override
	public List<Ticket> getAllTicket() {
		return repo.findAll();
	}

	@Override
	public List<Ticket> getTicketByUser(Long userId) {
		return repo.findAll();
	}
	
	

}
