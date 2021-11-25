package com.svyrydova.hw10;

import java.util.Arrays;

public class PassengerCar extends Car {
    private String[] passengers;

    public PassengerCar(Series series, int year, Colour colour, double fuel) {
        super(series, year, colour, fuel);
    }

    @Override
    public void getStatistics() {

    }

    public void setPassenger(Passenger passenger) {
        for (int i = 0; i < 3; i++) {
            passengers[i] = passenger.getPassenger();
        }

    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "passengers=" + Arrays.toString(passengers) +
                '}';
    }

    @Override
    public void refuel() {
        this.fuel = 100;
    }
}





