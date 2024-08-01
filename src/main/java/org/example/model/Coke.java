package org.example.model;

public class Coke extends ProductForSale{

    private boolean isDiet;


    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    public boolean isDiet() {
        return isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Product type: " + getType() + " Product price: " + getPrice() +
                " Product description: " + getDescription() + " Is Coke Diet?: " + isDiet());
    }
}
