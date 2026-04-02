package com.foodapp.foodapp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.foodapp.Entity.User;
import com.foodapp.foodapp.Repository.User_Repository;

@Service
public class User_Service {

    @Autowired
    private User_Repository userRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }
}