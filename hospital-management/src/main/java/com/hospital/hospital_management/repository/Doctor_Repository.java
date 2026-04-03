package com.hospital.hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital_management.entity.Doctor;

@Repository
public interface Doctor_Repository extends JpaRepository<Doctor, Integer> {

}
