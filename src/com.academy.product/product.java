package com.academy.product;

import com.academy.exceptions.InsufficientStock;

public class Product {
    int availableStock = 10;

    public void checkProductStock(int qty) throws InsufficientStock{

        if (qty > availableStock)
            throw new InsufficientStock("Insufficient stock available");
        else
            System.out.println("Stock is Available");
    }

}
