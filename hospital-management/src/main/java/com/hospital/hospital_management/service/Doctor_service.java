package com.hospital.hospital_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital_management.entity.Doctor;
import com.hospital.hospital_management.repository.Doctor_Repository;

@Service
public class Doctor_service {
	
	@Autowired
	public Doctor_Repository repo;
	
	public String addDoctor(Doctor d)
	{
		repo.save(d);
		return d.getD_name()+" add successfully..!!";
	}
	
	
	public List<Doctor> getAll()
	{
		return repo.findAll();
	}

}
