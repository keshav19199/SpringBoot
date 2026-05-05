package com.metro.Ticket_Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metro.Ticket_Booking.Entity.Station;

public interface StationRepo extends JpaRepository<Station,Long>{

}
