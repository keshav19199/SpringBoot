package com.ticket.Airplane_ticket_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.Airplane_ticket_management.Entity.Ticket;
import com.ticket.Airplane_ticket_management.Repository.Ticket_Repository;

@Service
public class Ticket_service {
	
	@Autowired
	private Ticket_Repository repo;
	
	public String addTicket(Ticket t)
	{
		repo.save(t);
		return t.getTid()+" add successful";
	}

	public List<Ticket> getAll()
	{
		return repo.findAll();
	}
}
