package com.punemetro.pune_metro_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punemetro.pune_metro_ticket_booking.entity.Station;

public interface StationRepo extends JpaRepository<Station, Long>{

}
