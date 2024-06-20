package org.example.Vehicles;

import org.example.Models.CarModel;
import org.example.Vehicle;

public class Car extends Vehicle {
    private final CarModel model;

    public Car(CarModel model) {
        this.model = model;
    }

    public CarModel getModel() {
        return model;
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public String toString() {
        return "\uD83D\uDE97";
    }
}
