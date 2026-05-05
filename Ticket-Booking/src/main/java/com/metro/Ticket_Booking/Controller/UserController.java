package com.metro.Ticket_Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metro.Ticket_Booking.Entity.User;
import com.metro.Ticket_Booking.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/register-user")
	public User register(@RequestBody User user)
	{
		return service.register(user);
	}
	
	@GetMapping("/get-user")
	public List<User> getAllUser()
	{
		return service.getAllUser();
	}

}
