package com.hospital.hospital_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.repository.Patient_Repository;

@Service
public class Patient_service {

	@Autowired
	public Patient_Repository repo;
	
	public String addPatient(Patient p)
	{
		repo.save(p);
		return p.getP_name()+" add sucessfully..!!";
	}
	
	public List<Patient> getAllPatient()
	{
		return repo.findAll();
	}
}
