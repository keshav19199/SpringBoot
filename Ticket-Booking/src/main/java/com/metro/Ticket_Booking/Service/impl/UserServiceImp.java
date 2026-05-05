package com.metro.Ticket_Booking.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.Ticket_Booking.Entity.User;
import com.metro.Ticket_Booking.Repository.UserRepo;
import com.metro.Ticket_Booking.Service.UserService;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public User register(User user) {
		return repo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return repo.findAll();
	}

}
