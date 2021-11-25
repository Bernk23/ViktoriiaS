package com.svyrydova.hw10;

import java.util.Arrays;
import java.util.Random;

public class Truck extends Car {
    private Random random = new Random();
    private String cargo = "cargo";
    private String[] cargos = new String[7];

    public Truck(Series series, int year, Colour colour, double fuel) {
        super(series, year, colour, fuel);
    }

    @Override
    public void getStatistics() {
    }

    public void shipmentCargo() {
        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = cargo + String.valueOf(random.nextInt(15));
            System.out.println(cargos[i]);
        }
    }

    public void dischargeCargo() {
        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = null + String.valueOf(random.nextInt(15));;
            System.out.println(cargos[i]);
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "fuel=" + fuel +
                '}';
    }

    @Override
    public boolean getMovement () {
        this.fuel = fuel - expenditure*2;
        if (fuel <= 0) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public void refuel() {
        this.fuel = 100;
    }
}

