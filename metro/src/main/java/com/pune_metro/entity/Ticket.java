package com.pune_metro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double price;
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public Route getR() {
		return r;
	}
	public void setR(Route r) {
		this.r = r;
	}
	@ManyToOne
	@JoinColumn(name="user_id")
	private User u;
	
	@ManyToOne
	@JoinColumn(name="route_id")
	private Route r;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
