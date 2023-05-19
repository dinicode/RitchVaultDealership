package com.cvaultrace;

import java.io.*;
import java.util.Scanner;


public class DealershipFileManager {

    public Dealership getDealership() throws FileNotFoundException {
        Dealership RitchiVault = new Dealership();
   try {
       // Read the CSV file that contains the vehicles
       File vehiclesFile = new File("VehicleInventory.csv");
       FileReader fr = new FileReader(vehiclesFile);
       BufferedReader br = new BufferedReader(fr);
       Scanner scanner = new Scanner(br);
       scanner.nextLine(); // skip the header line

       while (scanner.hasNextLine()) {
           String line = scanner.nextLine();
           String[] data = line.split(",");
           String make = data[0];
           String model = data[1];
           int year = Integer.parseInt(data[2]);
           double price = Double.parseDouble(data[3]);
           String condition = data[4];

           Vehicles vehicle = new Vehicles(make, model, year, condition, price);
           RitchiVault.addVehicle(vehicle);
           scanner.close();
       }
   } catch (FileNotFoundException ex){

   }

        return RitchiVault;
    }
}


