package com.relationship.Client.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.Client.Entity.Doctor;

@Repository
public interface Doctor_Repository extends JpaRepository<Doctor, Integer> {

}
