package com.metro.Ticket_Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metro.Ticket_Booking.Entity.Station;
import com.metro.Ticket_Booking.Service.StationService;

@RestController
public class StationController {
	
	@Autowired
	private StationService service;
	
	@PostMapping("/add-station")
	public Station addSation(@RequestBody Station station)
	{
		return service.addSation(station);
	}
	
	@GetMapping("/get-allStaion")
	public List<Station> getAllStation()
	{
		return service.getAllStation();
	}

}
