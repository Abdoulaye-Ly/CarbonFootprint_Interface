/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farida.carbonfootprintapp;

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;

public class CarbonFootprintApp {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> items = new ArrayList<>();

        // Create objects
        items.add(new Building(1500, "electric")); // 1500 kWh electricity
        items.add(new Building(1200, "gas")); // 1200 kWh natural gas
        items.add(new Car(10000, 30, "gasoline")); // 10,000 miles, 30 mpg, gasoline
        items.add(new Car(8000, 25, "diesel")); // 8,000 miles, 25 mpg, diesel
        items.add(new Bicycle(500, false)); // 500 miles, manual bicycle
        items.add(new Bicycle(300, true)); // 300 miles, electric bicycle

        // Iterate and print carbon footprints
        for (CarbonFootprint item : items) {
            System.out.println(item);
            System.out.println("Carbon Footprint: " + item.getCarbonFootprint() + " kg CO₂");
            System.out.println();
        }
    }
}
