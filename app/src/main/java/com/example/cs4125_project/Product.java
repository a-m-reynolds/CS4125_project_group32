package com.example.cs4125_project;

public interface Product {
    String name = "";
    double price = 0.0;
    String size = "";
    int quantity = 0;
    String brand = "";
    String colour = "";
    String style = "";

    String getName();

    double getPrice();

    String getSize();

    int getQuantity();

    String getBrand();

    String getColour();

    String getStyle();

    String getImageURL();
}
