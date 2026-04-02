package com.relationship.Client.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.Client.Entity.Orders;

@Repository
public interface Orders_Repository extends JpaRepository<Orders, Integer>{

}
