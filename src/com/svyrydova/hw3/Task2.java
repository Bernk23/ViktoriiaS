package com.svyrydova.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Введите символ для вычисления");
            Scanner symb = new Scanner(System.in);
            String a = symb.nextLine();
            if (a.equals("0")) {
                break;
            }
            System.out.println("Введите x");
            double x = symb.nextDouble();
            System.out.println("Введите y");
            double y = symb.nextDouble();
            switch (a) {
                case ("+"):
                    System.out.println(x + y);
                    break;
                case ("-"):
                    System.out.println(x - y);
                    break;
                case ("*"):
                    System.out.println(x * y);
                    break;
                case ("/"):
                    if (y == 0) {
                        System.out.println("Делить на ноль нельзя");
                    } else {
                        System.out.println(x / y);
                        break;
                    }
                default:
                    System.out.println("Вы ввели неправильный символ");
            }
        }
    }
}

