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
    public void showDetails(ProductForSale product) {
        if (product instanceof Chocolate) {
            Chocolate product1 = (Chocolate) product;
            System.out.println("Product type: " + product1.getType() + " Product price: " + product1.getPrice() +
                    " Product description: " + product1.getDescription() + " Chocolate brand: " + product1.getBrand() + " Is chocolate bitter?: " + product1.isBitter());
        }
    }

}
