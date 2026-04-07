package com.ticket.Airplane_ticket_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.Airplane_ticket_management.Entity.Customer;

@Repository
public interface Customer_Repository extends JpaRepository<Customer, Integer>{

}
