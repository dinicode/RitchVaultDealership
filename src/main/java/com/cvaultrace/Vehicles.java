package com.cvaultrace;

public class Vehicles {
    private String make;
    private String model;
    private String vehicleType;
    private int year;
    private String color;
    private double price;

    // constructors
    public Vehicles(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public Vehicles(String make, String model, int year, double price) {
    }

    // methods


    // getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;

    }
}



