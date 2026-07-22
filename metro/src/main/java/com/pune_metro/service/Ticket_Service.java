package com.pune_metro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pune_metro.entity.Ticket;
import com.pune_metro.repository.Ticket_Repo;

@Service
public class Ticket_Service {

	@Autowired
	public Ticket_Repo repo;
	
	public String addTicket(Ticket t)
	{
		repo.save(t);
		return t.getId()+"  Add SuccessFull..!";
	}
	
	public List<Ticket> getAll()
	{
		return repo.findAll();
	}
	
	public String updateTicket(Ticket t)
	{
		return repo.save(t)+" updated successfully..!";
	}
	
	public String deleteTicke(int i)
	{
		repo.deleteById(i);
		return " delete successfully..!";
	}
	
}
