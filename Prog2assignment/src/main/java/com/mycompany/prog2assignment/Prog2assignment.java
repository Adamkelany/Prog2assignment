/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2assignment;

import java.util.Scanner;

/**
 *
 * @author AGHA SMART STORE
 */
public class Prog2assignment {

        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the E-Commerce system!\n");

        System.out.println("Please enter your id");
        int customerId = (scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nPlease enter your name");
        String name = scanner.nextLine();

        System.out.println("\nPlease enter your address");
        String address = scanner.nextLine();

        System.out.println("\nHow many products you want to add to your cart?");
        int numProducts = (scanner.nextInt());
        scanner.nextLine();

        product[] products = new product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nWhich product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    products[i] = new electronicproduct(1, "Smartphone", 599.99, "BrandX", 12);
                    break;
                case 2:
                    products[i] = new Clothingproduct(2, "T-Shirt", 19.99, "M", "Cotton");
                    break;
                case 3:
                    products[i] = new bookproductclass(3, "OOP", 239.99, "John Doe", "PublisherX");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        
        customer customer1 = new customer(customerId, name, address);


        cart cart1 = new cart(customer1.getCustomerId(), numProducts);
        for (int i = 0; i < numProducts; i++) {
            cart1.addProduct(products[i], i);
        }

        
        Order order1 = cart1.placeOrder();

        System.out.println("\nYour total is $" + order1.calculateTotalPrice());
        System.out.println("Would you like to place the order? 1- Yes 2- No");

        int choice = scanner.nextInt();
        if (choice == 1) {
            order1.printOrderInfo();
        } else {
            System.out.println("Order cancelled.");
        }

    }
}

