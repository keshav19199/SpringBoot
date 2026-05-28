package com.metro.Ticket_Booking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.Ticket_Booking.Entity.User;
import com.metro.Ticket_Booking.Repository.UserRepo;

@Service
public interface UserService {
	
	@Autowired
	private UserRepo repo;
	
	public User registerUser(User user)
	{
		return repo.save(user);
				
	}
	
	 
	
}
