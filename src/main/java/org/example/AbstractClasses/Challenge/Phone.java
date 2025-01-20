package org.example.AbstractClasses.Challenge;

public class Phone extends ProductForSale {


    public Phone(String type, double price, String description) {
        super(type, price, description);
    }



    @Override
    public void showDetails() {
        System.out.println("this is a " + type);
        System.out.println("The price of this is: " + price);
        System.out.println(description);
    }
}
