package com.ticket.Airplane_ticket_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.Airplane_ticket_management.Entity.Payment;
import com.ticket.Airplane_ticket_management.service.Payment_service;

@RestController
public class PaymentController {

	@Autowired
	private Payment_service service;
	
	@PostMapping("/add-payment")
	public String add(@RequestBody Payment p)
	{
		return service.addPayment(p);
	}
	
	@GetMapping("/get-payment")
	public List<Payment> getAll()
	{
		return service.getAll();
	}
}
