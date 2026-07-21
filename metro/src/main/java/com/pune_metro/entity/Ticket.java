package com.pune_metro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

	@Id
	private String id;
	private double price;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
