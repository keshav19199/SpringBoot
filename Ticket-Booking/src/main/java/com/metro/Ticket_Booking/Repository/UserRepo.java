package com.metro.Ticket_Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metro.Ticket_Booking.Entity.User;

public interface UserRepo extends JpaRepository<User,Long> {

}
