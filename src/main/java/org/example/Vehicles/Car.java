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
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + '}';
    }
}
