package com.svyrydova.hw10;

import lombok.Getter;

import java.util.Random;


@Getter
public class Passenger {

 Random random = new Random();
    private String passenger = "Passenger " + String.valueOf(random.nextInt(15));

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger='" + passenger + '\'' +
                '}';
    }
}
