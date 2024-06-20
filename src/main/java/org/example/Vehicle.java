package org.example;

public abstract class Vehicle {

    private boolean isParked;


    public Vehicle() {
        this.isParked = false;
    }

    public abstract int getSize();

//    public boolean isParked() {
//        return this.isParked;
//    }
//
//    public void park() {
//        this.isParked = true;
//    }
//
//    public void unPark() {
//        this.isParked = false;
//    }
}
