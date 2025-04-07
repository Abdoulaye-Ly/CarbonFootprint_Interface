/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farida.carbonfootprintapp;

/**
 *
 * @author LENOVO
 */
public class Car implements CarbonFootprint {
    private double mileage; // in miles
    private double fuelEfficiency; // in miles per gallon (mpg)
    private String fuelType; // "gasoline" or "diesel"

    public Car(double mileage, double fuelEfficiency, String fuelType) {
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelType = fuelType;
    }

    @Override
    public double getCarbonFootprint() {
        double gallonsUsed = mileage / fuelEfficiency;
        if (fuelType.equals("gasoline")) {
            // Gasoline emits 8.89 kg CO₂ per gallon
            return gallonsUsed * 8.89;
        } else if (fuelType.equals("diesel")) {
            // Diesel emits 10.16 kg CO₂ per gallon
            return gallonsUsed * 10.16;
        }
        return 0; // Unknown fuel type
    }

    @Override
    public String toString() {
        return "Car [mileage=" + mileage + " miles, fuelEfficiency=" + fuelEfficiency + " mpg, fuelType=" + fuelType + "]";
    }
}
