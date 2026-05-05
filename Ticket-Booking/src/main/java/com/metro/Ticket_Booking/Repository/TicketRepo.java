package com.metro.Ticket_Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metro.Ticket_Booking.Entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Long>{

}
