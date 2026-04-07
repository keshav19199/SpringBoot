package com.ticket.Airplane_ticket_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.Airplane_ticket_management.Entity.Customer;
import com.ticket.Airplane_ticket_management.Repository.Customer_Repository;

@Service
public class Customer_service {

	@Autowired
	private Customer_Repository repo;
	
	public String addCustomer(Customer c)
	{
		repo.save(c);
		return c.getCname()+" add successfully";
	}
	
	public List<Customer> getAll()
	{
		return repo.findAll();
	}
}
