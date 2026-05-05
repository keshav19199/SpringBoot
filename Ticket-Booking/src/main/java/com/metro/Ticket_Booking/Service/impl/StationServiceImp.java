package com.metro.Ticket_Booking.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.Ticket_Booking.Entity.Station;
import com.metro.Ticket_Booking.Repository.StationRepo;
import com.metro.Ticket_Booking.Service.StationService;

@Service
public class StationServiceImp implements StationService{
	
	@Autowired
	private StationRepo repo;

	@Override
	public Station addSation(Station station) {
		return repo.save(station);
	}

	@Override
	public List<Station> getAllStation() {
		return repo.findAll();
	}
	
	
	

}
