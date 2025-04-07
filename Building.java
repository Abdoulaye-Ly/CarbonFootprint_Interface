/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farida.carbonfootprintapp;

/**
 *
 * @author LENOVO
 */
public class Building implements CarbonFootprint {
     private double energyConsumption; // in kWh
    private String fuelType; // "electric" or "gas"

    public Building(double energyConsumption, String fuelType) {
        this.energyConsumption = energyConsumption;
        this.fuelType = fuelType;
    }

    @Override
    public double getCarbonFootprint() {
        if (fuelType.equals("gas")) {
            // Natural gas emits 0.18 kg CO₂ per kWh
            return energyConsumption * 0.18;
        } else if (fuelType.equals("electric")) {
            // Electricity emits 0.92 kg CO₂ per kWh (U.S. average)
            return energyConsumption * 0.92;
        }
        return 0; // Unknown fuel type
    }

    @Override
    public String toString() {
        return "Building [energyConsumption=" + energyConsumption + " kWh, fuelType=" + fuelType + "]";
    }
}
