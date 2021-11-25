package com.svyrydova.hw10;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger();
        PassengerCar car = new PassengerCar(Series.AHA, 2020, Colour.RED, 100);
        Truck truck = new Truck(Series.AHA, 2020, Colour.RED, 100);


        Recovery car1 = new PassengerCar(Series.AW,2001, Colour.BLACK, 50.0d) {
            @Override
            public void refuel() {
                System.out.println("refuel");
            }
        };
        Recovery PassengerCar = new PassengerCar(Series.AHA, 2020, Colour.RED, 100);
        car.refuel();

    }
    }
