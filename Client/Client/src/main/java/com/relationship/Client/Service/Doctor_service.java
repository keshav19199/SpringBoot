package com.relationship.Client.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.relationship.Client.Entity.Doctor;
import com.relationship.Client.Repositoy.Doctor_Repository;

@Service
public class Doctor_service {
	
	public Doctor_Repository repo;
	
	public String addDoctor(Doctor d)
	{
		repo.save(d);
		return d.getD_name()+" add successfully..!!!";
	}
	public List<Doctor> getAll()
	{
		return repo.findAll();
	}

}
