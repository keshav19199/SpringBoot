package com.punemetro.pune_metro_ticket_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punemetro.pune_metro_ticket_booking.entity.Booking;
import com.punemetro.pune_metro_ticket_booking.repository.BookingRepo;

@Service
public class BookingService {

	 @Autowired
	    private BookingRepo repo;

	    public Booking saveBooking(Booking booking) {
	        return repo.save(booking);
	    }

	    public List<Booking> getAllBookings() {
	        return repo.findAll();
	    }

	    public Booking getBookingById(Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    public void deleteBooking(Long id) {
	        repo.deleteById(id);
	    }
}
