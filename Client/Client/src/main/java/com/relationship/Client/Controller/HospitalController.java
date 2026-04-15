package com.relationship.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.Client.Entity.Doctor;
import com.relationship.Client.Entity.Patient;
import com.relationship.Client.Service.Doctor_service;
import com.relationship.Client.Service.Patient_service;

@RestController
public class HospitalController {

	@Autowired
	public Patient_service p_service;
	
	@PostMapping("/add-patient")
		public String addPatient(@RequestBody Patient p)
		{
			return p_service.addPatient(p);
		}
	@GetMapping("/get-patient")
	public List<Patient> getAllPatient()
	{
		return p_service.getAll();
	}
	
	
	
	@Autowired
	public Doctor_service d_service;
	
	@PostMapping("/add-doctor")
	public String addDoctor(@RequestBody Doctor d)
	{
		return d_service.addDoctor(d);
	}
	
	@GetMapping("/get-doctor")
	public List<Doctor> getAllDoctor()
	{
		return d_service.getAll();
	}
}
