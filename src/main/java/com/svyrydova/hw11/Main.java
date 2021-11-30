package com.svyrydova.hw11;

public class Main{
    public static void main(String[] args) {


        RotaryPhone rotaryPhone = new RotaryPhone(Colour.RED, Year.Y1989);
        CellularPhone cellularPhone = new CellularPhone(Colour.RED, Year.Y1989);
        Smartphone smartphone = new Smartphone(Colour.RED, Year.Y1989);
        Service service = new Service();
        service.testPhone(rotaryPhone);
        service.testPhone(cellularPhone);
        service.testPhone(smartphone);


        int smart = smartphone.hashCode();
        int cell = cellularPhone.hashCode();
        if (smart != cell) {
            System.out.println("false");
        } else {
            System.out.println(cellularPhone.equals(smartphone));
        }
    }
}




