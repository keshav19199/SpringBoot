package com.relationship.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.Client.Entity.Orders;
import com.relationship.Client.Service.Orders_service;

@RestController
public class OrdersController {

	@Autowired
	public Orders_service service;
	
	@PostMapping("/add-orders")
	public String addOrders(@RequestBody Orders o)
	{
		service.addOrders(o);
		return addOrders(o);
	}
	
	@GetMapping("/get-orders")
	public List<Orders> getAll()
	{
		return service.getAll();
	}
}
