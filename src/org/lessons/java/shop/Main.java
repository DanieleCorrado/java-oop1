package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Product[] products = {new Product("PC","Portatile Asus", 1120.50,22),
                              new Product("Google pixel 7","Smartphone", 700,10),
                              new Product("Google Watch","Smartwatch", 599,5)};


        for (int i = 0; i < products.length; i++) {
            System.out.println("Il nome del prodotto " + (i+1) + " è: " + products[i].fullName());
            System.out.println("Il suo prezzo è: " + products[i].getTaxedPrice() + "Є");
        }
    }
}
