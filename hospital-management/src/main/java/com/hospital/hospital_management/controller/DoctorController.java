package com.hospital.hospital_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital_management.entity.Doctor;

@RestController
public class DoctorController {

	@Autowired
	public DoctorController service;
	
	@PostMapping("/add-doctor")
	public String addDoctor(@RequestBody Doctor d)
	{
		service.addDoctor(d);
		return d.getD_name()+" add doctor";
	}
	
	@GetMapping("/get-doctor")
	public List<Doctor> getAllDoctor()
	{
		return service.getAllDoctor();
	}
}

