/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farida.carbonfootprintapp;

/**
 *
 * @author LENOVO
 */
public class Bicycle implements CarbonFootprint {
   private double distanceTraveled; // in miles
    private boolean isElectric; // true if electric, false if manual

    public Bicycle(double distanceTraveled, boolean isElectric) {
        this.distanceTraveled = distanceTraveled;
        this.isElectric = isElectric;
    }

    @Override
    public double getCarbonFootprint() {
        if (isElectric) {
            // Electric bicycles consume ~0.02 kWh per mile
            double energyConsumed = distanceTraveled * 0.02;
            // Electricity emits 0.92 kg CO₂ per kWh
            return energyConsumed * 0.92;
        } else {
            // Human-powered bicycles emit ~0.016 kg CO₂ per mile (food energy)
            return distanceTraveled * 0.016;
        }
    }

    @Override
    public String toString() {
        return "Bicycle [distanceTraveled=" + distanceTraveled + " miles, isElectric=" + isElectric + "]";
    } 
}
