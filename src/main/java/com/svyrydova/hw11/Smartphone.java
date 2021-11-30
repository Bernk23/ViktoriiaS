package com.svyrydova.hw11;

import java.util.Scanner;

public class Smartphone extends Phone {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String call() {

        System.out.println("Введите номер абонента");
        String r = scanner.nextLine();
        System.out.println("Нажмите 1 для видеосвязи,2 для голосового вызова, 3 для подключения Интернета");

        String v = scanner.nextLine();
                System.out.println("Видеозвонок");

             String vs = scanner.nextLine();
                System.out.println("голосовой вызов");

        String wf = scanner.nextLine();
      return "Нажмите кнопку для подключения Wi Fi";


        }
    public void flashlight() {
        System.out.println("Включить фонарь");
    }

    public Smartphone(Colour colour, Year year) {
        super(colour, year);
    }
    public String sms() {
        System.out.println("Введите ваше сообщение");
        String s = scanner.nextLine();
        return s;
    }
    @Override
    public void menu() {
        System.out.println("Включите Wi Fi");

    }

    @Override
    public void app() {
        System.out.println("Включите меню приложений");

    }
}