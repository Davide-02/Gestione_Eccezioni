package com.academy.main;
import com.academy.exceptions.InsufficientStock;
import com.academy.main.product;

public class main {
    public static void main(String[] args) {

        Product product = new Product();

        try {
            product.checkProductStock(15);
        } catch (InsufficientStock e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("*** DEALLOCO LE RISORSE NEL FINALLY ***");
        }

        System.out.println("*** FINE PROGRAMMA ***");

    }
}
