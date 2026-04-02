package com.foodapp.foodapp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String restaurant;
    private String foodItem;
    private int quantity;
    private int totalPrice;

    public Orders() {}

    public Orders(String restaurant, String foodItem, int quantity, int totalPrice) {
        this.restaurant = restaurant;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getId() { return id; }

    public String getRestaurant() { return restaurant; }
    public void setRestaurant(String restaurant) { this.restaurant = restaurant; }

    public String getFoodItem() { return foodItem; }
    public void setFoodItem(String foodItem) { this.foodItem = foodItem; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int getTotalPrice() { return totalPrice; }
    public void setTotalPrice(int totalPrice) { this.totalPrice = totalPrice; }
}
