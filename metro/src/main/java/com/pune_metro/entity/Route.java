package com.pune_metro.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
//	private String source;
//	private String destination;
	
	@ManyToOne
	@JoinColumn(name="source_id")
	private Station s;
	
	public Station getS() {
		return s;
	}
	public void setS(Station s) {
		this.s = s;
	}
	public Station getD() {
		return d;
	}
	public void setD(Station d) {
		this.d = d;
	}
	
	@ManyToOne
	@JoinColumn(name="destination_id")
	private Station d;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getSource() {
//		return source;
//	}
//	public void setSource(String source) {
//		this.source = source;
//	}
//	public String getDestination() {
//		return destination;
//	}
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
	
}
