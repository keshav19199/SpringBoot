package com.punemetro.pune_metro_ticket_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punemetro.pune_metro_ticket_booking.entity.Route;
import com.punemetro.pune_metro_ticket_booking.repository.RouteRepo;

@Service
public class RouteService {

	 @Autowired
	    private RouteRepo repo;

	    public Route saveRoute(Route route) {
	        return repo.save(route);
	    }

	    public List<Route> getAllRoutes() {
	        return repo.findAll();
	    }

	    public Route getRouteById(Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    public void deleteRoute(Long id) {
	        repo.deleteById(id);
	    }
}
