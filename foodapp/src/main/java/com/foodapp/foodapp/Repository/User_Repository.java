package com.foodapp.foodapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.foodapp.Entity.User;


public interface User_Repository extends JpaRepository<User, Integer> {
}
