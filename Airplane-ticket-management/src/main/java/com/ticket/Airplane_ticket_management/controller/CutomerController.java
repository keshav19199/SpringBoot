package com.ticket.Airplane_ticket_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.Airplane_ticket_management.Entity.Customer;
import com.ticket.Airplane_ticket_management.service.Customer_service;

@RestController
public class CutomerController {
	
	@Autowired
	
	private Customer_service service;
	
	@PostMapping("/add-customer")
	public String add(@RequestBody Customer c)
	{
		return service.addCustomer(c);
	}
	
	@GetMapping("/get-cutomer")
	public List<Customer> getAll()
	{
		return service.getAll();
	}
	

}
