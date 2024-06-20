package org.example.Vehicles;

import org.example.Models.VanModel;
import org.example.Vehicle;

public class Van extends Vehicle {
    private final VanModel model;

    public Van(VanModel model) {
        this.model = model;
    }

    public VanModel getModel() {
        return model;
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
