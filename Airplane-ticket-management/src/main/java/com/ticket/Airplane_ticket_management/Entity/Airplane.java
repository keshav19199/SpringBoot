package com.ticket.Airplane_ticket_management.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Airplane {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int aid;
	String model;
	
	@OneToMany(mappedBy = "airplane")
	private List<Ticket> ticket;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	

}
