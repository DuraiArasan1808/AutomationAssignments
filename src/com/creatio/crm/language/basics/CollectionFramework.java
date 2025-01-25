package com.creatio.crm.language.basics;
import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        // Initialize the data directly without loops
        Map<String, String> product1 = new HashMap<>();
        product1.put("Product ID", "P001");
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "$1,200");
        product1.put("Stock Quantity", "50");
        product1.put("Supplier", "Tech Supplies");
        product1.put("Warranty", "2 years");
        product1.put("Rating", "4.5");
        product1.put("Manufacturing Date", "15-01-2023");
        product1.put("Expiry Date", "15-01-2025");

        Map<String, String> product2 = new HashMap<>();
        product2.put("Product ID", "P002");
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "$150");
        product2.put("Stock Quantity", "200");
        product2.put("Supplier", "Office Depot");
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4");
        product2.put("Manufacturing Date", "10-02-2023");
        product2.put("Expiry Date", "N/A");

        Map<String, String> product3 = new HashMap<>();
        product3.put("Product ID", "P003");
        product3.put("Name", "Coffee Maker");
        product3.put("Category", "Kitchen");
        product3.put("Price", "$75");
        product3.put("Stock Quantity", "100");
        product3.put("Supplier", "KitchenWorld");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.2");
        product3.put("Manufacturing Date", "20-03-2023");
        product3.put("Expiry Date", "20-03-2024");

        // Print data for product1
        System.out.println("Product Details for Product 1:");
        System.out.println("Product ID: " + product1.get("Product ID"));
        System.out.println("Name: " + product1.get("Name"));
        System.out.println("Category: " + product1.get("Category"));
        System.out.println("Price: " + product1.get("Price"));
        System.out.println("Stock Quantity: " + product1.get("Stock Quantity"));
        System.out.println("Supplier: " + product1.get("Supplier"));
        System.out.println("Warranty: " + product1.get("Warranty"));
        System.out.println("Rating: " + product1.get("Rating"));
        System.out.println("Manufacturing Date: " + product1.get("Manufacturing Date"));
        System.out.println("Expiry Date: " + product1.get("Expiry Date"));

        // Print data for product2
        System.out.println("\nProduct Details for Product 2:");
        System.out.println("Product ID: " + product2.get("Product ID"));
        System.out.println("Name: " + product2.get("Name"));
        System.out.println("Category: " + product2.get("Category"));
        System.out.println("Price: " + product2.get("Price"));
        System.out.println("Stock Quantity: " + product2.get("Stock Quantity"));
        System.out.println("Supplier: " + product2.get("Supplier"));
        System.out.println("Warranty: " + product2.get("Warranty"));
        System.out.println("Rating: " + product2.get("Rating"));
        System.out.println("Manufacturing Date: " + product2.get("Manufacturing Date"));
        System.out.println("Expiry Date: " + product2.get("Expiry Date"));

        // Print data for product3
        System.out.println("\nProduct Details for Product 3:");
        System.out.println("Product ID: " + product3.get("Product ID"));
        System.out.println("Name: " + product3.get("Name"));
        System.out.println("Category: " + product3.get("Category"));
        System.out.println("Price: " + product3.get("Price"));
        System.out.println("Stock Quantity: " + product3.get("Stock Quantity"));
        System.out.println("Supplier: " + product3.get("Supplier"));
        System.out.println("Warranty: " + product3.get("Warranty"));
        System.out.println("Rating: " + product3.get("Rating"));
        System.out.println("Manufacturing Date: " + product3.get("Manufacturing Date"));
        System.out.println("Expiry Date: " + product3.get("Expiry Date"));
    }
}
