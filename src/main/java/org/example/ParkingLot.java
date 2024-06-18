package org.example;

import org.example.Spots.LargeSpot;
import org.example.Spots.RegularSpot;
import org.example.Spots.SingleSpot;

import java.util.ArrayList;

public class ParkingLot {
    private ArrayList<SingleSpot> singleSpots;
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

    public int freeSpots() {
        return freeSpots(singleSpots.size(), regularSpots.size(), largeSpots.size());
    }

    public int getTotalSpots() {
        return singleSpots.size() + regularSpots.size() + largeSpots.size();
    }

    private int freeSpots(int single, int regular, int large) {
        int spots = 0;
        for (int i = 0; i < single; i++) {
            if (!singleSpots.get(i).getIsFull()) {
                spots++;
            }
        }
        for (int i = 0; i < regular; i++) {
            if (!regularSpots.get(i).getIsFull()) {
                spots++;
            }
        }
        for (int i = 0; i < large; i++) {
            if (!largeSpots.get(i).getIsFull()) {
                spots++;
            }
        }
        return spots;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "singleSpots=" + singleSpots.size() +
                ", regularSpots=" + regularSpots.size() +
                ", largeSpots=" + largeSpots.size() +
                ", freeSpots=" + freeSpots() +
                '}';
    }
}
