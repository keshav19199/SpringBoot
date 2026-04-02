package com.relationship.Client.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {
	
	@Id
	int id;
	String Oname;
	Double Price;
	String Ocity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getO_name() {
		return Oname;
	}
	public void setO_name(String o_name) {
		Oname = o_name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getO_city() {
		return Ocity;
	}
	public void setO_city(String o_city) {
		Ocity = o_city;
	}
	
	
	

}
