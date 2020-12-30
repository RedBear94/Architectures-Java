package com.company;

import java.util.ArrayList;
import java.util.List;

// Composite
public class SpecialOffer extends Product {
    private List<Product> groupProducts = new ArrayList<>();

    public SpecialOffer(){
    }

    public SpecialOffer(List<Product> groupProducts) {
        this.groupProducts = groupProducts;
    }

    public void addProduct(Product product){
        groupProducts.add(product);
        findOverallPrice();
    }

    public void removeProduct(Product product){
        groupProducts.remove(product);
        findOverallPrice();
    }

    public void findOverallPrice(){
        for (Product product : groupProducts) {
            this.price = product.getPrice();
        }
    }
}
