package com.svyrydova.hw10;

import lombok.Getter;

@Getter
public abstract class Car implements Recovery{

    private Series series;
    private int year;
    private Colour colour;
    public double fuel;
    public double expenditure = 10.0;


    public Car (Series series, int year, Colour colour, double fuel) {
        this.series = series;
        this.year = year;
        this.colour = colour;
        this.fuel = fuel;

    }
        public boolean getMovement () {
            this.fuel = fuel - expenditure;
            if (fuel <= 0) {
                return false;
            } else {
                return true;
            }

        }
        public abstract void getStatistics ();


    }


