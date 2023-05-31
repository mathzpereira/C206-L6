package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        boolean removed = items.remove(product);
        if (removed) {
            System.out.println("Product removed from the cart.");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }


    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product product : items) {
                System.out.println("ID: " + product.getId());
                System.out.println("Name: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("---------------------------");
            }
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        items.clear();
        System.out.println("Checkout completed. Thank you for shopping!");
    }
}
