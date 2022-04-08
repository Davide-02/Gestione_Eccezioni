package com.academy.exceptions;

public class InsufficientStock extends Exception{

    public InsufficientStock(String msg){
        super(msg);
    }
}