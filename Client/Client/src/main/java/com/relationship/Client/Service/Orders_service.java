package com.relationship.Client.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationship.Client.Entity.Orders;
import com.relationship.Client.Repositoy.Orders_Repository;

@Service
public class Orders_service {

	@Autowired
	public Orders_Repository repo;
	
	public String addOrders(Orders o)
	{
		repo.save(o);
		return o.getO_name()+" added";
	}
	
	public List<Orders> getAll()
	{
		return repo.findAll();
	}
}
