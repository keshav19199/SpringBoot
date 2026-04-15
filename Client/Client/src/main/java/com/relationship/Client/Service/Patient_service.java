package com.relationship.Client.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.relationship.Client.Entity.Patient;
import com.relationship.Client.Repositoy.Patient_Repository;

@Service
public class Patient_service {
	
	public Patient_Repository repo;
	
	public String addPatient(Patient p)
	{
		repo.save(p);
		return p.getP_name()+" add successfully..!!";		
	}
	
	public List<Patient> getAll()
	{
		return repo.findAll();
	}

}
