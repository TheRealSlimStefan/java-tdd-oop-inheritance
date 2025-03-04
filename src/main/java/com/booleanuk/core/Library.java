package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Product> products;

    public Library() {
        this.products = new ArrayList<>();
    }

    public void addToStock(Product product) {
        this.products.add(product);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInProduct(String title) {
        List<Product> filtered = this.products.stream()
                .filter(product -> product.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutProduct(String title) {
        List<Product> filtered = this.products.stream()
                .filter(product -> product.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
