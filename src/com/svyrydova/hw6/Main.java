package com.svyrydova.hw6;

public class Main {
    public static void main(String[] args) {

        Engine pt = new Engine(220.00,  "Sedan");
        Engine pt2 = new Engine(250.00, "Sedan" );

        Car myCar = new Car(Manufacturer.BMW,pt,"Red");

        Car myCar2 = new Car(Manufacturer.Ford,pt2,"Black");



        System.out.println(myCar);
        System.out.println(myCar2);

        myCar.startEngine("Nika");
        myCar2.startEngine("Sasha");

        System.out.println(myCar.isEnoughPetrolLevel());
        System.out.println(myCar2.isEnoughPetrolLevel());
    }
}

