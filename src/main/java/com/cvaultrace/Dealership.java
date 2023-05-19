package com.cvaultrace;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private static List<Vehicles> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    public Dealership() {

    }


    public void addVehicle(Vehicles vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicles vehicles) {
        inventory.remove(vehicles);
    }

    public List<Vehicles> searchInventory(String make, String model, int minYear, int maxYear, double minPrice, double maxPrice) {
        List<Vehicles> results = new ArrayList<>();

        for (Vehicles vehicle : inventory) ;
        {
            Vehicles vehicle = null;
            if (vehicle.getMake().equalsIgnoreCase(make) &&
                    vehicle.getModel().equalsIgnoreCase(model) &&
                    vehicle.getYear() >= minYear &&
                    vehicle.getYear() <= maxYear &&
                    vehicle.getPrice() >= minPrice &&
                    vehicle.getPrice() <= maxPrice) {
                results.add(vehicle);
            }
        }

        return results;
    }

    public void printInventory() {
        System.out.println(name + " Koenigsegg Gemera ");
        for (Vehicles vehicle : inventory) {
            System.out.println(vehicle);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static List<Vehicles> getInventory() {
        return inventory;
    }

    public void setInventory(List<Vehicles> inventory) {
        this.inventory = inventory;
    }
}