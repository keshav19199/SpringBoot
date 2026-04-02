package com.foodapp.foodapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.foodapp.Entity.Orders;

public interface Orders_Repository extends JpaRepository<Orders, Integer> {
	
}