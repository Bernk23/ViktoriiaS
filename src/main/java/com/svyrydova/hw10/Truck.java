package com.svyrydova.hw10;

import java.util.Arrays;

public class Truck extends Car {

    private String cargo;
    private String[] cargos = new String[10];

    public Truck(Series series, int year, Colour colour, double fuel) {
        super(series, year, colour, fuel);
    }

    @Override
    public void getStatistics() {
    }

    public void shipmentCargo() {
        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = cargo;
        }
    }

    public void dischargeCargo() {
        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = null;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargo='" + cargo + '\'' +
                ", cargos=" + Arrays.toString(cargos) +
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

