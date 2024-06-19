package org.example.Vehicles;

import org.example.BikeModel;
import org.example.Vehicle;

public class Bike extends Vehicle {
    private BikeModel model;

    public Bike(BikeModel model) {
        this.model = model;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "\uD83C\uDFCD\uFE0F";
    }
}
