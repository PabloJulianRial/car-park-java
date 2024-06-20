package org.example;

import org.example.CLI.Color;
import org.example.CLI.Display;
import org.example.CLI.Input;
import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Input inputHandler = new Input();

        String[] vehicleArray = {"bike", "car", "van"};

        System.out.println();
        System.out.println(Color.ANSI_BLUE + "Let's build a parking lot....." + Color.ANSI_RESET);
        System.out.println();
        int singleSpots = inputHandler.getIntInput("Enter the number of single spots: ");
        int regularSpots = inputHandler.getIntInput("Enter the number of regular spots: ");
        int largeSpots = inputHandler.getIntInput("Enter the number of large spots: ");

        ParkingLot lot = new ParkingLot(largeSpots, singleSpots, regularSpots);

        int numberOfBikes = inputHandler.getIntInput(Color.ANSI_YELLOW + "Enter the number of bikes to park: " + Color.ANSI_RESET);
        int numberOfCars = inputHandler.getIntInput(Color.ANSI_BLUE + "Enter the number of cars to park: " + Color.ANSI_RESET);
        int numberOfVans = inputHandler.getIntInput(Color.ANSI_GREEN + "Enter the number of vans to park: " + Color.ANSI_RESET);

        List<Car> cars = VehicleGenerator.createCars(numberOfCars);
        List<Bike> bikes = VehicleGenerator.createBikes(numberOfBikes);
        List<Van> vans = VehicleGenerator.createVans(numberOfVans);

        List<Spot> singleSpotsList = lot.getSingleSpots();
        List<Spot> regularSpotsList = lot.getRegularSpots();
        List<Spot> largeSpotsList = lot.getLargeSpots();

        List<Spot>[] spotLists = new List[]{singleSpotsList, regularSpotsList, largeSpotsList};
        List<Vehicle>[] vehicleLists = new List[]{bikes, cars, vans};

        while (!lot.isFull()) {
            Display.printParkingLotStatus(lot);
            Display.printVehicles(bikes, cars, vans);

            int vehicleToPark = inputHandler.getVehicleChoice();
            int spotToPark = inputHandler.getParkingChoice(vehicleArray, vehicleToPark);

            List<Spot> spots = spotLists[spotToPark - 1];
            List<Vehicle> vehicles = vehicleLists[vehicleToPark - 1];

            for (Spot spot : spots) {
                if (!spot.getIsFull() && spot.canParkVehicle(vehicles.get(0)) && vehicles.get(0).getSize() <= spot.getSize()) {
                    spot.parkVehicle(vehicles.get(0));
                    vehicles.remove(0);
                    break;
                }
            }
            if (lot.isFull()) {
                System.out.println(Color.ANSI_PURPLE + "\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB Parking lot is full, find another parking lot!!!\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB\uD83D\uDEAB" + Color.ANSI_RESET);
            }
        }
    }
}
