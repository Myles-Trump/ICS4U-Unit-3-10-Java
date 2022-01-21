/*
* The "UseVehicle" program lets the user use their vehicle
*
* @author  Myles Trump
* @version 1.0
* @since   2022-01-01
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class UseVehicle {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private UseVehicle() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        Vehicle vehicleVariable = new Vehicle();
        Bike bikeVariable = new Bike();
        System.out.println("Vehicle number of wheels.");
        vehicleVariable.numberOfWheels();
        System.out.println("\nBike number of wheels.");
        bikeVariable.numberOfWheels();
        System.out.println("\nDone.");
    }
}
