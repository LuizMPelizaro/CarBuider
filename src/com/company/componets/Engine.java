package com.company.componets;

public class Engine {
    /**
     * Mais uma caracterisca do carro
     */

    private final double volume;
    private double mileage;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
