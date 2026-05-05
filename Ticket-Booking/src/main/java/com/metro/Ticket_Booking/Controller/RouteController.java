package com.metro.Ticket_Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metro.Ticket_Booking.Entity.Route;
import com.metro.Ticket_Booking.Service.RouteService;

@RestController
public class RouteController {
	
	@Autowired
	private RouteService service;
	
	@PostMapping("/add-route")
	public Route addRoute(@RequestBody Route route)
	{
		return service.addRoute(route);
	}

	@GetMapping("/get-route")
	public List<Route> getAllRoute()
	{
		return service.getAllRoute();
	}
}
