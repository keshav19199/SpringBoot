package com.punemetro.pune_metro_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punemetro.pune_metro_ticket_booking.entity.Route;

public interface RouteRepo extends JpaRepository<Route, Long>{

}
