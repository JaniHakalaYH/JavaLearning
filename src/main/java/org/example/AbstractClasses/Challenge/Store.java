package org.example.AbstractClasses.Challenge;

import java.util.ArrayList;

public abstract class Store {

    private static  ArrayList<ProductForSale> productList = new ArrayList<>();

    public static void main(String[] args){

        productList.add(new Phone("Iphone", 1200,"Smartphone by Apple"));
        productList.add(new Phone("Samsung galaxy s24", 1350,"Smartphone by samsung"));

        listProducts();
    }


    public static void listProducts(){
        for (var item : productList){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
