package com.relationship.Client.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.Client.Entity.User;

@Repository
public interface User_Repository extends JpaRepository<User, Integer>{

}
