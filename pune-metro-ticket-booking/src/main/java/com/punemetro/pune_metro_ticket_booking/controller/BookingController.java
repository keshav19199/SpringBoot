package com.punemetro.pune_metro_ticket_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.punemetro.pune_metro_ticket_booking.entity.Booking;
import com.punemetro.pune_metro_ticket_booking.service.BookingService;

@RestController
public class BookingController {
	
	 @Autowired
	    private BookingService service;

	    @PostMapping("/add-booking")
	    public Booking addBooking(@RequestBody Booking booking) {
	        return service.saveBooking(booking);
	    }

	    @GetMapping("/get-booking")
	    public List<Booking> getAllBookings() {
	        return service.getAllBookings();
	    }

	    @GetMapping("/get-booking-by-id/{id}")
	    public Booking getBookingById(@PathVariable Long id) {
	        return service.getBookingById(id);
	    }

	    @DeleteMapping("/delete-booking/{id}")
	    public String deleteBooking(@PathVariable Long id) {

	        service.deleteBooking(id);

	        return "Booking deleted successfully";
	    }
}
