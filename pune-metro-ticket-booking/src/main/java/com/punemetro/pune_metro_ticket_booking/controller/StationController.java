package com.punemetro.pune_metro_ticket_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.punemetro.pune_metro_ticket_booking.entity.Station;
import com.punemetro.pune_metro_ticket_booking.service.StationService;

@RestController
public class StationController {
	
    @Autowired
    private StationService service;

    @PostMapping("/add-station")
    public Station addStation(@RequestBody Station station) {
        return service.saveStation(station);
    }

    @GetMapping("/get-stations")
    public List<Station> getAllStations() {
        return service.getAllStations();
    }

    @GetMapping("/get-station-by-id/{id}")
    public Station getStationById(@PathVariable Long id) {
        return service.getStationById(id);
    }

    @DeleteMapping("/delete-station/{id}")
    public String deleteStation(@PathVariable Long id) {

        service.deleteStation(id);

        return "Station deleted successfully";
    }
}
