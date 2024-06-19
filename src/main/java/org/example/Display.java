package org.example;

import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

import java.util.List;

public class Display {

    public static void printParkingLotStatus(ParkingLot lot) {
        System.out.println("\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F PARKING LOT \uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F");
        printSingleSpots(lot);
        printRegularSpots(lot);
        printLargeSpots(lot);
    }

    private static void printSingleSpots(ParkingLot lot) {
        System.out.print("Single spots: " + lot.getFreeSingleSpots().size() + " ");
        for (Spot spot : lot.getSingleSpots()) {
            if (!spot.getParkedVehicles().isEmpty()) {
                System.out.print("|" + spot.getParkedVehicles().get(0) + "|");
            } else {
                System.out.print("|_|");
            }
        }
        if (lot.getFreeSingleSpots().isEmpty()) {
            System.out.print(Color.ANSI_RED + "  ALL SINGLE SPOTS ARE OCCUPIED" + Color.ANSI_RESET);
        }
        System.out.println();
    }

    private static void printRegularSpots(ParkingLot lot) {
        System.out.print("Regular spots: " + lot.getFreeRegularSpots().size() + " ");
        for (Spot spot : lot.getRegularSpots()) {
            List<Vehicle> parkedVehicles = spot.getParkedVehicles();
            if (parkedVehicles.isEmpty()) {
                System.out.print("|__|");
            } else if (parkedVehicles.size() == 1 && parkedVehicles.get(0) instanceof Bike) {
                System.out.print("|" + parkedVehicles.get(0) + "_|");
            } else if (parkedVehicles.size() == 1 && parkedVehicles.get(0) instanceof Car) {
                System.out.print("|" + parkedVehicles.get(0) + "|");
            } else if (parkedVehicles.size() == 2) {
                System.out.print("|" + parkedVehicles.get(0) + parkedVehicles.get(1) + "|");
            }
        }
        if (lot.getFreeRegularSpots().isEmpty()) {
            System.out.print(Color.ANSI_RED + "  ALL REGULAR SPOTS ARE OCCUPIED" + Color.ANSI_RESET);
        }
        System.out.println();
    }

    private static void printLargeSpots(ParkingLot lot) {
        System.out.print("Large spots: " + lot.getFreeLargeSpots().size() + " ");
        for (Spot spot : lot.getLargeSpots()) {
            List<Vehicle> parkedVehicles = spot.getParkedVehicles();
            if (parkedVehicles.isEmpty()) {
                System.out.print("|___|");
            } else if (parkedVehicles.size() == 1) {
                System.out.print("|" + parkedVehicles.get(0) + "__|");
            } else if (parkedVehicles.size() == 2) {
                System.out.print("|" + parkedVehicles.get(0) + "|" + parkedVehicles.get(1) + "_|");
            } else {
                System.out.print("|" + parkedVehicles.get(0) + "|" + parkedVehicles.get(1) + "|" + parkedVehicles.get(2) + "|");
            }
        }
        if (lot.getFreeLargeSpots().isEmpty()) {
            System.out.println(Color.ANSI_RED + "  ALL LARGE SPOTS ARE OCCUPIED" + Color.ANSI_RESET);
        }
        System.out.println();
    }

    public static void printVehicles(List<Bike> bikes, List<Car> cars, List<Van> vans) {
        System.out.println("\uD83C\uDFCD\uFE0F".repeat(bikes.size()));
        System.out.println("\uD83D\uDE97".repeat(cars.size()));
        System.out.println("\uD83D\uDE90".repeat(vans.size()));
    }
}
