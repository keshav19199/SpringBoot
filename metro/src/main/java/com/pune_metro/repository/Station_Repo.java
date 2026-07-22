package com.pune_metro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pune_metro.entity.Station;

@Repository
public interface Station_Repo extends JpaRepository<Station, Integer> {

}
