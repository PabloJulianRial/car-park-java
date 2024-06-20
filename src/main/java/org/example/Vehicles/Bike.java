package org.example.Vehicles;

import org.example.Models.BikeModel;
import org.example.Vehicle;

public class Bike extends Vehicle {
    private final BikeModel model;

    public Bike(BikeModel model) {
        this.model = model;
    }

    public BikeModel getModel() {
        return model;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "\uD83C\uDFCD️";
    }
}
