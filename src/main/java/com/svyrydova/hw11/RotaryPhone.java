package com.svyrydova.hw11;

import java.util.Scanner;

public class RotaryPhone extends Phone{

    @Override
    public String call() {


    System.out.println("Наберите номер");
        Scanner scanner = new Scanner(System.in);
       String r = scanner.nextLine();
        return r;
    }


    @Override
    public String sms() {
        return null;
    }

    public RotaryPhone(Colour colour, Year year){
        super(colour, year);
    }

    public void circle() {
        System.out.println("Вращать диск");
    }


    @Override
    public void menu(){
        System.out.println("Введите цифры от 1 до 9");

    }

    @Override
    public void app() {

    }
}