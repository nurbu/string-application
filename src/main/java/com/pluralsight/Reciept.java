package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String item = "Yo-yo";
        double price = 2.99;
        int quantity = 3;
        double totalPrice = price * quantity;
        System.out.println("I bought " + quantity + " " + item + "s, one for each kid, and total was " + totalPrice);
    }
}
