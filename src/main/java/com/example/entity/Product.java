package com.example.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
(name = "product")
public class Product {
 
    @Id //chiave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue definisce che la pk dev'essere generata automaticamente
    private Long id;
 
    @Column(nullable = false)
    private String name;
 
    @Column(nullable = false)
    private double price;
 
    @Column(nullable = false)
    private int quantity;
 
    // Getters
    public Long getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}