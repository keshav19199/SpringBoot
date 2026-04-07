package com.ticket.Airplane_ticket_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.Airplane_ticket_management.Entity.Airplane;

@Repository
public interface Airplane_Repository extends JpaRepository<Airplane, Integer>{

	
}
