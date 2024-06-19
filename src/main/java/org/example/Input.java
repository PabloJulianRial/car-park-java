package org.example;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public int getParkingChoice(String[] vehicleArray, int vehicleToPark) {
        System.out.println("Enter 1 to park the " + vehicleArray[vehicleToPark - 1] + " in a single spot");
        System.out.println("Enter 2 to park the " + vehicleArray[vehicleToPark - 1] + " in a regular spot");
        System.out.println("Enter 3 to park the " + vehicleArray[vehicleToPark - 1] + " in a large spot");
        return scanner.nextInt();
    }

    public int getVehicleChoice() {
        System.out.println("Enter 1 to park a bike");
        System.out.println("Enter 2 to park a car");
        System.out.println("Enter 3 to park a van");
        return scanner.nextInt();
    }
}
