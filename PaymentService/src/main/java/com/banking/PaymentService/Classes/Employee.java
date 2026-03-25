package com.banking.PaymentService.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int id;
	String name;
	String email;
	

}
