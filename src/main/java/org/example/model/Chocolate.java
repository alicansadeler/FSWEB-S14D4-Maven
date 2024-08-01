package org.example.model;

public class Chocolate extends ProductForSale {

    private String brand;
    private boolean bitter;


    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }



    public Chocolate(String type, int price, String description, String brand, boolean bitter) {
        super(type, price, description);
        this.brand = brand;
        this.bitter = bitter;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isBitter() {
        return bitter;
    }

    @Override
    public void showDetails() {
        System.out.println("Product type: " + getType() + " Product price: " + getPrice() +
                " Product description: " + getDescription() + " Chocolate brand: " + getBrand() +
                " Is chocolate bitter?: " + isBitter());
    }

}
