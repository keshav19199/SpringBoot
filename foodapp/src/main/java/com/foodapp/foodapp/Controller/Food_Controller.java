package com.foodapp.foodapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.foodapp.foodapp.Entity.Orders;
import com.foodapp.foodapp.Entity.User;
import com.foodapp.foodapp.Service.Orders_Service;
import com.foodapp.foodapp.Service.User_Service;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class Food_Controller {

	@Autowired
	private User_Service userService;

	@Autowired
	private Orders_Service orderService;

	@PostMapping("/user")
	public User saveUser(@Valid @RequestBody User user) {
	    return userService.saveUser(user);
	}

	@PostMapping("order")
	public Orders placeOrder(@RequestBody Orders order) {
	    return orderService.placeOrder(order);
	}

	@GetMapping("orders")
	public List<Orders> getAllOrders() {
	    return orderService.getAllOrders();
	}
}