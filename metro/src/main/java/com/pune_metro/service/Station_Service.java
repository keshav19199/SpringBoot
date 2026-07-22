package com.pune_metro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pune_metro.entity.Station;
import com.pune_metro.repository.Station_Repo;

@Service
public class Station_Service {

	@Autowired
	public Station_Repo repo;
	
	public String addStaion(Station s)
	{
		repo.save(s);
		return " add successfully..!";
	}
	
	public List<Station> getAll()
	{
		return repo.findAll();
	}
	
	public String updateStation(Station s)
	{
		repo.save(s);
		return " updated successfully..!";
	}
	
	public String deleteStation(int s)
	{
		repo.deleteById(s);
		return " deleted Successfully..!";
	}
}
