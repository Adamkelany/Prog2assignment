/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assignment;

/**
 *
 * @author AGHA SMART STORE
 */
public class product {
 private int productId;
    private String name;
    private double price;


    public product(int productId, String name, double price) {
        this.productId = (productId);
        this.name = name;
        this.price = (price);
    }

    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = (productId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price);
    }
}
