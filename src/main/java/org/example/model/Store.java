package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Dark Chocolate", 10, "Rich dark chocolate", "ChocoBrand", true),
                new Coke("Soft Drink", 5, "Refreshing coke", true),
                new Bread("Whole Wheat Bread", 3, "Healthy whole wheat bread", true)
        };

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("--------------------");
        }
    }
}