package com.ticket.Airplane_ticket_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int pid;
	String Transaction_no;
	String status;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTransaction_no() {
		return Transaction_no;
	}
	public void setTransaction_no(String transaction_no) {
		Transaction_no = transaction_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
