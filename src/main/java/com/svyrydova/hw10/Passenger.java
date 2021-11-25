package com.svyrydova.hw10;

import lombok.Getter;

import java.util.Random;


public class Passenger {

    Random random = new Random();
    private String passenger = "Passenger " + String.valueOf(random.nextInt(15));

    public String getPassenger() {
        return passenger = "Passenger " + String.valueOf(random.nextInt(15));
    }

}
