/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assignment;

/**
 *
 * @author AGHA SMART STORE
 */
public class Order {
    private int customerId;
    private int orderId;
    private product[] products;
    private double totalPrice;

    
    public Order(int customerId, product[] products) {
        this.customerId = Math.abs(customerId); 
        this.orderId = (int) (Math.random() * 1000); 
        this.products = products;
        this.totalPrice = calculateTotalPrice();
    }

    
    double calculateTotalPrice() {
        double totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (product product : products) {
            if (product != null) {
                System.out.println("- " + product.getName() + ": $" + product.getPrice());
            }
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}