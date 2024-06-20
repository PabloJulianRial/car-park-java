package org.example.CLI;

import org.example.ParkingLot;
import org.example.Spot;
import org.example.Vehicle;
import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

import java.util.List;

public class Display {

    public static void printParkingLotStatus(ParkingLot lot) {
        System.out.println(Color.ANSI_BLUE + "\uD83C\uDD7F️\uD83C\uDD7F️\uD83C\uDD7F️\uD83C\uDD7F️\uD83C\uDD7F️ PARKING LOT \uD83C\uDD7F️\uD83C\uDD7F️\uD83C\uDD7F️\uD83C\uDD7F️\uD83C\uDD7F️" + Color.ANSI_BLUE);
        System.out.println();
        if (lot.isEmpty()) {
            System.out.println(Color.ANSI_PINK + "The parking lot is empty" + Color.ANSI_RESET);
        }
        System.out.println(Color.ANSI_YELLOW + "There are " + lot.getTotalSpots() + " spots in total in this parking lot: " + lot.getSingleSpots().size() + " single, " + lot.getRegularSpots().size() + " regular and " + lot.getLargeSpots().size() + " large" + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "There are " + lot.freeSpots() + " spots free in this parking lot" + Color.ANSI_RESET);
        System.out.println();
        printSingleSpots(lot);
        printRegularSpots(lot);
        printLargeSpots(lot);
        System.out.println();
    }

    private static void printSingleSpots(ParkingLot lot) {
        System.out.print("Single  spots free: " + lot.getFreeSingleSpots().size() + " ");
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
        System.out.print("Regular spots free: " + lot.getFreeRegularSpots().size() + " ");
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
        System.out.print("Large  spots  free: " + lot.getFreeLargeSpots().size() + " ");
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
        for (Bike bike : bikes) {
            System.out.print(Color.ANSI_RED + "|" + Color.ANSI_RESET);
            System.out.print(bike.getModel());
            System.out.print("\uD83C\uDFCD️");
            System.out.print(Color.ANSI_RED + "|" + Color.ANSI_RESET);
        }
        System.out.println();
        for (Car car : cars) {
            System.out.print(Color.ANSI_BLUE + "|" + Color.ANSI_RESET);
            System.out.print(car.getModel());
            System.out.print("\uD83C\uDFCD️");
            System.out.print(Color.ANSI_BLUE + "|" + Color.ANSI_RESET);
        }
        System.out.println();
        for (Van van : vans) {
            System.out.print(Color.ANSI_GREEN + "|" + Color.ANSI_RESET);
            System.out.print(van.getModel());
            System.out.print("\uD83C\uDFCD️");
            System.out.print(Color.ANSI_GREEN + "|" + Color.ANSI_RESET);
        }
        System.out.println();
        System.out.println();
    }

}
