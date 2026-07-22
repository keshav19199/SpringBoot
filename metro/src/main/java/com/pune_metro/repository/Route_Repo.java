package com.pune_metro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pune_metro.entity.Route;

@Repository
public interface Route_Repo extends JpaRepository<Route, Integer>{

}
