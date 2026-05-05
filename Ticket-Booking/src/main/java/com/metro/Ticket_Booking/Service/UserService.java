package com.metro.Ticket_Booking.Service;

import java.util.List;

import com.metro.Ticket_Booking.Entity.User;
public interface UserService {
	
	User register(User user);
	
	List<User> getAllUser();
	
}
