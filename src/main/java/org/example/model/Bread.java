package org.example.model;

public class Bread extends ProductForSale{

    private boolean isGlutenFree;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, boolean isGlutenFree) {
        super(type, price, description);
        this.isGlutenFree = isGlutenFree;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Product type: " + getType() + " Product price: " + getPrice() +
                " Product description: " + getDescription() + " Is Bread Gluten-Free?: " + isGlutenFree());
    }


}
