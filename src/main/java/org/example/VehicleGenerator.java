package org.example;

import org.example.Models.BikeModel;
import org.example.Models.CarModel;
import org.example.Models.VanModel;
import org.example.Vehicles.Bike;
import org.example.Vehicles.Car;
import org.example.Vehicles.Van;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VehicleGenerator {
    static Random random = new Random();

    public static List<Car> createCars(int count) {
        return Stream.generate(() -> new Car(CarModel.values()[random.nextInt(CarModel.values().length)]))
                .limit(count)
                .collect(Collectors.toList());
    }

    public static List<Bike> createBikes(int count) {
        return Stream.generate(() -> new Bike(BikeModel.values()[random.nextInt(BikeModel.values().length)]))
                .limit(count)
                .collect(Collectors.toList());
    }

    public static List<Van> createVans(int count) {
        return Stream.generate(() -> new Van(VanModel.values()[random.nextInt(VanModel.values().length)]))
                .limit(count)
                .collect(Collectors.toList());
    }
}
