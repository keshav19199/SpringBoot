package com.pune_metro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pune_metro.entity.User;
import com.pune_metro.repository.User_Repo;

@Service
public class User_Service {
	
	@Autowired
	public User_Repo repo;
	
	public String addUser(User u)
	{
		repo.save(u);
		return u.getName()+" Add Successfully..!";
	}
	
	public List<User> getAll()
	{
		return repo.findAll();
	}

}
