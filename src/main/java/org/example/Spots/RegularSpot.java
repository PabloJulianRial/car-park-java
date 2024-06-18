package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;
import org.example.Vehicles.Van;

public class RegularSpot extends Spot {
    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return !(vehicle instanceof Van);
    }

    @Override
    public int getSize() {
        return 2;
    }
}