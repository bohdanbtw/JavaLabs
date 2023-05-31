package com.example;
public class ArchimedesLawCalculator {

    public static double calculateBuoyancy(double mass, double volume, double fluidDensity) {
        double buoyancyForce = volume * fluidDensity * 9.8;
        return buoyancyForce - mass * 9.8;
    }
}
