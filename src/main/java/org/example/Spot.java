package org.example;

public abstract class Spot {
    private boolean isFull;
    private Vehicle parkedVehicle;

    public Spot() {
        this.isFull = false;
        this.parkedVehicle = null;
    }

    public boolean getIsFull() {
        return isFull;
    }


    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isFull = true;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isFull = false;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public abstract int getSize();


}
