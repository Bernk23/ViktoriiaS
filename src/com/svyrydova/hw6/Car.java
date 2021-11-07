package com.svyrydova.hw6;

public class Car {

    private Manufacturer manufacturer;
    private Engine powerType;
    private String colour;
    private double petrol;

    public Engine getPowerType() {
        return powerType;
    }

    public Car(Manufacturer manufacturer, Engine powerType, String colour) {
        this.manufacturer = manufacturer;
        this.powerType = powerType;
        this.colour = colour;
        this.petrol = 100;

    }

    /*public void setEngine(String engine) {
        this.engine = engine;
    }*/

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPetrol(Double petrol) {
        this.petrol = petrol;
    }

/*   public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }*/

    public void startEngine(String name) {
        System.out.println(name + " Start Engine");
    }

    public boolean isEnoughPetrolLevel() {
        if (petrol > 50) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer.getRussianName() + '\'' +
                ", engine='" + powerType + '\'' +
                ", colour='" + colour + '\'' +
                ", petrol=" + petrol +
                '}';

    }

}
