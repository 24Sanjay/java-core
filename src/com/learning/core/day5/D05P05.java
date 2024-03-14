package com.learning.core.day5;

import java.util.HashSet;
import java.util.Iterator;

class Product2 {
    private String productId;
    private String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product2 product = (Product2) obj;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}

public class D05P05 {
    public static void main(String[] args) {
        HashSet<Product2> productSet = new HashSet<>();

        productSet.add(new Product2("P001", "Maruti 800"));
        productSet.add(new Product2("P002", "Maruti Swift"));
        productSet.add(new Product2("P003", "Maruti Dezire"));
        productSet.add(new Product2("P004", "Maruti Alto"));

        String productIdToRemove = "P002";

        Iterator<Product2> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product2 product = iterator.next();
            if (product.getProductId().equals(productIdToRemove)) {
                iterator.remove();
                System.out.println(productIdToRemove);
                break; 
            }
        }

        System.out.println("Remaining products:");
        for (Product2 product : productSet) {
            System.out.println( product.getProductId() +" " +  product.getProductName());
        }
    }
}



