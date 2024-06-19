package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;
import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

public class LargeSpot extends Spot {
    private int size = 3;

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return true;
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
        if (vehicle instanceof Bike && size > 0) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
        } else if (vehicle instanceof Car && size > 1) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
            reduceSize();
        } else if (vehicle instanceof Van && size > 2) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
            reduceSize();
            reduceSize();
        } else {
            System.out.println("Cant fit that vehicle here");
        }
    }
}
