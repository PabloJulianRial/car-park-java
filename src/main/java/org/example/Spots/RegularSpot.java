package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;
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
    public int setSize() {
        this.size -= 1;
        return 0;
    }
}