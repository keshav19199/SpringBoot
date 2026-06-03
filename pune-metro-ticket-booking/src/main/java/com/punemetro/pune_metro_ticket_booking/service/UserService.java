package com.punemetro.pune_metro_ticket_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punemetro.pune_metro_ticket_booking.entity.User;
import com.punemetro.pune_metro_ticket_booking.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public List<User> getAllUser()
	{
		return repo.findAll();
	}
	
	public User getUserById(Long id)
	{
		return repo.findById(id).orElse(null);
	}
	
	public void deleteUser(Long id)
	{
		repo.deleteById(id);
	}

}
