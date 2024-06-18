package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;

public class LargeSpot extends Spot {
    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return true;
    }

    @Override
    public int getSize() {
        return 3;
    }
}
