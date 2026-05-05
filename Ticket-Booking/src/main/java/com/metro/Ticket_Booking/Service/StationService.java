package com.metro.Ticket_Booking.Service;

import java.util.List;

import com.metro.Ticket_Booking.Entity.Station;

public interface StationService {
	
	Station addSation(Station station);
	List<Station> getAllStation();
	
}
