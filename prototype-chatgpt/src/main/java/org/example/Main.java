package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Smartphone", 699.99);
        Product product2 = new Product(2, "Laptop", 1199.99);
        Product product3 = new Product(3, "Headphones", 99.99);

        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("----- Online Shopping System -----");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    Product selectedProduct = getProductById(productId);
                    if (selectedProduct != null) {
                        cart.addItem(selectedProduct);
                        System.out.println("Product added to cart.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int removeProductId = scanner.nextInt();
                    Product productToRemove = getProductById(removeProductId);
                    if (productToRemove != null) {
                        cart.removeItem(productToRemove);
                        System.out.println("Product removed from cart.");
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;
                case 3:
                    System.out.println("----- Cart -----");
                    cart.viewCart();
                    break;
                case 4:
                    double total = cart.calculateTotal();
                    System.out.println("Total: $" + total);
                    cart.checkout();
                    flag = false;
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    private static Product getProductById(int id) {
        // Implement the logic to retrieve the product from a data source (e.g., database, API)
        // Here, we manually create a few products for demonstration purposes
        Product[] products = {
                new Product(1, "Smartphone", 699.99),
                new Product(2, "Laptop", 1199.99),
                new Product(3, "Headphones", 99.99)
        };

        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }
}
