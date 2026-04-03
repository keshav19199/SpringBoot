package com.hospital.hospital_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.service.Patient_service;

@RestController
public class PatientController {

	@Autowired
	public Patient_service service;
	
	@PostMapping("/add-patient")
	public String addPatient(@RequestBody Patient p)
	{
		return service.addPatient(p);
	}
	
	@GetMapping("get-patient")
	public List<Patient> getAllPatient()
	{
		return service.getAllPatient();
	}
	
}
