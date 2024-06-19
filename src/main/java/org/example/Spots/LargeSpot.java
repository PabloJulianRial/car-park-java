package org.example.Spots;

import org.example.Spot;
import org.example.Vehicle;

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
    public int setSize() {
        this.size -= 1;
        return 0;
    }
}
