package com.svyrydova.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String name = "SvyrydovaViktoriia";
        System.out.println(name);

        String name2 = "Viktoriia";
        int v = name2.length();
        System.out.println(v);
        if (v > 7) {
            System.out.println("more than 7");
        } else if
        (v < 7) {
            System.out.println("less than 7");
        }

        int b = 0;
        for (int a = 5; a < 26; a = a + 2) {
            System.out.println("Шаг" + b + "," + "значение" + a);
            b++;
        }

    }
}