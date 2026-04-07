package com.ticket.Airplane_ticket_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.Airplane_ticket_management.Entity.Payment;
import com.ticket.Airplane_ticket_management.Entity.Ticket;
import com.ticket.Airplane_ticket_management.Repository.Payment_Repository;

@Service
public class Payment_service {
	
	@Autowired
	private Payment_Repository repo;
	
	public String addPayment(Payment p)
	{
		repo.save(p);
		return p.getPid()+" add successful";
	}
	
	public List<Payment> getAll()
	{
		return repo.findAll();
	}

}
