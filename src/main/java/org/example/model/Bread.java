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
    public void showDetails(ProductForSale product) {
        if (product instanceof Bread) {
            Bread product1 = (Bread) product;
            System.out.println("Product type: " + product1.getType() + " Product price: " + product1.getPrice() +
                    " Product description : " + product1.getDescription() + " Is Bread Gluten-Free? :" + product1.isGlutenFree());
        }
    }


}
