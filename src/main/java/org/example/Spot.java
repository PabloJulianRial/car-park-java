package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Spot {
    protected List<Vehicle> parkedVehicles;
    private boolean isFull;

    public Spot() {
        this.isFull = false;
        this.parkedVehicles = new ArrayList<>();
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void setIsFull() {
        this.isFull = true;
    }

    public List<Vehicle> getParkedVehicles() {
        return parkedVehicles;
    }

    public abstract void parkVehicle(Vehicle vehicle);

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public abstract int getSize();

    public abstract void reduceSize();
}
