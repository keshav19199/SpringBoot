package com.banking.PaymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Scope_Controller {
	
	@Autowired
	private Stud st;
	
	@GetMapping("/demo")
	public int gethascode()
	{
		return st.hashCode();
	}

}
