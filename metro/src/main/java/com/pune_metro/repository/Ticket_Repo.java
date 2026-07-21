package com.pune_metro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pune_metro.entity.Ticket;

@Repository
public interface Ticket_Repo extends JpaRepository<Ticket, Integer> {

}
