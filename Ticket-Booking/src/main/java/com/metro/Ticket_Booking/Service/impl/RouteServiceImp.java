package com.metro.Ticket_Booking.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.Ticket_Booking.Entity.Route;
import com.metro.Ticket_Booking.Repository.RouteRepo;
import com.metro.Ticket_Booking.Service.RouteService;

@Service
public class RouteServiceImp implements RouteService{

	@Autowired
	private RouteRepo repo;

	@Override
	public Route addRoute(Route route) {
		return repo.save(route);
	}

	@Override
	public List<Route> getAllRoute() {
		return repo.findAll();
	}
	
}
