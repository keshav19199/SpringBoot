package com.relationship.Client.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationship.Client.Entity.User;
import com.relationship.Client.Repositoy.User_Repository;

@Service
public class User_service {

	@Autowired
	public User_Repository repo;
	
	public String addUser(User u)
	{
		repo.save(u);
		return u.getU_name()+" add successfully";
	}
	
	public List<User> getAll()
	{
		return repo.findAll();
	}
	
}
