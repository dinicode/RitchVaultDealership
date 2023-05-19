package com.cvaultrace;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() throws FileNotFoundException {
        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Car Dealership!");
            System.out.println("1. Add a car");
            System.out.println("2. List all cars");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addCar(scanner);
                    break;
                case 2:
                    listCars();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        System.out.println("Thank you for using the Car Dealership!");
    }

    private void addCar(Scanner scanner) {
        System.out.print("Enter the make: ");
        String make = scanner.nextLine();

        System.out.print("Enter the model: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Vehicles car = new Vehicles(make, model, year, price);
        Dealership.getInventory().add(car);
        System.out.println("Car added successfully!");
    }

    private void listCars() {
        if (Dealership.getInventory().isEmpty()) {
            System.out.println("No cars available.");
        } else {
            System.out.println("Car Listing:");
            for (Vehicles car : Dealership.getInventory()) {
                System.out.println(car);
            }
        }
    }
}