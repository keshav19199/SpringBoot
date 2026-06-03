package com.punemetro.pune_metro_ticket_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.punemetro.pune_metro_ticket_booking.entity.Route;
import com.punemetro.pune_metro_ticket_booking.service.RouteService;

@RestController
public class RouteController {
	
	 @Autowired
	    private RouteService service;

	    @PostMapping("/add-route")
	    public Route addRoute(@RequestBody Route route) {
	        return service.saveRoute(route);
	    }

	    @GetMapping("/get-routes")
	    public List<Route> getAllRoutes() {
	        return service.getAllRoutes();
	    }

	    @GetMapping("/get-route-by-id/{id}")
	    public Route getRouteById(@PathVariable Long id) {
	        return service.getRouteById(id);
	    }

	    @DeleteMapping("/delete-route/{id}")
	    public String deleteRoute(@PathVariable Long id) {

	        service.deleteRoute(id);

	        return "Route deleted successfully";
	    }
}
