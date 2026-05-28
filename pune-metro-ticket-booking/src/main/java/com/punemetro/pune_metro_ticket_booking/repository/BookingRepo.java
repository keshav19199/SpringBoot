package com.punemetro.pune_metro_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punemetro.pune_metro_ticket_booking.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long>{

}
