package org.example.AbstractClasses.Challenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {}

public abstract class Store {

    private static  ArrayList<ProductForSale> productList = new ArrayList<>();

    public static void main(String[] args){

        productList.add(new Phone("Iphone", 1200,"Smartphone by Apple"));
        productList.add(new Phone("Samsung galaxy s24", 1350,"Smartphone by samsung"));
        productList.add(new Table("Table", 4000,"Made with the finest mahogany"));
        productList.add(new Table("Table",2000,"made from swedish Oak"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        addItemToOrder(order1,2,2);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,2,3);
        addItemToOrder(order2,0,1);
        addItemToOrder(order2,2,1);
        printOrder(order2);
    }
    
    public static void listProducts(){
        for (var item : productList){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, productList.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }
}
