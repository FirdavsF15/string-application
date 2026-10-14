package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        System.out.println();
        String itemName;
        double price;
        int quantity;

        itemName = "apples";
        price = 7.10;
        quantity = 3;

        System.out.println("You bought " + quantity + " " + itemName + " for $" + price);
    }
}
