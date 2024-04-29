/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assignment;

/**
 *
 * @author AGHA SMART STORE
 */
public class cart  {
private int customerID;
private int nproducts; 
private product[]products;

    public cart(int customerId, int nProducts) {
        this.customerID = Math.abs(customerId); 
        this.nproducts = Math.abs(nProducts); 
        this.products = new product[nProducts];
    }
public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = Math.abs(customerID);
    }

    public int getNproduct() {
        return nproducts;
    }

    public void setNproduct(int nproduct) {
        this.nproducts = Math.abs(nproduct);
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }
    
  
    public void addProduct(product product, int index) {
        if (index >= 0 && index < nproducts) {
            products[index] = product;
        } else {
            System.out.println("Invalid index");
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < nproducts) {
            products[index] = null;
        } else {
            System.out.println("Invalid index");
        }
    }

    public double calculatePrice() {
        double totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
      public Order placeOrder() {
        return new Order(customerID, products);
    }
}

