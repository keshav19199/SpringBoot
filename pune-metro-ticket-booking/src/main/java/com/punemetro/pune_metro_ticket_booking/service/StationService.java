package com.punemetro.pune_metro_ticket_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punemetro.pune_metro_ticket_booking.entity.Station;
import com.punemetro.pune_metro_ticket_booking.repository.StationRepo;

@Service
public class StationService {
	
	  @Autowired
	    private StationRepo repo;

	    public Station saveStation(Station station) {
	        return repo.save(station);
	    }

	    public List<Station> getAllStations() {
	        return repo.findAll();
	    }

	    public Station getStationById(Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    public void deleteStation(Long id) {
	        repo.deleteById(id);
	    }
	
}
