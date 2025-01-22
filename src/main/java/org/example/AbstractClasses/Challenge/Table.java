package org.example.AbstractClasses.Challenge;

public class Table extends ProductForSale{


    public Table(String type, double price, String description) {
        super(type, price, description);
    }



    @Override
    public void showDetails() {
        System.out.println("this " + type + " was manufactured in Stockholm");
        System.out.println("The price of this is: " + price);
        System.out.println(description);
    }
}
