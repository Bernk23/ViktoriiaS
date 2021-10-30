package com.svyrydova.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String cancel = "";
        while (true) {
            if (cancel == "0") {
                break;
            }
            String request1 = "Введите символ для вычисления";
            System.out.println(request1);
            Scanner symb = new Scanner(System.in);
            String a = symb.nextLine();
            cancel = a;
            System.out.println("Введите x");
            int x = symb.nextInt();
            System.out.println("Введите y");
            int y = symb.nextInt();
            switch (a) {
                case ("+"):
                    int z1 = x + y;
                    System.out.println(z1);
                    break;
                case ("-"):
                    int z2 = x - y;
                    System.out.println(z2);
                    break;
                case ("*"):
                    int z3 = x * y;
                    System.out.println(z3);
                    break;
                case ("/"):
                    if (y == 0) {
                        System.out.println("Делить на ноль нельзя");
                    } else {
                        int z4 = x / y;
                        System.out.println(z4);
                        break;
                    }
                default:
                    System.out.println("Вы ввели неправильный символ");
            }
        }
    }
}

