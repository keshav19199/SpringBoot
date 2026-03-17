package com.banking.PaymentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo_1")
public class Controller_Demo1 {

	@GetMapping("/name")
	public String car()
	{
		return "swift";
	}

}
