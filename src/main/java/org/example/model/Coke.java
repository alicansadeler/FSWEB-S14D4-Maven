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
    public void showDetails(ProductForSale product) {
        if (product instanceof Coke) {
            Coke product1 = (Coke) product;
            System.out.println("Product type: " + product1.getType() + " Product price: " + product1.getPrice() +
                    " Product description : " + product1.getDescription() + " Is Coke Diet? :" + product1.isDiet());
        }
    }
}
