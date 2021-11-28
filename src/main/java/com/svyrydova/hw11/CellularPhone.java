package com.svyrydova.hw11;

import java.util.Scanner;

public class CellularPhone extends Phone{

    @Override
   String call() {

        System.out.println("Наберите номер");
        Scanner scanner = new Scanner(System.in);
        String r = scanner.nextLine();
         return r;
    }

    public String sms(){
        System.out.println("Напишите смс");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return null;
    }
    public CellularPhone(Variety variety, Variety2 variety2) {
        super(variety, variety2);
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

