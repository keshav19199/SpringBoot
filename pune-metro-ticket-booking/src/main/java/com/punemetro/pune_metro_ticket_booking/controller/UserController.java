package com.punemetro.pune_metro_ticket_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.punemetro.pune_metro_ticket_booking.entity.User;
import com.punemetro.pune_metro_ticket_booking.service.UserService;

@RestController
public class UserController {

	 @Autowired
	    private UserService service;

	    @PostMapping("/add-user")
	    public User addUser(@RequestBody User user) {
	        return service.saveUser(user);
	    }

	    @GetMapping("/get-user")
	    public List<User> getAllUser() {
	        return service.getAllUser();
	    }

	    @GetMapping("/get-by-id/{id}")
	    public User getUserById(@PathVariable Long id) {
	        return service.getUserById(id);
	    }

	    @DeleteMapping("/get-delete-by-id/{id}")
	    public String deleteUser(@PathVariable Long id) {

	        service.deleteUser(id);

	        return "User deleted successfully";
	    }
}
