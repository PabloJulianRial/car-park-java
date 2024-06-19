package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;
import org.example.Vehicles.Bike;

public class SingleSpot extends Spot {
    private int size = 1;

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle instanceof Bike;
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
        if (vehicle instanceof Bike && this.size > 0) {
            this.parkedVehicles.add(vehicle);
            reduceSize();
        } else {
            System.out.println("Can't fit that vehicle here");
        }
    }
}
