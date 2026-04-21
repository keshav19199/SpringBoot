package com.security.RBA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/get-data")
	public String getData()
	{
		return "this is demo data";
	}
	
	@PostMapping("/add-data/{id}")
	public String addData(@PathVariable("id")int id)
	{
		return "method add successfully";
	}
	
}
