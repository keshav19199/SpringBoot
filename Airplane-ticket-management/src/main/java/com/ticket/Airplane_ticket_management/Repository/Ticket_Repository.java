package com.ticket.Airplane_ticket_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.Airplane_ticket_management.Entity.Ticket;

@Repository
public interface Ticket_Repository extends JpaRepository<Ticket, Integer> {

}
