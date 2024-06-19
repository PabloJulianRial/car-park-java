package org.example.Vehicles;

import org.example.VanModel;
import org.example.Vehicle;

public class Van extends Vehicle {
    private VanModel model;


    public Van(VanModel model) {
        this.model = model;
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public String toString() {
        return "\uD83D\uDE90";
    }
}
