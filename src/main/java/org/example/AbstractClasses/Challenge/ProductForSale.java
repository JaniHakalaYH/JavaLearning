package org.example.AbstractClasses.Challenge;

public abstract class ProductForSale extends Store{

    protected String type;
    protected double price;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected String description;

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%2d quantity at $%8.2f each, %-15s %-35s %n",
                quantity, price, type, description);
    }

    public abstract void showDetails();
}
