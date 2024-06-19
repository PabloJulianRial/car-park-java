package org.example;

import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] vehicleArray = {"bike", "car", "van"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of large spots: ");
        int largeSpots = scanner.nextInt();
        System.out.print("Enter the number of single spots: ");
        int singleSpots = scanner.nextInt();
        System.out.print("Enter the number of regular spots: ");
        int regularSpots = scanner.nextInt();
        ParkingLot lot = new ParkingLot(largeSpots, singleSpots, regularSpots);
        System.out.print(Color.ANSI_YELLOW + "Enter the number of bikes to park: " + Color.ANSI_RESET);
        int numberOfBikes = scanner.nextInt();
        System.out.print(Color.ANSI_BLUE + "Enter the number of cars to park: " + Color.ANSI_RESET);
        int numberOfCars = scanner.nextInt();
        System.out.print(Color.ANSI_GREEN + "Enter the number of vans to park: " + Color.ANSI_RESET);
        int numberOfVans = scanner.nextInt();
        List<Car> cars = VehicleGenerator.createCars(numberOfCars);
        List<Bike> bikes = VehicleGenerator.createBikes(numberOfBikes);
        List<Van> vans = VehicleGenerator.createVans(numberOfVans);
        List<? extends Spot>[] spotLists = (List<? extends Spot>[]) new List<?>[]{
                lot.getSingleSpots(),
                lot.getRegularSpots(),
                lot.getLargeSpots()
        };
        List<? extends Vehicle>[] vehicleLists = (List<? extends Vehicle>[]) new List<?>[]{
                bikes,
                cars,
                vans
        };
        while (!lot.isFull()) {
            System.out.println("\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F PARKING LOT \uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F\uD83C\uDD7F\uFE0F");
            System.out.print("Single  spots: " + lot.getFreeSingleSpots().size() + " ");
            for (Spot spot : lot.getSingleSpots()) {
                Vehicle parkedVehicle = spot.getParkedVehicle();
                if (parkedVehicle != null) {
                    System.out.print("|" + parkedVehicle + "|");
                } else {
                    System.out.print("|_|");
                }
            }
            if (lot.getFreeSingleSpots().isEmpty()) {
                System.out.print(Color.ANSI_RED + "  ALL SINGLE SPOTS ARE OCCUPIED" + Color.ANSI_RESET);
            }
            System.out.println();

            System.out.print("Regular spots: " + lot.getFreeRegularSpots().size() + " ");
            for (Spot spot : lot.getRegularSpots()) {
                if (spot.getIsFull()) {
                    Vehicle parkedVehicle = spot.getParkedVehicle();
                    if (parkedVehicle != null) {
                        System.out.print("|" + parkedVehicle + "|");
                    } else {
                        System.out.print("|__|");
                    }
                } else {
                    System.out.print("|__|");
                }
            }
            if (lot.getFreeRegularSpots().isEmpty()) {
                System.out.print(Color.ANSI_RED + "  ALL REGULAR SPOTS ARE OCCUPIED" + Color.ANSI_RESET);
            }
            System.out.println();
            System.out.print("Large   spots: " + lot.getFreeLargeSpots().size() + " ");
            for (Spot spot : lot.getLargeSpots()) {
                Vehicle parkedVehicle = spot.getParkedVehicle();
                if (parkedVehicle != null) {
                    System.out.print("|" + parkedVehicle + "|");
                } else {
                    System.out.print("|___|");
                }
            }
            if (lot.getFreeLargeSpots().isEmpty()) {
                System.out.println(Color.ANSI_RED + "  ALL LARGE SPOTS ARE OCCUPIED" + Color.ANSI_RESET);
            }
            System.out.println();
            System.out.println("\uD83C\uDFCD\uFE0F".repeat(bikes.size()));
            System.out.println("\uD83D\uDE97".repeat(cars.size()));
            System.out.println("\uD83D\uDE90".repeat(vans.size()));
            System.out.println(lot);
            System.out.println("Enter 1 to park a bike");
            System.out.println("Enter 2 to park a car");
            System.out.println("Enter 3 to park a van");
            int vehicleToPark = scanner.nextInt();
            System.out.println("Enter 1 to park the " + vehicleArray[vehicleToPark - 1] + " in a single spot");
            System.out.println("Enter 2 to park the " + vehicleArray[vehicleToPark - 1] + " in a regular spot");
            System.out.println("Enter 3 to park the " + vehicleArray[vehicleToPark - 1] + " in a large spot");
            int spotToPark = scanner.nextInt();
            List<? extends Spot> spots = spotLists[spotToPark - 1];
            List<? extends Vehicle> vehicles = vehicleLists[vehicleToPark - 1];
            for (Spot spot : spots) {
                if (!spot.getIsFull() && spot.canParkVehicle(vehicles.get(0)) && vehicles.get(0).getSize() <= spot.getSize()) {
                    spot.parkVehicle(vehicles.get(0));
                    vehicles.remove(0);
                    break;
                }
            }
            if (lot.isFull()) {
                System.out.println("\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB Parking lot is full, find another parking lot!!!\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB");
            }
        }
    }
}
