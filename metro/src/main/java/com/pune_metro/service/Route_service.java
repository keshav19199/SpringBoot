package com.pune_metro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pune_metro.entity.Route;
import com.pune_metro.repository.Route_Repo;

@Service
public class Route_service {
	
	@Autowired
	public Route_Repo repo;
	
	public String addRoute(Route r)
	{
		repo.save(r);
		return " add successfully..!";
	}
	
	public List<Route> getAll()
	{
		return repo.findAll();
	}
	
	public String updateRoute(Route r)
	{
		return repo.save(r)+" updated successfully..!";
	}
	
	public String deleteRoute(int i)
	{
		repo.deleteById(i);
		return " deleted successfully..!";		
	}
}
