package com.svyrydova.hw11;

import java.util.Scanner;

public class CellularPhone extends Phone{

    @Override
    public String call() {

        System.out.println("Наберите номер");
        Scanner scanner = new Scanner(System.in);
        String r = scanner.nextLine();
        return r;
    }

    public String sms(){
        String s = null;
        return s;
    }

    public CellularPhone(Colour colour, Year year) {
        super(colour, year);
    }

    public void calendary() {
        System.out.println("Открыть календарь");
    }

    @Override
    public void menu(){
        System.out.println("Выберите пункт SMS");

    }

    @Override
    public void app() {
        System.out.println("Играть в Тетрис");

    }
}

