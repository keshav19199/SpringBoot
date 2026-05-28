package com.punemetro.pune_metro_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
