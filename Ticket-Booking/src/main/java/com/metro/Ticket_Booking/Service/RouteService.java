package com.metro.Ticket_Booking.Service;

import java.util.List;

import com.metro.Ticket_Booking.Entity.Route;

public interface RouteService {
	
	Route addRoute(Route route);
	List<Route> getAllRoute();

}
