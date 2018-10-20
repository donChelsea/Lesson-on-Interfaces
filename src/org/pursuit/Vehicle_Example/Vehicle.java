package org.pursuit.Vehicle_Example;

public class Vehicle implements wipeWindshield {

    String make;
    String model;
    int gas = 50;
    int mileage = 0;

    public Vehicle(String make,
                   String model) {
        this.make = make;
        this.model = model;
    }

    public void drive(int distance) {
        this.mileage = mileage + distance;
        this.gas = gas - distance;
    }


    @Override
    public void wipeWindshield(int howMuchRain) {

    }
}
