package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;
import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

public class RegularSpot extends Spot {
    private int size = 2;

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return !(vehicle instanceof Van);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void reduceSize() {
        this.size -= 1;
        if (this.size == 0) {
            setIsFull();
        }
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        if (this.size > 1 && vehicle instanceof Car) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
            reduceSize();
        } else if (this.size > 1 && vehicle instanceof Bike) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
        } else if (this.size == 1 && vehicle instanceof Bike) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
        } else {
            System.out.println("Can't fit that vehicle here");
        }
    }
}
