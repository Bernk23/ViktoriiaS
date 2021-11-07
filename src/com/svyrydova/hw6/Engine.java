package com.svyrydova.hw6;

public class Engine {

    private double power;
    private String type;

    public Engine(double power, String type) {
        this.power = power;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                '}';
    }
}

