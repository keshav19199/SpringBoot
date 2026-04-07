package com.ticket.Airplane_ticket_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.Airplane_ticket_management.Entity.Airplane;
import com.ticket.Airplane_ticket_management.Repository.Airplane_Repository;

@Service
public class Airplane_service {
	
	@Autowired
	private Airplane_Repository repo;
	
	public String addAirplane(Airplane a)
	{
		repo.save(a);
		return a.getModel()+" add successfully";
	}
	
	public List<Airplane> getAll()
	{
		return repo.findAll();
	}
	

}
