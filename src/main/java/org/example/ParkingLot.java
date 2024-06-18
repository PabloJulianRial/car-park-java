package org.example;

import org.example.Spots.LargeSpot;
import org.example.Spots.RegularSpot;
import org.example.Spots.SingleSpot;

import java.util.ArrayList;

public class ParkingLot {
    ArrayList<SingleSpot> singleSpots;
    private ArrayList<RegularSpot> regularSpots;
    private ArrayList<LargeSpot> largeSpots;

    public ParkingLot(int large, int single, int regular) {
        singleSpots = new ArrayList<>();
        regularSpots = new ArrayList<>();
        largeSpots = new ArrayList<>();
        for (int i = 0; i < single; i++) {
            singleSpots.add(new SingleSpot());
        }
        for (int i = 0; i < regular; i++) {
            regularSpots.add(new RegularSpot());
        }
        for (int i = 0; i < large; i++) {
            largeSpots.add(new LargeSpot());
        }
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "singleSpots=" + singleSpots +
                ", regularSpots=" + regularSpots +
                ", largeSpots=" + largeSpots +
                '}';
    }
}
