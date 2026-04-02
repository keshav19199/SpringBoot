package com.foodapp.foodapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.foodapp.Entity.Orders;
import com.foodapp.foodapp.Repository.Orders_Repository;

@Service
public class Orders_Service {

    @Autowired
    private Orders_Repository orderRepo;

    public Orders placeOrder(Orders order) {
        return orderRepo.save(order);
    }

    public List<Orders> getAllOrders() {
        return orderRepo.findAll();
    }
}