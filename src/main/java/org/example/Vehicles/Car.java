package org.example.Vehicles;

import org.example.CarModel;
import org.example.Vehicle;

public class Car extends Vehicle {
    private CarModel model;


    public Car(CarModel model) {
        this.model = model;
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
