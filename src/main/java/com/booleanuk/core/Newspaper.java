package com.booleanuk.core;

public class Newspaper extends Product {

    public Newspaper(String title) {
        super(title);
    }

    public String checkIn() {
        return "newspapers are not available for loan";
    }

    public String checkOut() {
        return "newspapers are not available for loan";
    }
}
