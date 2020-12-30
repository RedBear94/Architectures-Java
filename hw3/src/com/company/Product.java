package com.company;

public class Product implements ThingForSale {
    public int price;
    public String name;
    public String category;

    @Override
    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

}
