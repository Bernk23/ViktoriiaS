package com.svyrydova.modul2.models;

public class Television extends Sale {
    @Override
    public String toString() {

        return "Television: " +
                " diagonal is " + getDiagonal() + "," +
                " series is " + getSeries() + "," +
                " screen type is " + getScreenType() + "," +
                " country is " + getCountry() + "," +
                " price is " + getPrice();
    }
}
