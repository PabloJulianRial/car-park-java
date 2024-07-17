
# Java  Parking Lot

## Overview

This project involves designing a parking lot using object-oriented principles. The solution is implemented in Java and accommodates different types of vehicles and parking spots.

## Assumptions

- The parking lot can hold motorcycles, cars, and vans.
- The parking lot has single, double, and triple spots.
- A motorcycle can park in any spot.
- A car can park in a double spot or three single spots.
- A van can park in a triple spot or take up three single spots.
- A double spot can hold 2 motorcycles or 1 car.
- A triple spot can hold a van, 3 motorcycles, or a motorcycle and a car.

## Specifications

The following methods are available:

- Display the number of remaining spots.
- Display the total number of spots in the parking lot.
- Indicate when the parking lot is full.
- Indicate when the parking lot is empty.
- Indicate when certain spots are full (e.g., all motorcycle spots are taken).
- Display the number of spots vans are taking up.

## Implementation Details

- The program prompts the user to input the number of each kind of spot to create the parking lot.
- It then asks how many of each vehicle to create and where to place each vehicle (next single available spot, next double, or next triple).
- The program provides information about the parking lot and ends when the parking lot is full.

## Classes

- **Main**: Combines all classes and methods to run the program.
- **ParkingLot**: Manages the parking lot, including spots and vehicles.
- **Spot**: Base class for all types of spots.
- **Vehicle**: Base class for all types of vehicles.
- **VehicleGenerator**: Generates instances of vehicles.
- **Bike**: Represents a motorcycle.
- **Car**: Represents a car.
- **Van**: Represents a van.
- **SingleSpot**: Represents a single parking spot.
- **DoubleSpot**: Represents a double parking spot.
- **TripleSpot**: Represents a triple parking spot.
- **BikeModel**: Model class for motorcycle specifications.
- **CarModel**: Model class for car specifications.
- **VanModel**: Model class for van specifications.

## How to Use

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/yourusername/car-park-java.git
    cd car-park-java
    ```

2. **Compile the Program**:
    ```sh
    javac Main.java
    ```

3. **Run the Program**:
    ```sh
    java Main
    ```

4. **Follow the Prompts**:
    - Enter the number of each type of spot to create the parking lot.
    - Enter the number of each type of vehicle.
    - Specify where to place each vehicle (next single, double, or triple spot).
    - View the information about the parking lot until it is full.

## Project Structure

- **Main.java**: Main class combines all the other classes and methods to run the program.
- **ParkingLot.java**: Manages the parking lot, including spots and vehicles.
- **Spot.java**: Base class for all types of spots.
- **Vehicle.java**: Base class for all types of vehicles.
- **VehicleGenerator.java**: Generates instances of vehicles.
- **Bike.java**: Represents a motorcycle.
- **Car.java**: Represents a car.
- **Van.java**: Represents a van.
- **SingleSpot.java**: Represents a single parking spot.
- **DoubleSpot.java**: Represents a double parking spot.
- **TripleSpot.java**: Represents a triple parking spot.
- **BikeModel.java**: Model class for motorcycle specifications.
- **CarModel.java**: Model class for car specifications.
- **VanModel.java**: Model class for van specifications.
- **README.md**: This file, providing an overview and usage instructions for the project.

## Contact

For any questions or suggestions, please reach out to [your email].




