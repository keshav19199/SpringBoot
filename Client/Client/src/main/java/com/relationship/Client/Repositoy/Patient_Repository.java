package com.relationship.Client.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.Client.Entity.Patient;

@Repository
public interface Patient_Repository extends JpaRepository<Patient, Integer>{

}
