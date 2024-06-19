package org.example;

import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of large spots: ");
        int largeSpots = scanner.nextInt();

        System.out.print("Enter the number of single spots: ");
        int singleSpots = scanner.nextInt();

        System.out.print("Enter the number of regular spots: ");
        int regularSpots = scanner.nextInt();

        ParkingLot lot = new ParkingLot(largeSpots, singleSpots, regularSpots);

        System.out.print("Enter the number of cars to park: ");
        int numberOfCars = scanner.nextInt();

        System.out.print("Enter the number of bikes to park: ");
        int numberOfBikes = scanner.nextInt();

        System.out.print("Enter the number of vans to park: ");
        int numberOfVans = scanner.nextInt();

        List<Car> cars = VehicleGenerator.createCars(numberOfCars);

        List<Bike> bikes = VehicleGenerator.createBikes(numberOfBikes);

        List<Van> vans = VehicleGenerator.createVans(numberOfVans);

        System.out.println("Single spots");
        System.out.println("|_|".repeat(singleSpots));
        System.out.println("Regular spots");
        System.out.println("|__|".repeat(regularSpots));
        System.out.println("Large spots");
        System.out.println("|___|".repeat(largeSpots));
        System.out.println("\uD83C\uDFCD\uFE0F".repeat(bikes.size()));
        System.out.println("\uD83D\uDE97".repeat(cars.size()));
        System.out.println("\uD83D\uDE90".repeat(vans.size()));


        System.out.println(lot);
    }
}